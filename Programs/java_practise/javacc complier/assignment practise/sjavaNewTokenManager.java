/* Generated By:JavaCC: Do not edit this line. sjavaNewTokenManager.java */

/** Token Manager. */
public class sjavaNewTokenManager implements sjavaNewConstants
{
                   static int commentNesting=0;

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 37:
         return jjStopAtPos(0, 13);
      case 43:
         return jjStopAtPos(0, 9);
      case 45:
         return jjStopAtPos(0, 11);
      case 47:
         jjmatchedKind = 12;
         return jjMoveStringLiteralDfa1_0(0x20L);
      case 59:
         return jjStopAtPos(0, 10);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_0(0x380000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0x7c00000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      default :
         return 1;
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x20L) != 0L)
            return jjStopAtPos(1, 5);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0xc00000L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000L);
      case 70:
      case 102:
         if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(1, 14);
         break;
      case 72:
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x2008000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x4080000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000L);
      case 89:
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000L);
      default :
         return 2;
   }
   return 2;
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 2;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 2;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x3010000L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x448000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0xa00000L);
      default :
         return 3;
   }
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 3;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 3;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      case 69:
      case 101:
         if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(3, 15);
         else if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(3, 21);
         else if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(3, 22);
         break;
      case 76:
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x80a0000L);
      case 82:
      case 114:
         if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(3, 24);
         break;
      case 83:
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x4050000L);
      default :
         return 4;
   }
   return 4;
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 4;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 4;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000L);
      case 72:
      case 104:
         if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(4, 23);
         break;
      case 73:
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x4030000L);
      case 75:
      case 107:
         if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(4, 20);
         break;
      case 79:
      case 111:
         if ((active0 & 0x8000000L) != 0L)
            return jjStopAtPos(4, 27);
         break;
      case 82:
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000L);
      case 83:
      case 115:
         if ((active0 & 0x2000000L) != 0L)
            return jjStopAtPos(4, 25);
         break;
      default :
         return 5;
   }
   return 5;
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 5;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 5;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0xc0000L);
      case 67:
      case 99:
         if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(5, 16);
         else if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(5, 17);
         break;
      case 78:
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000000L);
      default :
         return 6;
   }
   return 6;
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 6;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 6;
   }
   switch(curChar)
   {
      case 67:
      case 99:
         return jjMoveStringLiteralDfa7_0(active0, 0x40000L);
      case 78:
      case 110:
         if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(6, 19);
         break;
      case 85:
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000000L);
      default :
         return 7;
   }
   return 7;
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 7;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 7;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x4000000L) != 0L)
            return jjStopAtPos(7, 26);
         break;
      case 84:
      case 116:
         if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(7, 18);
         break;
      default :
         return 8;
   }
   return 8;
}
static private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_1(0x80L);
      case 47:
         return jjMoveStringLiteralDfa1_1(0x40L);
      default :
         return 1;
   }
}
static private int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      case 47:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(1, 7);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, "\53", "\73", "\55", 
"\57", "\45", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "IN_COMMENT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xffffe01L, 
};
static final long[] jjtoSkip = {
   0x1feL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[0];
static private final int[] jjstateSet = new int[0];
private static final StringBuilder jjimage = new StringBuilder();
private static StringBuilder image = jjimage;
private static int jjimageLen;
private static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public sjavaNewTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public sjavaNewTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 0; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   switch(curLexState)
   {
     case 0:
       try { input_stream.backup(0);
          while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
             curChar = input_stream.BeginToken();
       }
       catch (java.io.IOException e1) { continue EOFLoop; }
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_0();
       break;
     case 1:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_1();
       if (jjmatchedPos == 0 && jjmatchedKind > 8)
       {
          jjmatchedKind = 8;
       }
       break;
   }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else
        {
           SkipLexicalActions(null);
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 5 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
      commentNesting++;
         break;
      case 6 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
      commentNesting++;
         break;
      case 7 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
       commentNesting--;
 if(commentNesting==0)
 SwitchTo(DEFAULT);
         break;
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}