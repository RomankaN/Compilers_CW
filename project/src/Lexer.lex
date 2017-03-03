import java_cup.runtime.*;

%%
%class Lexer
%unicode
%cup
%line
%column

%{
  private boolean debug_mode;
  public  boolean debug()            { return debug_mode; }
  public  void    debug(boolean mode){ debug_mode = mode; }
  
  StringBuffer string = new StringBuffer();

  private Symbol token(int tokenType) {
    return new Symbol(tokenType, yyline, yycolumn);
  }

  private Symbol token(int tokenType, Object value) {
    return new Symbol(tokenType, yyline, yycolumn, value);
  }
%}

%init{
	yybegin(TOKENIZE);
%init}

EOL = \r|\n|\r\n
Whitespace = {EOL}|" "|"\t"
/* Comment can be the last line of the file, in which case there is no line terminator */
Comment1 = "#"[^\n\r]*{EOL}?
Comment2 = "/#"[^#] ~"#/" | "/#" "#"+ "/"
Letter = [a-zA-Z]
Digit = [0-9]
AcceptedChar = ({Letter}|"_"|{Digit})
Identifier = {Letter}{AcceptedChar}*
Punctuation = [\[\\\]\!\"#$%&\'\(\)\*\+,\./:;<=>\?@\^_`\{\|\}\~-]
Char = \'({Letter}|{Punctuation}|{Digit})\''
Bool = [T|F]
Integer = (0|[1-9]{Digit}*)
Rational = ({Integer}_)?{Integer}"/"{Integer}
Float = {Integer}\.{Digit}*
Number = (-?{Integer}|{Rational}|{Float})
Top = (Char|Integer|Bool|Number)
Dictionary = \<(Top, Top)?\>
StringCharacter = [^\r\n\"\\]
BreakArg = "break "{Integer}
Qmark = \?

%state TOKENIZE, STRING

%%
<TOKENIZE> {
	{Whitespace} {
	// do nothing
	}
	{Comment1} {

	}
	{Comment2} {

	}
	{Bool} {
		return token(sym.BOOL);
	}
	{Char} {
		return token(sym.CHAR, yytext());
	}
	{Float} {
		return token(sym.FLOAT);
	}
  {Integer}     { 
    	return token(sym.INTEGER, Integer.parseInt(yytext())); 
    }
  {Rational}    { 
    	return token(sym.RATIONAL);
    }
  {Number}      {
      return token(sym.NUMBER);
  }
  {Qmark}   {
      return token(sym.QMARK);
  }
	\"            { 
		string.setLength(0);
    	yybegin(STRING);
    }

   	// seq   	
    "["           { return token(sym.LBRACKET);   }
    "]"           { return token(sym.RBRACKET);   }
    "<"           { return token(sym.LANGLE);     }
    ">"           { return token(sym.RANGLE);     }
    "{"           { return token(sym.LBRACE);     }
    "}"           { return token(sym.RBRACE);     }
    ","           { return token(sym.COMMA);      }
    ":"           { return token(sym.COLON);      }
    "in"          { return token(sym.IN);         }

    /* Types in the language */
    	//primitives 
    	"bool"        { return token(sym.BOOLEAN_T);  }
    	"char"        { return token(sym.CHAR_T);     }
    	"float"       { return token(sym.FLOAT_T);    }
    	"int"         { return token(sym.INT_T);      }
    	"rat"         { return token(sym.RATIONAL_T); }
    	"top"         { return token(sym.TOP_T);      }
      "void"        { return token(sym.VOID);     }
    
    	//aggregates
    	"seq"         { return token(sym.SEQ_T);      }
    	"dict"        { return token(sym.DICT_T);     }
    
    

    /* Numerical Operators */
    "+"           { return token(sym.PLUS);       }
    "-"           { return token(sym.MINUS);      }
    "*"           { return token(sym.MULT);       }
    "/"           { return token(sym.DIV);        }
    "^"           { return token(sym.POW);        }

    /* Boolean Operators */
    "||"          { return token(sym.OR);         }
    "&&"          { return token(sym.AND);        }
    "!"           { return token(sym.NOT);        }
    "=>"		  { return token(sym.IMPLY);	  }
   
    
    

    /* Comparison Operators */
    "="           { return token(sym.EQ);         }
    "!="          { return token(sym.NEQ);      }
    "<="          { return token(sym.LTEQ);       }
    
    
    "("           { return token(sym.LPAREN);     }
    ")"           { return token(sym.RPAREN);     }
    "len"         { return token(sym.LEN);        }

    ":="          { return token(sym.ASSIGNMENT); }
    "."           { return token(sym.DOT);        }
    "::"          { return token(sym.APPEND);     }

    "main"        { return token(sym.MAIN);       }
    "fdef"        { return token(sym.FDEF);       }
    "tdef"        { return token(sym.TDEF);       }
    "alias"       { return token(sym.ALIAS);      }
    ";"           { return token(sym.SEMICOLON);  }
    "if"          { return token(sym.IF);         }
    "then"        { return token(sym.THEN);       }
    "else"        { return token(sym.ELSE);       }
    "fi"          { return token(sym.FI);         }
    "loop"        { return token(sym.LOOP);       }
    "pool"        { return token(sym.POOL);       }
    "break"       { return token(sym.BREAK);      }
    {BreakArg} { return token(sym.BREAKARG);      }
    
    

    "print"       { return token(sym.PRINT);      }
    "read"        { return token(sym.READ);       }
    "return"      { return token(sym.RETURN);     }
    {Identifier}  { return token(sym.IDENTIFIER); }
}

<STRING>{
  \"            {
   yybegin(YYINITIAL); 
   return token(sym.STRING_LITERAL, string.toString()); }

  {StringCharacter}+ { string.append(yytext()); }
  "\\b"   { string.append( '\b' ); }
  "\\t"   { string.append( '\t' ); }
  "\\n"   { string.append( '\n' ); }
  "\\f"   { string.append( '\f' ); }
  "\\r"   { string.append( '\r' ); }
  "\\\""  { string.append( '\"' ); }
  "\\'"   { string.append( '\'' ); }
  "\\\\"  { string.append( '\\' ); }
}

[^] {
  System.out.println("file:" + (yyline+1) +
    ":" + yycolumn + ": Error: Invalid input '" + yytext()+"'");
  return token(sym.BADCHAR);
}

