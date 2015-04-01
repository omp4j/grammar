// Generated from OMP.g4 by ANTLR 4.4
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
public class OMPLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, OMP=4, PARALLEL=5, FOR=6, SECTIONS=7, SECTION=8, 
		SINGLE=9, MASTER=10, BARRIER=11, ATOMIC=12, CRITICAL=13, OMPTHREADNUM=14, 
		OMPNUMTHREADS=15, PUBLIC=16, PRIVATE=17, FIRSTPRIVATE=18, SCHEDULE=19, 
		STATIC=20, DYNAMIC=21, THREAD_NUM=22, VAR=23, NUMBER=24, WS=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "OMP", "PARALLEL", "FOR", "SECTIONS", "SECTION", 
		"SINGLE", "MASTER", "BARRIER", "ATOMIC", "CRITICAL", "OMPTHREADNUM", "OMPNUMTHREADS", 
		"PUBLIC", "PRIVATE", "FIRSTPRIVATE", "SCHEDULE", "STATIC", "DYNAMIC", 
		"THREAD_NUM", "VAR", "NUMBER", "WS", "JavaLetter", "JavaLetterOrDigit", 
		"Digits", "Digit", "NonZeroDigit", "DigitsAndUnderscores", "DigitOrUnderscore"
	};


	public OMPLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "OMP.g4"; }

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
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 25: return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 26: return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u0124\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\7\30\u00f1\n\30\f\30\16\30\u00f4"+
		"\13\30\3\31\3\31\3\32\6\32\u00f9\n\32\r\32\16\32\u00fa\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u0105\n\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u010d\n\34\3\35\3\35\5\35\u0111\n\35\3\35\5\35\u0114\n\35\3\36\3"+
		"\36\5\36\u0118\n\36\3\37\3\37\3 \6 \u011d\n \r \16 \u011e\3!\3!\5!\u0123"+
		"\n!\2\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\2\67\2"+
		"9\2;\2=\2?\2A\2\3\2\t\5\2\13\f\16\17\"\"\6\2&&C\\aac|\4\2\2\u0101\ud802"+
		"\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\3\2\63;\u0127"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\3C\3\2\2\2\5E\3\2\2\2\7G\3\2\2\2\tI\3\2\2"+
		"\2\13M\3\2\2\2\rV\3\2\2\2\17Z\3\2\2\2\21c\3\2\2\2\23k\3\2\2\2\25r\3\2"+
		"\2\2\27y\3\2\2\2\31\u0081\3\2\2\2\33\u0088\3\2\2\2\35\u0091\3\2\2\2\37"+
		"\u00a0\3\2\2\2!\u00b0\3\2\2\2#\u00b7\3\2\2\2%\u00bf\3\2\2\2\'\u00cc\3"+
		"\2\2\2)\u00d5\3\2\2\2+\u00dc\3\2\2\2-\u00e4\3\2\2\2/\u00ee\3\2\2\2\61"+
		"\u00f5\3\2\2\2\63\u00f8\3\2\2\2\65\u0104\3\2\2\2\67\u010c\3\2\2\29\u010e"+
		"\3\2\2\2;\u0117\3\2\2\2=\u0119\3\2\2\2?\u011c\3\2\2\2A\u0122\3\2\2\2C"+
		"D\7*\2\2D\4\3\2\2\2EF\7+\2\2F\6\3\2\2\2GH\7.\2\2H\b\3\2\2\2IJ\7q\2\2J"+
		"K\7o\2\2KL\7r\2\2L\n\3\2\2\2MN\7r\2\2NO\7c\2\2OP\7t\2\2PQ\7c\2\2QR\7n"+
		"\2\2RS\7n\2\2ST\7g\2\2TU\7n\2\2U\f\3\2\2\2VW\7h\2\2WX\7q\2\2XY\7t\2\2"+
		"Y\16\3\2\2\2Z[\7u\2\2[\\\7g\2\2\\]\7e\2\2]^\7v\2\2^_\7k\2\2_`\7q\2\2`"+
		"a\7p\2\2ab\7u\2\2b\20\3\2\2\2cd\7u\2\2de\7g\2\2ef\7e\2\2fg\7v\2\2gh\7"+
		"k\2\2hi\7q\2\2ij\7p\2\2j\22\3\2\2\2kl\7u\2\2lm\7k\2\2mn\7p\2\2no\7i\2"+
		"\2op\7n\2\2pq\7g\2\2q\24\3\2\2\2rs\7o\2\2st\7c\2\2tu\7u\2\2uv\7v\2\2v"+
		"w\7g\2\2wx\7t\2\2x\26\3\2\2\2yz\7d\2\2z{\7c\2\2{|\7t\2\2|}\7t\2\2}~\7"+
		"k\2\2~\177\7g\2\2\177\u0080\7t\2\2\u0080\30\3\2\2\2\u0081\u0082\7c\2\2"+
		"\u0082\u0083\7v\2\2\u0083\u0084\7q\2\2\u0084\u0085\7o\2\2\u0085\u0086"+
		"\7k\2\2\u0086\u0087\7e\2\2\u0087\32\3\2\2\2\u0088\u0089\7e\2\2\u0089\u008a"+
		"\7t\2\2\u008a\u008b\7k\2\2\u008b\u008c\7v\2\2\u008c\u008d\7k\2\2\u008d"+
		"\u008e\7e\2\2\u008e\u008f\7c\2\2\u008f\u0090\7n\2\2\u0090\34\3\2\2\2\u0091"+
		"\u0092\7Q\2\2\u0092\u0093\7O\2\2\u0093\u0094\7R\2\2\u0094\u0095\7a\2\2"+
		"\u0095\u0096\7V\2\2\u0096\u0097\7J\2\2\u0097\u0098\7T\2\2\u0098\u0099"+
		"\7G\2\2\u0099\u009a\7C\2\2\u009a\u009b\7F\2\2\u009b\u009c\7a\2\2\u009c"+
		"\u009d\7P\2\2\u009d\u009e\7W\2\2\u009e\u009f\7O\2\2\u009f\36\3\2\2\2\u00a0"+
		"\u00a1\7Q\2\2\u00a1\u00a2\7O\2\2\u00a2\u00a3\7R\2\2\u00a3\u00a4\7a\2\2"+
		"\u00a4\u00a5\7P\2\2\u00a5\u00a6\7W\2\2\u00a6\u00a7\7O\2\2\u00a7\u00a8"+
		"\7a\2\2\u00a8\u00a9\7V\2\2\u00a9\u00aa\7J\2\2\u00aa\u00ab\7T\2\2\u00ab"+
		"\u00ac\7G\2\2\u00ac\u00ad\7C\2\2\u00ad\u00ae\7F\2\2\u00ae\u00af\7U\2\2"+
		"\u00af \3\2\2\2\u00b0\u00b1\7r\2\2\u00b1\u00b2\7w\2\2\u00b2\u00b3\7d\2"+
		"\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7e\2\2\u00b6\"\3"+
		"\2\2\2\u00b7\u00b8\7r\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7k\2\2\u00ba"+
		"\u00bb\7x\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7g\2\2"+
		"\u00be$\3\2\2\2\u00bf\u00c0\7h\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7t\2"+
		"\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7r\2\2\u00c5\u00c6"+
		"\7t\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7x\2\2\u00c8\u00c9\7c\2\2\u00c9"+
		"\u00ca\7v\2\2\u00ca\u00cb\7g\2\2\u00cb&\3\2\2\2\u00cc\u00cd\7u\2\2\u00cd"+
		"\u00ce\7e\2\2\u00ce\u00cf\7j\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7f\2\2"+
		"\u00d1\u00d2\7w\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7g\2\2\u00d4(\3\2\2"+
		"\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9"+
		"\7v\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7e\2\2\u00db*\3\2\2\2\u00dc\u00dd"+
		"\7f\2\2\u00dd\u00de\7{\2\2\u00de\u00df\7p\2\2\u00df\u00e0\7c\2\2\u00e0"+
		"\u00e1\7o\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7e\2\2\u00e3,\3\2\2\2\u00e4"+
		"\u00e5\7v\2\2\u00e5\u00e6\7j\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7g\2\2"+
		"\u00e8\u00e9\7c\2\2\u00e9\u00ea\7f\2\2\u00ea\u00eb\7P\2\2\u00eb\u00ec"+
		"\7w\2\2\u00ec\u00ed\7o\2\2\u00ed.\3\2\2\2\u00ee\u00f2\5\65\33\2\u00ef"+
		"\u00f1\5\67\34\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3"+
		"\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\60\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5"+
		"\u00f6\59\35\2\u00f6\62\3\2\2\2\u00f7\u00f9\t\2\2\2\u00f8\u00f7\3\2\2"+
		"\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fc\u00fd\b\32\2\2\u00fd\64\3\2\2\2\u00fe\u0105\t\3\2\2\u00ff"+
		"\u0100\n\4\2\2\u0100\u0105\6\33\2\2\u0101\u0102\t\5\2\2\u0102\u0103\t"+
		"\6\2\2\u0103\u0105\6\33\3\2\u0104\u00fe\3\2\2\2\u0104\u00ff\3\2\2\2\u0104"+
		"\u0101\3\2\2\2\u0105\66\3\2\2\2\u0106\u010d\t\7\2\2\u0107\u0108\n\4\2"+
		"\2\u0108\u010d\6\34\4\2\u0109\u010a\t\5\2\2\u010a\u010b\t\6\2\2\u010b"+
		"\u010d\6\34\5\2\u010c\u0106\3\2\2\2\u010c\u0107\3\2\2\2\u010c\u0109\3"+
		"\2\2\2\u010d8\3\2\2\2\u010e\u0113\5;\36\2\u010f\u0111\5? \2\u0110\u010f"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\5;\36\2\u0113"+
		"\u0110\3\2\2\2\u0113\u0114\3\2\2\2\u0114:\3\2\2\2\u0115\u0118\7\62\2\2"+
		"\u0116\u0118\5=\37\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118<\3"+
		"\2\2\2\u0119\u011a\t\b\2\2\u011a>\3\2\2\2\u011b\u011d\5A!\2\u011c\u011b"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"@\3\2\2\2\u0120\u0123\5;\36\2\u0121\u0123\7a\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0121\3\2\2\2\u0123B\3\2\2\2\f\2\u00f2\u00fa\u0104\u010c\u0110\u0113"+
		"\u0117\u011e\u0122\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}