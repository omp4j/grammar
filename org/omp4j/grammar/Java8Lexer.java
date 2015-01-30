// Generated from Java8.g4 by ANTLR 4.4
package org.omp4j.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Java8Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, OMPTHREADNUM=51, OMPNUMTHREADS=52, IntegerLiteral=53, FloatingPointLiteral=54, 
		BooleanLiteral=55, CharacterLiteral=56, StringLiteral=57, NullLiteral=58, 
		LPAREN=59, RPAREN=60, LBRACE=61, RBRACE=62, LBRACK=63, RBRACK=64, SEMI=65, 
		COMMA=66, DOT=67, ASSIGN=68, GT=69, LT=70, BANG=71, TILDE=72, QUESTION=73, 
		COLON=74, EQUAL=75, LE=76, GE=77, NOTEQUAL=78, AND=79, OR=80, INC=81, 
		DEC=82, ADD=83, SUB=84, MUL=85, DIV=86, BITAND=87, BITOR=88, CARET=89, 
		MOD=90, ARROW=91, COLONCOLON=92, ADD_ASSIGN=93, SUB_ASSIGN=94, MUL_ASSIGN=95, 
		DIV_ASSIGN=96, AND_ASSIGN=97, OR_ASSIGN=98, XOR_ASSIGN=99, MOD_ASSIGN=100, 
		LSHIFT_ASSIGN=101, RSHIFT_ASSIGN=102, URSHIFT_ASSIGN=103, Identifier=104, 
		AT=105, ELLIPSIS=106, WS=107, COMMENT=108, LINE_COMMENT=109;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "':'", "';'", 
		"'<'", "'='", "'>'", "'?'", "'@'", "'A'", "'B'", "'C'", "'D'", "'E'", 
		"'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", 
		"'P'", "'Q'", "'R'", "'S'", "'T'", "'U'", "'V'", "'W'", "'X'", "'Y'", 
		"'Z'", "'['", "'\\'", "']'", "'^'", "'_'", "'`'", "'a'", "'b'", "'c'", 
		"'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'"
	};
	public static final String[] ruleNames = {
		"ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", 
		"CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", 
		"EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", 
		"IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
		"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", 
		"SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", 
		"TRY", "VOID", "VOLATILE", "WHILE", "OMPTHREADNUM", "OMPNUMTHREADS", "IntegerLiteral", 
		"DecimalIntegerLiteral", "HexIntegerLiteral", "OctalIntegerLiteral", "BinaryIntegerLiteral", 
		"IntegerTypeSuffix", "DecimalNumeral", "Digits", "Digit", "NonZeroDigit", 
		"DigitsAndUnderscores", "DigitOrUnderscore", "Underscores", "HexNumeral", 
		"HexDigits", "HexDigit", "HexDigitsAndUnderscores", "HexDigitOrUnderscore", 
		"OctalNumeral", "OctalDigits", "OctalDigit", "OctalDigitsAndUnderscores", 
		"OctalDigitOrUnderscore", "BinaryNumeral", "BinaryDigits", "BinaryDigit", 
		"BinaryDigitsAndUnderscores", "BinaryDigitOrUnderscore", "FloatingPointLiteral", 
		"DecimalFloatingPointLiteral", "ExponentPart", "ExponentIndicator", "SignedInteger", 
		"Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", "HexSignificand", 
		"BinaryExponent", "BinaryExponentIndicator", "BooleanLiteral", "CharacterLiteral", 
		"SingleCharacter", "StringLiteral", "StringCharacters", "StringCharacter", 
		"EscapeSequence", "OctalEscape", "ZeroToThree", "UnicodeEscape", "NullLiteral", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
		"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
		"DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", "COLONCOLON", "ADD_ASSIGN", 
		"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
		"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", 
		"JavaLetter", "JavaLetterOrDigit", "AT", "ELLIPSIS", "WS", "COMMENT", 
		"LINE_COMMENT"
	};


	    public static final int COMMENTS = 1;
	    public static final int OTHER = 2;


	public Java8Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Java8.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 152: WS_action((RuleContext)_localctx, actionIndex); break;
		case 153: COMMENT_action((RuleContext)_localctx, actionIndex); break;
		case 154: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: _channel = COMMENTS; break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = OTHER; break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: _channel = OTHER; break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 148: return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 149: return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean JavaLetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3: return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean JavaLetter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1: return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2o\u046b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%"+
		"\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3"+
		".\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\5\66\u02b0\n\66"+
		"\3\67\3\67\5\67\u02b4\n\67\38\38\58\u02b8\n8\39\39\59\u02bc\n9\3:\3:\5"+
		":\u02c0\n:\3;\3;\3<\3<\3<\5<\u02c7\n<\3<\3<\3<\5<\u02cc\n<\5<\u02ce\n"+
		"<\3=\3=\5=\u02d2\n=\3=\5=\u02d5\n=\3>\3>\5>\u02d9\n>\3?\3?\3@\6@\u02de"+
		"\n@\r@\16@\u02df\3A\3A\5A\u02e4\nA\3B\6B\u02e7\nB\rB\16B\u02e8\3C\3C\3"+
		"C\3C\3D\3D\5D\u02f1\nD\3D\5D\u02f4\nD\3E\3E\3F\6F\u02f9\nF\rF\16F\u02fa"+
		"\3G\3G\5G\u02ff\nG\3H\3H\5H\u0303\nH\3H\3H\3I\3I\5I\u0309\nI\3I\5I\u030c"+
		"\nI\3J\3J\3K\6K\u0311\nK\rK\16K\u0312\3L\3L\5L\u0317\nL\3M\3M\3M\3M\3"+
		"N\3N\5N\u031f\nN\3N\5N\u0322\nN\3O\3O\3P\6P\u0327\nP\rP\16P\u0328\3Q\3"+
		"Q\5Q\u032d\nQ\3R\3R\5R\u0331\nR\3S\3S\3S\5S\u0336\nS\3S\5S\u0339\nS\3"+
		"S\5S\u033c\nS\3S\3S\3S\5S\u0341\nS\3S\5S\u0344\nS\3S\3S\3S\5S\u0349\n"+
		"S\3S\3S\3S\5S\u034e\nS\3T\3T\3T\3U\3U\3V\5V\u0356\nV\3V\3V\3W\3W\3X\3"+
		"X\3Y\3Y\3Y\5Y\u0361\nY\3Z\3Z\5Z\u0365\nZ\3Z\3Z\3Z\5Z\u036a\nZ\3Z\3Z\5"+
		"Z\u036e\nZ\3[\3[\3[\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\3]\3]\5]\u037e\n]\3^"+
		"\3^\3^\3^\3^\3^\3^\3^\5^\u0388\n^\3_\3_\3`\3`\5`\u038e\n`\3`\3`\3a\6a"+
		"\u0393\na\ra\16a\u0394\3b\3b\5b\u0399\nb\3c\3c\3c\3c\5c\u039f\nc\3d\3"+
		"d\3d\3d\3d\3d\3d\3d\3d\3d\3d\5d\u03ac\nd\3e\3e\3f\3f\3f\3f\3f\3f\3f\3"+
		"g\3g\3g\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n\3o\3o\3p\3p\3"+
		"q\3q\3r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3w\3w\3x\3x\3x\3y\3y\3y\3z\3z\3z\3"+
		"{\3{\3{\3|\3|\3|\3}\3}\3}\3~\3~\3~\3\177\3\177\3\177\3\u0080\3\u0080\3"+
		"\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083\3\u0084\3\u0084\3\u0085"+
		"\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0089"+
		"\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008c"+
		"\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008f"+
		"\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095\7\u0095\u0431\n\u0095\f\u0095"+
		"\16\u0095\u0434\13\u0095\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\5\u0096\u043c\n\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\5\u0097\u0444\n\u0097\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u009a\6\u009a\u044d\n\u009a\r\u009a\16\u009a\u044e\3\u009a\3\u009a"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\7\u009b\u0457\n\u009b\f\u009b\16\u009b"+
		"\u045a\13\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\7\u009c\u0465\n\u009c\f\u009c\16\u009c\u0468\13\u009c"+
		"\3\u009c\3\u009c\3\u0458\2\u009d\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2"+
		"\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093"+
		"\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f\2\u00a1\2\u00a38\u00a5"+
		"\2\u00a7\2\u00a9\2\u00ab\2\u00ad\2\u00af\2\u00b1\2\u00b3\2\u00b5\2\u00b7"+
		"\2\u00b99\u00bb:\u00bd\2\u00bf;\u00c1\2\u00c3\2\u00c5\2\u00c7\2\u00c9"+
		"\2\u00cb\2\u00cd<\u00cf=\u00d1>\u00d3?\u00d5@\u00d7A\u00d9B\u00dbC\u00dd"+
		"D\u00dfE\u00e1F\u00e3G\u00e5H\u00e7I\u00e9J\u00ebK\u00edL\u00efM\u00f1"+
		"N\u00f3O\u00f5P\u00f7Q\u00f9R\u00fbS\u00fdT\u00ffU\u0101V\u0103W\u0105"+
		"X\u0107Y\u0109Z\u010b[\u010d\\\u010f]\u0111^\u0113_\u0115`\u0117a\u0119"+
		"b\u011bc\u011dd\u011fe\u0121f\u0123g\u0125h\u0127i\u0129j\u012b\2\u012d"+
		"\2\u012fk\u0131l\u0133m\u0135n\u0137o\3\2\30\4\2NNnn\3\2\63;\4\2ZZzz\5"+
		"\2\62;CHch\3\2\629\4\2DDdd\3\2\62\63\4\2GGgg\4\2--//\6\2FFHHffhh\4\2R"+
		"Rrr\4\2))^^\4\2$$^^\n\2$$))^^ddhhppttvv\3\2\62\65\6\2&&C\\aac|\4\2\2\u0101"+
		"\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\5\2\13\f"+
		"\16\17\"\"\4\2\f\f\17\17\u0479\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\2k\3\2\2\2\2\u00a3\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2"+
		"\u00bf\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3"+
		"\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2"+
		"\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5"+
		"\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2"+
		"\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2\2\2\u00f7"+
		"\3\2\2\2\2\u00f9\3\2\2\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff\3\2\2"+
		"\2\2\u0101\3\2\2\2\2\u0103\3\2\2\2\2\u0105\3\2\2\2\2\u0107\3\2\2\2\2\u0109"+
		"\3\2\2\2\2\u010b\3\2\2\2\2\u010d\3\2\2\2\2\u010f\3\2\2\2\2\u0111\3\2\2"+
		"\2\2\u0113\3\2\2\2\2\u0115\3\2\2\2\2\u0117\3\2\2\2\2\u0119\3\2\2\2\2\u011b"+
		"\3\2\2\2\2\u011d\3\2\2\2\2\u011f\3\2\2\2\2\u0121\3\2\2\2\2\u0123\3\2\2"+
		"\2\2\u0125\3\2\2\2\2\u0127\3\2\2\2\2\u0129\3\2\2\2\2\u012f\3\2\2\2\2\u0131"+
		"\3\2\2\2\2\u0133\3\2\2\2\2\u0135\3\2\2\2\2\u0137\3\2\2\2\3\u0139\3\2\2"+
		"\2\5\u0142\3\2\2\2\7\u0149\3\2\2\2\t\u0151\3\2\2\2\13\u0157\3\2\2\2\r"+
		"\u015c\3\2\2\2\17\u0161\3\2\2\2\21\u0167\3\2\2\2\23\u016c\3\2\2\2\25\u0172"+
		"\3\2\2\2\27\u0178\3\2\2\2\31\u0181\3\2\2\2\33\u0189\3\2\2\2\35\u018c\3"+
		"\2\2\2\37\u0193\3\2\2\2!\u0198\3\2\2\2#\u019d\3\2\2\2%\u01a5\3\2\2\2\'"+
		"\u01ab\3\2\2\2)\u01b3\3\2\2\2+\u01b9\3\2\2\2-\u01bd\3\2\2\2/\u01c0\3\2"+
		"\2\2\61\u01c5\3\2\2\2\63\u01d0\3\2\2\2\65\u01d7\3\2\2\2\67\u01e2\3\2\2"+
		"\29\u01e6\3\2\2\2;\u01f0\3\2\2\2=\u01f5\3\2\2\2?\u01fc\3\2\2\2A\u0200"+
		"\3\2\2\2C\u0208\3\2\2\2E\u0210\3\2\2\2G\u021a\3\2\2\2I\u0221\3\2\2\2K"+
		"\u0228\3\2\2\2M\u022e\3\2\2\2O\u0235\3\2\2\2Q\u023e\3\2\2\2S\u0244\3\2"+
		"\2\2U\u024b\3\2\2\2W\u0258\3\2\2\2Y\u025d\3\2\2\2[\u0263\3\2\2\2]\u026a"+
		"\3\2\2\2_\u0274\3\2\2\2a\u0278\3\2\2\2c\u027d\3\2\2\2e\u0286\3\2\2\2g"+
		"\u028c\3\2\2\2i\u029b\3\2\2\2k\u02af\3\2\2\2m\u02b1\3\2\2\2o\u02b5\3\2"+
		"\2\2q\u02b9\3\2\2\2s\u02bd\3\2\2\2u\u02c1\3\2\2\2w\u02cd\3\2\2\2y\u02cf"+
		"\3\2\2\2{\u02d8\3\2\2\2}\u02da\3\2\2\2\177\u02dd\3\2\2\2\u0081\u02e3\3"+
		"\2\2\2\u0083\u02e6\3\2\2\2\u0085\u02ea\3\2\2\2\u0087\u02ee\3\2\2\2\u0089"+
		"\u02f5\3\2\2\2\u008b\u02f8\3\2\2\2\u008d\u02fe\3\2\2\2\u008f\u0300\3\2"+
		"\2\2\u0091\u0306\3\2\2\2\u0093\u030d\3\2\2\2\u0095\u0310\3\2\2\2\u0097"+
		"\u0316\3\2\2\2\u0099\u0318\3\2\2\2\u009b\u031c\3\2\2\2\u009d\u0323\3\2"+
		"\2\2\u009f\u0326\3\2\2\2\u00a1\u032c\3\2\2\2\u00a3\u0330\3\2\2\2\u00a5"+
		"\u034d\3\2\2\2\u00a7\u034f\3\2\2\2\u00a9\u0352\3\2\2\2\u00ab\u0355\3\2"+
		"\2\2\u00ad\u0359\3\2\2\2\u00af\u035b\3\2\2\2\u00b1\u035d\3\2\2\2\u00b3"+
		"\u036d\3\2\2\2\u00b5\u036f\3\2\2\2\u00b7\u0372\3\2\2\2\u00b9\u037d\3\2"+
		"\2\2\u00bb\u0387\3\2\2\2\u00bd\u0389\3\2\2\2\u00bf\u038b\3\2\2\2\u00c1"+
		"\u0392\3\2\2\2\u00c3\u0398\3\2\2\2\u00c5\u039e\3\2\2\2\u00c7\u03ab\3\2"+
		"\2\2\u00c9\u03ad\3\2\2\2\u00cb\u03af\3\2\2\2\u00cd\u03b6\3\2\2\2\u00cf"+
		"\u03bb\3\2\2\2\u00d1\u03bd\3\2\2\2\u00d3\u03bf\3\2\2\2\u00d5\u03c1\3\2"+
		"\2\2\u00d7\u03c3\3\2\2\2\u00d9\u03c5\3\2\2\2\u00db\u03c7\3\2\2\2\u00dd"+
		"\u03c9\3\2\2\2\u00df\u03cb\3\2\2\2\u00e1\u03cd\3\2\2\2\u00e3\u03cf\3\2"+
		"\2\2\u00e5\u03d1\3\2\2\2\u00e7\u03d3\3\2\2\2\u00e9\u03d5\3\2\2\2\u00eb"+
		"\u03d7\3\2\2\2\u00ed\u03d9\3\2\2\2\u00ef\u03db\3\2\2\2\u00f1\u03de\3\2"+
		"\2\2\u00f3\u03e1\3\2\2\2\u00f5\u03e4\3\2\2\2\u00f7\u03e7\3\2\2\2\u00f9"+
		"\u03ea\3\2\2\2\u00fb\u03ed\3\2\2\2\u00fd\u03f0\3\2\2\2\u00ff\u03f3\3\2"+
		"\2\2\u0101\u03f5\3\2\2\2\u0103\u03f7\3\2\2\2\u0105\u03f9\3\2\2\2\u0107"+
		"\u03fb\3\2\2\2\u0109\u03fd\3\2\2\2\u010b\u03ff\3\2\2\2\u010d\u0401\3\2"+
		"\2\2\u010f\u0403\3\2\2\2\u0111\u0406\3\2\2\2\u0113\u0409\3\2\2\2\u0115"+
		"\u040c\3\2\2\2\u0117\u040f\3\2\2\2\u0119\u0412\3\2\2\2\u011b\u0415\3\2"+
		"\2\2\u011d\u0418\3\2\2\2\u011f\u041b\3\2\2\2\u0121\u041e\3\2\2\2\u0123"+
		"\u0421\3\2\2\2\u0125\u0425\3\2\2\2\u0127\u0429\3\2\2\2\u0129\u042e\3\2"+
		"\2\2\u012b\u043b\3\2\2\2\u012d\u0443\3\2\2\2\u012f\u0445\3\2\2\2\u0131"+
		"\u0447\3\2\2\2\u0133\u044c\3\2\2\2\u0135\u0452\3\2\2\2\u0137\u0460\3\2"+
		"\2\2\u0139\u013a\7c\2\2\u013a\u013b\7d\2\2\u013b\u013c\7u\2\2\u013c\u013d"+
		"\7v\2\2\u013d\u013e\7t\2\2\u013e\u013f\7c\2\2\u013f\u0140\7e\2\2\u0140"+
		"\u0141\7v\2\2\u0141\4\3\2\2\2\u0142\u0143\7c\2\2\u0143\u0144\7u\2\2\u0144"+
		"\u0145\7u\2\2\u0145\u0146\7g\2\2\u0146\u0147\7t\2\2\u0147\u0148\7v\2\2"+
		"\u0148\6\3\2\2\2\u0149\u014a\7d\2\2\u014a\u014b\7q\2\2\u014b\u014c\7q"+
		"\2\2\u014c\u014d\7n\2\2\u014d\u014e\7g\2\2\u014e\u014f\7c\2\2\u014f\u0150"+
		"\7p\2\2\u0150\b\3\2\2\2\u0151\u0152\7d\2\2\u0152\u0153\7t\2\2\u0153\u0154"+
		"\7g\2\2\u0154\u0155\7c\2\2\u0155\u0156\7m\2\2\u0156\n\3\2\2\2\u0157\u0158"+
		"\7d\2\2\u0158\u0159\7{\2\2\u0159\u015a\7v\2\2\u015a\u015b\7g\2\2\u015b"+
		"\f\3\2\2\2\u015c\u015d\7e\2\2\u015d\u015e\7c\2\2\u015e\u015f\7u\2\2\u015f"+
		"\u0160\7g\2\2\u0160\16\3\2\2\2\u0161\u0162\7e\2\2\u0162\u0163\7c\2\2\u0163"+
		"\u0164\7v\2\2\u0164\u0165\7e\2\2\u0165\u0166\7j\2\2\u0166\20\3\2\2\2\u0167"+
		"\u0168\7e\2\2\u0168\u0169\7j\2\2\u0169\u016a\7c\2\2\u016a\u016b\7t\2\2"+
		"\u016b\22\3\2\2\2\u016c\u016d\7e\2\2\u016d\u016e\7n\2\2\u016e\u016f\7"+
		"c\2\2\u016f\u0170\7u\2\2\u0170\u0171\7u\2\2\u0171\24\3\2\2\2\u0172\u0173"+
		"\7e\2\2\u0173\u0174\7q\2\2\u0174\u0175\7p\2\2\u0175\u0176\7u\2\2\u0176"+
		"\u0177\7v\2\2\u0177\26\3\2\2\2\u0178\u0179\7e\2\2\u0179\u017a\7q\2\2\u017a"+
		"\u017b\7p\2\2\u017b\u017c\7v\2\2\u017c\u017d\7k\2\2\u017d\u017e\7p\2\2"+
		"\u017e\u017f\7w\2\2\u017f\u0180\7g\2\2\u0180\30\3\2\2\2\u0181\u0182\7"+
		"f\2\2\u0182\u0183\7g\2\2\u0183\u0184\7h\2\2\u0184\u0185\7c\2\2\u0185\u0186"+
		"\7w\2\2\u0186\u0187\7n\2\2\u0187\u0188\7v\2\2\u0188\32\3\2\2\2\u0189\u018a"+
		"\7f\2\2\u018a\u018b\7q\2\2\u018b\34\3\2\2\2\u018c\u018d\7f\2\2\u018d\u018e"+
		"\7q\2\2\u018e\u018f\7w\2\2\u018f\u0190\7d\2\2\u0190\u0191\7n\2\2\u0191"+
		"\u0192\7g\2\2\u0192\36\3\2\2\2\u0193\u0194\7g\2\2\u0194\u0195\7n\2\2\u0195"+
		"\u0196\7u\2\2\u0196\u0197\7g\2\2\u0197 \3\2\2\2\u0198\u0199\7g\2\2\u0199"+
		"\u019a\7p\2\2\u019a\u019b\7w\2\2\u019b\u019c\7o\2\2\u019c\"\3\2\2\2\u019d"+
		"\u019e\7g\2\2\u019e\u019f\7z\2\2\u019f\u01a0\7v\2\2\u01a0\u01a1\7g\2\2"+
		"\u01a1\u01a2\7p\2\2\u01a2\u01a3\7f\2\2\u01a3\u01a4\7u\2\2\u01a4$\3\2\2"+
		"\2\u01a5\u01a6\7h\2\2\u01a6\u01a7\7k\2\2\u01a7\u01a8\7p\2\2\u01a8\u01a9"+
		"\7c\2\2\u01a9\u01aa\7n\2\2\u01aa&\3\2\2\2\u01ab\u01ac\7h\2\2\u01ac\u01ad"+
		"\7k\2\2\u01ad\u01ae\7p\2\2\u01ae\u01af\7c\2\2\u01af\u01b0\7n\2\2\u01b0"+
		"\u01b1\7n\2\2\u01b1\u01b2\7{\2\2\u01b2(\3\2\2\2\u01b3\u01b4\7h\2\2\u01b4"+
		"\u01b5\7n\2\2\u01b5\u01b6\7q\2\2\u01b6\u01b7\7c\2\2\u01b7\u01b8\7v\2\2"+
		"\u01b8*\3\2\2\2\u01b9\u01ba\7h\2\2\u01ba\u01bb\7q\2\2\u01bb\u01bc\7t\2"+
		"\2\u01bc,\3\2\2\2\u01bd\u01be\7k\2\2\u01be\u01bf\7h\2\2\u01bf.\3\2\2\2"+
		"\u01c0\u01c1\7i\2\2\u01c1\u01c2\7q\2\2\u01c2\u01c3\7v\2\2\u01c3\u01c4"+
		"\7q\2\2\u01c4\60\3\2\2\2\u01c5\u01c6\7k\2\2\u01c6\u01c7\7o\2\2\u01c7\u01c8"+
		"\7r\2\2\u01c8\u01c9\7n\2\2\u01c9\u01ca\7g\2\2\u01ca\u01cb\7o\2\2\u01cb"+
		"\u01cc\7g\2\2\u01cc\u01cd\7p\2\2\u01cd\u01ce\7v\2\2\u01ce\u01cf\7u\2\2"+
		"\u01cf\62\3\2\2\2\u01d0\u01d1\7k\2\2\u01d1\u01d2\7o\2\2\u01d2\u01d3\7"+
		"r\2\2\u01d3\u01d4\7q\2\2\u01d4\u01d5\7t\2\2\u01d5\u01d6\7v\2\2\u01d6\64"+
		"\3\2\2\2\u01d7\u01d8\7k\2\2\u01d8\u01d9\7p\2\2\u01d9\u01da\7u\2\2\u01da"+
		"\u01db\7v\2\2\u01db\u01dc\7c\2\2\u01dc\u01dd\7p\2\2\u01dd\u01de\7e\2\2"+
		"\u01de\u01df\7g\2\2\u01df\u01e0\7q\2\2\u01e0\u01e1\7h\2\2\u01e1\66\3\2"+
		"\2\2\u01e2\u01e3\7k\2\2\u01e3\u01e4\7p\2\2\u01e4\u01e5\7v\2\2\u01e58\3"+
		"\2\2\2\u01e6\u01e7\7k\2\2\u01e7\u01e8\7p\2\2\u01e8\u01e9\7v\2\2\u01e9"+
		"\u01ea\7g\2\2\u01ea\u01eb\7t\2\2\u01eb\u01ec\7h\2\2\u01ec\u01ed\7c\2\2"+
		"\u01ed\u01ee\7e\2\2\u01ee\u01ef\7g\2\2\u01ef:\3\2\2\2\u01f0\u01f1\7n\2"+
		"\2\u01f1\u01f2\7q\2\2\u01f2\u01f3\7p\2\2\u01f3\u01f4\7i\2\2\u01f4<\3\2"+
		"\2\2\u01f5\u01f6\7p\2\2\u01f6\u01f7\7c\2\2\u01f7\u01f8\7v\2\2\u01f8\u01f9"+
		"\7k\2\2\u01f9\u01fa\7x\2\2\u01fa\u01fb\7g\2\2\u01fb>\3\2\2\2\u01fc\u01fd"+
		"\7p\2\2\u01fd\u01fe\7g\2\2\u01fe\u01ff\7y\2\2\u01ff@\3\2\2\2\u0200\u0201"+
		"\7r\2\2\u0201\u0202\7c\2\2\u0202\u0203\7e\2\2\u0203\u0204\7m\2\2\u0204"+
		"\u0205\7c\2\2\u0205\u0206\7i\2\2\u0206\u0207\7g\2\2\u0207B\3\2\2\2\u0208"+
		"\u0209\7r\2\2\u0209\u020a\7t\2\2\u020a\u020b\7k\2\2\u020b\u020c\7x\2\2"+
		"\u020c\u020d\7c\2\2\u020d\u020e\7v\2\2\u020e\u020f\7g\2\2\u020fD\3\2\2"+
		"\2\u0210\u0211\7r\2\2\u0211\u0212\7t\2\2\u0212\u0213\7q\2\2\u0213\u0214"+
		"\7v\2\2\u0214\u0215\7g\2\2\u0215\u0216\7e\2\2\u0216\u0217\7v\2\2\u0217"+
		"\u0218\7g\2\2\u0218\u0219\7f\2\2\u0219F\3\2\2\2\u021a\u021b\7r\2\2\u021b"+
		"\u021c\7w\2\2\u021c\u021d\7d\2\2\u021d\u021e\7n\2\2\u021e\u021f\7k\2\2"+
		"\u021f\u0220\7e\2\2\u0220H\3\2\2\2\u0221\u0222\7t\2\2\u0222\u0223\7g\2"+
		"\2\u0223\u0224\7v\2\2\u0224\u0225\7w\2\2\u0225\u0226\7t\2\2\u0226\u0227"+
		"\7p\2\2\u0227J\3\2\2\2\u0228\u0229\7u\2\2\u0229\u022a\7j\2\2\u022a\u022b"+
		"\7q\2\2\u022b\u022c\7t\2\2\u022c\u022d\7v\2\2\u022dL\3\2\2\2\u022e\u022f"+
		"\7u\2\2\u022f\u0230\7v\2\2\u0230\u0231\7c\2\2\u0231\u0232\7v\2\2\u0232"+
		"\u0233\7k\2\2\u0233\u0234\7e\2\2\u0234N\3\2\2\2\u0235\u0236\7u\2\2\u0236"+
		"\u0237\7v\2\2\u0237\u0238\7t\2\2\u0238\u0239\7k\2\2\u0239\u023a\7e\2\2"+
		"\u023a\u023b\7v\2\2\u023b\u023c\7h\2\2\u023c\u023d\7r\2\2\u023dP\3\2\2"+
		"\2\u023e\u023f\7u\2\2\u023f\u0240\7w\2\2\u0240\u0241\7r\2\2\u0241\u0242"+
		"\7g\2\2\u0242\u0243\7t\2\2\u0243R\3\2\2\2\u0244\u0245\7u\2\2\u0245\u0246"+
		"\7y\2\2\u0246\u0247\7k\2\2\u0247\u0248\7v\2\2\u0248\u0249\7e\2\2\u0249"+
		"\u024a\7j\2\2\u024aT\3\2\2\2\u024b\u024c\7u\2\2\u024c\u024d\7{\2\2\u024d"+
		"\u024e\7p\2\2\u024e\u024f\7e\2\2\u024f\u0250\7j\2\2\u0250\u0251\7t\2\2"+
		"\u0251\u0252\7q\2\2\u0252\u0253\7p\2\2\u0253\u0254\7k\2\2\u0254\u0255"+
		"\7|\2\2\u0255\u0256\7g\2\2\u0256\u0257\7f\2\2\u0257V\3\2\2\2\u0258\u0259"+
		"\7v\2\2\u0259\u025a\7j\2\2\u025a\u025b\7k\2\2\u025b\u025c\7u\2\2\u025c"+
		"X\3\2\2\2\u025d\u025e\7v\2\2\u025e\u025f\7j\2\2\u025f\u0260\7t\2\2\u0260"+
		"\u0261\7q\2\2\u0261\u0262\7y\2\2\u0262Z\3\2\2\2\u0263\u0264\7v\2\2\u0264"+
		"\u0265\7j\2\2\u0265\u0266\7t\2\2\u0266\u0267\7q\2\2\u0267\u0268\7y\2\2"+
		"\u0268\u0269\7u\2\2\u0269\\\3\2\2\2\u026a\u026b\7v\2\2\u026b\u026c\7t"+
		"\2\2\u026c\u026d\7c\2\2\u026d\u026e\7p\2\2\u026e\u026f\7u\2\2\u026f\u0270"+
		"\7k\2\2\u0270\u0271\7g\2\2\u0271\u0272\7p\2\2\u0272\u0273\7v\2\2\u0273"+
		"^\3\2\2\2\u0274\u0275\7v\2\2\u0275\u0276\7t\2\2\u0276\u0277\7{\2\2\u0277"+
		"`\3\2\2\2\u0278\u0279\7x\2\2\u0279\u027a\7q\2\2\u027a\u027b\7k\2\2\u027b"+
		"\u027c\7f\2\2\u027cb\3\2\2\2\u027d\u027e\7x\2\2\u027e\u027f\7q\2\2\u027f"+
		"\u0280\7n\2\2\u0280\u0281\7c\2\2\u0281\u0282\7v\2\2\u0282\u0283\7k\2\2"+
		"\u0283\u0284\7n\2\2\u0284\u0285\7g\2\2\u0285d\3\2\2\2\u0286\u0287\7y\2"+
		"\2\u0287\u0288\7j\2\2\u0288\u0289\7k\2\2\u0289\u028a\7n\2\2\u028a\u028b"+
		"\7g\2\2\u028bf\3\2\2\2\u028c\u028d\7Q\2\2\u028d\u028e\7O\2\2\u028e\u028f"+
		"\7R\2\2\u028f\u0290\7a\2\2\u0290\u0291\7V\2\2\u0291\u0292\7J\2\2\u0292"+
		"\u0293\7T\2\2\u0293\u0294\7G\2\2\u0294\u0295\7C\2\2\u0295\u0296\7F\2\2"+
		"\u0296\u0297\7a\2\2\u0297\u0298\7P\2\2\u0298\u0299\7W\2\2\u0299\u029a"+
		"\7O\2\2\u029ah\3\2\2\2\u029b\u029c\7Q\2\2\u029c\u029d\7O\2\2\u029d\u029e"+
		"\7R\2\2\u029e\u029f\7a\2\2\u029f\u02a0\7P\2\2\u02a0\u02a1\7W\2\2\u02a1"+
		"\u02a2\7O\2\2\u02a2\u02a3\7a\2\2\u02a3\u02a4\7V\2\2\u02a4\u02a5\7J\2\2"+
		"\u02a5\u02a6\7T\2\2\u02a6\u02a7\7G\2\2\u02a7\u02a8\7C\2\2\u02a8\u02a9"+
		"\7F\2\2\u02a9\u02aa\7U\2\2\u02aaj\3\2\2\2\u02ab\u02b0\5m\67\2\u02ac\u02b0"+
		"\5o8\2\u02ad\u02b0\5q9\2\u02ae\u02b0\5s:\2\u02af\u02ab\3\2\2\2\u02af\u02ac"+
		"\3\2\2\2\u02af\u02ad\3\2\2\2\u02af\u02ae\3\2\2\2\u02b0l\3\2\2\2\u02b1"+
		"\u02b3\5w<\2\u02b2\u02b4\5u;\2\u02b3\u02b2\3\2\2\2\u02b3\u02b4\3\2\2\2"+
		"\u02b4n\3\2\2\2\u02b5\u02b7\5\u0085C\2\u02b6\u02b8\5u;\2\u02b7\u02b6\3"+
		"\2\2\2\u02b7\u02b8\3\2\2\2\u02b8p\3\2\2\2\u02b9\u02bb\5\u008fH\2\u02ba"+
		"\u02bc\5u;\2\u02bb\u02ba\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bcr\3\2\2\2\u02bd"+
		"\u02bf\5\u0099M\2\u02be\u02c0\5u;\2\u02bf\u02be\3\2\2\2\u02bf\u02c0\3"+
		"\2\2\2\u02c0t\3\2\2\2\u02c1\u02c2\t\2\2\2\u02c2v\3\2\2\2\u02c3\u02ce\7"+
		"\62\2\2\u02c4\u02cb\5}?\2\u02c5\u02c7\5y=\2\u02c6\u02c5\3\2\2\2\u02c6"+
		"\u02c7\3\2\2\2\u02c7\u02cc\3\2\2\2\u02c8\u02c9\5\u0083B\2\u02c9\u02ca"+
		"\5y=\2\u02ca\u02cc\3\2\2\2\u02cb\u02c6\3\2\2\2\u02cb\u02c8\3\2\2\2\u02cc"+
		"\u02ce\3\2\2\2\u02cd\u02c3\3\2\2\2\u02cd\u02c4\3\2\2\2\u02cex\3\2\2\2"+
		"\u02cf\u02d4\5{>\2\u02d0\u02d2\5\177@\2\u02d1\u02d0\3\2\2\2\u02d1\u02d2"+
		"\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d5\5{>\2\u02d4\u02d1\3\2\2\2\u02d4"+
		"\u02d5\3\2\2\2\u02d5z\3\2\2\2\u02d6\u02d9\7\62\2\2\u02d7\u02d9\5}?\2\u02d8"+
		"\u02d6\3\2\2\2\u02d8\u02d7\3\2\2\2\u02d9|\3\2\2\2\u02da\u02db\t\3\2\2"+
		"\u02db~\3\2\2\2\u02dc\u02de\5\u0081A\2\u02dd\u02dc\3\2\2\2\u02de\u02df"+
		"\3\2\2\2\u02df\u02dd\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u0080\3\2\2\2\u02e1"+
		"\u02e4\5{>\2\u02e2\u02e4\7a\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e2\3\2\2"+
		"\2\u02e4\u0082\3\2\2\2\u02e5\u02e7\7a\2\2\u02e6\u02e5\3\2\2\2\u02e7\u02e8"+
		"\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u0084\3\2\2\2\u02ea"+
		"\u02eb\7\62\2\2\u02eb\u02ec\t\4\2\2\u02ec\u02ed\5\u0087D\2\u02ed\u0086"+
		"\3\2\2\2\u02ee\u02f3\5\u0089E\2\u02ef\u02f1\5\u008bF\2\u02f0\u02ef\3\2"+
		"\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f4\5\u0089E\2\u02f3"+
		"\u02f0\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u0088\3\2\2\2\u02f5\u02f6\t\5"+
		"\2\2\u02f6\u008a\3\2\2\2\u02f7\u02f9\5\u008dG\2\u02f8\u02f7\3\2\2\2\u02f9"+
		"\u02fa\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u008c\3\2"+
		"\2\2\u02fc\u02ff\5\u0089E\2\u02fd\u02ff\7a\2\2\u02fe\u02fc\3\2\2\2\u02fe"+
		"\u02fd\3\2\2\2\u02ff\u008e\3\2\2\2\u0300\u0302\7\62\2\2\u0301\u0303\5"+
		"\u0083B\2\u0302\u0301\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0304\3\2\2\2"+
		"\u0304\u0305\5\u0091I\2\u0305\u0090\3\2\2\2\u0306\u030b\5\u0093J\2\u0307"+
		"\u0309\5\u0095K\2\u0308\u0307\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030a"+
		"\3\2\2\2\u030a\u030c\5\u0093J\2\u030b\u0308\3\2\2\2\u030b\u030c\3\2\2"+
		"\2\u030c\u0092\3\2\2\2\u030d\u030e\t\6\2\2\u030e\u0094\3\2\2\2\u030f\u0311"+
		"\5\u0097L\2\u0310\u030f\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0310\3\2\2"+
		"\2\u0312\u0313\3\2\2\2\u0313\u0096\3\2\2\2\u0314\u0317\5\u0093J\2\u0315"+
		"\u0317\7a\2\2\u0316\u0314\3\2\2\2\u0316\u0315\3\2\2\2\u0317\u0098\3\2"+
		"\2\2\u0318\u0319\7\62\2\2\u0319\u031a\t\7\2\2\u031a\u031b\5\u009bN\2\u031b"+
		"\u009a\3\2\2\2\u031c\u0321\5\u009dO\2\u031d\u031f\5\u009fP\2\u031e\u031d"+
		"\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0322\5\u009dO"+
		"\2\u0321\u031e\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u009c\3\2\2\2\u0323\u0324"+
		"\t\b\2\2\u0324\u009e\3\2\2\2\u0325\u0327\5\u00a1Q\2\u0326\u0325\3\2\2"+
		"\2\u0327\u0328\3\2\2\2\u0328\u0326\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u00a0"+
		"\3\2\2\2\u032a\u032d\5\u009dO\2\u032b\u032d\7a\2\2\u032c\u032a\3\2\2\2"+
		"\u032c\u032b\3\2\2\2\u032d\u00a2\3\2\2\2\u032e\u0331\5\u00a5S\2\u032f"+
		"\u0331\5\u00b1Y\2\u0330\u032e\3\2\2\2\u0330\u032f\3\2\2\2\u0331\u00a4"+
		"\3\2\2\2\u0332\u0333\5y=\2\u0333\u0335\7\60\2\2\u0334\u0336\5y=\2\u0335"+
		"\u0334\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0338\3\2\2\2\u0337\u0339\5\u00a7"+
		"T\2\u0338\u0337\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033b\3\2\2\2\u033a"+
		"\u033c\5\u00afX\2\u033b\u033a\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u034e"+
		"\3\2\2\2\u033d\u033e\7\60\2\2\u033e\u0340\5y=\2\u033f\u0341\5\u00a7T\2"+
		"\u0340\u033f\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0343\3\2\2\2\u0342\u0344"+
		"\5\u00afX\2\u0343\u0342\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u034e\3\2\2"+
		"\2\u0345\u0346\5y=\2\u0346\u0348\5\u00a7T\2\u0347\u0349\5\u00afX\2\u0348"+
		"\u0347\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034e\3\2\2\2\u034a\u034b\5y"+
		"=\2\u034b\u034c\5\u00afX\2\u034c\u034e\3\2\2\2\u034d\u0332\3\2\2\2\u034d"+
		"\u033d\3\2\2\2\u034d\u0345\3\2\2\2\u034d\u034a\3\2\2\2\u034e\u00a6\3\2"+
		"\2\2\u034f\u0350\5\u00a9U\2\u0350\u0351\5\u00abV\2\u0351\u00a8\3\2\2\2"+
		"\u0352\u0353\t\t\2\2\u0353\u00aa\3\2\2\2\u0354\u0356\5\u00adW\2\u0355"+
		"\u0354\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0358\5y"+
		"=\2\u0358\u00ac\3\2\2\2\u0359\u035a\t\n\2\2\u035a\u00ae\3\2\2\2\u035b"+
		"\u035c\t\13\2\2\u035c\u00b0\3\2\2\2\u035d\u035e\5\u00b3Z\2\u035e\u0360"+
		"\5\u00b5[\2\u035f\u0361\5\u00afX\2\u0360\u035f\3\2\2\2\u0360\u0361\3\2"+
		"\2\2\u0361\u00b2\3\2\2\2\u0362\u0364\5\u0085C\2\u0363\u0365\7\60\2\2\u0364"+
		"\u0363\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u036e\3\2\2\2\u0366\u0367\7\62"+
		"\2\2\u0367\u0369\t\4\2\2\u0368\u036a\5\u0087D\2\u0369\u0368\3\2\2\2\u0369"+
		"\u036a\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036c\7\60\2\2\u036c\u036e\5"+
		"\u0087D\2\u036d\u0362\3\2\2\2\u036d\u0366\3\2\2\2\u036e\u00b4\3\2\2\2"+
		"\u036f\u0370\5\u00b7\\\2\u0370\u0371\5\u00abV\2\u0371\u00b6\3\2\2\2\u0372"+
		"\u0373\t\f\2\2\u0373\u00b8\3\2\2\2\u0374\u0375\7v\2\2\u0375\u0376\7t\2"+
		"\2\u0376\u0377\7w\2\2\u0377\u037e\7g\2\2\u0378\u0379\7h\2\2\u0379\u037a"+
		"\7c\2\2\u037a\u037b\7n\2\2\u037b\u037c\7u\2\2\u037c\u037e\7g\2\2\u037d"+
		"\u0374\3\2\2\2\u037d\u0378\3\2\2\2\u037e\u00ba\3\2\2\2\u037f\u0380\7)"+
		"\2\2\u0380\u0381\5\u00bd_\2\u0381\u0382\7)\2\2\u0382\u0388\3\2\2\2\u0383"+
		"\u0384\7)\2\2\u0384\u0385\5\u00c5c\2\u0385\u0386\7)\2\2\u0386\u0388\3"+
		"\2\2\2\u0387\u037f\3\2\2\2\u0387\u0383\3\2\2\2\u0388\u00bc\3\2\2\2\u0389"+
		"\u038a\n\r\2\2\u038a\u00be\3\2\2\2\u038b\u038d\7$\2\2\u038c\u038e\5\u00c1"+
		"a\2\u038d\u038c\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u038f\3\2\2\2\u038f"+
		"\u0390\7$\2\2\u0390\u00c0\3\2\2\2\u0391\u0393\5\u00c3b\2\u0392\u0391\3"+
		"\2\2\2\u0393\u0394\3\2\2\2\u0394\u0392\3\2\2\2\u0394\u0395\3\2\2\2\u0395"+
		"\u00c2\3\2\2\2\u0396\u0399\n\16\2\2\u0397\u0399\5\u00c5c\2\u0398\u0396"+
		"\3\2\2\2\u0398\u0397\3\2\2\2\u0399\u00c4\3\2\2\2\u039a\u039b\7^\2\2\u039b"+
		"\u039f\t\17\2\2\u039c\u039f\5\u00c7d\2\u039d\u039f\5\u00cbf\2\u039e\u039a"+
		"\3\2\2\2\u039e\u039c\3\2\2\2\u039e\u039d\3\2\2\2\u039f\u00c6\3\2\2\2\u03a0"+
		"\u03a1\7^\2\2\u03a1\u03ac\5\u0093J\2\u03a2\u03a3\7^\2\2\u03a3\u03a4\5"+
		"\u0093J\2\u03a4\u03a5\5\u0093J\2\u03a5\u03ac\3\2\2\2\u03a6\u03a7\7^\2"+
		"\2\u03a7\u03a8\5\u00c9e\2\u03a8\u03a9\5\u0093J\2\u03a9\u03aa\5\u0093J"+
		"\2\u03aa\u03ac\3\2\2\2\u03ab\u03a0\3\2\2\2\u03ab\u03a2\3\2\2\2\u03ab\u03a6"+
		"\3\2\2\2\u03ac\u00c8\3\2\2\2\u03ad\u03ae\t\20\2\2\u03ae\u00ca\3\2\2\2"+
		"\u03af\u03b0\7^\2\2\u03b0\u03b1\7w\2\2\u03b1\u03b2\5\u0089E\2\u03b2\u03b3"+
		"\5\u0089E\2\u03b3\u03b4\5\u0089E\2\u03b4\u03b5\5\u0089E\2\u03b5\u00cc"+
		"\3\2\2\2\u03b6\u03b7\7p\2\2\u03b7\u03b8\7w\2\2\u03b8\u03b9\7n\2\2\u03b9"+
		"\u03ba\7n\2\2\u03ba\u00ce\3\2\2\2\u03bb\u03bc\7*\2\2\u03bc\u00d0\3\2\2"+
		"\2\u03bd\u03be\7+\2\2\u03be\u00d2\3\2\2\2\u03bf\u03c0\7}\2\2\u03c0\u00d4"+
		"\3\2\2\2\u03c1\u03c2\7\177\2\2\u03c2\u00d6\3\2\2\2\u03c3\u03c4\7]\2\2"+
		"\u03c4\u00d8\3\2\2\2\u03c5\u03c6\7_\2\2\u03c6\u00da\3\2\2\2\u03c7\u03c8"+
		"\7=\2\2\u03c8\u00dc\3\2\2\2\u03c9\u03ca\7.\2\2\u03ca\u00de\3\2\2\2\u03cb"+
		"\u03cc\7\60\2\2\u03cc\u00e0\3\2\2\2\u03cd\u03ce\7?\2\2\u03ce\u00e2\3\2"+
		"\2\2\u03cf\u03d0\7@\2\2\u03d0\u00e4\3\2\2\2\u03d1\u03d2\7>\2\2\u03d2\u00e6"+
		"\3\2\2\2\u03d3\u03d4\7#\2\2\u03d4\u00e8\3\2\2\2\u03d5\u03d6\7\u0080\2"+
		"\2\u03d6\u00ea\3\2\2\2\u03d7\u03d8\7A\2\2\u03d8\u00ec\3\2\2\2\u03d9\u03da"+
		"\7<\2\2\u03da\u00ee\3\2\2\2\u03db\u03dc\7?\2\2\u03dc\u03dd\7?\2\2\u03dd"+
		"\u00f0\3\2\2\2\u03de\u03df\7>\2\2\u03df\u03e0\7?\2\2\u03e0\u00f2\3\2\2"+
		"\2\u03e1\u03e2\7@\2\2\u03e2\u03e3\7?\2\2\u03e3\u00f4\3\2\2\2\u03e4\u03e5"+
		"\7#\2\2\u03e5\u03e6\7?\2\2\u03e6\u00f6\3\2\2\2\u03e7\u03e8\7(\2\2\u03e8"+
		"\u03e9\7(\2\2\u03e9\u00f8\3\2\2\2\u03ea\u03eb\7~\2\2\u03eb\u03ec\7~\2"+
		"\2\u03ec\u00fa\3\2\2\2\u03ed\u03ee\7-\2\2\u03ee\u03ef\7-\2\2\u03ef\u00fc"+
		"\3\2\2\2\u03f0\u03f1\7/\2\2\u03f1\u03f2\7/\2\2\u03f2\u00fe\3\2\2\2\u03f3"+
		"\u03f4\7-\2\2\u03f4\u0100\3\2\2\2\u03f5\u03f6\7/\2\2\u03f6\u0102\3\2\2"+
		"\2\u03f7\u03f8\7,\2\2\u03f8\u0104\3\2\2\2\u03f9\u03fa\7\61\2\2\u03fa\u0106"+
		"\3\2\2\2\u03fb\u03fc\7(\2\2\u03fc\u0108\3\2\2\2\u03fd\u03fe\7~\2\2\u03fe"+
		"\u010a\3\2\2\2\u03ff\u0400\7`\2\2\u0400\u010c\3\2\2\2\u0401\u0402\7\'"+
		"\2\2\u0402\u010e\3\2\2\2\u0403\u0404\7/\2\2\u0404\u0405\7@\2\2\u0405\u0110"+
		"\3\2\2\2\u0406\u0407\7<\2\2\u0407\u0408\7<\2\2\u0408\u0112\3\2\2\2\u0409"+
		"\u040a\7-\2\2\u040a\u040b\7?\2\2\u040b\u0114\3\2\2\2\u040c\u040d\7/\2"+
		"\2\u040d\u040e\7?\2\2\u040e\u0116\3\2\2\2\u040f\u0410\7,\2\2\u0410\u0411"+
		"\7?\2\2\u0411\u0118\3\2\2\2\u0412\u0413\7\61\2\2\u0413\u0414\7?\2\2\u0414"+
		"\u011a\3\2\2\2\u0415\u0416\7(\2\2\u0416\u0417\7?\2\2\u0417\u011c\3\2\2"+
		"\2\u0418\u0419\7~\2\2\u0419\u041a\7?\2\2\u041a\u011e\3\2\2\2\u041b\u041c"+
		"\7`\2\2\u041c\u041d\7?\2\2\u041d\u0120\3\2\2\2\u041e\u041f\7\'\2\2\u041f"+
		"\u0420\7?\2\2\u0420\u0122\3\2\2\2\u0421\u0422\7>\2\2\u0422\u0423\7>\2"+
		"\2\u0423\u0424\7?\2\2\u0424\u0124\3\2\2\2\u0425\u0426\7@\2\2\u0426\u0427"+
		"\7@\2\2\u0427\u0428\7?\2\2\u0428\u0126\3\2\2\2\u0429\u042a\7@\2\2\u042a"+
		"\u042b\7@\2\2\u042b\u042c\7@\2\2\u042c\u042d\7?\2\2\u042d\u0128\3\2\2"+
		"\2\u042e\u0432\5\u012b\u0096\2\u042f\u0431\5\u012d\u0097\2\u0430\u042f"+
		"\3\2\2\2\u0431\u0434\3\2\2\2\u0432\u0430\3\2\2\2\u0432\u0433\3\2\2\2\u0433"+
		"\u012a\3\2\2\2\u0434\u0432\3\2\2\2\u0435\u043c\t\21\2\2\u0436\u0437\n"+
		"\22\2\2\u0437\u043c\6\u0096\2\2\u0438\u0439\t\23\2\2\u0439\u043a\t\24"+
		"\2\2\u043a\u043c\6\u0096\3\2\u043b\u0435\3\2\2\2\u043b\u0436\3\2\2\2\u043b"+
		"\u0438\3\2\2\2\u043c\u012c\3\2\2\2\u043d\u0444\t\25\2\2\u043e\u043f\n"+
		"\22\2\2\u043f\u0444\6\u0097\4\2\u0440\u0441\t\23\2\2\u0441\u0442\t\24"+
		"\2\2\u0442\u0444\6\u0097\5\2\u0443\u043d\3\2\2\2\u0443\u043e\3\2\2\2\u0443"+
		"\u0440\3\2\2\2\u0444\u012e\3\2\2\2\u0445\u0446\7B\2\2\u0446\u0130\3\2"+
		"\2\2\u0447\u0448\7\60\2\2\u0448\u0449\7\60\2\2\u0449\u044a\7\60\2\2\u044a"+
		"\u0132\3\2\2\2\u044b\u044d\t\26\2\2\u044c\u044b\3\2\2\2\u044d\u044e\3"+
		"\2\2\2\u044e\u044c\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0450\3\2\2\2\u0450"+
		"\u0451\b\u009a\2\2\u0451\u0134\3\2\2\2\u0452\u0453\7\61\2\2\u0453\u0454"+
		"\7,\2\2\u0454\u0458\3\2\2\2\u0455\u0457\13\2\2\2\u0456\u0455\3\2\2\2\u0457"+
		"\u045a\3\2\2\2\u0458\u0459\3\2\2\2\u0458\u0456\3\2\2\2\u0459\u045b\3\2"+
		"\2\2\u045a\u0458\3\2\2\2\u045b\u045c\7,\2\2\u045c\u045d\7\61\2\2\u045d"+
		"\u045e\3\2\2\2\u045e\u045f\b\u009b\3\2\u045f\u0136\3\2\2\2\u0460\u0461"+
		"\7\61\2\2\u0461\u0462\7\61\2\2\u0462\u0466\3\2\2\2\u0463\u0465\n\27\2"+
		"\2\u0464\u0463\3\2\2\2\u0465\u0468\3\2\2\2\u0466\u0464\3\2\2\2\u0466\u0467"+
		"\3\2\2\2\u0467\u0469\3\2\2\2\u0468\u0466\3\2\2\2\u0469\u046a\b\u009c\4"+
		"\2\u046a\u0138\3\2\2\28\2\u02af\u02b3\u02b7\u02bb\u02bf\u02c6\u02cb\u02cd"+
		"\u02d1\u02d4\u02d8\u02df\u02e3\u02e8\u02f0\u02f3\u02fa\u02fe\u0302\u0308"+
		"\u030b\u0312\u0316\u031e\u0321\u0328\u032c\u0330\u0335\u0338\u033b\u0340"+
		"\u0343\u0348\u034d\u0355\u0360\u0364\u0369\u036d\u037d\u0387\u038d\u0394"+
		"\u0398\u039e\u03ab\u0432\u043b\u0443\u044e\u0458\u0466\5\3\u009a\2\3\u009b"+
		"\3\3\u009c\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}