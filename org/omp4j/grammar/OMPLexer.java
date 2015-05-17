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
		T__3=1, T__2=2, T__1=3, T__0=4, OMP=5, PARALLEL=6, FOR=7, SECTIONS=8, 
		SECTION=9, SINGLE=10, MASTER=11, BARRIER=12, ATOMIC=13, CRITICAL=14, PUBLIC=15, 
		PRIVATE=16, FIRSTPRIVATE=17, SCHEDULE=18, THREAD_NUM=19, VAR=20, FULLNAME=21, 
		NUMBER=22, WS=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "OMP", "PARALLEL", "FOR", "SECTIONS", 
		"SECTION", "SINGLE", "MASTER", "BARRIER", "ATOMIC", "CRITICAL", "PUBLIC", 
		"PRIVATE", "FIRSTPRIVATE", "SCHEDULE", "THREAD_NUM", "VAR", "FULLNAME", 
		"NUMBER", "WS", "JavaLetter", "JavaLetterOrDigit", "Digits", "Digit", 
		"NonZeroDigit", "DigitsAndUnderscores", "DigitOrUnderscore"
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
		case 23: return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 24: return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u00fb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\7\25\u00c1\n\25\f\25\16\25\u00c4\13\25\3\26"+
		"\3\26\7\26\u00c8\n\26\f\26\16\26\u00cb\13\26\3\27\3\27\3\30\6\30\u00d0"+
		"\n\30\r\30\16\30\u00d1\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00dc"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00e4\n\32\3\33\3\33\5\33\u00e8"+
		"\n\33\3\33\5\33\u00eb\n\33\3\34\3\34\5\34\u00ef\n\34\3\35\3\35\3\36\6"+
		"\36\u00f4\n\36\r\36\16\36\u00f5\3\37\3\37\5\37\u00fa\n\37\2\2 \3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\2\63\2\65\2\67\29\2;\2=\2\3\2\t\5\2\13"+
		"\f\16\17\"\"\6\2&&C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802\udc01\3\2"+
		"\udc02\ue001\7\2&&\62;C\\aac|\3\2\63;\u00ff\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7"+
		"C\3\2\2\2\tE\3\2\2\2\13G\3\2\2\2\rK\3\2\2\2\17T\3\2\2\2\21X\3\2\2\2\23"+
		"a\3\2\2\2\25i\3\2\2\2\27p\3\2\2\2\31w\3\2\2\2\33\177\3\2\2\2\35\u0086"+
		"\3\2\2\2\37\u008f\3\2\2\2!\u0096\3\2\2\2#\u009e\3\2\2\2%\u00ab\3\2\2\2"+
		"\'\u00b4\3\2\2\2)\u00be\3\2\2\2+\u00c5\3\2\2\2-\u00cc\3\2\2\2/\u00cf\3"+
		"\2\2\2\61\u00db\3\2\2\2\63\u00e3\3\2\2\2\65\u00e5\3\2\2\2\67\u00ee\3\2"+
		"\2\29\u00f0\3\2\2\2;\u00f3\3\2\2\2=\u00f9\3\2\2\2?@\7*\2\2@\4\3\2\2\2"+
		"AB\7+\2\2B\6\3\2\2\2CD\7.\2\2D\b\3\2\2\2EF\7\60\2\2F\n\3\2\2\2GH\7q\2"+
		"\2HI\7o\2\2IJ\7r\2\2J\f\3\2\2\2KL\7r\2\2LM\7c\2\2MN\7t\2\2NO\7c\2\2OP"+
		"\7n\2\2PQ\7n\2\2QR\7g\2\2RS\7n\2\2S\16\3\2\2\2TU\7h\2\2UV\7q\2\2VW\7t"+
		"\2\2W\20\3\2\2\2XY\7u\2\2YZ\7g\2\2Z[\7e\2\2[\\\7v\2\2\\]\7k\2\2]^\7q\2"+
		"\2^_\7p\2\2_`\7u\2\2`\22\3\2\2\2ab\7u\2\2bc\7g\2\2cd\7e\2\2de\7v\2\2e"+
		"f\7k\2\2fg\7q\2\2gh\7p\2\2h\24\3\2\2\2ij\7u\2\2jk\7k\2\2kl\7p\2\2lm\7"+
		"i\2\2mn\7n\2\2no\7g\2\2o\26\3\2\2\2pq\7o\2\2qr\7c\2\2rs\7u\2\2st\7v\2"+
		"\2tu\7g\2\2uv\7t\2\2v\30\3\2\2\2wx\7d\2\2xy\7c\2\2yz\7t\2\2z{\7t\2\2{"+
		"|\7k\2\2|}\7g\2\2}~\7t\2\2~\32\3\2\2\2\177\u0080\7c\2\2\u0080\u0081\7"+
		"v\2\2\u0081\u0082\7q\2\2\u0082\u0083\7o\2\2\u0083\u0084\7k\2\2\u0084\u0085"+
		"\7e\2\2\u0085\34\3\2\2\2\u0086\u0087\7e\2\2\u0087\u0088\7t\2\2\u0088\u0089"+
		"\7k\2\2\u0089\u008a\7v\2\2\u008a\u008b\7k\2\2\u008b\u008c\7e\2\2\u008c"+
		"\u008d\7c\2\2\u008d\u008e\7n\2\2\u008e\36\3\2\2\2\u008f\u0090\7r\2\2\u0090"+
		"\u0091\7w\2\2\u0091\u0092\7d\2\2\u0092\u0093\7n\2\2\u0093\u0094\7k\2\2"+
		"\u0094\u0095\7e\2\2\u0095 \3\2\2\2\u0096\u0097\7r\2\2\u0097\u0098\7t\2"+
		"\2\u0098\u0099\7k\2\2\u0099\u009a\7x\2\2\u009a\u009b\7c\2\2\u009b\u009c"+
		"\7v\2\2\u009c\u009d\7g\2\2\u009d\"\3\2\2\2\u009e\u009f\7h\2\2\u009f\u00a0"+
		"\7k\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7v\2\2\u00a3"+
		"\u00a4\7r\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7x\2\2"+
		"\u00a7\u00a8\7c\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7g\2\2\u00aa$\3\2\2"+
		"\2\u00ab\u00ac\7u\2\2\u00ac\u00ad\7e\2\2\u00ad\u00ae\7j\2\2\u00ae\u00af"+
		"\7g\2\2\u00af\u00b0\7f\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2\7n\2\2\u00b2"+
		"\u00b3\7g\2\2\u00b3&\3\2\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7j\2\2\u00b6"+
		"\u00b7\7t\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7f\2\2"+
		"\u00ba\u00bb\7P\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\7o\2\2\u00bd(\3\2\2"+
		"\2\u00be\u00c2\5\61\31\2\u00bf\u00c1\5\63\32\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3*\3\2\2\2"+
		"\u00c4\u00c2\3\2\2\2\u00c5\u00c9\5\61\31\2\u00c6\u00c8\5\63\32\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca,\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\5\65\33\2\u00cd.\3"+
		"\2\2\2\u00ce\u00d0\t\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\b\30"+
		"\2\2\u00d4\60\3\2\2\2\u00d5\u00dc\t\3\2\2\u00d6\u00d7\n\4\2\2\u00d7\u00dc"+
		"\6\31\2\2\u00d8\u00d9\t\5\2\2\u00d9\u00da\t\6\2\2\u00da\u00dc\6\31\3\2"+
		"\u00db\u00d5\3\2\2\2\u00db\u00d6\3\2\2\2\u00db\u00d8\3\2\2\2\u00dc\62"+
		"\3\2\2\2\u00dd\u00e4\t\7\2\2\u00de\u00df\n\4\2\2\u00df\u00e4\6\32\4\2"+
		"\u00e0\u00e1\t\5\2\2\u00e1\u00e2\t\6\2\2\u00e2\u00e4\6\32\5\2\u00e3\u00dd"+
		"\3\2\2\2\u00e3\u00de\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e4\64\3\2\2\2\u00e5"+
		"\u00ea\5\67\34\2\u00e6\u00e8\5;\36\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3"+
		"\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\5\67\34\2\u00ea\u00e7\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\66\3\2\2\2\u00ec\u00ef\7\62\2\2\u00ed\u00ef\59\35"+
		"\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef8\3\2\2\2\u00f0\u00f1"+
		"\t\b\2\2\u00f1:\3\2\2\2\u00f2\u00f4\5=\37\2\u00f3\u00f2\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6<\3\2\2\2"+
		"\u00f7\u00fa\5\67\34\2\u00f8\u00fa\7a\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8"+
		"\3\2\2\2\u00fa>\3\2\2\2\r\2\u00c2\u00c9\u00d1\u00db\u00e3\u00e7\u00ea"+
		"\u00ee\u00f5\u00f9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}