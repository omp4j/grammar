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
		SINGLE=9, MASTER=10, BARRIER=11, ATOMIC=12, CRITICAL=13, PUBLIC=14, PRIVATE=15, 
		SCHEDULE=16, STATIC=17, DYNAMIC=18, THREAD_NUM=19, VAR=20, NUMBER=21, 
		WS=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "OMP", "PARALLEL", "FOR", "SECTIONS", "SECTION", 
		"SINGLE", "MASTER", "BARRIER", "ATOMIC", "CRITICAL", "PUBLIC", "PRIVATE", 
		"SCHEDULE", "STATIC", "DYNAMIC", "THREAD_NUM", "VAR", "NUMBER", "WS", 
		"JavaLetter", "JavaLetterOrDigit", "Digits", "Digit", "NonZeroDigit", 
		"DigitsAndUnderscores", "DigitOrUnderscore"
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
		case 22: return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 23: return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u00f2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\7\25\u00bf\n\25\f\25\16\25\u00c2\13\25\3\26\3\26\3\27\6\27"+
		"\u00c7\n\27\r\27\16\27\u00c8\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5"+
		"\30\u00d3\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00db\n\31\3\32\3\32"+
		"\5\32\u00df\n\32\3\32\5\32\u00e2\n\32\3\33\3\33\5\33\u00e6\n\33\3\34\3"+
		"\34\3\35\6\35\u00eb\n\35\r\35\16\35\u00ec\3\36\3\36\5\36\u00f1\n\36\2"+
		"\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2\61\2\63\2\65\2\67\29\2;\2\3"+
		"\2\t\5\2\13\f\16\17\"\"\6\2&&C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802"+
		"\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\3\2\63;\u00f5\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7A\3"+
		"\2\2\2\tC\3\2\2\2\13G\3\2\2\2\rP\3\2\2\2\17T\3\2\2\2\21]\3\2\2\2\23e\3"+
		"\2\2\2\25l\3\2\2\2\27s\3\2\2\2\31{\3\2\2\2\33\u0082\3\2\2\2\35\u008b\3"+
		"\2\2\2\37\u0092\3\2\2\2!\u009a\3\2\2\2#\u00a3\3\2\2\2%\u00aa\3\2\2\2\'"+
		"\u00b2\3\2\2\2)\u00bc\3\2\2\2+\u00c3\3\2\2\2-\u00c6\3\2\2\2/\u00d2\3\2"+
		"\2\2\61\u00da\3\2\2\2\63\u00dc\3\2\2\2\65\u00e5\3\2\2\2\67\u00e7\3\2\2"+
		"\29\u00ea\3\2\2\2;\u00f0\3\2\2\2=>\7+\2\2>\4\3\2\2\2?@\7.\2\2@\6\3\2\2"+
		"\2AB\7*\2\2B\b\3\2\2\2CD\7q\2\2DE\7o\2\2EF\7r\2\2F\n\3\2\2\2GH\7r\2\2"+
		"HI\7c\2\2IJ\7t\2\2JK\7c\2\2KL\7n\2\2LM\7n\2\2MN\7g\2\2NO\7n\2\2O\f\3\2"+
		"\2\2PQ\7h\2\2QR\7q\2\2RS\7t\2\2S\16\3\2\2\2TU\7u\2\2UV\7g\2\2VW\7e\2\2"+
		"WX\7v\2\2XY\7k\2\2YZ\7q\2\2Z[\7p\2\2[\\\7u\2\2\\\20\3\2\2\2]^\7u\2\2^"+
		"_\7g\2\2_`\7e\2\2`a\7v\2\2ab\7k\2\2bc\7q\2\2cd\7p\2\2d\22\3\2\2\2ef\7"+
		"u\2\2fg\7k\2\2gh\7p\2\2hi\7i\2\2ij\7n\2\2jk\7g\2\2k\24\3\2\2\2lm\7o\2"+
		"\2mn\7c\2\2no\7u\2\2op\7v\2\2pq\7g\2\2qr\7t\2\2r\26\3\2\2\2st\7d\2\2t"+
		"u\7c\2\2uv\7t\2\2vw\7t\2\2wx\7k\2\2xy\7g\2\2yz\7t\2\2z\30\3\2\2\2{|\7"+
		"c\2\2|}\7v\2\2}~\7q\2\2~\177\7o\2\2\177\u0080\7k\2\2\u0080\u0081\7e\2"+
		"\2\u0081\32\3\2\2\2\u0082\u0083\7e\2\2\u0083\u0084\7t\2\2\u0084\u0085"+
		"\7k\2\2\u0085\u0086\7v\2\2\u0086\u0087\7k\2\2\u0087\u0088\7e\2\2\u0088"+
		"\u0089\7c\2\2\u0089\u008a\7n\2\2\u008a\34\3\2\2\2\u008b\u008c\7r\2\2\u008c"+
		"\u008d\7w\2\2\u008d\u008e\7d\2\2\u008e\u008f\7n\2\2\u008f\u0090\7k\2\2"+
		"\u0090\u0091\7e\2\2\u0091\36\3\2\2\2\u0092\u0093\7r\2\2\u0093\u0094\7"+
		"t\2\2\u0094\u0095\7k\2\2\u0095\u0096\7x\2\2\u0096\u0097\7c\2\2\u0097\u0098"+
		"\7v\2\2\u0098\u0099\7g\2\2\u0099 \3\2\2\2\u009a\u009b\7u\2\2\u009b\u009c"+
		"\7e\2\2\u009c\u009d\7j\2\2\u009d\u009e\7g\2\2\u009e\u009f\7f\2\2\u009f"+
		"\u00a0\7w\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7g\2\2\u00a2\"\3\2\2\2\u00a3"+
		"\u00a4\7u\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7v\2\2"+
		"\u00a7\u00a8\7k\2\2\u00a8\u00a9\7e\2\2\u00a9$\3\2\2\2\u00aa\u00ab\7f\2"+
		"\2\u00ab\u00ac\7{\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af"+
		"\7o\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7e\2\2\u00b1&\3\2\2\2\u00b2\u00b3"+
		"\7v\2\2\u00b3\u00b4\7j\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7g\2\2\u00b6"+
		"\u00b7\7c\2\2\u00b7\u00b8\7f\2\2\u00b8\u00b9\7P\2\2\u00b9\u00ba\7w\2\2"+
		"\u00ba\u00bb\7o\2\2\u00bb(\3\2\2\2\u00bc\u00c0\5/\30\2\u00bd\u00bf\5\61"+
		"\31\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1*\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\5\63\32"+
		"\2\u00c4,\3\2\2\2\u00c5\u00c7\t\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cb\b\27\2\2\u00cb.\3\2\2\2\u00cc\u00d3\t\3\2\2\u00cd\u00ce\n\4\2\2"+
		"\u00ce\u00d3\6\30\2\2\u00cf\u00d0\t\5\2\2\u00d0\u00d1\t\6\2\2\u00d1\u00d3"+
		"\6\30\3\2\u00d2\u00cc\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d2\u00cf\3\2\2\2"+
		"\u00d3\60\3\2\2\2\u00d4\u00db\t\7\2\2\u00d5\u00d6\n\4\2\2\u00d6\u00db"+
		"\6\31\4\2\u00d7\u00d8\t\5\2\2\u00d8\u00d9\t\6\2\2\u00d9\u00db\6\31\5\2"+
		"\u00da\u00d4\3\2\2\2\u00da\u00d5\3\2\2\2\u00da\u00d7\3\2\2\2\u00db\62"+
		"\3\2\2\2\u00dc\u00e1\5\65\33\2\u00dd\u00df\59\35\2\u00de\u00dd\3\2\2\2"+
		"\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\5\65\33\2\u00e1\u00de"+
		"\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\64\3\2\2\2\u00e3\u00e6\7\62\2\2\u00e4"+
		"\u00e6\5\67\34\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\66\3\2"+
		"\2\2\u00e7\u00e8\t\b\2\2\u00e88\3\2\2\2\u00e9\u00eb\5;\36\2\u00ea\u00e9"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		":\3\2\2\2\u00ee\u00f1\5\65\33\2\u00ef\u00f1\7a\2\2\u00f0\u00ee\3\2\2\2"+
		"\u00f0\u00ef\3\2\2\2\u00f1<\3\2\2\2\f\2\u00c0\u00c8\u00d2\u00da\u00de"+
		"\u00e1\u00e5\u00ec\u00f0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}