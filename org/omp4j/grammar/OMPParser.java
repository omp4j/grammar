// Generated from OMP.g4 by ANTLR 4.4
package org.omp4j.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OMPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, OMP=4, PARALLEL=5, FOR=6, SECTIONS=7, SECTION=8, 
		SINGLE=9, MASTER=10, BARRIER=11, ATOMIC=12, CRITICAL=13, PUBLIC=14, PRIVATE=15, 
		SCHEDULE=16, STATIC=17, DYNAMIC=18, THREAD_NUM=19, VAR=20, NUMBER=21, 
		WS=22;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "','", "'('", "'omp'", "'parallel'", "'for'", "'sections'", 
		"'section'", "'single'", "'master'", "'barrier'", "'atomic'", "'critical'", 
		"'public'", "'private'", "'schedule'", "'static'", "'dynamic'", "'threadNum'", 
		"VAR", "NUMBER", "WS"
	};
	public static final int
		RULE_ompUnit = 0, RULE_ompParallel = 1, RULE_ompParallelModifiers = 2, 
		RULE_ompParallelModifier = 3, RULE_ompParallelFor = 4, RULE_ompParallelForModifiers = 5, 
		RULE_ompParallelForModifier = 6, RULE_ompFor = 7, RULE_ompSections = 8, 
		RULE_ompSection = 9, RULE_ompSingle = 10, RULE_ompMaster = 11, RULE_ompBarrier = 12, 
		RULE_ompAtomic = 13, RULE_ompCritical = 14, RULE_ompSchedule = 15, RULE_ompThreadNum = 16, 
		RULE_ompAccessModifier = 17, RULE_ompVars = 18, RULE_ompVar = 19, RULE_ompNumber = 20;
	public static final String[] ruleNames = {
		"ompUnit", "ompParallel", "ompParallelModifiers", "ompParallelModifier", 
		"ompParallelFor", "ompParallelForModifiers", "ompParallelForModifier", 
		"ompFor", "ompSections", "ompSection", "ompSingle", "ompMaster", "ompBarrier", 
		"ompAtomic", "ompCritical", "ompSchedule", "ompThreadNum", "ompAccessModifier", 
		"ompVars", "ompVar", "ompNumber"
	};

	@Override
	public String getGrammarFileName() { return "OMP.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OMPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class OmpUnitContext extends ParserRuleContext {
		public OmpParallelContext ompParallel() {
			return getRuleContext(OmpParallelContext.class,0);
		}
		public TerminalNode EOF() { return getToken(OMPParser.EOF, 0); }
		public OmpSectionsContext ompSections() {
			return getRuleContext(OmpSectionsContext.class,0);
		}
		public OmpMasterContext ompMaster() {
			return getRuleContext(OmpMasterContext.class,0);
		}
		public OmpSingleContext ompSingle() {
			return getRuleContext(OmpSingleContext.class,0);
		}
		public OmpSectionContext ompSection() {
			return getRuleContext(OmpSectionContext.class,0);
		}
		public OmpForContext ompFor() {
			return getRuleContext(OmpForContext.class,0);
		}
		public TerminalNode OMP() { return getToken(OMPParser.OMP, 0); }
		public OmpCriticalContext ompCritical() {
			return getRuleContext(OmpCriticalContext.class,0);
		}
		public OmpAtomicContext ompAtomic() {
			return getRuleContext(OmpAtomicContext.class,0);
		}
		public OmpBarrierContext ompBarrier() {
			return getRuleContext(OmpBarrierContext.class,0);
		}
		public OmpParallelForContext ompParallelFor() {
			return getRuleContext(OmpParallelForContext.class,0);
		}
		public OmpUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpUnitContext ompUnit() throws RecognitionException {
		OmpUnitContext _localctx = new OmpUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ompUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); match(OMP);
			setState(53);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(43); ompParallel();
				}
				break;
			case 2:
				{
				setState(44); ompParallelFor();
				}
				break;
			case 3:
				{
				setState(45); ompFor();
				}
				break;
			case 4:
				{
				setState(46); ompSections();
				}
				break;
			case 5:
				{
				setState(47); ompSection();
				}
				break;
			case 6:
				{
				setState(48); ompSingle();
				}
				break;
			case 7:
				{
				setState(49); ompMaster();
				}
				break;
			case 8:
				{
				setState(50); ompBarrier();
				}
				break;
			case 9:
				{
				setState(51); ompAtomic();
				}
				break;
			case 10:
				{
				setState(52); ompCritical();
				}
				break;
			}
			setState(55); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpParallelContext extends ParserRuleContext {
		public static java.util.HashSet<String> names;
		public OmpParallelModifiersContext ompParallelModifiers() {
			return getRuleContext(OmpParallelModifiersContext.class,0);
		}
		public TerminalNode PARALLEL() { return getToken(OMPParser.PARALLEL, 0); }
		public OmpParallelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompParallel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpParallel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpParallel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpParallel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpParallelContext ompParallel() throws RecognitionException {
		OmpParallelContext _localctx = new OmpParallelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ompParallel);

		        OmpParallelContext.names = new java.util.HashSet<String>();
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); match(PARALLEL);
			setState(58); ompParallelModifiers();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpParallelModifiersContext extends ParserRuleContext {
		public OmpParallelModifierContext ompParallelModifier() {
			return getRuleContext(OmpParallelModifierContext.class,0);
		}
		public OmpParallelModifiersContext ompParallelModifiers() {
			return getRuleContext(OmpParallelModifiersContext.class,0);
		}
		public OmpParallelModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompParallelModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpParallelModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpParallelModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpParallelModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpParallelModifiersContext ompParallelModifiers() throws RecognitionException {
		OmpParallelModifiersContext _localctx = new OmpParallelModifiersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ompParallelModifiers);
		try {
			setState(64);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60); ompParallelModifier();
				setState(61); ompParallelModifiers();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpParallelModifierContext extends ParserRuleContext {
		public OmpAccessModifierContext ompAccessModifier() {
			return getRuleContext(OmpAccessModifierContext.class,0);
		}
		public OmpThreadNumContext ompThreadNum() {
			return getRuleContext(OmpThreadNumContext.class,0);
		}
		public OmpScheduleContext ompSchedule() {
			return getRuleContext(OmpScheduleContext.class,0);
		}
		public OmpParallelModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompParallelModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpParallelModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpParallelModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpParallelModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpParallelModifierContext ompParallelModifier() throws RecognitionException {
		OmpParallelModifierContext _localctx = new OmpParallelModifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ompParallelModifier);
		try {
			setState(75);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				if (!(!((OmpParallelContext)getInvokingContext(1)).names.contains("schedule"))) throw new FailedPredicateException(this, "!$ompParallel::names.contains(\"schedule\")");
				setState(67); ompSchedule();
				((OmpParallelContext)getInvokingContext(1)).names.add("schedule");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				if (!(!((OmpParallelContext)getInvokingContext(1)).names.contains("threadNum"))) throw new FailedPredicateException(this, "!$ompParallel::names.contains(\"threadNum\")");
				setState(71); ompThreadNum();
				((OmpParallelContext)getInvokingContext(1)).names.add("threadNum");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74); ompAccessModifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpParallelForContext extends ParserRuleContext {
		public static java.util.HashSet<String> names;
		public TerminalNode FOR() { return getToken(OMPParser.FOR, 0); }
		public TerminalNode PARALLEL() { return getToken(OMPParser.PARALLEL, 0); }
		public OmpParallelForModifiersContext ompParallelForModifiers() {
			return getRuleContext(OmpParallelForModifiersContext.class,0);
		}
		public OmpParallelForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompParallelFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpParallelFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpParallelFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpParallelFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpParallelForContext ompParallelFor() throws RecognitionException {
		OmpParallelForContext _localctx = new OmpParallelForContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ompParallelFor);

		        OmpParallelForContext.names = new java.util.HashSet<String>();
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); match(PARALLEL);
			setState(78); match(FOR);
			setState(79); ompParallelForModifiers();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpParallelForModifiersContext extends ParserRuleContext {
		public OmpParallelForModifierContext ompParallelForModifier() {
			return getRuleContext(OmpParallelForModifierContext.class,0);
		}
		public OmpParallelForModifiersContext ompParallelForModifiers() {
			return getRuleContext(OmpParallelForModifiersContext.class,0);
		}
		public OmpParallelForModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompParallelForModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpParallelForModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpParallelForModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpParallelForModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpParallelForModifiersContext ompParallelForModifiers() throws RecognitionException {
		OmpParallelForModifiersContext _localctx = new OmpParallelForModifiersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ompParallelForModifiers);
		try {
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				if (!(((OmpParallelForContext)getInvokingContext(4)).names.size() < 3)) throw new FailedPredicateException(this, "$ompParallelFor::names.size() < 3");
				setState(82); ompParallelForModifier();
				setState(83); ompParallelForModifiers();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				if (!(((OmpParallelForContext)getInvokingContext(4)).names.size() <= 3)) throw new FailedPredicateException(this, "$ompParallelFor::names.size() <= 3");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpParallelForModifierContext extends ParserRuleContext {
		public OmpAccessModifierContext ompAccessModifier() {
			return getRuleContext(OmpAccessModifierContext.class,0);
		}
		public OmpThreadNumContext ompThreadNum() {
			return getRuleContext(OmpThreadNumContext.class,0);
		}
		public OmpScheduleContext ompSchedule() {
			return getRuleContext(OmpScheduleContext.class,0);
		}
		public OmpParallelForModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompParallelForModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpParallelForModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpParallelForModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpParallelForModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpParallelForModifierContext ompParallelForModifier() throws RecognitionException {
		OmpParallelForModifierContext _localctx = new OmpParallelForModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ompParallelForModifier);
		try {
			setState(97);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				if (!(!((OmpParallelForContext)getInvokingContext(4)).names.contains("schedule"))) throw new FailedPredicateException(this, "!$ompParallelFor::names.contains(\"schedule\")");
				setState(89); ompSchedule();
				((OmpParallelForContext)getInvokingContext(4)).names.add("schedule");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				if (!(!((OmpParallelForContext)getInvokingContext(4)).names.contains("threadNum"))) throw new FailedPredicateException(this, "!$ompParallelFor::names.contains(\"threadNum\")");
				setState(93); ompThreadNum();
				((OmpParallelForContext)getInvokingContext(4)).names.add("threadNum");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96); ompAccessModifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpForContext extends ParserRuleContext {
		public OmpAccessModifierContext ompAccessModifier(int i) {
			return getRuleContext(OmpAccessModifierContext.class,i);
		}
		public List<OmpAccessModifierContext> ompAccessModifier() {
			return getRuleContexts(OmpAccessModifierContext.class);
		}
		public TerminalNode FOR() { return getToken(OMPParser.FOR, 0); }
		public OmpForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpForContext ompFor() throws RecognitionException {
		OmpForContext _localctx = new OmpForContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ompFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); match(FOR);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUBLIC || _la==PRIVATE) {
				{
				{
				setState(100); ompAccessModifier();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpSectionsContext extends ParserRuleContext {
		public TerminalNode SECTIONS() { return getToken(OMPParser.SECTIONS, 0); }
		public OmpScheduleContext ompSchedule() {
			return getRuleContext(OmpScheduleContext.class,0);
		}
		public OmpSectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompSections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpSections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpSections(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpSections(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpSectionsContext ompSections() throws RecognitionException {
		OmpSectionsContext _localctx = new OmpSectionsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ompSections);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(SECTIONS);
			setState(108);
			_la = _input.LA(1);
			if (_la==SCHEDULE) {
				{
				setState(107); ompSchedule();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpSectionContext extends ParserRuleContext {
		public TerminalNode SECTION() { return getToken(OMPParser.SECTION, 0); }
		public OmpSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpSectionContext ompSection() throws RecognitionException {
		OmpSectionContext _localctx = new OmpSectionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ompSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(SECTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpSingleContext extends ParserRuleContext {
		public TerminalNode SINGLE() { return getToken(OMPParser.SINGLE, 0); }
		public OmpSingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompSingle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpSingleContext ompSingle() throws RecognitionException {
		OmpSingleContext _localctx = new OmpSingleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ompSingle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); match(SINGLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpMasterContext extends ParserRuleContext {
		public TerminalNode MASTER() { return getToken(OMPParser.MASTER, 0); }
		public OmpMasterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompMaster; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpMaster(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpMaster(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpMaster(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpMasterContext ompMaster() throws RecognitionException {
		OmpMasterContext _localctx = new OmpMasterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ompMaster);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(MASTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpBarrierContext extends ParserRuleContext {
		public TerminalNode BARRIER() { return getToken(OMPParser.BARRIER, 0); }
		public OmpBarrierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompBarrier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpBarrier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpBarrier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpBarrier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpBarrierContext ompBarrier() throws RecognitionException {
		OmpBarrierContext _localctx = new OmpBarrierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ompBarrier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(BARRIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpAtomicContext extends ParserRuleContext {
		public TerminalNode ATOMIC() { return getToken(OMPParser.ATOMIC, 0); }
		public OmpAtomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompAtomic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpAtomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpAtomic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpAtomic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpAtomicContext ompAtomic() throws RecognitionException {
		OmpAtomicContext _localctx = new OmpAtomicContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ompAtomic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(ATOMIC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpCriticalContext extends ParserRuleContext {
		public OmpVarContext ompVar() {
			return getRuleContext(OmpVarContext.class,0);
		}
		public TerminalNode CRITICAL() { return getToken(OMPParser.CRITICAL, 0); }
		public OmpCriticalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompCritical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpCritical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpCritical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpCritical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpCriticalContext ompCritical() throws RecognitionException {
		OmpCriticalContext _localctx = new OmpCriticalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ompCritical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(CRITICAL);
			setState(125);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(121); match(T__0);
				setState(122); ompVar();
				setState(123); match(T__2);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpScheduleContext extends ParserRuleContext {
		public TerminalNode DYNAMIC() { return getToken(OMPParser.DYNAMIC, 0); }
		public TerminalNode SCHEDULE() { return getToken(OMPParser.SCHEDULE, 0); }
		public TerminalNode STATIC() { return getToken(OMPParser.STATIC, 0); }
		public OmpScheduleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompSchedule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpSchedule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpSchedule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpSchedule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpScheduleContext ompSchedule() throws RecognitionException {
		OmpScheduleContext _localctx = new OmpScheduleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ompSchedule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(SCHEDULE);
			setState(128); match(T__0);
			setState(129);
			_la = _input.LA(1);
			if ( !(_la==STATIC || _la==DYNAMIC) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(130); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpThreadNumContext extends ParserRuleContext {
		public OmpNumberContext ompNumber() {
			return getRuleContext(OmpNumberContext.class,0);
		}
		public TerminalNode THREAD_NUM() { return getToken(OMPParser.THREAD_NUM, 0); }
		public OmpThreadNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompThreadNum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpThreadNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpThreadNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpThreadNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpThreadNumContext ompThreadNum() throws RecognitionException {
		OmpThreadNumContext _localctx = new OmpThreadNumContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ompThreadNum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); match(THREAD_NUM);
			setState(133); match(T__0);
			setState(134); ompNumber();
			setState(135); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpAccessModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(OMPParser.PUBLIC, 0); }
		public OmpVarsContext ompVars() {
			return getRuleContext(OmpVarsContext.class,0);
		}
		public TerminalNode PRIVATE() { return getToken(OMPParser.PRIVATE, 0); }
		public OmpAccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompAccessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpAccessModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpAccessModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpAccessModifierContext ompAccessModifier() throws RecognitionException {
		OmpAccessModifierContext _localctx = new OmpAccessModifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ompAccessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !(_la==PUBLIC || _la==PRIVATE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(138); match(T__0);
			setState(139); ompVars();
			setState(140); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpVarsContext extends ParserRuleContext {
		public List<OmpVarContext> ompVar() {
			return getRuleContexts(OmpVarContext.class);
		}
		public OmpVarContext ompVar(int i) {
			return getRuleContext(OmpVarContext.class,i);
		}
		public OmpVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpVarsContext ompVars() throws RecognitionException {
		OmpVarsContext _localctx = new OmpVarsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ompVars);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(142); ompVar();
				}
				break;
			case 2:
				{
				setState(146); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(143); ompVar();
						setState(144); match(T__1);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(148); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(150); ompVar();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpVarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(OMPParser.VAR, 0); }
		public OmpVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpVarContext ompVar() throws RecognitionException {
		OmpVarContext _localctx = new OmpVarContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ompVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); match(VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpNumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(OMPParser.NUMBER, 0); }
		public OmpNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpNumberContext ompNumber() throws RecognitionException {
		OmpNumberContext _localctx = new OmpNumberContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ompNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3: return ompParallelModifier_sempred((OmpParallelModifierContext)_localctx, predIndex);
		case 5: return ompParallelForModifiers_sempred((OmpParallelForModifiersContext)_localctx, predIndex);
		case 6: return ompParallelForModifier_sempred((OmpParallelForModifierContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean ompParallelModifier_sempred(OmpParallelModifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return !((OmpParallelContext)getInvokingContext(1)).names.contains("schedule");
		case 1: return !((OmpParallelContext)getInvokingContext(1)).names.contains("threadNum");
		}
		return true;
	}
	private boolean ompParallelForModifiers_sempred(OmpParallelForModifiersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return ((OmpParallelForContext)getInvokingContext(4)).names.size() < 3;
		case 3: return ((OmpParallelForContext)getInvokingContext(4)).names.size() <= 3;
		}
		return true;
	}
	private boolean ompParallelForModifier_sempred(OmpParallelForModifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return !((OmpParallelForContext)getInvokingContext(4)).names.contains("schedule");
		case 5: return !((OmpParallelForContext)getInvokingContext(4)).names.contains("threadNum");
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\u00a1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\5\28\n\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4C\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5N\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\5\7Y\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bd\n\b\3\t\3"+
		"\t\7\th\n\t\f\t\16\tk\13\t\3\n\3\n\5\no\n\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u0080\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\6\24\u0095\n\24\r\24\16\24\u0096\3\24\3\24\5\24\u009b"+
		"\n\24\3\25\3\25\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*\2\4\3\2\23\24\3\2\20\21\u009f\2,\3\2\2\2\4;\3\2\2\2\6B\3"+
		"\2\2\2\bM\3\2\2\2\nO\3\2\2\2\fX\3\2\2\2\16c\3\2\2\2\20e\3\2\2\2\22l\3"+
		"\2\2\2\24p\3\2\2\2\26r\3\2\2\2\30t\3\2\2\2\32v\3\2\2\2\34x\3\2\2\2\36"+
		"z\3\2\2\2 \u0081\3\2\2\2\"\u0086\3\2\2\2$\u008b\3\2\2\2&\u009a\3\2\2\2"+
		"(\u009c\3\2\2\2*\u009e\3\2\2\2,\67\7\6\2\2-8\5\4\3\2.8\5\n\6\2/8\5\20"+
		"\t\2\608\5\22\n\2\618\5\24\13\2\628\5\26\f\2\638\5\30\r\2\648\5\32\16"+
		"\2\658\5\34\17\2\668\5\36\20\2\67-\3\2\2\2\67.\3\2\2\2\67/\3\2\2\2\67"+
		"\60\3\2\2\2\67\61\3\2\2\2\67\62\3\2\2\2\67\63\3\2\2\2\67\64\3\2\2\2\67"+
		"\65\3\2\2\2\67\66\3\2\2\289\3\2\2\29:\7\2\2\3:\3\3\2\2\2;<\7\7\2\2<=\5"+
		"\6\4\2=\5\3\2\2\2>?\5\b\5\2?@\5\6\4\2@C\3\2\2\2AC\3\2\2\2B>\3\2\2\2BA"+
		"\3\2\2\2C\7\3\2\2\2DE\6\5\2\3EF\5 \21\2FG\b\5\1\2GN\3\2\2\2HI\6\5\3\3"+
		"IJ\5\"\22\2JK\b\5\1\2KN\3\2\2\2LN\5$\23\2MD\3\2\2\2MH\3\2\2\2ML\3\2\2"+
		"\2N\t\3\2\2\2OP\7\7\2\2PQ\7\b\2\2QR\5\f\7\2R\13\3\2\2\2ST\6\7\4\3TU\5"+
		"\16\b\2UV\5\f\7\2VY\3\2\2\2WY\6\7\5\3XS\3\2\2\2XW\3\2\2\2Y\r\3\2\2\2Z"+
		"[\6\b\6\3[\\\5 \21\2\\]\b\b\1\2]d\3\2\2\2^_\6\b\7\3_`\5\"\22\2`a\b\b\1"+
		"\2ad\3\2\2\2bd\5$\23\2cZ\3\2\2\2c^\3\2\2\2cb\3\2\2\2d\17\3\2\2\2ei\7\b"+
		"\2\2fh\5$\23\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\21\3\2\2\2ki\3"+
		"\2\2\2ln\7\t\2\2mo\5 \21\2nm\3\2\2\2no\3\2\2\2o\23\3\2\2\2pq\7\n\2\2q"+
		"\25\3\2\2\2rs\7\13\2\2s\27\3\2\2\2tu\7\f\2\2u\31\3\2\2\2vw\7\r\2\2w\33"+
		"\3\2\2\2xy\7\16\2\2y\35\3\2\2\2z\177\7\17\2\2{|\7\5\2\2|}\5(\25\2}~\7"+
		"\3\2\2~\u0080\3\2\2\2\177{\3\2\2\2\177\u0080\3\2\2\2\u0080\37\3\2\2\2"+
		"\u0081\u0082\7\22\2\2\u0082\u0083\7\5\2\2\u0083\u0084\t\2\2\2\u0084\u0085"+
		"\7\3\2\2\u0085!\3\2\2\2\u0086\u0087\7\25\2\2\u0087\u0088\7\5\2\2\u0088"+
		"\u0089\5*\26\2\u0089\u008a\7\3\2\2\u008a#\3\2\2\2\u008b\u008c\t\3\2\2"+
		"\u008c\u008d\7\5\2\2\u008d\u008e\5&\24\2\u008e\u008f\7\3\2\2\u008f%\3"+
		"\2\2\2\u0090\u009b\5(\25\2\u0091\u0092\5(\25\2\u0092\u0093\7\4\2\2\u0093"+
		"\u0095\3\2\2\2\u0094\u0091\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\5(\25\2\u0099"+
		"\u009b\3\2\2\2\u009a\u0090\3\2\2\2\u009a\u0094\3\2\2\2\u009b\'\3\2\2\2"+
		"\u009c\u009d\7\26\2\2\u009d)\3\2\2\2\u009e\u009f\7\27\2\2\u009f+\3\2\2"+
		"\2\f\67BMXcin\177\u0096\u009a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}