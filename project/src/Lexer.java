/* The following code was generated by JFlex 1.6.1 */

import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>src/Lexer.lex</tt>
 */
class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int TOKENIZE = 2;
  public static final int STRING = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\4\1\2\2\0\1\1\22\0\1\3\1\64\1\43\1\5"+
    "\2\12\1\63\1\13\1\66\1\67\1\61\1\60\1\36\1\20\1\17"+
    "\1\6\1\16\11\10\1\50\1\70\1\34\1\65\1\37\1\42\1\12"+
    "\1\7\1\7\1\7\2\7\1\14\2\7\1\7\4\7\1\7\5\7"+
    "\1\14\6\7\1\44\1\40\1\45\1\62\1\11\1\12\1\22\1\33"+
    "\1\52\1\55\1\26\1\53\1\7\1\21\1\51\1\7\1\41\1\30"+
    "\1\32\1\24\1\27\1\35\1\57\1\23\1\56\1\25\1\31\1\54"+
    "\4\7\1\46\1\15\1\47\1\12\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uff91\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\2\2\1\3\1\4\1\5\1\6\1\1"+
    "\2\7\1\6\1\10\1\11\7\5\1\12\1\5\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\6\5\1\24\1\25\1\26\1\1\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\1\1\35\2\3\3\0\1\36"+
    "\1\0\1\37\2\40\14\5\1\41\2\5\1\42\1\43"+
    "\1\44\1\45\2\5\1\46\4\5\1\47\1\50\1\51"+
    "\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61"+
    "\2\0\2\62\3\0\1\5\1\63\3\5\1\64\2\5"+
    "\1\65\6\5\1\66\5\5\1\67\1\0\1\70\1\5"+
    "\1\71\1\5\1\72\1\73\1\74\1\75\1\76\1\5"+
    "\1\77\1\5\1\100\1\101\1\5\1\102\1\103\1\104"+
    "\1\105\1\5\1\106\1\107\1\110\1\111\1\0\2\112";

  private static int [] zzUnpackAction() {
    int [] result = new int[156];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\71\0\162\0\253\0\344\0\253\0\u011d\0\u0156"+
    "\0\u018f\0\u01c8\0\u0201\0\u018f\0\u023a\0\u0273\0\253\0\u02ac"+
    "\0\u02e5\0\u031e\0\u0357\0\u0390\0\u03c9\0\u0402\0\u043b\0\u0474"+
    "\0\u04ad\0\253\0\253\0\253\0\253\0\253\0\253\0\253"+
    "\0\253\0\u04e6\0\u051f\0\u0558\0\u0591\0\u05ca\0\u0603\0\u063c"+
    "\0\253\0\253\0\253\0\u0675\0\u06ae\0\u06e7\0\253\0\253"+
    "\0\253\0\u0720\0\u0759\0\253\0\u0792\0\253\0\u07cb\0\u0804"+
    "\0\u083d\0\u0876\0\u08af\0\253\0\u08e8\0\253\0\u0921\0\u095a"+
    "\0\u0993\0\u09cc\0\u0a05\0\u0a3e\0\u0a77\0\u0ab0\0\u0ae9\0\u0b22"+
    "\0\u0b5b\0\u0b94\0\253\0\u0bcd\0\u0c06\0\253\0\253\0\u0c3f"+
    "\0\u018f\0\u0c78\0\u0cb1\0\u018f\0\u0cea\0\u0d23\0\u0d5c\0\u0d95"+
    "\0\253\0\253\0\253\0\253\0\253\0\253\0\253\0\253"+
    "\0\253\0\253\0\253\0\u0dce\0\u0e07\0\u0e40\0\253\0\u0e79"+
    "\0\u0eb2\0\u0eeb\0\u0f24\0\u018f\0\u0f5d\0\u0f96\0\u0fcf\0\u018f"+
    "\0\u1008\0\u1041\0\u018f\0\u107a\0\u10b3\0\u10ec\0\u1125\0\u115e"+
    "\0\u1197\0\u018f\0\u11d0\0\u1209\0\u1242\0\u127b\0\u12b4\0\u018f"+
    "\0\u12ed\0\253\0\u1326\0\u018f\0\u135f\0\u018f\0\u018f\0\u018f"+
    "\0\u018f\0\u018f\0\u1398\0\u018f\0\u13d1\0\u018f\0\u018f\0\u140a"+
    "\0\u018f\0\u018f\0\u018f\0\u018f\0\u1443\0\u147c\0\u018f\0\u018f"+
    "\0\u018f\0\u14b5\0\u14ee\0\253";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[156];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\72\4\1\5\3\6\1\7\1\10\1\11\1\12\2\4"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\11\1\21"+
    "\1\22\1\11\1\23\1\24\1\11\1\25\1\11\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\4\1\11\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\1\50\1\11\1\51\1\52\1\53"+
    "\1\54\1\55\1\56\1\57\1\60\1\61\1\62\2\4"+
    "\35\62\1\63\2\62\1\64\25\62\73\0\1\6\66\0"+
    "\1\7\1\65\1\66\66\7\5\0\1\67\72\0\3\11"+
    "\2\0\1\11\1\0\1\11\2\0\13\11\1\0\1\11"+
    "\3\0\1\11\7\0\7\11\17\0\1\70\1\0\1\12"+
    "\1\71\4\0\1\12\1\72\56\0\64\73\15\0\1\74"+
    "\61\0\1\70\2\0\1\71\5\0\1\72\61\0\1\75"+
    "\5\0\1\76\61\0\3\11\2\0\1\11\1\0\1\11"+
    "\2\0\7\11\1\77\3\11\1\0\1\11\3\0\1\11"+
    "\7\0\7\11\20\0\3\11\2\0\1\11\1\0\1\11"+
    "\2\0\1\11\1\100\3\11\1\101\5\11\1\0\1\11"+
    "\3\0\1\11\7\0\7\11\20\0\3\11\2\0\1\11"+
    "\1\0\1\11\2\0\1\102\5\11\1\103\4\11\1\0"+
    "\1\11\3\0\1\11\7\0\4\11\1\104\2\11\20\0"+
    "\3\11\2\0\1\11\1\0\1\11\2\0\7\11\1\105"+
    "\3\11\1\0\1\11\3\0\1\11\7\0\7\11\20\0"+
    "\3\11\2\0\1\11\1\0\1\11\2\0\5\11\1\106"+
    "\1\107\4\11\1\0\1\11\3\0\1\11\7\0\7\11"+
    "\20\0\3\11\2\0\1\11\1\0\1\11\2\0\1\11"+
    "\1\110\11\11\1\0\1\11\3\0\1\11\7\0\7\11"+
    "\20\0\3\11\2\0\1\11\1\0\1\11\2\0\2\11"+
    "\1\111\3\11\1\112\4\11\1\0\1\11\3\0\1\11"+
    "\7\0\7\11\76\0\1\113\12\0\3\11\2\0\1\11"+
    "\1\0\1\11\2\0\2\11\1\114\3\11\1\115\4\11"+
    "\1\0\1\11\3\0\1\11\7\0\7\11\61\0\1\116"+
    "\14\0\1\117\12\0\3\11\2\0\1\11\1\0\1\11"+
    "\2\0\3\11\1\120\7\11\1\0\1\11\3\0\1\11"+
    "\7\0\2\11\1\121\4\11\20\0\3\11\2\0\1\11"+
    "\1\0\1\11\2\0\1\122\12\11\1\0\1\11\3\0"+
    "\1\11\7\0\7\11\20\0\3\11\2\0\1\11\1\0"+
    "\1\11\2\0\7\11\1\123\3\11\1\0\1\11\3\0"+
    "\1\11\7\0\1\124\3\11\1\125\2\11\20\0\3\11"+
    "\2\0\1\11\1\0\1\11\2\0\6\11\1\126\4\11"+
    "\1\0\1\11\3\0\1\11\7\0\7\11\20\0\3\11"+
    "\2\0\1\11\1\0\1\11\2\0\13\11\1\0\1\11"+
    "\3\0\1\11\7\0\1\127\6\11\20\0\3\11\2\0"+
    "\1\11\1\0\1\11\2\0\5\11\1\130\5\11\1\0"+
    "\1\11\3\0\1\11\7\0\7\11\74\0\1\131\72\0"+
    "\1\132\42\0\1\133\31\0\1\62\2\0\35\62\1\0"+
    "\2\62\1\0\25\62\13\0\1\134\7\0\1\135\1\136"+
    "\1\137\5\0\1\140\4\0\1\141\2\0\1\142\7\0"+
    "\1\143\17\0\1\66\66\0\5\144\1\145\63\144\10\0"+
    "\1\146\5\0\1\147\62\0\1\150\5\0\1\151\62\0"+
    "\1\72\5\0\1\72\65\0\1\152\65\0\1\75\5\0"+
    "\1\75\61\0\3\11\2\0\1\11\1\0\1\11\2\0"+
    "\13\11\1\0\1\11\3\0\1\11\7\0\1\153\6\11"+
    "\20\0\3\11\2\0\1\11\1\0\1\11\2\0\4\11"+
    "\1\154\6\11\1\0\1\11\3\0\1\11\7\0\7\11"+
    "\20\0\3\11\2\0\1\11\1\0\1\11\2\0\1\11"+
    "\1\155\2\11\1\156\6\11\1\0\1\11\3\0\1\11"+
    "\7\0\7\11\20\0\3\11\2\0\1\11\1\0\1\11"+
    "\2\0\5\11\1\157\5\11\1\0\1\11\3\0\1\11"+
    "\7\0\7\11\20\0\3\11\2\0\1\11\1\0\1\11"+
    "\2\0\13\11\1\0\1\160\3\0\1\11\7\0\7\11"+
    "\20\0\3\11\2\0\1\11\1\0\1\11\2\0\5\11"+
    "\1\161\5\11\1\0\1\11\3\0\1\11\7\0\7\11"+
    "\20\0\3\11\2\0\1\11\1\0\1\11\2\0\13\11"+
    "\1\0\1\11\3\0\1\11\7\0\5\11\1\162\1\11"+
    "\20\0\3\11\2\0\1\11\1\0\1\11\2\0\3\11"+
    "\1\163\7\11\1\0\1\11\3\0\1\11\7\0\7\11"+
    "\20\0\3\11\2\0\1\11\1\0\1\11\2\0\6\11"+
    "\1\164\4\11\1\0\1\11\3\0\1\11\7\0\7\11"+
    "\20\0\3\11\2\0\1\11\1\0\1\11\2\0\13\11"+
    "\1\0\1\11\3\0\1\11\7\0\1\165\6\11\20\0"+
    "\3\11\2\0\1\11\1\0\1\11\2\0\5\11\1\166"+
    "\5\11\1\0\1\11\3\0\1\11\7\0\7\11\20\0"+
    "\3\11\2\0\1\11\1\0\1\11\2\0\6\11\1\167"+
    "\4\11\1\0\1\11\3\0\1\11\7\0\7\11\20\0"+
    "\3\11\2\0\1\11\1\0\1\11\2\0\13\11\1\0"+
    "\1\11\3\0\1\11\7\0\1\170\6\11\20\0\3\11"+
    "\2\0\1\11\1\0\1\11\2\0\6\11\1\171\4\11"+
    "\1\0\1\11\3\0\1\11\7\0\7\11\20\0\3\11"+
    "\2\0\1\11\1\0\1\11\2\0\4\11\1\172\6\11"+
    "\1\0\1\11\3\0\1\11\7\0\7\11\20\0\3\11"+
    "\2\0\1\11\1\0\1\11\2\0\1\11\1\173\11\11"+
    "\1\0\1\11\3\0\1\11\7\0\7\11\20\0\3\11"+
    "\2\0\1\11\1\0\1\11\2\0\6\11\1\174\4\11"+
    "\1\0\1\11\3\0\1\11\7\0\7\11\20\0\3\11"+
    "\2\0\1\11\1\0\1\11\2\0\5\11\1\175\5\11"+
    "\1\0\1\11\3\0\1\11\7\0\7\11\20\0\3\11"+
    "\2\0\1\11\1\0\1\11\2\0\13\11\1\0\1\11"+
    "\3\0\1\11\7\0\1\176\6\11\20\0\3\11\2\0"+
    "\1\11\1\0\1\11\2\0\13\11\1\0\1\11\3\0"+
    "\1\11\7\0\1\11\1\177\5\11\20\0\3\11\2\0"+
    "\1\11\1\0\1\11\2\0\13\11\1\0\1\11\3\0"+
    "\1\11\7\0\6\11\1\200\11\0\5\144\1\201\63\144"+
    "\5\0\1\145\1\66\72\0\1\146\5\0\1\146\60\0"+
    "\1\70\1\0\1\150\5\0\1\150\60\0\1\70\75\0"+
    "\1\202\64\0\3\11\2\0\1\11\1\0\1\11\2\0"+
    "\1\11\1\203\11\11\1\0\1\11\3\0\1\11\7\0"+
    "\7\11\20\0\3\11\2\0\1\11\1\0\1\11\2\0"+
    "\13\11\1\0\1\11\3\0\1\11\7\0\4\11\1\204"+
    "\2\11\20\0\3\11\2\0\1\11\1\0\1\11\2\0"+
    "\10\11\1\205\2\11\1\0\1\11\3\0\1\11\7\0"+
    "\7\11\20\0\3\11\2\0\1\11\1\0\1\11\2\0"+
    "\3\11\1\206\7\11\1\0\1\11\3\0\1\11\7\0"+
    "\7\11\20\0\3\11\2\0\1\11\1\0\1\11\2\0"+
    "\13\11\1\0\1\11\3\0\1\11\7\0\2\11\1\207"+
    "\4\11\20\0\3\11\2\0\1\11\1\0\1\11\2\0"+
    "\5\11\1\210\5\11\1\0\1\11\3\0\1\11\7\0"+
    "\7\11\20\0\3\11\2\0\1\11\1\0\1\11\2\0"+
    "\13\11\1\0\1\211\3\0\1\11\7\0\7\11\20\0"+
    "\3\11\2\0\1\11\1\0\1\11\2\0\3\11\1\212"+
    "\7\11\1\0\1\11\3\0\1\11\7\0\7\11\20\0"+
    "\3\11\2\0\1\11\1\0\1\11\2\0\1\11\1\213"+
    "\11\11\1\0\1\11\3\0\1\11\7\0\7\11\20\0"+
    "\3\11\2\0\1\11\1\0\1\11\2\0\7\11\1\214"+
    "\3\11\1\0\1\11\3\0\1\11\7\0\7\11\20\0"+
    "\3\11\2\0\1\11\1\0\1\11\2\0\3\11\1\215"+
    "\7\11\1\0\1\11\3\0\1\11\7\0\7\11\20\0"+
    "\3\11\2\0\1\11\1\0\1\11\2\0\7\11\1\216"+
    "\3\11\1\0\1\11\3\0\1\11\7\0\7\11\20\0"+
    "\3\11\2\0\1\11\1\0\1\11\2\0\2\11\1\217"+
    "\10\11\1\0\1\11\3\0\1\11\7\0\7\11\20\0"+
    "\3\11\2\0\1\11\1\0\1\11\2\0\1\11\1\220"+
    "\11\11\1\0\1\11\3\0\1\11\7\0\7\11\20\0"+
    "\3\11\2\0\1\11\1\0\1\11\2\0\13\11\1\0"+
    "\1\11\3\0\1\11\7\0\2\11\1\221\4\11\20\0"+
    "\3\11\2\0\1\11\1\0\1\11\2\0\13\11\1\0"+
    "\1\11\3\0\1\11\7\0\4\11\1\222\2\11\20\0"+
    "\3\11\2\0\1\11\1\0\1\11\2\0\4\11\1\223"+
    "\6\11\1\0\1\11\3\0\1\11\7\0\7\11\11\0"+
    "\5\144\1\201\1\66\62\144\7\0\3\11\2\0\1\11"+
    "\1\0\1\11\2\0\13\11\1\0\1\11\3\0\1\11"+
    "\7\0\5\11\1\224\1\11\20\0\3\11\2\0\1\11"+
    "\1\0\1\11\2\0\2\11\1\225\10\11\1\0\1\11"+
    "\3\0\1\11\7\0\7\11\20\0\3\11\2\0\1\11"+
    "\1\0\1\11\2\0\13\11\1\0\1\11\3\0\1\226"+
    "\7\0\7\11\20\0\3\11\2\0\1\11\1\0\1\11"+
    "\2\0\4\11\1\227\6\11\1\0\1\11\3\0\1\11"+
    "\7\0\7\11\20\0\3\11\2\0\1\11\1\0\1\11"+
    "\2\0\4\11\1\230\6\11\1\0\1\11\3\0\1\11"+
    "\7\0\7\11\20\0\3\11\2\0\1\11\1\0\1\11"+
    "\2\0\3\11\1\231\7\11\1\0\1\11\3\0\1\11"+
    "\7\0\7\11\14\0\1\232\3\0\3\11\2\0\1\11"+
    "\1\0\1\11\2\0\13\11\1\0\1\11\3\0\1\11"+
    "\7\0\7\11\21\0\1\233\5\0\1\234\62\0\1\233"+
    "\5\0\1\233\52\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5415];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\1\1\1\11\10\1\1\11\12\1\10\11"+
    "\7\1\3\11\3\1\3\11\2\1\1\11\1\1\1\11"+
    "\3\0\1\1\1\0\1\11\1\1\1\11\14\1\1\11"+
    "\2\1\2\11\11\1\13\11\2\0\1\1\1\11\3\0"+
    "\26\1\1\0\1\11\27\1\1\0\1\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[156];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
  private boolean debug_mode;
  public  boolean debug()            { return debug_mode; }

  
  StringBuffer string = new StringBuffer();

  private Symbol token(int tokenType) {
    return new Symbol(tokenType, yyline, yycolumn);
  }

  private Symbol token(int tokenType, Object value) {
    return new Symbol(tokenType, yyline, yycolumn, value);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
  	yybegin(TOKENIZE);
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 184) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.println("file:" + (yyline+1) +
    ":" + yycolumn + ": Error: Invalid input '" + yytext()+"'");
  return token(sym.BADCHAR);
            }
          case 75: break;
          case 2: 
            { // do nothing
            }
          case 76: break;
          case 3: 
            { 
            }
          case 77: break;
          case 4: 
            { return token(sym.DIV);
            }
          case 78: break;
          case 5: 
            { return token(sym.IDENTIFIER);
            }
          case 79: break;
          case 6: 
            { return token(sym.INTEGER, Integer.parseInt(yytext()));
            }
          case 80: break;
          case 7: 
            { return token(sym.BOOL);
            }
          case 81: break;
          case 8: 
            { return token(sym.DOT);
            }
          case 82: break;
          case 9: 
            { return token(sym.MINUS);
            }
          case 83: break;
          case 10: 
            { return token(sym.LANGLE);
            }
          case 84: break;
          case 11: 
            { return token(sym.COMMA);
            }
          case 85: break;
          case 12: 
            { return token(sym.RANGLE);
            }
          case 86: break;
          case 13: 
            { return token(sym.QMARK);
            }
          case 87: break;
          case 14: 
            { string.setLength(0);
    	yybegin(STRING);
            }
          case 88: break;
          case 15: 
            { return token(sym.LBRACKET);
            }
          case 89: break;
          case 16: 
            { return token(sym.RBRACKET);
            }
          case 90: break;
          case 17: 
            { return token(sym.LBRACE);
            }
          case 91: break;
          case 18: 
            { return token(sym.RBRACE);
            }
          case 92: break;
          case 19: 
            { return token(sym.COLON);
            }
          case 93: break;
          case 20: 
            { return token(sym.PLUS);
            }
          case 94: break;
          case 21: 
            { return token(sym.MULT);
            }
          case 95: break;
          case 22: 
            { return token(sym.POW);
            }
          case 96: break;
          case 23: 
            { return token(sym.NOT);
            }
          case 97: break;
          case 24: 
            { return token(sym.EQ);
            }
          case 98: break;
          case 25: 
            { return token(sym.LPAREN);
            }
          case 99: break;
          case 26: 
            { return token(sym.RPAREN);
            }
          case 100: break;
          case 27: 
            { return token(sym.SEMICOLON);
            }
          case 101: break;
          case 28: 
            { string.append(yytext());
            }
          case 102: break;
          case 29: 
            { yybegin(YYINITIAL); 
   return token(sym.STRING_LITERAL, string.toString());
            }
          case 103: break;
          case 30: 
            { return token(sym.FLOAT);
            }
          case 104: break;
          case 31: 
            { return token(sym.OR);
            }
          case 105: break;
          case 32: 
            { return token(sym.NUMBER);
            }
          case 106: break;
          case 33: 
            { return token(sym.LTEQ);
            }
          case 107: break;
          case 34: 
            { return token(sym.APPEND);
            }
          case 108: break;
          case 35: 
            { return token(sym.ASSIGNMENT);
            }
          case 109: break;
          case 36: 
            { return token(sym.IN);
            }
          case 110: break;
          case 37: 
            { return token(sym.IF);
            }
          case 111: break;
          case 38: 
            { return token(sym.FI);
            }
          case 112: break;
          case 39: 
            { return token(sym.AND);
            }
          case 113: break;
          case 40: 
            { return token(sym.NEQ);
            }
          case 114: break;
          case 41: 
            { return token(sym.IMPLY);
            }
          case 115: break;
          case 42: 
            { string.append( '\'' );
            }
          case 116: break;
          case 43: 
            { string.append( '\r' );
            }
          case 117: break;
          case 44: 
            { string.append( '\n' );
            }
          case 118: break;
          case 45: 
            { string.append( '\t' );
            }
          case 119: break;
          case 46: 
            { string.append( '\b' );
            }
          case 120: break;
          case 47: 
            { string.append( '\\' );
            }
          case 121: break;
          case 48: 
            { string.append( '\"' );
            }
          case 122: break;
          case 49: 
            { string.append( '\f' );
            }
          case 123: break;
          case 50: 
            { return token(sym.RATIONAL);
            }
          case 124: break;
          case 51: 
            { return token(sym.RATIONAL_T);
            }
          case 125: break;
          case 52: 
            { return token(sym.TOP_T);
            }
          case 126: break;
          case 53: 
            { return token(sym.LEN);
            }
          case 127: break;
          case 54: 
            { return token(sym.INT_T);
            }
          case 128: break;
          case 55: 
            { return token(sym.SEQ_T);
            }
          case 129: break;
          case 56: 
            { return token(sym.CHAR, yytext());
            }
          case 130: break;
          case 57: 
            { return token(sym.READ);
            }
          case 131: break;
          case 58: 
            { return token(sym.THEN);
            }
          case 132: break;
          case 59: 
            { return token(sym.TDEF);
            }
          case 133: break;
          case 60: 
            { return token(sym.ELSE);
            }
          case 134: break;
          case 61: 
            { return token(sym.LOOP);
            }
          case 135: break;
          case 62: 
            { return token(sym.MAIN);
            }
          case 136: break;
          case 63: 
            { return token(sym.BOOLEAN_T);
            }
          case 137: break;
          case 64: 
            { return token(sym.POOL);
            }
          case 138: break;
          case 65: 
            { return token(sym.CHAR_T);
            }
          case 139: break;
          case 66: 
            { return token(sym.FDEF);
            }
          case 140: break;
          case 67: 
            { return token(sym.VOID);
            }
          case 141: break;
          case 68: 
            { return token(sym.DICT_T);
            }
          case 142: break;
          case 69: 
            { return token(sym.ALIAS);
            }
          case 143: break;
          case 70: 
            { return token(sym.BREAK);
            }
          case 144: break;
          case 71: 
            { return token(sym.PRINT);
            }
          case 145: break;
          case 72: 
            { return token(sym.FLOAT_T);
            }
          case 146: break;
          case 73: 
            { return token(sym.RETURN);
            }
          case 147: break;
          case 74: 
            { return token(sym.BREAKARG);
            }
          case 148: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}