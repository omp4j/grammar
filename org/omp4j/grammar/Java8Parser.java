// Generated from Java8.g4 by ANTLR 4.4
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
public class Java8Parser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", 
		"'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
		"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
		"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
		"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
		"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
		"'transient'", "'try'", "'void'", "'volatile'", "'while'", "'OMP_THREAD_NUM'", 
		"'OMP_NUM_THREADS'", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
		"CharacterLiteral", "StringLiteral", "'null'", "'('", "')'", "'{'", "'}'", 
		"'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", 
		"'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
		"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'->'", 
		"'::'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", 
		"'<<='", "'>>='", "'>>>='", "Identifier", "'@'", "'...'", "WS", "COMMENT", 
		"LINE_COMMENT"
	};
	public static final int
		RULE_literal = 0, RULE_ompThreadNum = 1, RULE_ompNumThreads = 2, RULE_type = 3, 
		RULE_primitiveType = 4, RULE_numericType = 5, RULE_integralType = 6, RULE_floatingPointType = 7, 
		RULE_referenceType = 8, RULE_classOrInterfaceType = 9, RULE_classType = 10, 
		RULE_classType_lf_classOrInterfaceType = 11, RULE_classType_lfno_classOrInterfaceType = 12, 
		RULE_interfaceType = 13, RULE_interfaceType_lf_classOrInterfaceType = 14, 
		RULE_interfaceType_lfno_classOrInterfaceType = 15, RULE_typeVariable = 16, 
		RULE_arrayType = 17, RULE_dims = 18, RULE_typeParameter = 19, RULE_typeParameterModifier = 20, 
		RULE_typeBound = 21, RULE_additionalBound = 22, RULE_typeArguments = 23, 
		RULE_typeArgumentList = 24, RULE_typeArgument = 25, RULE_wildcard = 26, 
		RULE_wildcardBounds = 27, RULE_packageName = 28, RULE_typeName = 29, RULE_packageOrTypeName = 30, 
		RULE_expressionName = 31, RULE_methodName = 32, RULE_ambiguousName = 33, 
		RULE_compilationUnit = 34, RULE_packageDeclaration = 35, RULE_packageModifier = 36, 
		RULE_importDeclaration = 37, RULE_singleTypeImportDeclaration = 38, RULE_typeImportOnDemandDeclaration = 39, 
		RULE_singleStaticImportDeclaration = 40, RULE_staticImportOnDemandDeclaration = 41, 
		RULE_typeDeclaration = 42, RULE_classDeclaration = 43, RULE_normalClassDeclaration = 44, 
		RULE_classModifier = 45, RULE_typeParameters = 46, RULE_typeParameterList = 47, 
		RULE_superclass = 48, RULE_superinterfaces = 49, RULE_interfaceTypeList = 50, 
		RULE_classBody = 51, RULE_classBodyDeclaration = 52, RULE_classMemberDeclaration = 53, 
		RULE_fieldDeclaration = 54, RULE_fieldModifier = 55, RULE_variableDeclaratorList = 56, 
		RULE_variableDeclarator = 57, RULE_variableDeclaratorId = 58, RULE_variableInitializer = 59, 
		RULE_unannType = 60, RULE_unannPrimitiveType = 61, RULE_unannReferenceType = 62, 
		RULE_unannClassOrInterfaceType = 63, RULE_unannClassType = 64, RULE_unannClassType_lf_unannClassOrInterfaceType = 65, 
		RULE_unannClassType_lfno_unannClassOrInterfaceType = 66, RULE_unannInterfaceType = 67, 
		RULE_unannInterfaceType_lf_unannClassOrInterfaceType = 68, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType = 69, 
		RULE_unannTypeVariable = 70, RULE_unannArrayType = 71, RULE_methodDeclaration = 72, 
		RULE_methodModifier = 73, RULE_methodHeader = 74, RULE_result = 75, RULE_methodDeclarator = 76, 
		RULE_formalParameterList = 77, RULE_formalParameters = 78, RULE_formalParameter = 79, 
		RULE_variableModifier = 80, RULE_lastFormalParameter = 81, RULE_receiverParameter = 82, 
		RULE_throws_ = 83, RULE_exceptionTypeList = 84, RULE_exceptionType = 85, 
		RULE_methodBody = 86, RULE_instanceInitializer = 87, RULE_staticInitializer = 88, 
		RULE_constructorDeclaration = 89, RULE_constructorModifier = 90, RULE_constructorDeclarator = 91, 
		RULE_simpleTypeName = 92, RULE_constructorBody = 93, RULE_explicitConstructorInvocation = 94, 
		RULE_enumDeclaration = 95, RULE_enumBody = 96, RULE_enumConstantList = 97, 
		RULE_enumConstant = 98, RULE_enumConstantModifier = 99, RULE_enumBodyDeclarations = 100, 
		RULE_interfaceDeclaration = 101, RULE_normalInterfaceDeclaration = 102, 
		RULE_interfaceModifier = 103, RULE_extendsInterfaces = 104, RULE_interfaceBody = 105, 
		RULE_interfaceMemberDeclaration = 106, RULE_constantDeclaration = 107, 
		RULE_constantModifier = 108, RULE_interfaceMethodDeclaration = 109, RULE_interfaceMethodModifier = 110, 
		RULE_annotationTypeDeclaration = 111, RULE_annotationTypeBody = 112, RULE_annotationTypeMemberDeclaration = 113, 
		RULE_annotationTypeElementDeclaration = 114, RULE_annotationTypeElementModifier = 115, 
		RULE_defaultValue = 116, RULE_annotation = 117, RULE_normalAnnotation = 118, 
		RULE_elementValuePairList = 119, RULE_elementValuePair = 120, RULE_elementValue = 121, 
		RULE_elementValueArrayInitializer = 122, RULE_elementValueList = 123, 
		RULE_markerAnnotation = 124, RULE_singleElementAnnotation = 125, RULE_arrayInitializer = 126, 
		RULE_variableInitializerList = 127, RULE_block = 128, RULE_blockStatements = 129, 
		RULE_blockStatement = 130, RULE_localVariableDeclarationStatement = 131, 
		RULE_localVariableDeclaration = 132, RULE_statement = 133, RULE_statementNoShortIf = 134, 
		RULE_statementWithoutTrailingSubstatement = 135, RULE_emptyStatement = 136, 
		RULE_labeledStatement = 137, RULE_labeledStatementNoShortIf = 138, RULE_expressionStatement = 139, 
		RULE_statementExpression = 140, RULE_ifThenStatement = 141, RULE_ifThenElseStatement = 142, 
		RULE_ifThenElseStatementNoShortIf = 143, RULE_assertStatement = 144, RULE_switchStatement = 145, 
		RULE_switchBlock = 146, RULE_switchBlockStatementGroup = 147, RULE_switchLabels = 148, 
		RULE_switchLabel = 149, RULE_enumConstantName = 150, RULE_whileStatement = 151, 
		RULE_whileStatementNoShortIf = 152, RULE_doStatement = 153, RULE_forStatement = 154, 
		RULE_forStatementNoShortIf = 155, RULE_basicForStatement = 156, RULE_basicForStatementNoShortIf = 157, 
		RULE_forInit = 158, RULE_forUpdate = 159, RULE_statementExpressionList = 160, 
		RULE_enhancedForStatement = 161, RULE_enhancedForStatementNoShortIf = 162, 
		RULE_breakStatement = 163, RULE_continueStatement = 164, RULE_returnStatement = 165, 
		RULE_throwStatement = 166, RULE_synchronizedStatement = 167, RULE_tryStatement = 168, 
		RULE_catches = 169, RULE_catchClause = 170, RULE_catchFormalParameter = 171, 
		RULE_catchType = 172, RULE_finally_ = 173, RULE_tryWithResourcesStatement = 174, 
		RULE_resourceSpecification = 175, RULE_resourceList = 176, RULE_resource = 177, 
		RULE_primary = 178, RULE_primaryNoNewArray = 179, RULE_primaryNoNewArray_lf_arrayAccess = 180, 
		RULE_primaryNoNewArray_lfno_arrayAccess = 181, RULE_primaryNoNewArray_lf_primary = 182, 
		RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 183, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 184, 
		RULE_primaryNoNewArray_lfno_primary = 185, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 186, 
		RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 187, 
		RULE_classInstanceCreationExpression = 188, RULE_classInstanceCreationExpression_lf_primary = 189, 
		RULE_classInstanceCreationExpression_lfno_primary = 190, RULE_typeArgumentsOrDiamond = 191, 
		RULE_fieldAccess = 192, RULE_fieldAccess_lf_primary = 193, RULE_fieldAccess_lfno_primary = 194, 
		RULE_arrayAccess = 195, RULE_arrayAccess_lf_primary = 196, RULE_arrayAccess_lfno_primary = 197, 
		RULE_methodInvocation = 198, RULE_methodInvocation_lf_primary = 199, RULE_methodInvocation_lfno_primary = 200, 
		RULE_argumentList = 201, RULE_methodReference = 202, RULE_methodReference_lf_primary = 203, 
		RULE_methodReference_lfno_primary = 204, RULE_arrayCreationExpression = 205, 
		RULE_dimExprs = 206, RULE_dimExpr = 207, RULE_constantExpression = 208, 
		RULE_expression = 209, RULE_lambdaExpression = 210, RULE_lambdaParameters = 211, 
		RULE_inferredFormalParameterList = 212, RULE_lambdaBody = 213, RULE_assignmentExpression = 214, 
		RULE_assignment = 215, RULE_leftHandSide = 216, RULE_assignmentOperator = 217, 
		RULE_conditionalExpression = 218, RULE_conditionalOrExpression = 219, 
		RULE_conditionalAndExpression = 220, RULE_inclusiveOrExpression = 221, 
		RULE_exclusiveOrExpression = 222, RULE_andExpression = 223, RULE_equalityExpression = 224, 
		RULE_relationalExpression = 225, RULE_shiftExpression = 226, RULE_additiveExpression = 227, 
		RULE_multiplicativeExpression = 228, RULE_unaryExpression = 229, RULE_preIncrementExpression = 230, 
		RULE_preDecrementExpression = 231, RULE_unaryExpressionNotPlusMinus = 232, 
		RULE_postfixExpression = 233, RULE_postIncrementExpression = 234, RULE_postIncrementExpression_lf_postfixExpression = 235, 
		RULE_postDecrementExpression = 236, RULE_postDecrementExpression_lf_postfixExpression = 237, 
		RULE_castExpression = 238;
	public static final String[] ruleNames = {
		"literal", "ompThreadNum", "ompNumThreads", "type", "primitiveType", "numericType", 
		"integralType", "floatingPointType", "referenceType", "classOrInterfaceType", 
		"classType", "classType_lf_classOrInterfaceType", "classType_lfno_classOrInterfaceType", 
		"interfaceType", "interfaceType_lf_classOrInterfaceType", "interfaceType_lfno_classOrInterfaceType", 
		"typeVariable", "arrayType", "dims", "typeParameter", "typeParameterModifier", 
		"typeBound", "additionalBound", "typeArguments", "typeArgumentList", "typeArgument", 
		"wildcard", "wildcardBounds", "packageName", "typeName", "packageOrTypeName", 
		"expressionName", "methodName", "ambiguousName", "compilationUnit", "packageDeclaration", 
		"packageModifier", "importDeclaration", "singleTypeImportDeclaration", 
		"typeImportOnDemandDeclaration", "singleStaticImportDeclaration", "staticImportOnDemandDeclaration", 
		"typeDeclaration", "classDeclaration", "normalClassDeclaration", "classModifier", 
		"typeParameters", "typeParameterList", "superclass", "superinterfaces", 
		"interfaceTypeList", "classBody", "classBodyDeclaration", "classMemberDeclaration", 
		"fieldDeclaration", "fieldModifier", "variableDeclaratorList", "variableDeclarator", 
		"variableDeclaratorId", "variableInitializer", "unannType", "unannPrimitiveType", 
		"unannReferenceType", "unannClassOrInterfaceType", "unannClassType", "unannClassType_lf_unannClassOrInterfaceType", 
		"unannClassType_lfno_unannClassOrInterfaceType", "unannInterfaceType", 
		"unannInterfaceType_lf_unannClassOrInterfaceType", "unannInterfaceType_lfno_unannClassOrInterfaceType", 
		"unannTypeVariable", "unannArrayType", "methodDeclaration", "methodModifier", 
		"methodHeader", "result", "methodDeclarator", "formalParameterList", "formalParameters", 
		"formalParameter", "variableModifier", "lastFormalParameter", "receiverParameter", 
		"throws_", "exceptionTypeList", "exceptionType", "methodBody", "instanceInitializer", 
		"staticInitializer", "constructorDeclaration", "constructorModifier", 
		"constructorDeclarator", "simpleTypeName", "constructorBody", "explicitConstructorInvocation", 
		"enumDeclaration", "enumBody", "enumConstantList", "enumConstant", "enumConstantModifier", 
		"enumBodyDeclarations", "interfaceDeclaration", "normalInterfaceDeclaration", 
		"interfaceModifier", "extendsInterfaces", "interfaceBody", "interfaceMemberDeclaration", 
		"constantDeclaration", "constantModifier", "interfaceMethodDeclaration", 
		"interfaceMethodModifier", "annotationTypeDeclaration", "annotationTypeBody", 
		"annotationTypeMemberDeclaration", "annotationTypeElementDeclaration", 
		"annotationTypeElementModifier", "defaultValue", "annotation", "normalAnnotation", 
		"elementValuePairList", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
		"elementValueList", "markerAnnotation", "singleElementAnnotation", "arrayInitializer", 
		"variableInitializerList", "block", "blockStatements", "blockStatement", 
		"localVariableDeclarationStatement", "localVariableDeclaration", "statement", 
		"statementNoShortIf", "statementWithoutTrailingSubstatement", "emptyStatement", 
		"labeledStatement", "labeledStatementNoShortIf", "expressionStatement", 
		"statementExpression", "ifThenStatement", "ifThenElseStatement", "ifThenElseStatementNoShortIf", 
		"assertStatement", "switchStatement", "switchBlock", "switchBlockStatementGroup", 
		"switchLabels", "switchLabel", "enumConstantName", "whileStatement", "whileStatementNoShortIf", 
		"doStatement", "forStatement", "forStatementNoShortIf", "basicForStatement", 
		"basicForStatementNoShortIf", "forInit", "forUpdate", "statementExpressionList", 
		"enhancedForStatement", "enhancedForStatementNoShortIf", "breakStatement", 
		"continueStatement", "returnStatement", "throwStatement", "synchronizedStatement", 
		"tryStatement", "catches", "catchClause", "catchFormalParameter", "catchType", 
		"finally_", "tryWithResourcesStatement", "resourceSpecification", "resourceList", 
		"resource", "primary", "primaryNoNewArray", "primaryNoNewArray_lf_arrayAccess", 
		"primaryNoNewArray_lfno_arrayAccess", "primaryNoNewArray_lf_primary", 
		"primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary", "primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary", 
		"primaryNoNewArray_lfno_primary", "primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary", 
		"primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary", "classInstanceCreationExpression", 
		"classInstanceCreationExpression_lf_primary", "classInstanceCreationExpression_lfno_primary", 
		"typeArgumentsOrDiamond", "fieldAccess", "fieldAccess_lf_primary", "fieldAccess_lfno_primary", 
		"arrayAccess", "arrayAccess_lf_primary", "arrayAccess_lfno_primary", "methodInvocation", 
		"methodInvocation_lf_primary", "methodInvocation_lfno_primary", "argumentList", 
		"methodReference", "methodReference_lf_primary", "methodReference_lfno_primary", 
		"arrayCreationExpression", "dimExprs", "dimExpr", "constantExpression", 
		"expression", "lambdaExpression", "lambdaParameters", "inferredFormalParameterList", 
		"lambdaBody", "assignmentExpression", "assignment", "leftHandSide", "assignmentOperator", 
		"conditionalExpression", "conditionalOrExpression", "conditionalAndExpression", 
		"inclusiveOrExpression", "exclusiveOrExpression", "andExpression", "equalityExpression", 
		"relationalExpression", "shiftExpression", "additiveExpression", "multiplicativeExpression", 
		"unaryExpression", "preIncrementExpression", "preDecrementExpression", 
		"unaryExpressionNotPlusMinus", "postfixExpression", "postIncrementExpression", 
		"postIncrementExpression_lf_postfixExpression", "postDecrementExpression", 
		"postDecrementExpression_lf_postfixExpression", "castExpression"
	};

	@Override
	public String getGrammarFileName() { return "Java8.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Java8Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LiteralContext extends ParserRuleContext {
		public OmpNumThreadsContext ompNumThreads() {
			return getRuleContext(OmpNumThreadsContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(Java8Parser.StringLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(Java8Parser.NullLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(Java8Parser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(Java8Parser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(Java8Parser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(Java8Parser.CharacterLiteral, 0); }
		public OmpThreadNumContext ompThreadNum() {
			return getRuleContext(OmpThreadNumContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		try {
			setState(486);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(478); match(IntegerLiteral);
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(479); match(FloatingPointLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(480); match(BooleanLiteral);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(481); match(CharacterLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(482); match(StringLiteral);
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(483); match(NullLiteral);
				}
				break;
			case OMPTHREADNUM:
				enterOuterAlt(_localctx, 7);
				{
				setState(484); ompThreadNum();
				}
				break;
			case OMPNUMTHREADS:
				enterOuterAlt(_localctx, 8);
				{
				setState(485); ompNumThreads();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public TerminalNode OMPTHREADNUM() { return getToken(Java8Parser.OMPTHREADNUM, 0); }
		public OmpThreadNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompThreadNum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpThreadNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpThreadNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitOmpThreadNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpThreadNumContext ompThreadNum() throws RecognitionException {
		OmpThreadNumContext _localctx = new OmpThreadNumContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ompThreadNum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488); match(OMPTHREADNUM);
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

	public static class OmpNumThreadsContext extends ParserRuleContext {
		public TerminalNode OMPNUMTHREADS() { return getToken(Java8Parser.OMPNUMTHREADS, 0); }
		public OmpNumThreadsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompNumThreads; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpNumThreads(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpNumThreads(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitOmpNumThreads(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpNumThreadsContext ompNumThreads() throws RecognitionException {
		OmpNumThreadsContext _localctx = new OmpNumThreadsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ompNumThreads);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490); match(OMPNUMTHREADS);
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

	public static class TypeContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			setState(494);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492); primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(493); referenceType();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_primitiveType);
		int _la;
		try {
			setState(510);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(496); annotation();
					}
					}
					setState(501);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(502); numericType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(503); annotation();
					}
					}
					setState(508);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(509); match(BOOLEAN);
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

	public static class NumericTypeContext extends ParserRuleContext {
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class,0);
		}
		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class,0);
		}
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNumericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNumericType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_numericType);
		try {
			setState(514);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(512); integralType();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(513); floatingPointType();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class IntegralTypeContext extends ParserRuleContext {
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIntegralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIntegralType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIntegralType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFloatingPointType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFloatingPointType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFloatingPointType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_referenceType);
		try {
			setState(523);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(520); classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(521); typeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(522); arrayType();
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

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<InterfaceType_lf_classOrInterfaceTypeContext> interfaceType_lf_classOrInterfaceType() {
			return getRuleContexts(InterfaceType_lf_classOrInterfaceTypeContext.class);
		}
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType(int i) {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,i);
		}
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() {
			return getRuleContext(InterfaceType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public List<ClassType_lf_classOrInterfaceTypeContext> classType_lf_classOrInterfaceType() {
			return getRuleContexts(ClassType_lf_classOrInterfaceTypeContext.class);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType(int i) {
			return getRuleContext(InterfaceType_lf_classOrInterfaceTypeContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(525); classType_lfno_classOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(526); interfaceType_lfno_classOrInterfaceType();
				}
				break;
			}
			setState(533);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(531);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(529); classType_lf_classOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(530); interfaceType_lf_classOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(535);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class ClassTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classType);
		int _la;
		try {
			setState(558);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(536); annotation();
					}
					}
					setState(541);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(542); match(Identifier);
				setState(544);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(543); typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(546); classOrInterfaceType();
				setState(547); match(DOT);
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(548); annotation();
					}
					}
					setState(553);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(554); match(Identifier);
				setState(556);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(555); typeArguments();
					}
				}

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

	public static class ClassType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ClassType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassType_lf_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassType_lf_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() throws RecognitionException {
		ClassType_lf_classOrInterfaceTypeContext _localctx = new ClassType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classType_lf_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560); match(DOT);
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(561); annotation();
				}
				}
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(567); match(Identifier);
			setState(569);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(568); typeArguments();
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

	public static class ClassType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ClassType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassType_lfno_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassType_lfno_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() throws RecognitionException {
		ClassType_lfno_classOrInterfaceTypeContext _localctx = new ClassType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classType_lfno_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(571); annotation();
				}
				}
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(577); match(Identifier);
			setState(579);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(578); typeArguments();
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

	public static class InterfaceTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581); classType();
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

	public static class InterfaceType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceType_lf_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceType_lf_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lf_classOrInterfaceTypeContext _localctx = new InterfaceType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_interfaceType_lf_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583); classType_lf_classOrInterfaceType();
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

	public static class InterfaceType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceType_lfno_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceType_lfno_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lfno_classOrInterfaceTypeContext _localctx = new InterfaceType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceType_lfno_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585); classType_lfno_classOrInterfaceType();
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

	public static class TypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(587); annotation();
				}
				}
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(593); match(Identifier);
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayType);
		try {
			setState(604);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(595); primitiveType();
				setState(596); dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(598); classOrInterfaceType();
				setState(599); dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(601); typeVariable();
				setState(602); dims();
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

	public static class DimsContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDims(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDims(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dims);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(606); annotation();
				}
				}
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(612); match(LBRACK);
			setState(613); match(RBRACK);
			setState(624);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(617);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(614); annotation();
						}
						}
						setState(619);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(620); match(LBRACK);
					setState(621); match(RBRACK);
					}
					} 
				}
				setState(626);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<TypeParameterModifierContext> typeParameterModifier() {
			return getRuleContexts(TypeParameterModifierContext.class);
		}
		public TypeParameterModifierContext typeParameterModifier(int i) {
			return getRuleContext(TypeParameterModifierContext.class,i);
		}
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(627); typeParameterModifier();
				}
				}
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(633); match(Identifier);
			setState(635);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(634); typeBound();
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

	public static class TypeParameterModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TypeParameterModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameterModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeParameterModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterModifierContext typeParameterModifier() throws RecognitionException {
		TypeParameterModifierContext _localctx = new TypeParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637); annotation();
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

	public static class TypeBoundContext extends ParserRuleContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeBound);
		int _la;
		try {
			setState(649);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(639); match(EXTENDS);
				setState(640); typeVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(641); match(EXTENDS);
				setState(642); classOrInterfaceType();
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(643); additionalBound();
					}
					}
					setState(648);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class AdditionalBoundContext extends ParserRuleContext {
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public AdditionalBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAdditionalBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAdditionalBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAdditionalBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionalBoundContext additionalBound() throws RecognitionException {
		AdditionalBoundContext _localctx = new AdditionalBoundContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_additionalBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651); match(BITAND);
			setState(652); interfaceType();
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654); match(LT);
			setState(655); typeArgumentList();
			setState(656); match(GT);
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

	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658); typeArgument();
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(659); match(COMMA);
				setState(660); typeArgument();
				}
				}
				setState(665);
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

	public static class TypeArgumentContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typeArgument);
		try {
			setState(668);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(666); referenceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(667); wildcard();
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

	public static class WildcardContext extends ParserRuleContext {
		public WildcardBoundsContext wildcardBounds() {
			return getRuleContext(WildcardBoundsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWildcard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitWildcard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(670); annotation();
				}
				}
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(676); match(QUESTION);
			setState(678);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(677); wildcardBounds();
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

	public static class WildcardBoundsContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWildcardBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWildcardBounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitWildcardBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardBoundsContext wildcardBounds() throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_wildcardBounds);
		try {
			setState(684);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(680); match(EXTENDS);
				setState(681); referenceType();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(682); match(SUPER);
				setState(683); referenceType();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PackageNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPackageName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPackageName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		return packageName(0);
	}

	private PackageNameContext packageName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageNameContext _localctx = new PackageNameContext(_ctx, _parentState);
		PackageNameContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_packageName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(687); match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(694);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageName);
					setState(689);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(690); match(DOT);
					setState(691); match(Identifier);
					}
					} 
				}
				setState(696);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typeName);
		try {
			setState(702);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(697); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(698); packageOrTypeName(0);
				setState(699); match(DOT);
				setState(700); match(Identifier);
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

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPackageOrTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPackageOrTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPackageOrTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		return packageOrTypeName(0);
	}

	private PackageOrTypeNameContext packageOrTypeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, _parentState);
		PackageOrTypeNameContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_packageOrTypeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(705); match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(712);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageOrTypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageOrTypeName);
					setState(707);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(708); match(DOT);
					setState(709); match(Identifier);
					}
					} 
				}
				setState(714);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExpressionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExpressionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExpressionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNameContext expressionName() throws RecognitionException {
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expressionName);
		try {
			setState(720);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(715); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(716); ambiguousName(0);
				setState(717); match(DOT);
				setState(718); match(Identifier);
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

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722); match(Identifier);
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

	public static class AmbiguousNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public AmbiguousNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiguousName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAmbiguousName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAmbiguousName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAmbiguousName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmbiguousNameContext ambiguousName() throws RecognitionException {
		return ambiguousName(0);
	}

	private AmbiguousNameContext ambiguousName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx, _parentState);
		AmbiguousNameContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_ambiguousName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(725); match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(732);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AmbiguousNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ambiguousName);
					setState(727);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(728); match(DOT);
					setState(729); match(Identifier);
					}
					} 
				}
				setState(734);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(Java8Parser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(735); packageDeclaration();
				}
				break;
			}
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(738); importDeclaration();
				}
				}
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(744); typeDeclaration();
				}
				}
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(750); match(EOF);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public List<PackageModifierContext> packageModifier() {
			return getRuleContexts(PackageModifierContext.class);
		}
		public PackageModifierContext packageModifier(int i) {
			return getRuleContext(PackageModifierContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(752); packageModifier();
				}
				}
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(758); match(PACKAGE);
			setState(759); match(Identifier);
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(760); match(DOT);
				setState(761); match(Identifier);
				}
				}
				setState(766);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(767); match(SEMI);
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

	public static class PackageModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public PackageModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPackageModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPackageModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPackageModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageModifierContext packageModifier() throws RecognitionException {
		PackageModifierContext _localctx = new PackageModifierContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_packageModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769); annotation();
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public SingleStaticImportDeclarationContext singleStaticImportDeclaration() {
			return getRuleContext(SingleStaticImportDeclarationContext.class,0);
		}
		public StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() {
			return getRuleContext(StaticImportOnDemandDeclarationContext.class,0);
		}
		public SingleTypeImportDeclarationContext singleTypeImportDeclaration() {
			return getRuleContext(SingleTypeImportDeclarationContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() {
			return getRuleContext(TypeImportOnDemandDeclarationContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_importDeclaration);
		try {
			setState(775);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(771); singleTypeImportDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(772); typeImportOnDemandDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(773); singleStaticImportDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(774); staticImportOnDemandDeclaration();
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

	public static class SingleTypeImportDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public SingleTypeImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTypeImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSingleTypeImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSingleTypeImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSingleTypeImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTypeImportDeclarationContext singleTypeImportDeclaration() throws RecognitionException {
		SingleTypeImportDeclarationContext _localctx = new SingleTypeImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_singleTypeImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777); match(IMPORT);
			setState(778); typeName();
			setState(779); match(SEMI);
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

	public static class TypeImportOnDemandDeclarationContext extends ParserRuleContext {
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeImportOnDemandDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeImportOnDemandDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() throws RecognitionException {
		TypeImportOnDemandDeclarationContext _localctx = new TypeImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typeImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781); match(IMPORT);
			setState(782); packageOrTypeName(0);
			setState(783); match(DOT);
			setState(784); match(MUL);
			setState(785); match(SEMI);
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

	public static class SingleStaticImportDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public SingleStaticImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStaticImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSingleStaticImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSingleStaticImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSingleStaticImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStaticImportDeclarationContext singleStaticImportDeclaration() throws RecognitionException {
		SingleStaticImportDeclarationContext _localctx = new SingleStaticImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_singleStaticImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787); match(IMPORT);
			setState(788); match(STATIC);
			setState(789); typeName();
			setState(790); match(DOT);
			setState(791); match(Identifier);
			setState(792); match(SEMI);
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

	public static class StaticImportOnDemandDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StaticImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStaticImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStaticImportOnDemandDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStaticImportOnDemandDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() throws RecognitionException {
		StaticImportOnDemandDeclarationContext _localctx = new StaticImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_staticImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794); match(IMPORT);
			setState(795); match(STATIC);
			setState(796); typeName();
			setState(797); match(DOT);
			setState(798); match(MUL);
			setState(799); match(SEMI);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeDeclaration);
		try {
			setState(804);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(801); classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(802); interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(803); match(SEMI);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_classDeclaration);
		try {
			setState(808);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(806); normalClassDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(807); enumDeclaration();
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

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNormalClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNormalClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(810); classModifier();
				}
				}
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(816); match(CLASS);
			setState(817); match(Identifier);
			setState(819);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(818); typeParameters();
				}
			}

			setState(822);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(821); superclass();
				}
			}

			setState(825);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(824); superinterfaces();
				}
			}

			setState(827); classBody();
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

	public static class ClassModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_classModifier);
		try {
			setState(837);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(829); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(830); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(831); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(832); match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(833); match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(834); match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(835); match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(836); match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TypeParametersContext extends ParserRuleContext {
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839); match(LT);
			setState(840); typeParameterList();
			setState(841); match(GT);
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

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843); typeParameter();
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(844); match(COMMA);
				setState(845); typeParameter();
				}
				}
				setState(850);
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

	public static class SuperclassContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSuperclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSuperclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSuperclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851); match(EXTENDS);
			setState(852); classType();
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

	public static class SuperinterfacesContext extends ParserRuleContext {
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public SuperinterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superinterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSuperinterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSuperinterfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSuperinterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperinterfacesContext superinterfaces() throws RecognitionException {
		SuperinterfacesContext _localctx = new SuperinterfacesContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_superinterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854); match(IMPLEMENTS);
			setState(855); interfaceTypeList();
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

	public static class InterfaceTypeListContext extends ParserRuleContext {
		public List<InterfaceTypeContext> interfaceType() {
			return getRuleContexts(InterfaceTypeContext.class);
		}
		public InterfaceTypeContext interfaceType(int i) {
			return getRuleContext(InterfaceTypeContext.class,i);
		}
		public InterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeListContext interfaceTypeList() throws RecognitionException {
		InterfaceTypeListContext _localctx = new InterfaceTypeListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_interfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857); interfaceType();
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(858); match(COMMA);
				setState(859); interfaceType();
				}
				}
				setState(864);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865); match(LBRACE);
			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (Identifier - 65)) | (1L << (AT - 65)))) != 0)) {
				{
				{
				setState(866); classBodyDeclaration();
				}
				}
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(872); match(RBRACE);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassMemberDeclarationContext classMemberDeclaration() {
			return getRuleContext(ClassMemberDeclarationContext.class,0);
		}
		public StaticInitializerContext staticInitializer() {
			return getRuleContext(StaticInitializerContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public InstanceInitializerContext instanceInitializer() {
			return getRuleContext(InstanceInitializerContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_classBodyDeclaration);
		try {
			setState(878);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(874); classMemberDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(875); instanceInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(876); staticInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(877); constructorDeclaration();
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

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_classMemberDeclaration);
		try {
			setState(885);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(880); fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(881); methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(882); classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(883); interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(884); match(SEMI);
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				{
				setState(887); fieldModifier();
				}
				}
				setState(892);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(893); unannType();
			setState(894); variableDeclaratorList();
			setState(895); match(SEMI);
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

	public static class FieldModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_fieldModifier);
		try {
			setState(905);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(897); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(898); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(899); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(900); match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(901); match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(902); match(FINAL);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(903); match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(904); match(VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907); variableDeclarator();
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(908); match(COMMA);
				setState(909); variableDeclarator();
				}
				}
				setState(914);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915); variableDeclaratorId();
			setState(918);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(916); match(ASSIGN);
				setState(917); variableInitializer();
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920); match(Identifier);
			setState(922);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(921); dims();
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_variableInitializer);
		try {
			setState(926);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case OMPTHREADNUM:
			case OMPNUMTHREADS:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(924); expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(925); arrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class UnannTypeContext extends ParserRuleContext {
		public UnannReferenceTypeContext unannReferenceType() {
			return getRuleContext(UnannReferenceTypeContext.class,0);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public UnannTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannTypeContext unannType() throws RecognitionException {
		UnannTypeContext _localctx = new UnannTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_unannType);
		try {
			setState(930);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(928); unannPrimitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(929); unannReferenceType();
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

	public static class UnannPrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public UnannPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannPrimitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannPrimitiveTypeContext unannPrimitiveType() throws RecognitionException {
		UnannPrimitiveTypeContext _localctx = new UnannPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_unannPrimitiveType);
		try {
			setState(934);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(932); numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(933); match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class UnannReferenceTypeContext extends ParserRuleContext {
		public UnannArrayTypeContext unannArrayType() {
			return getRuleContext(UnannArrayTypeContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannReferenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannReferenceTypeContext unannReferenceType() throws RecognitionException {
		UnannReferenceTypeContext _localctx = new UnannReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_unannReferenceType);
		try {
			setState(939);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(936); unannClassOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(937); unannTypeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(938); unannArrayType();
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

	public static class UnannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public List<UnannInterfaceType_lf_unannClassOrInterfaceTypeContext> unannInterfaceType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public List<UnannClassType_lf_unannClassOrInterfaceTypeContext> unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannClassType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() throws RecognitionException {
		UnannClassOrInterfaceTypeContext _localctx = new UnannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_unannClassOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(941); unannClassType_lfno_unannClassOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(942); unannInterfaceType_lfno_unannClassOrInterfaceType();
				}
				break;
			}
			setState(949);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(947);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						setState(945); unannClassType_lf_unannClassOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(946); unannInterfaceType_lf_unannClassOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(951);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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

	public static class UnannClassTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public UnannClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassTypeContext unannClassType() throws RecognitionException {
		UnannClassTypeContext _localctx = new UnannClassTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_unannClassType);
		int _la;
		try {
			setState(968);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(952); match(Identifier);
				setState(954);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(953); typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(956); unannClassOrInterfaceType();
				setState(957); match(DOT);
				setState(961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(958); annotation();
					}
					}
					setState(963);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(964); match(Identifier);
				setState(966);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(965); typeArguments();
					}
				}

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

	public static class UnannClassType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannClassType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannClassType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannClassType_lf_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_unannClassType_lf_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970); match(DOT);
			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(971); annotation();
				}
				}
				setState(976);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(977); match(Identifier);
			setState(979);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(978); typeArguments();
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

	public static class UnannClassType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannClassType_lfno_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_unannClassType_lfno_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981); match(Identifier);
			setState(983);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(982); typeArguments();
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

	public static class UnannInterfaceTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public UnannInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceTypeContext unannInterfaceType() throws RecognitionException {
		UnannInterfaceTypeContext _localctx = new UnannInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_unannInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985); unannClassType();
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

	public static class UnannInterfaceType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_unannInterfaceType_lf_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987); unannClassType_lf_unannClassOrInterfaceType();
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

	public static class UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989); unannClassType_lfno_unannClassOrInterfaceType();
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

	public static class UnannTypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public UnannTypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannTypeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannTypeVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannTypeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannTypeVariableContext unannTypeVariable() throws RecognitionException {
		UnannTypeVariableContext _localctx = new UnannTypeVariableContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_unannTypeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991); match(Identifier);
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

	public static class UnannArrayTypeContext extends ParserRuleContext {
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public UnannArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannArrayTypeContext unannArrayType() throws RecognitionException {
		UnannArrayTypeContext _localctx = new UnannArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_unannArrayType);
		try {
			setState(1002);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(993); unannPrimitiveType();
				setState(994); dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(996); unannClassOrInterfaceType();
				setState(997); dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(999); unannTypeVariable();
				setState(1000); dims();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public List<MethodModifierContext> methodModifier() {
			return getRuleContexts(MethodModifierContext.class);
		}
		public MethodModifierContext methodModifier(int i) {
			return getRuleContext(MethodModifierContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED))) != 0) || _la==AT) {
				{
				{
				setState(1004); methodModifier();
				}
				}
				setState(1009);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1010); methodHeader();
			setState(1011); methodBody();
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

	public static class MethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_methodModifier);
		try {
			setState(1023);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1013); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1014); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1015); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1016); match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1017); match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1018); match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1019); match(FINAL);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 8);
				{
				setState(1020); match(SYNCHRONIZED);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1021); match(NATIVE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 10);
				{
				setState(1022); match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MethodHeaderContext extends ParserRuleContext {
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_methodHeader);
		int _la;
		try {
			setState(1042);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1025); result();
				setState(1026); methodDeclarator();
				setState(1028);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1027); throws_();
					}
				}

				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1030); typeParameters();
				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1031); annotation();
					}
					}
					setState(1036);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1037); result();
				setState(1038); methodDeclarator();
				setState(1040);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1039); throws_();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ResultContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_result);
		try {
			setState(1046);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1044); unannType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1045); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MethodDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048); match(Identifier);
			setState(1049); match(LPAREN);
			setState(1051);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1050); formalParameterList();
				}
			}

			setState(1053); match(RPAREN);
			setState(1055);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1054); dims();
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_formalParameterList);
		try {
			setState(1062);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1057); formalParameters();
				setState(1058); match(COMMA);
				setState(1059); lastFormalParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1061); lastFormalParameter();
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

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_formalParameters);
		try {
			int _alt;
			setState(1080);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1064); formalParameter();
				setState(1069);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1065); match(COMMA);
						setState(1066); formalParameter();
						}
						} 
					}
					setState(1071);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1072); receiverParameter();
				setState(1077);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1073); match(COMMA);
						setState(1074); formalParameter();
						}
						} 
					}
					setState(1079);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				}
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

	public static class FormalParameterContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1082); variableModifier();
				}
				}
				setState(1087);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1088); unannType();
			setState(1089); variableDeclaratorId();
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

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_variableModifier);
		try {
			setState(1093);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1091); annotation();
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1092); match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LastFormalParameterContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLastFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_lastFormalParameter);
		int _la;
		try {
			setState(1112);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1098);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
					{
					setState(1095); variableModifier();
					}
					}
					setState(1100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1101); unannType();
				setState(1105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1102); annotation();
					}
					}
					setState(1107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1108); match(ELLIPSIS);
				setState(1109); variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1111); formalParameter();
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

	public static class ReceiverParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterReceiverParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitReceiverParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitReceiverParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1114); annotation();
				}
				}
				setState(1119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1120); unannType();
			setState(1123);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1121); match(Identifier);
				setState(1122); match(DOT);
				}
			}

			setState(1125); match(THIS);
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

	public static class Throws_Context extends ParserRuleContext {
		public ExceptionTypeListContext exceptionTypeList() {
			return getRuleContext(ExceptionTypeListContext.class,0);
		}
		public Throws_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throws_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterThrows_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitThrows_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitThrows_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Throws_Context throws_() throws RecognitionException {
		Throws_Context _localctx = new Throws_Context(_ctx, getState());
		enterRule(_localctx, 166, RULE_throws_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127); match(THROWS);
			setState(1128); exceptionTypeList();
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

	public static class ExceptionTypeListContext extends ParserRuleContext {
		public List<ExceptionTypeContext> exceptionType() {
			return getRuleContexts(ExceptionTypeContext.class);
		}
		public ExceptionTypeContext exceptionType(int i) {
			return getRuleContext(ExceptionTypeContext.class,i);
		}
		public ExceptionTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExceptionTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExceptionTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExceptionTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionTypeListContext exceptionTypeList() throws RecognitionException {
		ExceptionTypeListContext _localctx = new ExceptionTypeListContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_exceptionTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1130); exceptionType();
			setState(1135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1131); match(COMMA);
				setState(1132); exceptionType();
				}
				}
				setState(1137);
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

	public static class ExceptionTypeContext extends ParserRuleContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public ExceptionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExceptionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExceptionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExceptionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionTypeContext exceptionType() throws RecognitionException {
		ExceptionTypeContext _localctx = new ExceptionTypeContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_exceptionType);
		try {
			setState(1140);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1138); classType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1139); typeVariable();
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

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_methodBody);
		try {
			setState(1144);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1142); block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1143); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class InstanceInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InstanceInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInstanceInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInstanceInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInstanceInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceInitializerContext instanceInitializer() throws RecognitionException {
		InstanceInitializerContext _localctx = new InstanceInitializerContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_instanceInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146); block();
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

	public static class StaticInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StaticInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStaticInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStaticInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStaticInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticInitializerContext staticInitializer() throws RecognitionException {
		StaticInitializerContext _localctx = new StaticInitializerContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1148); match(STATIC);
			setState(1149); block();
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public ConstructorDeclaratorContext constructorDeclarator() {
			return getRuleContext(ConstructorDeclaratorContext.class,0);
		}
		public List<ConstructorModifierContext> constructorModifier() {
			return getRuleContexts(ConstructorModifierContext.class);
		}
		public ConstructorModifierContext constructorModifier(int i) {
			return getRuleContext(ConstructorModifierContext.class,i);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0) || _la==AT) {
				{
				{
				setState(1151); constructorModifier();
				}
				}
				setState(1156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1157); constructorDeclarator();
			setState(1159);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1158); throws_();
				}
			}

			setState(1161); constructorBody();
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

	public static class ConstructorModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ConstructorModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstructorModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorModifierContext constructorModifier() throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_constructorModifier);
		try {
			setState(1167);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1163); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1164); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1165); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1166); match(PRIVATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConstructorDeclaratorContext extends ParserRuleContext {
		public SimpleTypeNameContext simpleTypeName() {
			return getRuleContext(SimpleTypeNameContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstructorDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclaratorContext constructorDeclarator() throws RecognitionException {
		ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1169); typeParameters();
				}
			}

			setState(1172); simpleTypeName();
			setState(1173); match(LPAREN);
			setState(1175);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1174); formalParameterList();
				}
			}

			setState(1177); match(RPAREN);
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

	public static class SimpleTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSimpleTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSimpleTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSimpleTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeNameContext simpleTypeName() throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179); match(Identifier);
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

	public static class ConstructorBodyContext extends ParserRuleContext {
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1181); match(LBRACE);
			setState(1183);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(1182); explicitConstructorInvocation();
				}
				break;
			}
			setState(1186);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (Identifier - 65)) | (1L << (AT - 65)))) != 0)) {
				{
				setState(1185); blockStatements();
				}
			}

			setState(1188); match(RBRACE);
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

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExplicitConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExplicitConstructorInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExplicitConstructorInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(1236);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1191);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1190); typeArguments();
					}
				}

				setState(1193); match(THIS);
				setState(1194); match(LPAREN);
				setState(1196);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
					setState(1195); argumentList();
					}
				}

				setState(1198); match(RPAREN);
				setState(1199); match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1201);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1200); typeArguments();
					}
				}

				setState(1203); match(SUPER);
				setState(1204); match(LPAREN);
				setState(1206);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
					setState(1205); argumentList();
					}
				}

				setState(1208); match(RPAREN);
				setState(1209); match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1210); expressionName();
				setState(1211); match(DOT);
				setState(1213);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1212); typeArguments();
					}
				}

				setState(1215); match(SUPER);
				setState(1216); match(LPAREN);
				setState(1218);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
					setState(1217); argumentList();
					}
				}

				setState(1220); match(RPAREN);
				setState(1221); match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1223); primary();
				setState(1224); match(DOT);
				setState(1226);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1225); typeArguments();
					}
				}

				setState(1228); match(SUPER);
				setState(1229); match(LPAREN);
				setState(1231);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
					setState(1230); argumentList();
					}
				}

				setState(1233); match(RPAREN);
				setState(1234); match(SEMI);
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1238); classModifier();
				}
				}
				setState(1243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1244); match(ENUM);
			setState(1245); match(Identifier);
			setState(1247);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1246); superinterfaces();
				}
			}

			setState(1249); enumBody();
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

	public static class EnumBodyContext extends ParserRuleContext {
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumConstantListContext enumConstantList() {
			return getRuleContext(EnumConstantListContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251); match(LBRACE);
			setState(1253);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(1252); enumConstantList();
				}
			}

			setState(1256);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1255); match(COMMA);
				}
			}

			setState(1259);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1258); enumBodyDeclarations();
				}
			}

			setState(1261); match(RBRACE);
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

	public static class EnumConstantListContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantListContext enumConstantList() throws RecognitionException {
		EnumConstantListContext _localctx = new EnumConstantListContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_enumConstantList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1263); enumConstant();
			setState(1268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1264); match(COMMA);
					setState(1265); enumConstant();
					}
					} 
				}
				setState(1270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
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

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<EnumConstantModifierContext> enumConstantModifier() {
			return getRuleContexts(EnumConstantModifierContext.class);
		}
		public EnumConstantModifierContext enumConstantModifier(int i) {
			return getRuleContext(EnumConstantModifierContext.class,i);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1271); enumConstantModifier();
				}
				}
				setState(1276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1277); match(Identifier);
			setState(1283);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1278); match(LPAREN);
				setState(1280);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
					setState(1279); argumentList();
					}
				}

				setState(1282); match(RPAREN);
				}
			}

			setState(1286);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1285); classBody();
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

	public static class EnumConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public EnumConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstantModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumConstantModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantModifierContext enumConstantModifier() throws RecognitionException {
		EnumConstantModifierContext _localctx = new EnumConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_enumConstantModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288); annotation();
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

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumBodyDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290); match(SEMI);
			setState(1294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (Identifier - 65)) | (1L << (AT - 65)))) != 0)) {
				{
				{
				setState(1291); classBodyDeclaration();
				}
				}
				setState(1296);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_interfaceDeclaration);
		try {
			setState(1299);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1297); normalInterfaceDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1298); annotationTypeDeclaration();
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

	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ExtendsInterfacesContext extendsInterfaces() {
			return getRuleContext(ExtendsInterfacesContext.class,0);
		}
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNormalInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNormalInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNormalInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1301); interfaceModifier();
				}
				}
				setState(1306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1307); match(INTERFACE);
			setState(1308); match(Identifier);
			setState(1310);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1309); typeParameters();
				}
			}

			setState(1313);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1312); extendsInterfaces();
				}
			}

			setState(1315); interfaceBody();
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

	public static class InterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public InterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceModifierContext interfaceModifier() throws RecognitionException {
		InterfaceModifierContext _localctx = new InterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_interfaceModifier);
		try {
			setState(1324);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1317); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1318); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1319); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1320); match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1321); match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1322); match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1323); match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExtendsInterfacesContext extends ParserRuleContext {
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public ExtendsInterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsInterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExtendsInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExtendsInterfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExtendsInterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendsInterfacesContext extendsInterfaces() throws RecognitionException {
		ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_extendsInterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326); match(EXTENDS);
			setState(1327); interfaceTypeList();
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

	public static class InterfaceBodyContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration(int i) {
			return getRuleContext(InterfaceMemberDeclarationContext.class,i);
		}
		public List<InterfaceMemberDeclarationContext> interfaceMemberDeclaration() {
			return getRuleContexts(InterfaceMemberDeclarationContext.class);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1329); match(LBRACE);
			setState(1333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (Identifier - 65)) | (1L << (AT - 65)))) != 0)) {
				{
				{
				setState(1330); interfaceMemberDeclaration();
				}
				}
				setState(1335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1336); match(RBRACE);
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

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_interfaceMemberDeclaration);
		try {
			setState(1343);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1338); constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1339); interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1340); classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1341); interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1342); match(SEMI);
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

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class,i);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstantDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstantDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << STATIC))) != 0) || _la==AT) {
				{
				{
				setState(1345); constantModifier();
				}
				}
				setState(1350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1351); unannType();
			setState(1352); variableDeclaratorList();
			setState(1353); match(SEMI);
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

	public static class ConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstantModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstantModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantModifierContext constantModifier() throws RecognitionException {
		ConstantModifierContext _localctx = new ConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_constantModifier);
		try {
			setState(1359);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1355); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1356); match(PUBLIC);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1357); match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1358); match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1361); interfaceMethodModifier();
				}
				}
				setState(1366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1367); methodHeader();
			setState(1368); methodBody();
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

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceMethodModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_interfaceMethodModifier);
		try {
			setState(1376);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1370); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1371); match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1372); match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1373); match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1374); match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(1375); match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_annotationTypeDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1381);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1378); interfaceModifier();
					}
					} 
				}
				setState(1383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			}
			setState(1384); match(AT);
			setState(1385); match(INTERFACE);
			setState(1386); match(Identifier);
			setState(1387); annotationTypeBody();
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

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public List<AnnotationTypeMemberDeclarationContext> annotationTypeMemberDeclaration() {
			return getRuleContexts(AnnotationTypeMemberDeclarationContext.class);
		}
		public AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration(int i) {
			return getRuleContext(AnnotationTypeMemberDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1389); match(LBRACE);
			setState(1393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65)) | (1L << (Identifier - 65)) | (1L << (AT - 65)))) != 0)) {
				{
				{
				setState(1390); annotationTypeMemberDeclaration();
				}
				}
				setState(1395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1396); match(RBRACE);
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

	public static class AnnotationTypeMemberDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public AnnotationTypeMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationTypeMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration() throws RecognitionException {
		AnnotationTypeMemberDeclarationContext _localctx = new AnnotationTypeMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_annotationTypeMemberDeclaration);
		try {
			setState(1403);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1398); annotationTypeElementDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1399); constantDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1400); classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1401); interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1402); match(SEMI);
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

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationTypeElementModifierContext annotationTypeElementModifier(int i) {
			return getRuleContext(AnnotationTypeElementModifierContext.class,i);
		}
		public List<AnnotationTypeElementModifierContext> annotationTypeElementModifier() {
			return getRuleContexts(AnnotationTypeElementModifierContext.class);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeElementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_annotationTypeElementDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT || _la==PUBLIC || _la==AT) {
				{
				{
				setState(1405); annotationTypeElementModifier();
				}
				}
				setState(1410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1411); unannType();
			setState(1412); match(Identifier);
			setState(1413); match(LPAREN);
			setState(1414); match(RPAREN);
			setState(1416);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1415); dims();
				}
			}

			setState(1419);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1418); defaultValue();
				}
			}

			setState(1421); match(SEMI);
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

	public static class AnnotationTypeElementModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public AnnotationTypeElementModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeElementModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeElementModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationTypeElementModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementModifierContext annotationTypeElementModifier() throws RecognitionException {
		AnnotationTypeElementModifierContext _localctx = new AnnotationTypeElementModifierContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_annotationTypeElementModifier);
		try {
			setState(1426);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1423); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1424); match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1425); match(ABSTRACT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1428); match(DEFAULT);
			setState(1429); elementValue();
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

	public static class AnnotationContext extends ParserRuleContext {
		public NormalAnnotationContext normalAnnotation() {
			return getRuleContext(NormalAnnotationContext.class,0);
		}
		public MarkerAnnotationContext markerAnnotation() {
			return getRuleContext(MarkerAnnotationContext.class,0);
		}
		public SingleElementAnnotationContext singleElementAnnotation() {
			return getRuleContext(SingleElementAnnotationContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_annotation);
		try {
			setState(1434);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1431); normalAnnotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1432); markerAnnotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1433); singleElementAnnotation();
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

	public static class NormalAnnotationContext extends ParserRuleContext {
		public ElementValuePairListContext elementValuePairList() {
			return getRuleContext(ElementValuePairListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public NormalAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNormalAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNormalAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNormalAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalAnnotationContext normalAnnotation() throws RecognitionException {
		NormalAnnotationContext _localctx = new NormalAnnotationContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_normalAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1436); match(AT);
			setState(1437); typeName();
			setState(1438); match(LPAREN);
			setState(1440);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1439); elementValuePairList();
				}
			}

			setState(1442); match(RPAREN);
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

	public static class ElementValuePairListContext extends ParserRuleContext {
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValuePairList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValuePairList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitElementValuePairList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairListContext elementValuePairList() throws RecognitionException {
		ElementValuePairListContext _localctx = new ElementValuePairListContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_elementValuePairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1444); elementValuePair();
			setState(1449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1445); match(COMMA);
				setState(1446); elementValuePair();
				}
				}
				setState(1451);
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

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452); match(Identifier);
			setState(1453); match(ASSIGN);
			setState(1454); elementValue();
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

	public static class ElementValueContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_elementValue);
		try {
			setState(1459);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1456); conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1457); elementValueArrayInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1458); annotation();
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

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public ElementValueListContext elementValueList() {
			return getRuleContext(ElementValueListContext.class,0);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_elementValueArrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1461); match(LBRACE);
			setState(1463);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
				{
				setState(1462); elementValueList();
				}
			}

			setState(1466);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1465); match(COMMA);
				}
			}

			setState(1468); match(RBRACE);
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

	public static class ElementValueListContext extends ParserRuleContext {
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitElementValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueListContext elementValueList() throws RecognitionException {
		ElementValueListContext _localctx = new ElementValueListContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_elementValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1470); elementValue();
			setState(1475);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1471); match(COMMA);
					setState(1472); elementValue();
					}
					} 
				}
				setState(1477);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
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

	public static class MarkerAnnotationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MarkerAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markerAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMarkerAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMarkerAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMarkerAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarkerAnnotationContext markerAnnotation() throws RecognitionException {
		MarkerAnnotationContext _localctx = new MarkerAnnotationContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_markerAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1478); match(AT);
			setState(1479); typeName();
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

	public static class SingleElementAnnotationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public SingleElementAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleElementAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSingleElementAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSingleElementAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSingleElementAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleElementAnnotationContext singleElementAnnotation() throws RecognitionException {
		SingleElementAnnotationContext _localctx = new SingleElementAnnotationContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_singleElementAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1481); match(AT);
			setState(1482); typeName();
			setState(1483); match(LPAREN);
			setState(1484); elementValue();
			setState(1485); match(RPAREN);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class,0);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1487); match(LBRACE);
			setState(1489);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
				{
				setState(1488); variableInitializerList();
				}
			}

			setState(1492);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1491); match(COMMA);
				}
			}

			setState(1494); match(RBRACE);
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

	public static class VariableInitializerListContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public VariableInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1496); variableInitializer();
			setState(1501);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1497); match(COMMA);
					setState(1498); variableInitializer();
					}
					} 
				}
				setState(1503);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
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

	public static class BlockContext extends ParserRuleContext {
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1504); match(LBRACE);
			setState(1506);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (Identifier - 65)) | (1L << (AT - 65)))) != 0)) {
				{
				setState(1505); blockStatements();
				}
			}

			setState(1508); match(RBRACE);
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

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBlockStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBlockStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1510); blockStatement();
			setState(1514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (Identifier - 65)) | (1L << (AT - 65)))) != 0)) {
				{
				{
				setState(1511); blockStatement();
				}
				}
				setState(1516);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_blockStatement);
		try {
			setState(1520);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1517); localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1518); classDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1519); statement();
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

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1522); localVariableDeclaration();
			setState(1523); match(SEMI);
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1525); variableModifier();
				}
				}
				setState(1530);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1531); unannType();
			setState(1532); variableDeclaratorList();
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

	public static class StatementContext extends ParserRuleContext {
		public IfThenStatementContext ifThenStatement() {
			return getRuleContext(IfThenStatementContext.class,0);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public IfThenElseStatementContext ifThenElseStatement() {
			return getRuleContext(IfThenElseStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_statement);
		try {
			setState(1540);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1534); statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1535); labeledStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1536); ifThenStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1537); ifThenElseStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1538); whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1539); forStatement();
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

	public static class StatementNoShortIfContext extends ParserRuleContext {
		public ForStatementNoShortIfContext forStatementNoShortIf() {
			return getRuleContext(ForStatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext whileStatementNoShortIf() {
			return getRuleContext(WhileStatementNoShortIfContext.class,0);
		}
		public IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() {
			return getRuleContext(IfThenElseStatementNoShortIfContext.class,0);
		}
		public LabeledStatementNoShortIfContext labeledStatementNoShortIf() {
			return getRuleContext(LabeledStatementNoShortIfContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public StatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementNoShortIfContext statementNoShortIf() throws RecognitionException {
		StatementNoShortIfContext _localctx = new StatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_statementNoShortIf);
		try {
			setState(1547);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1542); statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1543); labeledStatementNoShortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1544); ifThenElseStatementNoShortIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1545); whileStatementNoShortIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1546); forStatementNoShortIf();
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

	public static class StatementWithoutTrailingSubstatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class,0);
		}
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithoutTrailingSubstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStatementWithoutTrailingSubstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(1561);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1549); block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1550); emptyStatement();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case OMPTHREADNUM:
			case OMPNUMTHREADS:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case INC:
			case DEC:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1551); expressionStatement();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1552); assertStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(1553); switchStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(1554); doStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(1555); breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1556); continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(1557); returnStatement();
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
				setState(1558); synchronizedStatement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 11);
				{
				setState(1559); throwStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 12);
				{
				setState(1560); tryStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1563); match(SEMI);
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

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLabeledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565); match(Identifier);
			setState(1566); match(COLON);
			setState(1567); statement();
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

	public static class LabeledStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public LabeledStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLabeledStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLabeledStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLabeledStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementNoShortIfContext labeledStatementNoShortIf() throws RecognitionException {
		LabeledStatementNoShortIfContext _localctx = new LabeledStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_labeledStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1569); match(Identifier);
			setState(1570); match(COLON);
			setState(1571); statementNoShortIf();
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1573); statementExpression();
			setState(1574); match(SEMI);
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

	public static class StatementExpressionContext extends ParserRuleContext {
		public PostDecrementExpressionContext postDecrementExpression() {
			return getRuleContext(PostDecrementExpressionContext.class,0);
		}
		public PostIncrementExpressionContext postIncrementExpression() {
			return getRuleContext(PostIncrementExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_statementExpression);
		try {
			setState(1583);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1576); assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1577); preIncrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1578); preDecrementExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1579); postIncrementExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1580); postDecrementExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1581); methodInvocation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1582); classInstanceCreationExpression();
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

	public static class IfThenStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfThenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIfThenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIfThenStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIfThenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenStatementContext ifThenStatement() throws RecognitionException {
		IfThenStatementContext _localctx = new IfThenStatementContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_ifThenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585); match(IF);
			setState(1586); match(LPAREN);
			setState(1587); expression();
			setState(1588); match(RPAREN);
			setState(1589); statement();
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

	public static class IfThenElseStatementContext extends ParserRuleContext {
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfThenElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIfThenElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIfThenElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIfThenElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseStatementContext ifThenElseStatement() throws RecognitionException {
		IfThenElseStatementContext _localctx = new IfThenElseStatementContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_ifThenElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1591); match(IF);
			setState(1592); match(LPAREN);
			setState(1593); expression();
			setState(1594); match(RPAREN);
			setState(1595); statementNoShortIf();
			setState(1596); match(ELSE);
			setState(1597); statement();
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

	public static class IfThenElseStatementNoShortIfContext extends ParserRuleContext {
		public List<StatementNoShortIfContext> statementNoShortIf() {
			return getRuleContexts(StatementNoShortIfContext.class);
		}
		public StatementNoShortIfContext statementNoShortIf(int i) {
			return getRuleContext(StatementNoShortIfContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfThenElseStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIfThenElseStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIfThenElseStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIfThenElseStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() throws RecognitionException {
		IfThenElseStatementNoShortIfContext _localctx = new IfThenElseStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_ifThenElseStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1599); match(IF);
			setState(1600); match(LPAREN);
			setState(1601); expression();
			setState(1602); match(RPAREN);
			setState(1603); statementNoShortIf();
			setState(1604); match(ELSE);
			setState(1605); statementNoShortIf();
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

	public static class AssertStatementContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAssertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_assertStatement);
		try {
			setState(1617);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1607); match(ASSERT);
				setState(1608); expression();
				setState(1609); match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1611); match(ASSERT);
				setState(1612); expression();
				setState(1613); match(COLON);
				setState(1614); expression();
				setState(1615); match(SEMI);
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1619); match(SWITCH);
			setState(1620); match(LPAREN);
			setState(1621); expression();
			setState(1622); match(RPAREN);
			setState(1623); switchBlock();
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

	public static class SwitchBlockContext extends ParserRuleContext {
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1625); match(LBRACE);
			setState(1629);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1626); switchBlockStatementGroup();
					}
					} 
				}
				setState(1631);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			}
			setState(1635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1632); switchLabel();
				}
				}
				setState(1637);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1638); match(RBRACE);
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

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public SwitchLabelsContext switchLabels() {
			return getRuleContext(SwitchLabelsContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640); switchLabels();
			setState(1641); blockStatements();
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

	public static class SwitchLabelsContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchLabels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSwitchLabels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelsContext switchLabels() throws RecognitionException {
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_switchLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1643); switchLabel();
			setState(1647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1644); switchLabel();
				}
				}
				setState(1649);
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

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_switchLabel);
		try {
			setState(1660);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1650); match(CASE);
				setState(1651); constantExpression();
				setState(1652); match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1654); match(CASE);
				setState(1655); enumConstantName();
				setState(1656); match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1658); match(DEFAULT);
				setState(1659); match(COLON);
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

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstantName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumConstantName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1662); match(Identifier);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1664); match(WHILE);
			setState(1665); match(LPAREN);
			setState(1666); expression();
			setState(1667); match(RPAREN);
			setState(1668); statement();
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

	public static class WhileStatementNoShortIfContext extends ParserRuleContext {
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWhileStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWhileStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitWhileStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementNoShortIfContext whileStatementNoShortIf() throws RecognitionException {
		WhileStatementNoShortIfContext _localctx = new WhileStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_whileStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1670); match(WHILE);
			setState(1671); match(LPAREN);
			setState(1672); expression();
			setState(1673); match(RPAREN);
			setState(1674); statementNoShortIf();
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

	public static class DoStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1676); match(DO);
			setState(1677); statement();
			setState(1678); match(WHILE);
			setState(1679); match(LPAREN);
			setState(1680); expression();
			setState(1681); match(RPAREN);
			setState(1682); match(SEMI);
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

	public static class ForStatementContext extends ParserRuleContext {
		public BasicForStatementContext basicForStatement() {
			return getRuleContext(BasicForStatementContext.class,0);
		}
		public EnhancedForStatementContext enhancedForStatement() {
			return getRuleContext(EnhancedForStatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_forStatement);
		try {
			setState(1686);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1684); basicForStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1685); enhancedForStatement();
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

	public static class ForStatementNoShortIfContext extends ParserRuleContext {
		public BasicForStatementNoShortIfContext basicForStatementNoShortIf() {
			return getRuleContext(BasicForStatementNoShortIfContext.class,0);
		}
		public EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() {
			return getRuleContext(EnhancedForStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementNoShortIfContext forStatementNoShortIf() throws RecognitionException {
		ForStatementNoShortIfContext _localctx = new ForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_forStatementNoShortIf);
		try {
			setState(1690);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1688); basicForStatementNoShortIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1689); enhancedForStatementNoShortIf();
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

	public static class BasicForStatementContext extends ParserRuleContext {
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BasicForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBasicForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBasicForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBasicForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicForStatementContext basicForStatement() throws RecognitionException {
		BasicForStatementContext _localctx = new BasicForStatementContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_basicForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1692); match(FOR);
			setState(1693); match(LPAREN);
			setState(1695);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (INC - 81)) | (1L << (DEC - 81)) | (1L << (Identifier - 81)) | (1L << (AT - 81)))) != 0)) {
				{
				setState(1694); forInit();
				}
			}

			setState(1697); match(SEMI);
			setState(1699);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
				{
				setState(1698); expression();
				}
			}

			setState(1701); match(SEMI);
			setState(1703);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (INC - 81)) | (1L << (DEC - 81)) | (1L << (Identifier - 81)) | (1L << (AT - 81)))) != 0)) {
				{
				setState(1702); forUpdate();
				}
			}

			setState(1705); match(RPAREN);
			setState(1706); statement();
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

	public static class BasicForStatementNoShortIfContext extends ParserRuleContext {
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BasicForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBasicForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBasicForStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBasicForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicForStatementNoShortIfContext basicForStatementNoShortIf() throws RecognitionException {
		BasicForStatementNoShortIfContext _localctx = new BasicForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_basicForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1708); match(FOR);
			setState(1709); match(LPAREN);
			setState(1711);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (INC - 81)) | (1L << (DEC - 81)) | (1L << (Identifier - 81)) | (1L << (AT - 81)))) != 0)) {
				{
				setState(1710); forInit();
				}
			}

			setState(1713); match(SEMI);
			setState(1715);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
				{
				setState(1714); expression();
				}
			}

			setState(1717); match(SEMI);
			setState(1719);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (INC - 81)) | (1L << (DEC - 81)) | (1L << (Identifier - 81)) | (1L << (AT - 81)))) != 0)) {
				{
				setState(1718); forUpdate();
				}
			}

			setState(1721); match(RPAREN);
			setState(1722); statementNoShortIf();
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

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_forInit);
		try {
			setState(1726);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1724); statementExpressionList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1725); localVariableDeclaration();
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

	public static class ForUpdateContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1728); statementExpressionList();
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

	public static class StatementExpressionListContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class,i);
		}
		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}
		public StatementExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStatementExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionListContext statementExpressionList() throws RecognitionException {
		StatementExpressionListContext _localctx = new StatementExpressionListContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_statementExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1730); statementExpression();
			setState(1735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1731); match(COMMA);
				setState(1732); statementExpression();
				}
				}
				setState(1737);
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

	public static class EnhancedForStatementContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnhancedForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnhancedForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnhancedForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForStatementContext enhancedForStatement() throws RecognitionException {
		EnhancedForStatementContext _localctx = new EnhancedForStatementContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_enhancedForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1738); match(FOR);
			setState(1739); match(LPAREN);
			setState(1743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1740); variableModifier();
				}
				}
				setState(1745);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1746); unannType();
			setState(1747); variableDeclaratorId();
			setState(1748); match(COLON);
			setState(1749); expression();
			setState(1750); match(RPAREN);
			setState(1751); statement();
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

	public static class EnhancedForStatementNoShortIfContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnhancedForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnhancedForStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnhancedForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() throws RecognitionException {
		EnhancedForStatementNoShortIfContext _localctx = new EnhancedForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_enhancedForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1753); match(FOR);
			setState(1754); match(LPAREN);
			setState(1758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1755); variableModifier();
				}
				}
				setState(1760);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1761); unannType();
			setState(1762); variableDeclaratorId();
			setState(1763); match(COLON);
			setState(1764); expression();
			setState(1765); match(RPAREN);
			setState(1766); statementNoShortIf();
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1768); match(BREAK);
			setState(1770);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1769); match(Identifier);
				}
			}

			setState(1772); match(SEMI);
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1774); match(CONTINUE);
			setState(1776);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1775); match(Identifier);
				}
			}

			setState(1778); match(SEMI);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1780); match(RETURN);
			setState(1782);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
				{
				setState(1781); expression();
				}
			}

			setState(1784); match(SEMI);
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

	public static class ThrowStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1786); match(THROW);
			setState(1787); expression();
			setState(1788); match(SEMI);
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

	public static class SynchronizedStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SynchronizedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSynchronizedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSynchronizedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSynchronizedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1790); match(SYNCHRONIZED);
			setState(1791); match(LPAREN);
			setState(1792); expression();
			setState(1793); match(RPAREN);
			setState(1794); block();
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

	public static class TryStatementContext extends ParserRuleContext {
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TryWithResourcesStatementContext tryWithResourcesStatement() {
			return getRuleContext(TryWithResourcesStatementContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_tryStatement);
		int _la;
		try {
			setState(1808);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1796); match(TRY);
				setState(1797); block();
				setState(1798); catches();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1800); match(TRY);
				setState(1801); block();
				setState(1803);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1802); catches();
					}
				}

				setState(1805); finally_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1807); tryWithResourcesStatement();
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

	public static class CatchesContext extends ParserRuleContext {
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1810); catchClause();
			setState(1814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1811); catchClause();
				}
				}
				setState(1816);
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

	public static class CatchClauseContext extends ParserRuleContext {
		public CatchFormalParameterContext catchFormalParameter() {
			return getRuleContext(CatchFormalParameterContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1817); match(CATCH);
			setState(1818); match(LPAREN);
			setState(1819); catchFormalParameter();
			setState(1820); match(RPAREN);
			setState(1821); block();
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

	public static class CatchFormalParameterContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public CatchFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatchFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatchFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCatchFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchFormalParameterContext catchFormalParameter() throws RecognitionException {
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1823); variableModifier();
				}
				}
				setState(1828);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1829); catchType();
			setState(1830); variableDeclaratorId();
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

	public static class CatchTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public ClassTypeContext classType(int i) {
			return getRuleContext(ClassTypeContext.class,i);
		}
		public List<ClassTypeContext> classType() {
			return getRuleContexts(ClassTypeContext.class);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatchType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1832); unannClassType();
			setState(1837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1833); match(BITOR);
				setState(1834); classType();
				}
				}
				setState(1839);
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

	public static class Finally_Context extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFinally_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFinally_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFinally_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Finally_Context finally_() throws RecognitionException {
		Finally_Context _localctx = new Finally_Context(_ctx, getState());
		enterRule(_localctx, 346, RULE_finally_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1840); match(FINALLY);
			setState(1841); block();
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

	public static class TryWithResourcesStatementContext extends ParserRuleContext {
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TryWithResourcesStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryWithResourcesStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTryWithResourcesStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTryWithResourcesStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTryWithResourcesStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryWithResourcesStatementContext tryWithResourcesStatement() throws RecognitionException {
		TryWithResourcesStatementContext _localctx = new TryWithResourcesStatementContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_tryWithResourcesStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1843); match(TRY);
			setState(1844); resourceSpecification();
			setState(1845); block();
			setState(1847);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(1846); catches();
				}
			}

			setState(1850);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1849); finally_();
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

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public ResourceListContext resourceList() {
			return getRuleContext(ResourceListContext.class,0);
		}
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResourceSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1852); match(LPAREN);
			setState(1853); resourceList();
			setState(1855);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1854); match(SEMI);
				}
			}

			setState(1857); match(RPAREN);
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

	public static class ResourceListContext extends ParserRuleContext {
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResourceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResourceList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitResourceList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceListContext resourceList() throws RecognitionException {
		ResourceListContext _localctx = new ResourceListContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_resourceList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1859); resource();
			setState(1864);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1860); match(SEMI);
					setState(1861); resource();
					}
					} 
				}
				setState(1866);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
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

	public static class ResourceContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1867); variableModifier();
				}
				}
				setState(1872);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1873); unannType();
			setState(1874); variableDeclaratorId();
			setState(1875); match(ASSIGN);
			setState(1876); expression();
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

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primaryContext.class,i);
		}
		public PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primaryContext.class,0);
		}
		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_primaryContext> primaryNoNewArray_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primaryContext.class);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1880);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1878); primaryNoNewArray_lfno_primary();
				}
				break;
			case 2:
				{
				setState(1879); arrayCreationExpression();
				}
				break;
			}
			setState(1885);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1882); primaryNoNewArray_lf_primary();
					}
					} 
				}
				setState(1887);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
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

	public static class PrimaryNoNewArrayContext extends ParserRuleContext {
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public PrimaryNoNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArrayContext primaryNoNewArray() throws RecognitionException {
		PrimaryNoNewArrayContext _localctx = new PrimaryNoNewArrayContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_primaryNoNewArray);
		int _la;
		try {
			setState(1917);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1888); literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1889); typeName();
				setState(1894);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1890); match(LBRACK);
					setState(1891); match(RBRACK);
					}
					}
					setState(1896);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1897); match(DOT);
				setState(1898); match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1900); match(VOID);
				setState(1901); match(DOT);
				setState(1902); match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1903); match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1904); typeName();
				setState(1905); match(DOT);
				setState(1906); match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1908); match(LPAREN);
				setState(1909); expression();
				setState(1910); match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1912); classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1913); fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1914); arrayAccess();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1915); methodInvocation();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1916); methodReference();
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

	public static class PrimaryNoNewArray_lf_arrayAccessContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lf_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lf_arrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_arrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lf_arrayAccessContext _localctx = new PrimaryNoNewArray_lf_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_primaryNoNewArray_lf_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class PrimaryNoNewArray_lfno_arrayAccessContext extends ParserRuleContext {
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_arrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lfno_arrayAccessContext _localctx = new PrimaryNoNewArray_lfno_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_primaryNoNewArray_lfno_arrayAccess);
		int _la;
		try {
			setState(1949);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1921); literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1922); typeName();
				setState(1927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1923); match(LBRACK);
					setState(1924); match(RBRACK);
					}
					}
					setState(1929);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1930); match(DOT);
				setState(1931); match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1933); match(VOID);
				setState(1934); match(DOT);
				setState(1935); match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1936); match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1937); typeName();
				setState(1938); match(DOT);
				setState(1939); match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1941); match(LPAREN);
				setState(1942); expression();
				setState(1943); match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1945); classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1946); fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1947); methodInvocation();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1948); methodReference();
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

	public static class PrimaryNoNewArray_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public ArrayAccess_lf_primaryContext arrayAccess_lf_primary() {
			return getRuleContext(ArrayAccess_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_primaryNoNewArray_lf_primary);
		try {
			setState(1956);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1951); classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1952); fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1953); arrayAccess_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1954); methodInvocation_lf_primary();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1955); methodReference_lf_primary();
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

	public static class PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(1964);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1960); classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1961); fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1962); methodInvocation_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1963); methodReference_lf_primary();
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

	public static class PrimaryNoNewArray_lfno_primaryContext extends ParserRuleContext {
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() {
			return getRuleContext(ArrayAccess_lfno_primaryContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_primaryNoNewArray_lfno_primary);
		int _la;
		try {
			setState(2006);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1966); literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1967); typeName();
				setState(1972);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1968); match(LBRACK);
					setState(1969); match(RBRACK);
					}
					}
					setState(1974);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1975); match(DOT);
				setState(1976); match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1978); unannPrimitiveType();
				setState(1983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1979); match(LBRACK);
					setState(1980); match(RBRACK);
					}
					}
					setState(1985);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1986); match(DOT);
				setState(1987); match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1989); match(VOID);
				setState(1990); match(DOT);
				setState(1991); match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1992); match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1993); typeName();
				setState(1994); match(DOT);
				setState(1995); match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1997); match(LPAREN);
				setState(1998); expression();
				setState(1999); match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2001); classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2002); fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2003); arrayAccess_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2004); methodInvocation_lfno_primary();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2005); methodReference_lfno_primary();
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

	public static class PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		int _la;
		try {
			setState(2049);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2010); literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2011); typeName();
				setState(2016);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2012); match(LBRACK);
					setState(2013); match(RBRACK);
					}
					}
					setState(2018);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2019); match(DOT);
				setState(2020); match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2022); unannPrimitiveType();
				setState(2027);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2023); match(LBRACK);
					setState(2024); match(RBRACK);
					}
					}
					setState(2029);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2030); match(DOT);
				setState(2031); match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2033); match(VOID);
				setState(2034); match(DOT);
				setState(2035); match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2036); match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2037); typeName();
				setState(2038); match(DOT);
				setState(2039); match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2041); match(LPAREN);
				setState(2042); expression();
				setState(2043); match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2045); classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2046); fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2047); methodInvocation_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2048); methodReference_lfno_primary();
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

	public static class ClassInstanceCreationExpressionContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassInstanceCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassInstanceCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassInstanceCreationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassInstanceCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpressionContext classInstanceCreationExpression() throws RecognitionException {
		ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(2134);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2051); match(NEW);
				setState(2053);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2052); typeArguments();
					}
				}

				setState(2058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2055); annotation();
					}
					}
					setState(2060);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2061); match(Identifier);
				setState(2072);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2062); match(DOT);
					setState(2066);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2063); annotation();
						}
						}
						setState(2068);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2069); match(Identifier);
					}
					}
					setState(2074);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2076);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2075); typeArgumentsOrDiamond();
					}
				}

				setState(2078); match(LPAREN);
				setState(2080);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
					setState(2079); argumentList();
					}
				}

				setState(2082); match(RPAREN);
				setState(2084);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2083); classBody();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2086); expressionName();
				setState(2087); match(DOT);
				setState(2088); match(NEW);
				setState(2090);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2089); typeArguments();
					}
				}

				setState(2095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2092); annotation();
					}
					}
					setState(2097);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2098); match(Identifier);
				setState(2100);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2099); typeArgumentsOrDiamond();
					}
				}

				setState(2102); match(LPAREN);
				setState(2104);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
					setState(2103); argumentList();
					}
				}

				setState(2106); match(RPAREN);
				setState(2108);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2107); classBody();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2110); primary();
				setState(2111); match(DOT);
				setState(2112); match(NEW);
				setState(2114);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2113); typeArguments();
					}
				}

				setState(2119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2116); annotation();
					}
					}
					setState(2121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2122); match(Identifier);
				setState(2124);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2123); typeArgumentsOrDiamond();
					}
				}

				setState(2126); match(LPAREN);
				setState(2128);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
					setState(2127); argumentList();
					}
				}

				setState(2130); match(RPAREN);
				setState(2132);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2131); classBody();
					}
				}

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

	public static class ClassInstanceCreationExpression_lf_primaryContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassInstanceCreationExpression_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassInstanceCreationExpression_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassInstanceCreationExpression_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassInstanceCreationExpression_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lf_primaryContext _localctx = new ClassInstanceCreationExpression_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_classInstanceCreationExpression_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2136); match(DOT);
			setState(2137); match(NEW);
			setState(2139);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2138); typeArguments();
				}
			}

			setState(2144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2141); annotation();
				}
				}
				setState(2146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2147); match(Identifier);
			setState(2149);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2148); typeArgumentsOrDiamond();
				}
			}

			setState(2151); match(LPAREN);
			setState(2153);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
				{
				setState(2152); argumentList();
				}
			}

			setState(2155); match(RPAREN);
			setState(2157);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(2156); classBody();
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

	public static class ClassInstanceCreationExpression_lfno_primaryContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassInstanceCreationExpression_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassInstanceCreationExpression_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassInstanceCreationExpression_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lfno_primaryContext _localctx = new ClassInstanceCreationExpression_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_classInstanceCreationExpression_lfno_primary);
		int _la;
		try {
			setState(2218);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2159); match(NEW);
				setState(2161);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2160); typeArguments();
					}
				}

				setState(2166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2163); annotation();
					}
					}
					setState(2168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2169); match(Identifier);
				setState(2180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2170); match(DOT);
					setState(2174);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2171); annotation();
						}
						}
						setState(2176);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2177); match(Identifier);
					}
					}
					setState(2182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2184);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2183); typeArgumentsOrDiamond();
					}
				}

				setState(2186); match(LPAREN);
				setState(2188);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
					setState(2187); argumentList();
					}
				}

				setState(2190); match(RPAREN);
				setState(2192);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(2191); classBody();
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2194); expressionName();
				setState(2195); match(DOT);
				setState(2196); match(NEW);
				setState(2198);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2197); typeArguments();
					}
				}

				setState(2203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2200); annotation();
					}
					}
					setState(2205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2206); match(Identifier);
				setState(2208);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2207); typeArgumentsOrDiamond();
					}
				}

				setState(2210); match(LPAREN);
				setState(2212);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
					setState(2211); argumentList();
					}
				}

				setState(2214); match(RPAREN);
				setState(2216);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(2215); classBody();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_typeArgumentsOrDiamond);
		try {
			setState(2223);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2220); typeArguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2221); match(LT);
				setState(2222); match(GT);
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

	public static class FieldAccessContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_fieldAccess);
		try {
			setState(2238);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2225); primary();
				setState(2226); match(DOT);
				setState(2227); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2229); match(SUPER);
				setState(2230); match(DOT);
				setState(2231); match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2232); typeName();
				setState(2233); match(DOT);
				setState(2234); match(SUPER);
				setState(2235); match(DOT);
				setState(2236); match(Identifier);
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

	public static class FieldAccess_lf_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FieldAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccess_lf_primaryContext fieldAccess_lf_primary() throws RecognitionException {
		FieldAccess_lf_primaryContext _localctx = new FieldAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_fieldAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2240); match(DOT);
			setState(2241); match(Identifier);
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

	public static class FieldAccess_lfno_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() throws RecognitionException {
		FieldAccess_lfno_primaryContext _localctx = new FieldAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_fieldAccess_lfno_primary);
		try {
			setState(2252);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2243); match(SUPER);
				setState(2244); match(DOT);
				setState(2245); match(Identifier);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2246); typeName();
				setState(2247); match(DOT);
				setState(2248); match(SUPER);
				setState(2249); match(DOT);
				setState(2250); match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ArrayAccessContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() {
			return getRuleContext(PrimaryNoNewArray_lfno_arrayAccessContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_arrayAccessContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_arrayAccessContext> primaryNoNewArray_lf_arrayAccess() {
			return getRuleContexts(PrimaryNoNewArray_lf_arrayAccessContext.class);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2264);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(2254); expressionName();
				setState(2255); match(LBRACK);
				setState(2256); expression();
				setState(2257); match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2259); primaryNoNewArray_lfno_arrayAccess();
				setState(2260); match(LBRACK);
				setState(2261); expression();
				setState(2262); match(RBRACK);
				}
				break;
			}
			setState(2273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(2266); primaryNoNewArray_lf_arrayAccess();
				setState(2267); match(LBRACK);
				setState(2268); expression();
				setState(2269); match(RBRACK);
				}
				}
				setState(2275);
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

	public static class ArrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class,i);
		}
		public List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext> primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccess_lf_primaryContext arrayAccess_lf_primary() throws RecognitionException {
		ArrayAccess_lf_primaryContext _localctx = new ArrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_arrayAccess_lf_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2276); primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(2277); match(LBRACK);
			setState(2278); expression();
			setState(2279); match(RBRACK);
			}
			setState(2288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2281); primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
					setState(2282); match(LBRACK);
					setState(2283); expression();
					setState(2284); match(RBRACK);
					}
					} 
				}
				setState(2290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
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

	public static class ArrayAccess_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext> primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() {
			return getRuleContexts(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class);
		}
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ArrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() throws RecognitionException {
		ArrayAccess_lfno_primaryContext _localctx = new ArrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_arrayAccess_lfno_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2301);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(2291); expressionName();
				setState(2292); match(LBRACK);
				setState(2293); expression();
				setState(2294); match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2296); primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(2297); match(LBRACK);
				setState(2298); expression();
				setState(2299); match(RBRACK);
				}
				break;
			}
			setState(2310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2303); primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(2304); match(LBRACK);
					setState(2305); expression();
					setState(2306); match(RBRACK);
					}
					} 
				}
				setState(2312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
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

	public static class MethodInvocationContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_methodInvocation);
		int _la;
		try {
			setState(2381);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2313); methodName();
				setState(2314); match(LPAREN);
				setState(2316);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
					setState(2315); argumentList();
					}
				}

				setState(2318); match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2320); typeName();
				setState(2321); match(DOT);
				setState(2323);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2322); typeArguments();
					}
				}

				setState(2325); match(Identifier);
				setState(2326); match(LPAREN);
				setState(2328);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
					setState(2327); argumentList();
					}
				}

				setState(2330); match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2332); expressionName();
				setState(2333); match(DOT);
				setState(2335);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2334); typeArguments();
					}
				}

				setState(2337); match(Identifier);
				setState(2338); match(LPAREN);
				setState(2340);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
					setState(2339); argumentList();
					}
				}

				setState(2342); match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2344); primary();
				setState(2345); match(DOT);
				setState(2347);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2346); typeArguments();
					}
				}

				setState(2349); match(Identifier);
				setState(2350); match(LPAREN);
				setState(2352);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
					setState(2351); argumentList();
					}
				}

				setState(2354); match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2356); match(SUPER);
				setState(2357); match(DOT);
				setState(2359);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2358); typeArguments();
					}
				}

				setState(2361); match(Identifier);
				setState(2362); match(LPAREN);
				setState(2364);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
					setState(2363); argumentList();
					}
				}

				setState(2366); match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2367); typeName();
				setState(2368); match(DOT);
				setState(2369); match(SUPER);
				setState(2370); match(DOT);
				setState(2372);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2371); typeArguments();
					}
				}

				setState(2374); match(Identifier);
				setState(2375); match(LPAREN);
				setState(2377);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
					setState(2376); argumentList();
					}
				}

				setState(2379); match(RPAREN);
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

	public static class MethodInvocation_lf_primaryContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocation_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodInvocation_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodInvocation_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodInvocation_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocation_lf_primaryContext methodInvocation_lf_primary() throws RecognitionException {
		MethodInvocation_lf_primaryContext _localctx = new MethodInvocation_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_methodInvocation_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2383); match(DOT);
			setState(2385);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2384); typeArguments();
				}
			}

			setState(2387); match(Identifier);
			setState(2388); match(LPAREN);
			setState(2390);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
				{
				setState(2389); argumentList();
				}
			}

			setState(2392); match(RPAREN);
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

	public static class MethodInvocation_lfno_primaryContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodInvocation_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodInvocation_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodInvocation_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() throws RecognitionException {
		MethodInvocation_lfno_primaryContext _localctx = new MethodInvocation_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_methodInvocation_lfno_primary);
		int _la;
		try {
			setState(2450);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2394); methodName();
				setState(2395); match(LPAREN);
				setState(2397);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
					setState(2396); argumentList();
					}
				}

				setState(2399); match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2401); typeName();
				setState(2402); match(DOT);
				setState(2404);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2403); typeArguments();
					}
				}

				setState(2406); match(Identifier);
				setState(2407); match(LPAREN);
				setState(2409);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
					setState(2408); argumentList();
					}
				}

				setState(2411); match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2413); expressionName();
				setState(2414); match(DOT);
				setState(2416);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2415); typeArguments();
					}
				}

				setState(2418); match(Identifier);
				setState(2419); match(LPAREN);
				setState(2421);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
					setState(2420); argumentList();
					}
				}

				setState(2423); match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2425); match(SUPER);
				setState(2426); match(DOT);
				setState(2428);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2427); typeArguments();
					}
				}

				setState(2430); match(Identifier);
				setState(2431); match(LPAREN);
				setState(2433);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
					setState(2432); argumentList();
					}
				}

				setState(2435); match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2436); typeName();
				setState(2437); match(DOT);
				setState(2438); match(SUPER);
				setState(2439); match(DOT);
				setState(2441);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2440); typeArguments();
					}
				}

				setState(2443); match(Identifier);
				setState(2444); match(LPAREN);
				setState(2446);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << OMPTHREADNUM) | (1L << OMPNUMTHREADS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
					setState(2445); argumentList();
					}
				}

				setState(2448); match(RPAREN);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2452); expression();
			setState(2457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2453); match(COMMA);
				setState(2454); expression();
				}
				}
				setState(2459);
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

	public static class MethodReferenceContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public MethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReferenceContext methodReference() throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_methodReference);
		int _la;
		try {
			setState(2507);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2460); expressionName();
				setState(2461); match(COLONCOLON);
				setState(2463);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2462); typeArguments();
					}
				}

				setState(2465); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2467); referenceType();
				setState(2468); match(COLONCOLON);
				setState(2470);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2469); typeArguments();
					}
				}

				setState(2472); match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2474); primary();
				setState(2475); match(COLONCOLON);
				setState(2477);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2476); typeArguments();
					}
				}

				setState(2479); match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2481); match(SUPER);
				setState(2482); match(COLONCOLON);
				setState(2484);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2483); typeArguments();
					}
				}

				setState(2486); match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2487); typeName();
				setState(2488); match(DOT);
				setState(2489); match(SUPER);
				setState(2490); match(COLONCOLON);
				setState(2492);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2491); typeArguments();
					}
				}

				setState(2494); match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2496); classType();
				setState(2497); match(COLONCOLON);
				setState(2499);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2498); typeArguments();
					}
				}

				setState(2501); match(NEW);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2503); arrayType();
				setState(2504); match(COLONCOLON);
				setState(2505); match(NEW);
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

	public static class MethodReference_lf_primaryContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public MethodReference_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodReference_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodReference_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodReference_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReference_lf_primaryContext methodReference_lf_primary() throws RecognitionException {
		MethodReference_lf_primaryContext _localctx = new MethodReference_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_methodReference_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2509); match(COLONCOLON);
			setState(2511);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2510); typeArguments();
				}
			}

			setState(2513); match(Identifier);
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

	public static class MethodReference_lfno_primaryContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public MethodReference_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodReference_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodReference_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodReference_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReference_lfno_primaryContext methodReference_lfno_primary() throws RecognitionException {
		MethodReference_lfno_primaryContext _localctx = new MethodReference_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_methodReference_lfno_primary);
		int _la;
		try {
			setState(2555);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2515); expressionName();
				setState(2516); match(COLONCOLON);
				setState(2518);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2517); typeArguments();
					}
				}

				setState(2520); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2522); referenceType();
				setState(2523); match(COLONCOLON);
				setState(2525);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2524); typeArguments();
					}
				}

				setState(2527); match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2529); match(SUPER);
				setState(2530); match(COLONCOLON);
				setState(2532);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2531); typeArguments();
					}
				}

				setState(2534); match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2535); typeName();
				setState(2536); match(DOT);
				setState(2537); match(SUPER);
				setState(2538); match(COLONCOLON);
				setState(2540);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2539); typeArguments();
					}
				}

				setState(2542); match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2544); classType();
				setState(2545); match(COLONCOLON);
				setState(2547);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2546); typeArguments();
					}
				}

				setState(2549); match(NEW);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2551); arrayType();
				setState(2552); match(COLONCOLON);
				setState(2553); match(NEW);
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

	public static class ArrayCreationExpressionContext extends ParserRuleContext {
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayCreationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreationExpressionContext arrayCreationExpression() throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_arrayCreationExpression);
		try {
			setState(2579);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2557); match(NEW);
				setState(2558); primitiveType();
				setState(2559); dimExprs();
				setState(2561);
				switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
				case 1:
					{
					setState(2560); dims();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2563); match(NEW);
				setState(2564); classOrInterfaceType();
				setState(2565); dimExprs();
				setState(2567);
				switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(2566); dims();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2569); match(NEW);
				setState(2570); primitiveType();
				setState(2571); dims();
				setState(2572); arrayInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2574); match(NEW);
				setState(2575); classOrInterfaceType();
				setState(2576); dims();
				setState(2577); arrayInitializer();
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

	public static class DimExprsContext extends ParserRuleContext {
		public List<DimExprContext> dimExpr() {
			return getRuleContexts(DimExprContext.class);
		}
		public DimExprContext dimExpr(int i) {
			return getRuleContext(DimExprContext.class,i);
		}
		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDimExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDimExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDimExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2581); dimExpr();
			setState(2585);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2582); dimExpr();
					}
					} 
				}
				setState(2587);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
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

	public static class DimExprContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDimExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDimExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDimExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_dimExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2588); annotation();
				}
				}
				setState(2593);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2594); match(LBRACK);
			setState(2595); expression();
			setState(2596); match(RBRACK);
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2598); expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_expression);
		try {
			setState(2602);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2600); lambdaExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2601); assignmentExpression();
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

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2604); lambdaParameters();
			setState(2605); match(ARROW);
			setState(2606); lambdaBody();
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

	public static class LambdaParametersContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public InferredFormalParameterListContext inferredFormalParameterList() {
			return getRuleContext(InferredFormalParameterListContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLambdaParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLambdaParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_lambdaParameters);
		int _la;
		try {
			setState(2618);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2608); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2609); match(LPAREN);
				setState(2611);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
					{
					setState(2610); formalParameterList();
					}
				}

				setState(2613); match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2614); match(LPAREN);
				setState(2615); inferredFormalParameterList();
				setState(2616); match(RPAREN);
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

	public static class InferredFormalParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public InferredFormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferredFormalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInferredFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInferredFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInferredFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InferredFormalParameterListContext inferredFormalParameterList() throws RecognitionException {
		InferredFormalParameterListContext _localctx = new InferredFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2620); match(Identifier);
			setState(2625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2621); match(COMMA);
				setState(2622); match(Identifier);
				}
				}
				setState(2627);
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

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLambdaBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLambdaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_lambdaBody);
		try {
			setState(2630);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case OMPTHREADNUM:
			case OMPNUMTHREADS:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2628); expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2629); block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_assignmentExpression);
		try {
			setState(2634);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2632); conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2633); assignment();
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

	public static class AssignmentContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2636); leftHandSide();
			setState(2637); assignmentOperator();
			setState(2638); expression();
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

	public static class LeftHandSideContext extends ParserRuleContext {
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLeftHandSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLeftHandSide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLeftHandSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_leftHandSide);
		try {
			setState(2643);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2640); expressionName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2641); fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2642); arrayAccess();
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2645);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (ASSIGN - 68)) | (1L << (ADD_ASSIGN - 68)) | (1L << (SUB_ASSIGN - 68)) | (1L << (MUL_ASSIGN - 68)) | (1L << (DIV_ASSIGN - 68)) | (1L << (AND_ASSIGN - 68)) | (1L << (OR_ASSIGN - 68)) | (1L << (XOR_ASSIGN - 68)) | (1L << (MOD_ASSIGN - 68)) | (1L << (LSHIFT_ASSIGN - 68)) | (1L << (RSHIFT_ASSIGN - 68)) | (1L << (URSHIFT_ASSIGN - 68)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_conditionalExpression);
		try {
			setState(2654);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2647); conditionalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2648); conditionalOrExpression(0);
				setState(2649); match(QUESTION);
				setState(2650); expression();
				setState(2651); match(COLON);
				setState(2652); conditionalExpression();
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

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConditionalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConditionalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 438;
		enterRecursionRule(_localctx, 438, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2657); conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2664);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(2659);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2660); match(OR);
					setState(2661); conditionalAndExpression(0);
					}
					} 
				}
				setState(2666);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConditionalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 440;
		enterRecursionRule(_localctx, 440, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2668); inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2675);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(2670);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2671); match(AND);
					setState(2672); inclusiveOrExpression(0);
					}
					} 
				}
				setState(2677);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 442;
		enterRecursionRule(_localctx, 442, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2679); exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2686);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(2681);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2682); match(BITOR);
					setState(2683); exclusiveOrExpression(0);
					}
					} 
				}
				setState(2688);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 444;
		enterRecursionRule(_localctx, 444, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2690); andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2697);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(2692);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2693); match(CARET);
					setState(2694); andExpression(0);
					}
					} 
				}
				setState(2699);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 446;
		enterRecursionRule(_localctx, 446, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2701); equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2708);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(2703);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2704); match(BITAND);
					setState(2705); equalityExpression(0);
					}
					} 
				}
				setState(2710);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 448;
		enterRecursionRule(_localctx, 448, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2712); relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2722);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2720);
					switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2714);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2715); match(EQUAL);
						setState(2716); relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2717);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2718); match(NOTEQUAL);
						setState(2719); relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(2724);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 450;
		enterRecursionRule(_localctx, 450, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2726); shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2745);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2743);
					switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2728);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2729); match(LT);
						setState(2730); shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2731);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2732); match(GT);
						setState(2733); shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2734);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2735); match(LE);
						setState(2736); shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2737);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2738); match(GE);
						setState(2739); shiftExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2740);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2741); match(INSTANCEOF);
						setState(2742); referenceType();
						}
						break;
					}
					} 
				}
				setState(2747);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 452;
		enterRecursionRule(_localctx, 452, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2749); additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2766);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2764);
					switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2751);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2752); match(LT);
						setState(2753); match(LT);
						setState(2754); additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2755);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2756); match(GT);
						setState(2757); match(GT);
						setState(2758); additiveExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2759);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2760); match(GT);
						setState(2761); match(GT);
						setState(2762); match(GT);
						setState(2763); additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(2768);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 454;
		enterRecursionRule(_localctx, 454, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2770); multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2780);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2778);
					switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2772);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2773); match(ADD);
						setState(2774); multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2775);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2776); match(SUB);
						setState(2777); multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(2782);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 456;
		enterRecursionRule(_localctx, 456, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2784); unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2797);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2795);
					switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2786);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2787); match(MUL);
						setState(2788); unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2789);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2790); match(DIV);
						setState(2791); unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2792);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2793); match(MOD);
						setState(2794); unaryExpression();
						}
						break;
					}
					} 
				}
				setState(2799);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_unaryExpression);
		try {
			setState(2807);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2800); preIncrementExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(2801); preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(2802); match(ADD);
				setState(2803); unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(2804); match(SUB);
				setState(2805); unaryExpression();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case OMPTHREADNUM:
			case OMPNUMTHREADS:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2806); unaryExpressionNotPlusMinus();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PreIncrementExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPreIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPreIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreIncrementExpressionContext preIncrementExpression() throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2809); match(INC);
			setState(2810); unaryExpression();
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

	public static class PreDecrementExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPreDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPreDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPreDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreDecrementExpressionContext preDecrementExpression() throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2812); match(DEC);
			setState(2813); unaryExpression();
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

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnaryExpressionNotPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(2821);
			switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2815); postfixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2816); match(TILDE);
				setState(2817); unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2818); match(BANG);
				setState(2819); unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2820); castExpression();
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

	public static class PostfixExpressionContext extends ParserRuleContext {
		public List<PostDecrementExpression_lf_postfixExpressionContext> postDecrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostDecrementExpression_lf_postfixExpressionContext.class);
		}
		public PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostIncrementExpression_lf_postfixExpressionContext.class,i);
		}
		public PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostDecrementExpression_lf_postfixExpressionContext.class,i);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<PostIncrementExpression_lf_postfixExpressionContext> postIncrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostIncrementExpression_lf_postfixExpressionContext.class);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2825);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				{
				setState(2823); primary();
				}
				break;
			case 2:
				{
				setState(2824); expressionName();
				}
				break;
			}
			setState(2831);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(2829);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(2827); postIncrementExpression_lf_postfixExpression();
						}
						break;
					case DEC:
						{
						setState(2828); postDecrementExpression_lf_postfixExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(2833);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
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

	public static class PostIncrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPostIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2834); postfixExpression();
			setState(2835); match(INC);
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

	public static class PostIncrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public PostIncrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPostIncrementExpression_lf_postfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression() throws RecognitionException {
		PostIncrementExpression_lf_postfixExpressionContext _localctx = new PostIncrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_postIncrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2837); match(INC);
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

	public static class PostDecrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPostDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementExpressionContext postDecrementExpression() throws RecognitionException {
		PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2839); postfixExpression();
			setState(2840); match(DEC);
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

	public static class PostDecrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public PostDecrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPostDecrementExpression_lf_postfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression() throws RecognitionException {
		PostDecrementExpression_lf_postfixExpressionContext _localctx = new PostDecrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_postDecrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2842); match(DEC);
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

	public static class CastExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_castExpression);
		int _la;
		try {
			setState(2871);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2844); match(LPAREN);
				setState(2845); primitiveType();
				setState(2846); match(RPAREN);
				setState(2847); unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2849); match(LPAREN);
				setState(2850); referenceType();
				setState(2854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2851); additionalBound();
					}
					}
					setState(2856);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2857); match(RPAREN);
				setState(2858); unaryExpressionNotPlusMinus();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2860); match(LPAREN);
				setState(2861); referenceType();
				setState(2865);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2862); additionalBound();
					}
					}
					setState(2867);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2868); match(RPAREN);
				setState(2869); lambdaExpression();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28: return packageName_sempred((PackageNameContext)_localctx, predIndex);
		case 30: return packageOrTypeName_sempred((PackageOrTypeNameContext)_localctx, predIndex);
		case 33: return ambiguousName_sempred((AmbiguousNameContext)_localctx, predIndex);
		case 219: return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 220: return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 221: return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 222: return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 223: return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 224: return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 225: return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 226: return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 227: return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 228: return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16: return precpred(_ctx, 2);
		case 17: return precpred(_ctx, 1);
		case 15: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18: return precpred(_ctx, 2);
		case 19: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean packageOrTypeName_sempred(PackageOrTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10: return precpred(_ctx, 5);
		case 11: return precpred(_ctx, 4);
		case 12: return precpred(_ctx, 3);
		case 13: return precpred(_ctx, 2);
		case 14: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20: return precpred(_ctx, 3);
		case 21: return precpred(_ctx, 2);
		case 22: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ambiguousName_sempred(AmbiguousNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8: return precpred(_ctx, 2);
		case 9: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean packageName_sempred(PackageNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3o\u0b3c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
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
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u01e9\n\2\3\3\3\3\3\4\3\4\3\5\3\5\5\5\u01f1"+
		"\n\5\3\6\7\6\u01f4\n\6\f\6\16\6\u01f7\13\6\3\6\3\6\7\6\u01fb\n\6\f\6\16"+
		"\6\u01fe\13\6\3\6\5\6\u0201\n\6\3\7\3\7\5\7\u0205\n\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\n\5\n\u020e\n\n\3\13\3\13\5\13\u0212\n\13\3\13\3\13\7\13\u0216"+
		"\n\13\f\13\16\13\u0219\13\13\3\f\7\f\u021c\n\f\f\f\16\f\u021f\13\f\3\f"+
		"\3\f\5\f\u0223\n\f\3\f\3\f\3\f\7\f\u0228\n\f\f\f\16\f\u022b\13\f\3\f\3"+
		"\f\5\f\u022f\n\f\5\f\u0231\n\f\3\r\3\r\7\r\u0235\n\r\f\r\16\r\u0238\13"+
		"\r\3\r\3\r\5\r\u023c\n\r\3\16\7\16\u023f\n\16\f\16\16\16\u0242\13\16\3"+
		"\16\3\16\5\16\u0246\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\7\22\u024f"+
		"\n\22\f\22\16\22\u0252\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\5\23\u025f\n\23\3\24\7\24\u0262\n\24\f\24\16\24\u0265\13"+
		"\24\3\24\3\24\3\24\7\24\u026a\n\24\f\24\16\24\u026d\13\24\3\24\3\24\7"+
		"\24\u0271\n\24\f\24\16\24\u0274\13\24\3\25\7\25\u0277\n\25\f\25\16\25"+
		"\u027a\13\25\3\25\3\25\5\25\u027e\n\25\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\7\27\u0287\n\27\f\27\16\27\u028a\13\27\5\27\u028c\n\27\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\7\32\u0298\n\32\f\32\16\32\u029b"+
		"\13\32\3\33\3\33\5\33\u029f\n\33\3\34\7\34\u02a2\n\34\f\34\16\34\u02a5"+
		"\13\34\3\34\3\34\5\34\u02a9\n\34\3\35\3\35\3\35\3\35\5\35\u02af\n\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\7\36\u02b7\n\36\f\36\16\36\u02ba\13\36\3"+
		"\37\3\37\3\37\3\37\3\37\5\37\u02c1\n\37\3 \3 \3 \3 \3 \3 \7 \u02c9\n "+
		"\f \16 \u02cc\13 \3!\3!\3!\3!\3!\5!\u02d3\n!\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"#\7#\u02dd\n#\f#\16#\u02e0\13#\3$\5$\u02e3\n$\3$\7$\u02e6\n$\f$\16$\u02e9"+
		"\13$\3$\7$\u02ec\n$\f$\16$\u02ef\13$\3$\3$\3%\7%\u02f4\n%\f%\16%\u02f7"+
		"\13%\3%\3%\3%\3%\7%\u02fd\n%\f%\16%\u0300\13%\3%\3%\3&\3&\3\'\3\'\3\'"+
		"\3\'\5\'\u030a\n\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*"+
		"\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\5,\u0327\n,\3-\3-\5-\u032b\n-\3.\7.\u032e"+
		"\n.\f.\16.\u0331\13.\3.\3.\3.\5.\u0336\n.\3.\5.\u0339\n.\3.\5.\u033c\n"+
		".\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0348\n/\3\60\3\60\3\60\3\60\3\61\3"+
		"\61\3\61\7\61\u0351\n\61\f\61\16\61\u0354\13\61\3\62\3\62\3\62\3\63\3"+
		"\63\3\63\3\64\3\64\3\64\7\64\u035f\n\64\f\64\16\64\u0362\13\64\3\65\3"+
		"\65\7\65\u0366\n\65\f\65\16\65\u0369\13\65\3\65\3\65\3\66\3\66\3\66\3"+
		"\66\5\66\u0371\n\66\3\67\3\67\3\67\3\67\3\67\5\67\u0378\n\67\38\78\u037b"+
		"\n8\f8\168\u037e\138\38\38\38\38\39\39\39\39\39\39\39\39\59\u038c\n9\3"+
		":\3:\3:\7:\u0391\n:\f:\16:\u0394\13:\3;\3;\3;\5;\u0399\n;\3<\3<\5<\u039d"+
		"\n<\3=\3=\5=\u03a1\n=\3>\3>\5>\u03a5\n>\3?\3?\5?\u03a9\n?\3@\3@\3@\5@"+
		"\u03ae\n@\3A\3A\5A\u03b2\nA\3A\3A\7A\u03b6\nA\fA\16A\u03b9\13A\3B\3B\5"+
		"B\u03bd\nB\3B\3B\3B\7B\u03c2\nB\fB\16B\u03c5\13B\3B\3B\5B\u03c9\nB\5B"+
		"\u03cb\nB\3C\3C\7C\u03cf\nC\fC\16C\u03d2\13C\3C\3C\5C\u03d6\nC\3D\3D\5"+
		"D\u03da\nD\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u03ed"+
		"\nI\3J\7J\u03f0\nJ\fJ\16J\u03f3\13J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3"+
		"K\3K\5K\u0402\nK\3L\3L\3L\5L\u0407\nL\3L\3L\7L\u040b\nL\fL\16L\u040e\13"+
		"L\3L\3L\3L\5L\u0413\nL\5L\u0415\nL\3M\3M\5M\u0419\nM\3N\3N\3N\5N\u041e"+
		"\nN\3N\3N\5N\u0422\nN\3O\3O\3O\3O\3O\5O\u0429\nO\3P\3P\3P\7P\u042e\nP"+
		"\fP\16P\u0431\13P\3P\3P\3P\7P\u0436\nP\fP\16P\u0439\13P\5P\u043b\nP\3"+
		"Q\7Q\u043e\nQ\fQ\16Q\u0441\13Q\3Q\3Q\3Q\3R\3R\5R\u0448\nR\3S\7S\u044b"+
		"\nS\fS\16S\u044e\13S\3S\3S\7S\u0452\nS\fS\16S\u0455\13S\3S\3S\3S\3S\5"+
		"S\u045b\nS\3T\7T\u045e\nT\fT\16T\u0461\13T\3T\3T\3T\5T\u0466\nT\3T\3T"+
		"\3U\3U\3U\3V\3V\3V\7V\u0470\nV\fV\16V\u0473\13V\3W\3W\5W\u0477\nW\3X\3"+
		"X\5X\u047b\nX\3Y\3Y\3Z\3Z\3Z\3[\7[\u0483\n[\f[\16[\u0486\13[\3[\3[\5["+
		"\u048a\n[\3[\3[\3\\\3\\\3\\\3\\\5\\\u0492\n\\\3]\5]\u0495\n]\3]\3]\3]"+
		"\5]\u049a\n]\3]\3]\3^\3^\3_\3_\5_\u04a2\n_\3_\5_\u04a5\n_\3_\3_\3`\5`"+
		"\u04aa\n`\3`\3`\3`\5`\u04af\n`\3`\3`\3`\5`\u04b4\n`\3`\3`\3`\5`\u04b9"+
		"\n`\3`\3`\3`\3`\3`\5`\u04c0\n`\3`\3`\3`\5`\u04c5\n`\3`\3`\3`\3`\3`\3`"+
		"\5`\u04cd\n`\3`\3`\3`\5`\u04d2\n`\3`\3`\3`\5`\u04d7\n`\3a\7a\u04da\na"+
		"\fa\16a\u04dd\13a\3a\3a\3a\5a\u04e2\na\3a\3a\3b\3b\5b\u04e8\nb\3b\5b\u04eb"+
		"\nb\3b\5b\u04ee\nb\3b\3b\3c\3c\3c\7c\u04f5\nc\fc\16c\u04f8\13c\3d\7d\u04fb"+
		"\nd\fd\16d\u04fe\13d\3d\3d\3d\5d\u0503\nd\3d\5d\u0506\nd\3d\5d\u0509\n"+
		"d\3e\3e\3f\3f\7f\u050f\nf\ff\16f\u0512\13f\3g\3g\5g\u0516\ng\3h\7h\u0519"+
		"\nh\fh\16h\u051c\13h\3h\3h\3h\5h\u0521\nh\3h\5h\u0524\nh\3h\3h\3i\3i\3"+
		"i\3i\3i\3i\3i\5i\u052f\ni\3j\3j\3j\3k\3k\7k\u0536\nk\fk\16k\u0539\13k"+
		"\3k\3k\3l\3l\3l\3l\3l\5l\u0542\nl\3m\7m\u0545\nm\fm\16m\u0548\13m\3m\3"+
		"m\3m\3m\3n\3n\3n\3n\5n\u0552\nn\3o\7o\u0555\no\fo\16o\u0558\13o\3o\3o"+
		"\3o\3p\3p\3p\3p\3p\3p\5p\u0563\np\3q\7q\u0566\nq\fq\16q\u0569\13q\3q\3"+
		"q\3q\3q\3q\3r\3r\7r\u0572\nr\fr\16r\u0575\13r\3r\3r\3s\3s\3s\3s\3s\5s"+
		"\u057e\ns\3t\7t\u0581\nt\ft\16t\u0584\13t\3t\3t\3t\3t\3t\5t\u058b\nt\3"+
		"t\5t\u058e\nt\3t\3t\3u\3u\3u\5u\u0595\nu\3v\3v\3v\3w\3w\3w\5w\u059d\n"+
		"w\3x\3x\3x\3x\5x\u05a3\nx\3x\3x\3y\3y\3y\7y\u05aa\ny\fy\16y\u05ad\13y"+
		"\3z\3z\3z\3z\3{\3{\3{\5{\u05b6\n{\3|\3|\5|\u05ba\n|\3|\5|\u05bd\n|\3|"+
		"\3|\3}\3}\3}\7}\u05c4\n}\f}\16}\u05c7\13}\3~\3~\3~\3\177\3\177\3\177\3"+
		"\177\3\177\3\177\3\u0080\3\u0080\5\u0080\u05d4\n\u0080\3\u0080\5\u0080"+
		"\u05d7\n\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\7\u0081\u05de\n"+
		"\u0081\f\u0081\16\u0081\u05e1\13\u0081\3\u0082\3\u0082\5\u0082\u05e5\n"+
		"\u0082\3\u0082\3\u0082\3\u0083\3\u0083\7\u0083\u05eb\n\u0083\f\u0083\16"+
		"\u0083\u05ee\13\u0083\3\u0084\3\u0084\3\u0084\5\u0084\u05f3\n\u0084\3"+
		"\u0085\3\u0085\3\u0085\3\u0086\7\u0086\u05f9\n\u0086\f\u0086\16\u0086"+
		"\u05fc\13\u0086\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\5\u0087\u0607\n\u0087\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\5\u0088\u060e\n\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u061c"+
		"\n\u0089\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\5\u008e\u0632\n\u008e\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\5\u0092\u0654\n\u0092\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0094\3\u0094\7\u0094\u065e\n\u0094\f\u0094\16\u0094"+
		"\u0661\13\u0094\3\u0094\7\u0094\u0664\n\u0094\f\u0094\16\u0094\u0667\13"+
		"\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0096\3\u0096\7\u0096"+
		"\u0670\n\u0096\f\u0096\16\u0096\u0673\13\u0096\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097\u067f"+
		"\n\u0097\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\5\u009c\u0699"+
		"\n\u009c\3\u009d\3\u009d\5\u009d\u069d\n\u009d\3\u009e\3\u009e\3\u009e"+
		"\5\u009e\u06a2\n\u009e\3\u009e\3\u009e\5\u009e\u06a6\n\u009e\3\u009e\3"+
		"\u009e\5\u009e\u06aa\n\u009e\3\u009e\3\u009e\3\u009e\3\u009f\3\u009f\3"+
		"\u009f\5\u009f\u06b2\n\u009f\3\u009f\3\u009f\5\u009f\u06b6\n\u009f\3\u009f"+
		"\3\u009f\5\u009f\u06ba\n\u009f\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0"+
		"\5\u00a0\u06c1\n\u00a0\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\7\u00a2"+
		"\u06c8\n\u00a2\f\u00a2\16\u00a2\u06cb\13\u00a2\3\u00a3\3\u00a3\3\u00a3"+
		"\7\u00a3\u06d0\n\u00a3\f\u00a3\16\u00a3\u06d3\13\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\7\u00a4"+
		"\u06df\n\u00a4\f\u00a4\16\u00a4\u06e2\13\u00a4\3\u00a4\3\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\5\u00a5\u06ed\n\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a6\3\u00a6\5\u00a6\u06f3\n\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a7\3\u00a7\5\u00a7\u06f9\n\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00aa"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u070e\n\u00aa"+
		"\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u0713\n\u00aa\3\u00ab\3\u00ab\7\u00ab"+
		"\u0717\n\u00ab\f\u00ab\16\u00ab\u071a\13\u00ab\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ad\7\u00ad\u0723\n\u00ad\f\u00ad\16\u00ad"+
		"\u0726\13\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae\7\u00ae"+
		"\u072e\n\u00ae\f\u00ae\16\u00ae\u0731\13\u00ae\3\u00af\3\u00af\3\u00af"+
		"\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u073a\n\u00b0\3\u00b0\5\u00b0"+
		"\u073d\n\u00b0\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u0742\n\u00b1\3\u00b1\3"+
		"\u00b1\3\u00b2\3\u00b2\3\u00b2\7\u00b2\u0749\n\u00b2\f\u00b2\16\u00b2"+
		"\u074c\13\u00b2\3\u00b3\7\u00b3\u074f\n\u00b3\f\u00b3\16\u00b3\u0752\13"+
		"\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b4\3\u00b4\5\u00b4"+
		"\u075b\n\u00b4\3\u00b4\7\u00b4\u075e\n\u00b4\f\u00b4\16\u00b4\u0761\13"+
		"\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\7\u00b5\u0767\n\u00b5\f\u00b5\16"+
		"\u00b5\u076a\13\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u0780\n\u00b5\3\u00b6"+
		"\3\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7\7\u00b7\u0788\n\u00b7\f\u00b7"+
		"\16\u00b7\u078b\13\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u07a0\n\u00b7\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u07a7\n\u00b8\3\u00b9\3\u00b9\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u07af\n\u00ba\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\7\u00bb\u07b5\n\u00bb\f\u00bb\16\u00bb\u07b8\13\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\7\u00bb\u07c0\n\u00bb\f\u00bb"+
		"\16\u00bb\u07c3\13\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u07d9\n\u00bb\3\u00bc"+
		"\3\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd\7\u00bd\u07e1\n\u00bd\f\u00bd"+
		"\16\u00bd\u07e4\13\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\7\u00bd\u07ec\n\u00bd\f\u00bd\16\u00bd\u07ef\13\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd"+
		"\u0804\n\u00bd\3\u00be\3\u00be\5\u00be\u0808\n\u00be\3\u00be\7\u00be\u080b"+
		"\n\u00be\f\u00be\16\u00be\u080e\13\u00be\3\u00be\3\u00be\3\u00be\7\u00be"+
		"\u0813\n\u00be\f\u00be\16\u00be\u0816\13\u00be\3\u00be\7\u00be\u0819\n"+
		"\u00be\f\u00be\16\u00be\u081c\13\u00be\3\u00be\5\u00be\u081f\n\u00be\3"+
		"\u00be\3\u00be\5\u00be\u0823\n\u00be\3\u00be\3\u00be\5\u00be\u0827\n\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u082d\n\u00be\3\u00be\7\u00be"+
		"\u0830\n\u00be\f\u00be\16\u00be\u0833\13\u00be\3\u00be\3\u00be\5\u00be"+
		"\u0837\n\u00be\3\u00be\3\u00be\5\u00be\u083b\n\u00be\3\u00be\3\u00be\5"+
		"\u00be\u083f\n\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0845\n\u00be"+
		"\3\u00be\7\u00be\u0848\n\u00be\f\u00be\16\u00be\u084b\13\u00be\3\u00be"+
		"\3\u00be\5\u00be\u084f\n\u00be\3\u00be\3\u00be\5\u00be\u0853\n\u00be\3"+
		"\u00be\3\u00be\5\u00be\u0857\n\u00be\5\u00be\u0859\n\u00be\3\u00bf\3\u00bf"+
		"\3\u00bf\5\u00bf\u085e\n\u00bf\3\u00bf\7\u00bf\u0861\n\u00bf\f\u00bf\16"+
		"\u00bf\u0864\13\u00bf\3\u00bf\3\u00bf\5\u00bf\u0868\n\u00bf\3\u00bf\3"+
		"\u00bf\5\u00bf\u086c\n\u00bf\3\u00bf\3\u00bf\5\u00bf\u0870\n\u00bf\3\u00c0"+
		"\3\u00c0\5\u00c0\u0874\n\u00c0\3\u00c0\7\u00c0\u0877\n\u00c0\f\u00c0\16"+
		"\u00c0\u087a\13\u00c0\3\u00c0\3\u00c0\3\u00c0\7\u00c0\u087f\n\u00c0\f"+
		"\u00c0\16\u00c0\u0882\13\u00c0\3\u00c0\7\u00c0\u0885\n\u00c0\f\u00c0\16"+
		"\u00c0\u0888\13\u00c0\3\u00c0\5\u00c0\u088b\n\u00c0\3\u00c0\3\u00c0\5"+
		"\u00c0\u088f\n\u00c0\3\u00c0\3\u00c0\5\u00c0\u0893\n\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\5\u00c0\u0899\n\u00c0\3\u00c0\7\u00c0\u089c\n\u00c0\f"+
		"\u00c0\16\u00c0\u089f\13\u00c0\3\u00c0\3\u00c0\5\u00c0\u08a3\n\u00c0\3"+
		"\u00c0\3\u00c0\5\u00c0\u08a7\n\u00c0\3\u00c0\3\u00c0\5\u00c0\u08ab\n\u00c0"+
		"\5\u00c0\u08ad\n\u00c0\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u08b2\n\u00c1\3"+
		"\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u08c1\n\u00c2\3\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\5\u00c4\u08cf\n\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u08db\n\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\7\u00c5\u08e2\n\u00c5\f\u00c5\16\u00c5"+
		"\u08e5\13\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\7\u00c6\u08f1\n\u00c6\f\u00c6\16\u00c6\u08f4"+
		"\13\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\5\u00c7\u0900\n\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\7\u00c7\u0907\n\u00c7\f\u00c7\16\u00c7\u090a\13\u00c7\3\u00c8"+
		"\3\u00c8\3\u00c8\5\u00c8\u090f\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\5\u00c8\u0916\n\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u091b\n"+
		"\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0922\n\u00c8\3"+
		"\u00c8\3\u00c8\3\u00c8\5\u00c8\u0927\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3"+
		"\u00c8\3\u00c8\5\u00c8\u092e\n\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0933"+
		"\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u093a\n\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u093f\n\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0947\n\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\5\u00c8\u094c\n\u00c8\3\u00c8\3\u00c8\5\u00c8\u0950\n\u00c8\3\u00c9\3"+
		"\u00c9\5\u00c9\u0954\n\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0959\n\u00c9"+
		"\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u0960\n\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u0967\n\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\5\u00ca\u096c\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\5\u00ca\u0973\n\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u0978\n\u00ca\3"+
		"\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u097f\n\u00ca\3\u00ca\3"+
		"\u00ca\3\u00ca\5\u00ca\u0984\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3"+
		"\u00ca\3\u00ca\5\u00ca\u098c\n\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u0991"+
		"\n\u00ca\3\u00ca\3\u00ca\5\u00ca\u0995\n\u00ca\3\u00cb\3\u00cb\3\u00cb"+
		"\7\u00cb\u099a\n\u00cb\f\u00cb\16\u00cb\u099d\13\u00cb\3\u00cc\3\u00cc"+
		"\3\u00cc\5\u00cc\u09a2\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\5\u00cc\u09a9\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc"+
		"\u09b0\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09b7\n"+
		"\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09bf\n"+
		"\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09c6\n\u00cc\3"+
		"\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09ce\n\u00cc\3"+
		"\u00cd\3\u00cd\5\u00cd\u09d2\n\u00cd\3\u00cd\3\u00cd\3\u00ce\3\u00ce\3"+
		"\u00ce\5\u00ce\u09d9\n\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5"+
		"\u00ce\u09e0\n\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u09e7"+
		"\n\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u09ef"+
		"\n\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u09f6\n\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u09fe\n\u00ce"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u0a04\n\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\5\u00cf\u0a0a\n\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u0a16\n\u00cf"+
		"\3\u00d0\3\u00d0\7\u00d0\u0a1a\n\u00d0\f\u00d0\16\u00d0\u0a1d\13\u00d0"+
		"\3\u00d1\7\u00d1\u0a20\n\u00d1\f\u00d1\16\u00d1\u0a23\13\u00d1\3\u00d1"+
		"\3\u00d1\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d3\3\u00d3\5\u00d3\u0a2d"+
		"\n\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d5\3\u00d5\3\u00d5\5\u00d5"+
		"\u0a36\n\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\5\u00d5\u0a3d\n"+
		"\u00d5\3\u00d6\3\u00d6\3\u00d6\7\u00d6\u0a42\n\u00d6\f\u00d6\16\u00d6"+
		"\u0a45\13\u00d6\3\u00d7\3\u00d7\5\u00d7\u0a49\n\u00d7\3\u00d8\3\u00d8"+
		"\5\u00d8\u0a4d\n\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00da\3\u00da"+
		"\3\u00da\5\u00da\u0a56\n\u00da\3\u00db\3\u00db\3\u00dc\3\u00dc\3\u00dc"+
		"\3\u00dc\3\u00dc\3\u00dc\3\u00dc\5\u00dc\u0a61\n\u00dc\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\7\u00dd\u0a69\n\u00dd\f\u00dd\16\u00dd"+
		"\u0a6c\13\u00dd\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\7\u00de"+
		"\u0a74\n\u00de\f\u00de\16\u00de\u0a77\13\u00de\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\7\u00df\u0a7f\n\u00df\f\u00df\16\u00df\u0a82"+
		"\13\u00df\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\7\u00e0\u0a8a"+
		"\n\u00e0\f\u00e0\16\u00e0\u0a8d\13\u00e0\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\7\u00e1\u0a95\n\u00e1\f\u00e1\16\u00e1\u0a98\13\u00e1"+
		"\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\7\u00e2\u0aa3\n\u00e2\f\u00e2\16\u00e2\u0aa6\13\u00e2\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\7\u00e3\u0aba"+
		"\n\u00e3\f\u00e3\16\u00e3\u0abd\13\u00e3\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\7\u00e4\u0acf\n\u00e4\f\u00e4\16\u00e4\u0ad2"+
		"\13\u00e4\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\7\u00e5\u0add\n\u00e5\f\u00e5\16\u00e5\u0ae0\13\u00e5\3\u00e6"+
		"\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6"+
		"\3\u00e6\3\u00e6\7\u00e6\u0aee\n\u00e6\f\u00e6\16\u00e6\u0af1\13\u00e6"+
		"\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\5\u00e7\u0afa"+
		"\n\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e9\3\u00e9\3\u00e9\3\u00ea\3\u00ea"+
		"\3\u00ea\3\u00ea\3\u00ea\3\u00ea\5\u00ea\u0b08\n\u00ea\3\u00eb\3\u00eb"+
		"\5\u00eb\u0b0c\n\u00eb\3\u00eb\3\u00eb\7\u00eb\u0b10\n\u00eb\f\u00eb\16"+
		"\u00eb\u0b13\13\u00eb\3\u00ec\3\u00ec\3\u00ec\3\u00ed\3\u00ed\3\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ef\3\u00ef\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0"+
		"\3\u00f0\3\u00f0\3\u00f0\7\u00f0\u0b27\n\u00f0\f\u00f0\16\u00f0\u0b2a"+
		"\13\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\7\u00f0\u0b32"+
		"\n\u00f0\f\u00f0\16\u00f0\u0b35\13\u00f0\3\u00f0\3\u00f0\3\u00f0\5\u00f0"+
		"\u0b3a\n\u00f0\3\u00f0\2\17:>D\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4"+
		"\u01c6\u01c8\u01ca\u00f1\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c"+
		"\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144"+
		"\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c"+
		"\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174"+
		"\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c"+
		"\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4"+
		"\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc"+
		"\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4"+
		"\u01d6\u01d8\u01da\u01dc\u01de\2\5\7\2\7\7\n\n\35\35\37\37\'\'\4\2\20"+
		"\20\26\26\4\2FF_i\u0c32\2\u01e8\3\2\2\2\4\u01ea\3\2\2\2\6\u01ec\3\2\2"+
		"\2\b\u01f0\3\2\2\2\n\u0200\3\2\2\2\f\u0204\3\2\2\2\16\u0206\3\2\2\2\20"+
		"\u0208\3\2\2\2\22\u020d\3\2\2\2\24\u0211\3\2\2\2\26\u0230\3\2\2\2\30\u0232"+
		"\3\2\2\2\32\u0240\3\2\2\2\34\u0247\3\2\2\2\36\u0249\3\2\2\2 \u024b\3\2"+
		"\2\2\"\u0250\3\2\2\2$\u025e\3\2\2\2&\u0263\3\2\2\2(\u0278\3\2\2\2*\u027f"+
		"\3\2\2\2,\u028b\3\2\2\2.\u028d\3\2\2\2\60\u0290\3\2\2\2\62\u0294\3\2\2"+
		"\2\64\u029e\3\2\2\2\66\u02a3\3\2\2\28\u02ae\3\2\2\2:\u02b0\3\2\2\2<\u02c0"+
		"\3\2\2\2>\u02c2\3\2\2\2@\u02d2\3\2\2\2B\u02d4\3\2\2\2D\u02d6\3\2\2\2F"+
		"\u02e2\3\2\2\2H\u02f5\3\2\2\2J\u0303\3\2\2\2L\u0309\3\2\2\2N\u030b\3\2"+
		"\2\2P\u030f\3\2\2\2R\u0315\3\2\2\2T\u031c\3\2\2\2V\u0326\3\2\2\2X\u032a"+
		"\3\2\2\2Z\u032f\3\2\2\2\\\u0347\3\2\2\2^\u0349\3\2\2\2`\u034d\3\2\2\2"+
		"b\u0355\3\2\2\2d\u0358\3\2\2\2f\u035b\3\2\2\2h\u0363\3\2\2\2j\u0370\3"+
		"\2\2\2l\u0377\3\2\2\2n\u037c\3\2\2\2p\u038b\3\2\2\2r\u038d\3\2\2\2t\u0395"+
		"\3\2\2\2v\u039a\3\2\2\2x\u03a0\3\2\2\2z\u03a4\3\2\2\2|\u03a8\3\2\2\2~"+
		"\u03ad\3\2\2\2\u0080\u03b1\3\2\2\2\u0082\u03ca\3\2\2\2\u0084\u03cc\3\2"+
		"\2\2\u0086\u03d7\3\2\2\2\u0088\u03db\3\2\2\2\u008a\u03dd\3\2\2\2\u008c"+
		"\u03df\3\2\2\2\u008e\u03e1\3\2\2\2\u0090\u03ec\3\2\2\2\u0092\u03f1\3\2"+
		"\2\2\u0094\u0401\3\2\2\2\u0096\u0414\3\2\2\2\u0098\u0418\3\2\2\2\u009a"+
		"\u041a\3\2\2\2\u009c\u0428\3\2\2\2\u009e\u043a\3\2\2\2\u00a0\u043f\3\2"+
		"\2\2\u00a2\u0447\3\2\2\2\u00a4\u045a\3\2\2\2\u00a6\u045f\3\2\2\2\u00a8"+
		"\u0469\3\2\2\2\u00aa\u046c\3\2\2\2\u00ac\u0476\3\2\2\2\u00ae\u047a\3\2"+
		"\2\2\u00b0\u047c\3\2\2\2\u00b2\u047e\3\2\2\2\u00b4\u0484\3\2\2\2\u00b6"+
		"\u0491\3\2\2\2\u00b8\u0494\3\2\2\2\u00ba\u049d\3\2\2\2\u00bc\u049f\3\2"+
		"\2\2\u00be\u04d6\3\2\2\2\u00c0\u04db\3\2\2\2\u00c2\u04e5\3\2\2\2\u00c4"+
		"\u04f1\3\2\2\2\u00c6\u04fc\3\2\2\2\u00c8\u050a\3\2\2\2\u00ca\u050c\3\2"+
		"\2\2\u00cc\u0515\3\2\2\2\u00ce\u051a\3\2\2\2\u00d0\u052e\3\2\2\2\u00d2"+
		"\u0530\3\2\2\2\u00d4\u0533\3\2\2\2\u00d6\u0541\3\2\2\2\u00d8\u0546\3\2"+
		"\2\2\u00da\u0551\3\2\2\2\u00dc\u0556\3\2\2\2\u00de\u0562\3\2\2\2\u00e0"+
		"\u0567\3\2\2\2\u00e2\u056f\3\2\2\2\u00e4\u057d\3\2\2\2\u00e6\u0582\3\2"+
		"\2\2\u00e8\u0594\3\2\2\2\u00ea\u0596\3\2\2\2\u00ec\u059c\3\2\2\2\u00ee"+
		"\u059e\3\2\2\2\u00f0\u05a6\3\2\2\2\u00f2\u05ae\3\2\2\2\u00f4\u05b5\3\2"+
		"\2\2\u00f6\u05b7\3\2\2\2\u00f8\u05c0\3\2\2\2\u00fa\u05c8\3\2\2\2\u00fc"+
		"\u05cb\3\2\2\2\u00fe\u05d1\3\2\2\2\u0100\u05da\3\2\2\2\u0102\u05e2\3\2"+
		"\2\2\u0104\u05e8\3\2\2\2\u0106\u05f2\3\2\2\2\u0108\u05f4\3\2\2\2\u010a"+
		"\u05fa\3\2\2\2\u010c\u0606\3\2\2\2\u010e\u060d\3\2\2\2\u0110\u061b\3\2"+
		"\2\2\u0112\u061d\3\2\2\2\u0114\u061f\3\2\2\2\u0116\u0623\3\2\2\2\u0118"+
		"\u0627\3\2\2\2\u011a\u0631\3\2\2\2\u011c\u0633\3\2\2\2\u011e\u0639\3\2"+
		"\2\2\u0120\u0641\3\2\2\2\u0122\u0653\3\2\2\2\u0124\u0655\3\2\2\2\u0126"+
		"\u065b\3\2\2\2\u0128\u066a\3\2\2\2\u012a\u066d\3\2\2\2\u012c\u067e\3\2"+
		"\2\2\u012e\u0680\3\2\2\2\u0130\u0682\3\2\2\2\u0132\u0688\3\2\2\2\u0134"+
		"\u068e\3\2\2\2\u0136\u0698\3\2\2\2\u0138\u069c\3\2\2\2\u013a\u069e\3\2"+
		"\2\2\u013c\u06ae\3\2\2\2\u013e\u06c0\3\2\2\2\u0140\u06c2\3\2\2\2\u0142"+
		"\u06c4\3\2\2\2\u0144\u06cc\3\2\2\2\u0146\u06db\3\2\2\2\u0148\u06ea\3\2"+
		"\2\2\u014a\u06f0\3\2\2\2\u014c\u06f6\3\2\2\2\u014e\u06fc\3\2\2\2\u0150"+
		"\u0700\3\2\2\2\u0152\u0712\3\2\2\2\u0154\u0714\3\2\2\2\u0156\u071b\3\2"+
		"\2\2\u0158\u0724\3\2\2\2\u015a\u072a\3\2\2\2\u015c\u0732\3\2\2\2\u015e"+
		"\u0735\3\2\2\2\u0160\u073e\3\2\2\2\u0162\u0745\3\2\2\2\u0164\u0750\3\2"+
		"\2\2\u0166\u075a\3\2\2\2\u0168\u077f\3\2\2\2\u016a\u0781\3\2\2\2\u016c"+
		"\u079f\3\2\2\2\u016e\u07a6\3\2\2\2\u0170\u07a8\3\2\2\2\u0172\u07ae\3\2"+
		"\2\2\u0174\u07d8\3\2\2\2\u0176\u07da\3\2\2\2\u0178\u0803\3\2\2\2\u017a"+
		"\u0858\3\2\2\2\u017c\u085a\3\2\2\2\u017e\u08ac\3\2\2\2\u0180\u08b1\3\2"+
		"\2\2\u0182\u08c0\3\2\2\2\u0184\u08c2\3\2\2\2\u0186\u08ce\3\2\2\2\u0188"+
		"\u08da\3\2\2\2\u018a\u08e6\3\2\2\2\u018c\u08ff\3\2\2\2\u018e\u094f\3\2"+
		"\2\2\u0190\u0951\3\2\2\2\u0192\u0994\3\2\2\2\u0194\u0996\3\2\2\2\u0196"+
		"\u09cd\3\2\2\2\u0198\u09cf\3\2\2\2\u019a\u09fd\3\2\2\2\u019c\u0a15\3\2"+
		"\2\2\u019e\u0a17\3\2\2\2\u01a0\u0a21\3\2\2\2\u01a2\u0a28\3\2\2\2\u01a4"+
		"\u0a2c\3\2\2\2\u01a6\u0a2e\3\2\2\2\u01a8\u0a3c\3\2\2\2\u01aa\u0a3e\3\2"+
		"\2\2\u01ac\u0a48\3\2\2\2\u01ae\u0a4c\3\2\2\2\u01b0\u0a4e\3\2\2\2\u01b2"+
		"\u0a55\3\2\2\2\u01b4\u0a57\3\2\2\2\u01b6\u0a60\3\2\2\2\u01b8\u0a62\3\2"+
		"\2\2\u01ba\u0a6d\3\2\2\2\u01bc\u0a78\3\2\2\2\u01be\u0a83\3\2\2\2\u01c0"+
		"\u0a8e\3\2\2\2\u01c2\u0a99\3\2\2\2\u01c4\u0aa7\3\2\2\2\u01c6\u0abe\3\2"+
		"\2\2\u01c8\u0ad3\3\2\2\2\u01ca\u0ae1\3\2\2\2\u01cc\u0af9\3\2\2\2\u01ce"+
		"\u0afb\3\2\2\2\u01d0\u0afe\3\2\2\2\u01d2\u0b07\3\2\2\2\u01d4\u0b0b\3\2"+
		"\2\2\u01d6\u0b14\3\2\2\2\u01d8\u0b17\3\2\2\2\u01da\u0b19\3\2\2\2\u01dc"+
		"\u0b1c\3\2\2\2\u01de\u0b39\3\2\2\2\u01e0\u01e9\7\67\2\2\u01e1\u01e9\7"+
		"8\2\2\u01e2\u01e9\79\2\2\u01e3\u01e9\7:\2\2\u01e4\u01e9\7;\2\2\u01e5\u01e9"+
		"\7<\2\2\u01e6\u01e9\5\4\3\2\u01e7\u01e9\5\6\4\2\u01e8\u01e0\3\2\2\2\u01e8"+
		"\u01e1\3\2\2\2\u01e8\u01e2\3\2\2\2\u01e8\u01e3\3\2\2\2\u01e8\u01e4\3\2"+
		"\2\2\u01e8\u01e5\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e7\3\2\2\2\u01e9"+
		"\3\3\2\2\2\u01ea\u01eb\7\65\2\2\u01eb\5\3\2\2\2\u01ec\u01ed\7\66\2\2\u01ed"+
		"\7\3\2\2\2\u01ee\u01f1\5\n\6\2\u01ef\u01f1\5\22\n\2\u01f0\u01ee\3\2\2"+
		"\2\u01f0\u01ef\3\2\2\2\u01f1\t\3\2\2\2\u01f2\u01f4\5\u00ecw\2\u01f3\u01f2"+
		"\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"\u01f8\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u0201\5\f\7\2\u01f9\u01fb\5\u00ec"+
		"w\2\u01fa\u01f9\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd\u01ff\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0201\7\5"+
		"\2\2\u0200\u01f5\3\2\2\2\u0200\u01fc\3\2\2\2\u0201\13\3\2\2\2\u0202\u0205"+
		"\5\16\b\2\u0203\u0205\5\20\t\2\u0204\u0202\3\2\2\2\u0204\u0203\3\2\2\2"+
		"\u0205\r\3\2\2\2\u0206\u0207\t\2\2\2\u0207\17\3\2\2\2\u0208\u0209\t\3"+
		"\2\2\u0209\21\3\2\2\2\u020a\u020e\5\24\13\2\u020b\u020e\5\"\22\2\u020c"+
		"\u020e\5$\23\2\u020d\u020a\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020c\3\2"+
		"\2\2\u020e\23\3\2\2\2\u020f\u0212\5\32\16\2\u0210\u0212\5 \21\2\u0211"+
		"\u020f\3\2\2\2\u0211\u0210\3\2\2\2\u0212\u0217\3\2\2\2\u0213\u0216\5\30"+
		"\r\2\u0214\u0216\5\36\20\2\u0215\u0213\3\2\2\2\u0215\u0214\3\2\2\2\u0216"+
		"\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\25\3\2\2"+
		"\2\u0219\u0217\3\2\2\2\u021a\u021c\5\u00ecw\2\u021b\u021a\3\2\2\2\u021c"+
		"\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0220\3\2"+
		"\2\2\u021f\u021d\3\2\2\2\u0220\u0222\7j\2\2\u0221\u0223\5\60\31\2\u0222"+
		"\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0231\3\2\2\2\u0224\u0225\5\24"+
		"\13\2\u0225\u0229\7E\2\2\u0226\u0228\5\u00ecw\2\u0227\u0226\3\2\2\2\u0228"+
		"\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022c\3\2"+
		"\2\2\u022b\u0229\3\2\2\2\u022c\u022e\7j\2\2\u022d\u022f\5\60\31\2\u022e"+
		"\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\3\2\2\2\u0230\u021d\3\2"+
		"\2\2\u0230\u0224\3\2\2\2\u0231\27\3\2\2\2\u0232\u0236\7E\2\2\u0233\u0235"+
		"\5\u00ecw\2\u0234\u0233\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2"+
		"\2\u0236\u0237\3\2\2\2\u0237\u0239\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023b"+
		"\7j\2\2\u023a\u023c\5\60\31\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2"+
		"\u023c\31\3\2\2\2\u023d\u023f\5\u00ecw\2\u023e\u023d\3\2\2\2\u023f\u0242"+
		"\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0243\3\2\2\2\u0242"+
		"\u0240\3\2\2\2\u0243\u0245\7j\2\2\u0244\u0246\5\60\31\2\u0245\u0244\3"+
		"\2\2\2\u0245\u0246\3\2\2\2\u0246\33\3\2\2\2\u0247\u0248\5\26\f\2\u0248"+
		"\35\3\2\2\2\u0249\u024a\5\30\r\2\u024a\37\3\2\2\2\u024b\u024c\5\32\16"+
		"\2\u024c!\3\2\2\2\u024d\u024f\5\u00ecw\2\u024e\u024d\3\2\2\2\u024f\u0252"+
		"\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0253\3\2\2\2\u0252"+
		"\u0250\3\2\2\2\u0253\u0254\7j\2\2\u0254#\3\2\2\2\u0255\u0256\5\n\6\2\u0256"+
		"\u0257\5&\24\2\u0257\u025f\3\2\2\2\u0258\u0259\5\24\13\2\u0259\u025a\5"+
		"&\24\2\u025a\u025f\3\2\2\2\u025b\u025c\5\"\22\2\u025c\u025d\5&\24\2\u025d"+
		"\u025f\3\2\2\2\u025e\u0255\3\2\2\2\u025e\u0258\3\2\2\2\u025e\u025b\3\2"+
		"\2\2\u025f%\3\2\2\2\u0260\u0262\5\u00ecw\2\u0261\u0260\3\2\2\2\u0262\u0265"+
		"\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0266\3\2\2\2\u0265"+
		"\u0263\3\2\2\2\u0266\u0267\7A\2\2\u0267\u0272\7B\2\2\u0268\u026a\5\u00ec"+
		"w\2\u0269\u0268\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026b"+
		"\u026c\3\2\2\2\u026c\u026e\3\2\2\2\u026d\u026b\3\2\2\2\u026e\u026f\7A"+
		"\2\2\u026f\u0271\7B\2\2\u0270\u026b\3\2\2\2\u0271\u0274\3\2\2\2\u0272"+
		"\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\'\3\2\2\2\u0274\u0272\3\2\2\2"+
		"\u0275\u0277\5*\26\2\u0276\u0275\3\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276"+
		"\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027b\3\2\2\2\u027a\u0278\3\2\2\2\u027b"+
		"\u027d\7j\2\2\u027c\u027e\5,\27\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2"+
		"\2\2\u027e)\3\2\2\2\u027f\u0280\5\u00ecw\2\u0280+\3\2\2\2\u0281\u0282"+
		"\7\23\2\2\u0282\u028c\5\"\22\2\u0283\u0284\7\23\2\2\u0284\u0288\5\24\13"+
		"\2\u0285\u0287\5.\30\2\u0286\u0285\3\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286"+
		"\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028c\3\2\2\2\u028a\u0288\3\2\2\2\u028b"+
		"\u0281\3\2\2\2\u028b\u0283\3\2\2\2\u028c-\3\2\2\2\u028d\u028e\7Y\2\2\u028e"+
		"\u028f\5\34\17\2\u028f/\3\2\2\2\u0290\u0291\7H\2\2\u0291\u0292\5\62\32"+
		"\2\u0292\u0293\7G\2\2\u0293\61\3\2\2\2\u0294\u0299\5\64\33\2\u0295\u0296"+
		"\7D\2\2\u0296\u0298\5\64\33\2\u0297\u0295\3\2\2\2\u0298\u029b\3\2\2\2"+
		"\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a\63\3\2\2\2\u029b\u0299"+
		"\3\2\2\2\u029c\u029f\5\22\n\2\u029d\u029f\5\66\34\2\u029e\u029c\3\2\2"+
		"\2\u029e\u029d\3\2\2\2\u029f\65\3\2\2\2\u02a0\u02a2\5\u00ecw\2\u02a1\u02a0"+
		"\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4"+
		"\u02a6\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a6\u02a8\7K\2\2\u02a7\u02a9\58\35"+
		"\2\u02a8\u02a7\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\67\3\2\2\2\u02aa\u02ab"+
		"\7\23\2\2\u02ab\u02af\5\22\n\2\u02ac\u02ad\7*\2\2\u02ad\u02af\5\22\n\2"+
		"\u02ae\u02aa\3\2\2\2\u02ae\u02ac\3\2\2\2\u02af9\3\2\2\2\u02b0\u02b1\b"+
		"\36\1\2\u02b1\u02b2\7j\2\2\u02b2\u02b8\3\2\2\2\u02b3\u02b4\f\3\2\2\u02b4"+
		"\u02b5\7E\2\2\u02b5\u02b7\7j\2\2\u02b6\u02b3\3\2\2\2\u02b7\u02ba\3\2\2"+
		"\2\u02b8\u02b6\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9;\3\2\2\2\u02ba\u02b8"+
		"\3\2\2\2\u02bb\u02c1\7j\2\2\u02bc\u02bd\5> \2\u02bd\u02be\7E\2\2\u02be"+
		"\u02bf\7j\2\2\u02bf\u02c1\3\2\2\2\u02c0\u02bb\3\2\2\2\u02c0\u02bc\3\2"+
		"\2\2\u02c1=\3\2\2\2\u02c2\u02c3\b \1\2\u02c3\u02c4\7j\2\2\u02c4\u02ca"+
		"\3\2\2\2\u02c5\u02c6\f\3\2\2\u02c6\u02c7\7E\2\2\u02c7\u02c9\7j\2\2\u02c8"+
		"\u02c5\3\2\2\2\u02c9\u02cc\3\2\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02cb\3\2"+
		"\2\2\u02cb?\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cd\u02d3\7j\2\2\u02ce\u02cf"+
		"\5D#\2\u02cf\u02d0\7E\2\2\u02d0\u02d1\7j\2\2\u02d1\u02d3\3\2\2\2\u02d2"+
		"\u02cd\3\2\2\2\u02d2\u02ce\3\2\2\2\u02d3A\3\2\2\2\u02d4\u02d5\7j\2\2\u02d5"+
		"C\3\2\2\2\u02d6\u02d7\b#\1\2\u02d7\u02d8\7j\2\2\u02d8\u02de\3\2\2\2\u02d9"+
		"\u02da\f\3\2\2\u02da\u02db\7E\2\2\u02db\u02dd\7j\2\2\u02dc\u02d9\3\2\2"+
		"\2\u02dd\u02e0\3\2\2\2\u02de\u02dc\3\2\2\2\u02de\u02df\3\2\2\2\u02dfE"+
		"\3\2\2\2\u02e0\u02de\3\2\2\2\u02e1\u02e3\5H%\2\u02e2\u02e1\3\2\2\2\u02e2"+
		"\u02e3\3\2\2\2\u02e3\u02e7\3\2\2\2\u02e4\u02e6\5L\'\2\u02e5\u02e4\3\2"+
		"\2\2\u02e6\u02e9\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8"+
		"\u02ed\3\2\2\2\u02e9\u02e7\3\2\2\2\u02ea\u02ec\5V,\2\u02eb\u02ea\3\2\2"+
		"\2\u02ec\u02ef\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f0"+
		"\3\2\2\2\u02ef\u02ed\3\2\2\2\u02f0\u02f1\7\2\2\3\u02f1G\3\2\2\2\u02f2"+
		"\u02f4\5J&\2\u02f3\u02f2\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3\3\2\2"+
		"\2\u02f5\u02f6\3\2\2\2\u02f6\u02f8\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\u02f9"+
		"\7\"\2\2\u02f9\u02fe\7j\2\2\u02fa\u02fb\7E\2\2\u02fb\u02fd\7j\2\2\u02fc"+
		"\u02fa\3\2\2\2\u02fd\u0300\3\2\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02ff\3\2"+
		"\2\2\u02ff\u0301\3\2\2\2\u0300\u02fe\3\2\2\2\u0301\u0302\7C\2\2\u0302"+
		"I\3\2\2\2\u0303\u0304\5\u00ecw\2\u0304K\3\2\2\2\u0305\u030a\5N(\2\u0306"+
		"\u030a\5P)\2\u0307\u030a\5R*\2\u0308\u030a\5T+\2\u0309\u0305\3\2\2\2\u0309"+
		"\u0306\3\2\2\2\u0309\u0307\3\2\2\2\u0309\u0308\3\2\2\2\u030aM\3\2\2\2"+
		"\u030b\u030c\7\33\2\2\u030c\u030d\5<\37\2\u030d\u030e\7C\2\2\u030eO\3"+
		"\2\2\2\u030f\u0310\7\33\2\2\u0310\u0311\5> \2\u0311\u0312\7E\2\2\u0312"+
		"\u0313\7W\2\2\u0313\u0314\7C\2\2\u0314Q\3\2\2\2\u0315\u0316\7\33\2\2\u0316"+
		"\u0317\7(\2\2\u0317\u0318\5<\37\2\u0318\u0319\7E\2\2\u0319\u031a\7j\2"+
		"\2\u031a\u031b\7C\2\2\u031bS\3\2\2\2\u031c\u031d\7\33\2\2\u031d\u031e"+
		"\7(\2\2\u031e\u031f\5<\37\2\u031f\u0320\7E\2\2\u0320\u0321\7W\2\2\u0321"+
		"\u0322\7C\2\2\u0322U\3\2\2\2\u0323\u0327\5X-\2\u0324\u0327\5\u00ccg\2"+
		"\u0325\u0327\7C\2\2\u0326\u0323\3\2\2\2\u0326\u0324\3\2\2\2\u0326\u0325"+
		"\3\2\2\2\u0327W\3\2\2\2\u0328\u032b\5Z.\2\u0329\u032b\5\u00c0a\2\u032a"+
		"\u0328\3\2\2\2\u032a\u0329\3\2\2\2\u032bY\3\2\2\2\u032c\u032e\5\\/\2\u032d"+
		"\u032c\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2"+
		"\2\2\u0330\u0332\3\2\2\2\u0331\u032f\3\2\2\2\u0332\u0333\7\13\2\2\u0333"+
		"\u0335\7j\2\2\u0334\u0336\5^\60\2\u0335\u0334\3\2\2\2\u0335\u0336\3\2"+
		"\2\2\u0336\u0338\3\2\2\2\u0337\u0339\5b\62\2\u0338\u0337\3\2\2\2\u0338"+
		"\u0339\3\2\2\2\u0339\u033b\3\2\2\2\u033a\u033c\5d\63\2\u033b\u033a\3\2"+
		"\2\2\u033b\u033c\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033e\5h\65\2\u033e"+
		"[\3\2\2\2\u033f\u0348\5\u00ecw\2\u0340\u0348\7%\2\2\u0341\u0348\7$\2\2"+
		"\u0342\u0348\7#\2\2\u0343\u0348\7\3\2\2\u0344\u0348\7(\2\2\u0345\u0348"+
		"\7\24\2\2\u0346\u0348\7)\2\2\u0347\u033f\3\2\2\2\u0347\u0340\3\2\2\2\u0347"+
		"\u0341\3\2\2\2\u0347\u0342\3\2\2\2\u0347\u0343\3\2\2\2\u0347\u0344\3\2"+
		"\2\2\u0347\u0345\3\2\2\2\u0347\u0346\3\2\2\2\u0348]\3\2\2\2\u0349\u034a"+
		"\7H\2\2\u034a\u034b\5`\61\2\u034b\u034c\7G\2\2\u034c_\3\2\2\2\u034d\u0352"+
		"\5(\25\2\u034e\u034f\7D\2\2\u034f\u0351\5(\25\2\u0350\u034e\3\2\2\2\u0351"+
		"\u0354\3\2\2\2\u0352\u0350\3\2\2\2\u0352\u0353\3\2\2\2\u0353a\3\2\2\2"+
		"\u0354\u0352\3\2\2\2\u0355\u0356\7\23\2\2\u0356\u0357\5\26\f\2\u0357c"+
		"\3\2\2\2\u0358\u0359\7\32\2\2\u0359\u035a\5f\64\2\u035ae\3\2\2\2\u035b"+
		"\u0360\5\34\17\2\u035c\u035d\7D\2\2\u035d\u035f\5\34\17\2\u035e\u035c"+
		"\3\2\2\2\u035f\u0362\3\2\2\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361"+
		"g\3\2\2\2\u0362\u0360\3\2\2\2\u0363\u0367\7?\2\2\u0364\u0366\5j\66\2\u0365"+
		"\u0364\3\2\2\2\u0366\u0369\3\2\2\2\u0367\u0365\3\2\2\2\u0367\u0368\3\2"+
		"\2\2\u0368\u036a\3\2\2\2\u0369\u0367\3\2\2\2\u036a\u036b\7@\2\2\u036b"+
		"i\3\2\2\2\u036c\u0371\5l\67\2\u036d\u0371\5\u00b0Y\2\u036e\u0371\5\u00b2"+
		"Z\2\u036f\u0371\5\u00b4[\2\u0370\u036c\3\2\2\2\u0370\u036d\3\2\2\2\u0370"+
		"\u036e\3\2\2\2\u0370\u036f\3\2\2\2\u0371k\3\2\2\2\u0372\u0378\5n8\2\u0373"+
		"\u0378\5\u0092J\2\u0374\u0378\5X-\2\u0375\u0378\5\u00ccg\2\u0376\u0378"+
		"\7C\2\2\u0377\u0372\3\2\2\2\u0377\u0373\3\2\2\2\u0377\u0374\3\2\2\2\u0377"+
		"\u0375\3\2\2\2\u0377\u0376\3\2\2\2\u0378m\3\2\2\2\u0379\u037b\5p9\2\u037a"+
		"\u0379\3\2\2\2\u037b\u037e\3\2\2\2\u037c\u037a\3\2\2\2\u037c\u037d\3\2"+
		"\2\2\u037d\u037f\3\2\2\2\u037e\u037c\3\2\2\2\u037f\u0380\5z>\2\u0380\u0381"+
		"\5r:\2\u0381\u0382\7C\2\2\u0382o\3\2\2\2\u0383\u038c\5\u00ecw\2\u0384"+
		"\u038c\7%\2\2\u0385\u038c\7$\2\2\u0386\u038c\7#\2\2\u0387\u038c\7(\2\2"+
		"\u0388\u038c\7\24\2\2\u0389\u038c\7\60\2\2\u038a\u038c\7\63\2\2\u038b"+
		"\u0383\3\2\2\2\u038b\u0384\3\2\2\2\u038b\u0385\3\2\2\2\u038b\u0386\3\2"+
		"\2\2\u038b\u0387\3\2\2\2\u038b\u0388\3\2\2\2\u038b\u0389\3\2\2\2\u038b"+
		"\u038a\3\2\2\2\u038cq\3\2\2\2\u038d\u0392\5t;\2\u038e\u038f\7D\2\2\u038f"+
		"\u0391\5t;\2\u0390\u038e\3\2\2\2\u0391\u0394\3\2\2\2\u0392\u0390\3\2\2"+
		"\2\u0392\u0393\3\2\2\2\u0393s\3\2\2\2\u0394\u0392\3\2\2\2\u0395\u0398"+
		"\5v<\2\u0396\u0397\7F\2\2\u0397\u0399\5x=\2\u0398\u0396\3\2\2\2\u0398"+
		"\u0399\3\2\2\2\u0399u\3\2\2\2\u039a\u039c\7j\2\2\u039b\u039d\5&\24\2\u039c"+
		"\u039b\3\2\2\2\u039c\u039d\3\2\2\2\u039dw\3\2\2\2\u039e\u03a1\5\u01a4"+
		"\u00d3\2\u039f\u03a1\5\u00fe\u0080\2\u03a0\u039e\3\2\2\2\u03a0\u039f\3"+
		"\2\2\2\u03a1y\3\2\2\2\u03a2\u03a5\5|?\2\u03a3\u03a5\5~@\2\u03a4\u03a2"+
		"\3\2\2\2\u03a4\u03a3\3\2\2\2\u03a5{\3\2\2\2\u03a6\u03a9\5\f\7\2\u03a7"+
		"\u03a9\7\5\2\2\u03a8\u03a6\3\2\2\2\u03a8\u03a7\3\2\2\2\u03a9}\3\2\2\2"+
		"\u03aa\u03ae\5\u0080A\2\u03ab\u03ae\5\u008eH\2\u03ac\u03ae\5\u0090I\2"+
		"\u03ad\u03aa\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ad\u03ac\3\2\2\2\u03ae\177"+
		"\3\2\2\2\u03af\u03b2\5\u0086D\2\u03b0\u03b2\5\u008cG\2\u03b1\u03af\3\2"+
		"\2\2\u03b1\u03b0\3\2\2\2\u03b2\u03b7\3\2\2\2\u03b3\u03b6\5\u0084C\2\u03b4"+
		"\u03b6\5\u008aF\2\u03b5\u03b3\3\2\2\2\u03b5\u03b4\3\2\2\2\u03b6\u03b9"+
		"\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u0081\3\2\2\2\u03b9"+
		"\u03b7\3\2\2\2\u03ba\u03bc\7j\2\2\u03bb\u03bd\5\60\31\2\u03bc\u03bb\3"+
		"\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03cb\3\2\2\2\u03be\u03bf\5\u0080A\2"+
		"\u03bf\u03c3\7E\2\2\u03c0\u03c2\5\u00ecw\2\u03c1\u03c0\3\2\2\2\u03c2\u03c5"+
		"\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c6\3\2\2\2\u03c5"+
		"\u03c3\3\2\2\2\u03c6\u03c8\7j\2\2\u03c7\u03c9\5\60\31\2\u03c8\u03c7\3"+
		"\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03cb\3\2\2\2\u03ca\u03ba\3\2\2\2\u03ca"+
		"\u03be\3\2\2\2\u03cb\u0083\3\2\2\2\u03cc\u03d0\7E\2\2\u03cd\u03cf\5\u00ec"+
		"w\2\u03ce\u03cd\3\2\2\2\u03cf\u03d2\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d0"+
		"\u03d1\3\2\2\2\u03d1\u03d3\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d3\u03d5\7j"+
		"\2\2\u03d4\u03d6\5\60\31\2\u03d5\u03d4\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6"+
		"\u0085\3\2\2\2\u03d7\u03d9\7j\2\2\u03d8\u03da\5\60\31\2\u03d9\u03d8\3"+
		"\2\2\2\u03d9\u03da\3\2\2\2\u03da\u0087\3\2\2\2\u03db\u03dc\5\u0082B\2"+
		"\u03dc\u0089\3\2\2\2\u03dd\u03de\5\u0084C\2\u03de\u008b\3\2\2\2\u03df"+
		"\u03e0\5\u0086D\2\u03e0\u008d\3\2\2\2\u03e1\u03e2\7j\2\2\u03e2\u008f\3"+
		"\2\2\2\u03e3\u03e4\5|?\2\u03e4\u03e5\5&\24\2\u03e5\u03ed\3\2\2\2\u03e6"+
		"\u03e7\5\u0080A\2\u03e7\u03e8\5&\24\2\u03e8\u03ed\3\2\2\2\u03e9\u03ea"+
		"\5\u008eH\2\u03ea\u03eb\5&\24\2\u03eb\u03ed\3\2\2\2\u03ec\u03e3\3\2\2"+
		"\2\u03ec\u03e6\3\2\2\2\u03ec\u03e9\3\2\2\2\u03ed\u0091\3\2\2\2\u03ee\u03f0"+
		"\5\u0094K\2\u03ef\u03ee\3\2\2\2\u03f0\u03f3\3\2\2\2\u03f1\u03ef\3\2\2"+
		"\2\u03f1\u03f2\3\2\2\2\u03f2\u03f4\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f4\u03f5"+
		"\5\u0096L\2\u03f5\u03f6\5\u00aeX\2\u03f6\u0093\3\2\2\2\u03f7\u0402\5\u00ec"+
		"w\2\u03f8\u0402\7%\2\2\u03f9\u0402\7$\2\2\u03fa\u0402\7#\2\2\u03fb\u0402"+
		"\7\3\2\2\u03fc\u0402\7(\2\2\u03fd\u0402\7\24\2\2\u03fe\u0402\7,\2\2\u03ff"+
		"\u0402\7 \2\2\u0400\u0402\7)\2\2\u0401\u03f7\3\2\2\2\u0401\u03f8\3\2\2"+
		"\2\u0401\u03f9\3\2\2\2\u0401\u03fa\3\2\2\2\u0401\u03fb\3\2\2\2\u0401\u03fc"+
		"\3\2\2\2\u0401\u03fd\3\2\2\2\u0401\u03fe\3\2\2\2\u0401\u03ff\3\2\2\2\u0401"+
		"\u0400\3\2\2\2\u0402\u0095\3\2\2\2\u0403\u0404\5\u0098M\2\u0404\u0406"+
		"\5\u009aN\2\u0405\u0407\5\u00a8U\2\u0406\u0405\3\2\2\2\u0406\u0407\3\2"+
		"\2\2\u0407\u0415\3\2\2\2\u0408\u040c\5^\60\2\u0409\u040b\5\u00ecw\2\u040a"+
		"\u0409\3\2\2\2\u040b\u040e\3\2\2\2\u040c\u040a\3\2\2\2\u040c\u040d\3\2"+
		"\2\2\u040d\u040f\3\2\2\2\u040e\u040c\3\2\2\2\u040f\u0410\5\u0098M\2\u0410"+
		"\u0412\5\u009aN\2\u0411\u0413\5\u00a8U\2\u0412\u0411\3\2\2\2\u0412\u0413"+
		"\3\2\2\2\u0413\u0415\3\2\2\2\u0414\u0403\3\2\2\2\u0414\u0408\3\2\2\2\u0415"+
		"\u0097\3\2\2\2\u0416\u0419\5z>\2\u0417\u0419\7\62\2\2\u0418\u0416\3\2"+
		"\2\2\u0418\u0417\3\2\2\2\u0419\u0099\3\2\2\2\u041a\u041b\7j\2\2\u041b"+
		"\u041d\7=\2\2\u041c\u041e\5\u009cO\2\u041d\u041c\3\2\2\2\u041d\u041e\3"+
		"\2\2\2\u041e\u041f\3\2\2\2\u041f\u0421\7>\2\2\u0420\u0422\5&\24\2\u0421"+
		"\u0420\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u009b\3\2\2\2\u0423\u0424\5\u009e"+
		"P\2\u0424\u0425\7D\2\2\u0425\u0426\5\u00a4S\2\u0426\u0429\3\2\2\2\u0427"+
		"\u0429\5\u00a4S\2\u0428\u0423\3\2\2\2\u0428\u0427\3\2\2\2\u0429\u009d"+
		"\3\2\2\2\u042a\u042f\5\u00a0Q\2\u042b\u042c\7D\2\2\u042c\u042e\5\u00a0"+
		"Q\2\u042d\u042b\3\2\2\2\u042e\u0431\3\2\2\2\u042f\u042d\3\2\2\2\u042f"+
		"\u0430\3\2\2\2\u0430\u043b\3\2\2\2\u0431\u042f\3\2\2\2\u0432\u0437\5\u00a6"+
		"T\2\u0433\u0434\7D\2\2\u0434\u0436\5\u00a0Q\2\u0435\u0433\3\2\2\2\u0436"+
		"\u0439\3\2\2\2\u0437\u0435\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u043b\3\2"+
		"\2\2\u0439\u0437\3\2\2\2\u043a\u042a\3\2\2\2\u043a\u0432\3\2\2\2\u043b"+
		"\u009f\3\2\2\2\u043c\u043e\5\u00a2R\2\u043d\u043c\3\2\2\2\u043e\u0441"+
		"\3\2\2\2\u043f\u043d\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0442\3\2\2\2\u0441"+
		"\u043f\3\2\2\2\u0442\u0443\5z>\2\u0443\u0444\5v<\2\u0444\u00a1\3\2\2\2"+
		"\u0445\u0448\5\u00ecw\2\u0446\u0448\7\24\2\2\u0447\u0445\3\2\2\2\u0447"+
		"\u0446\3\2\2\2\u0448\u00a3\3\2\2\2\u0449\u044b\5\u00a2R\2\u044a\u0449"+
		"\3\2\2\2\u044b\u044e\3\2\2\2\u044c\u044a\3\2\2\2\u044c\u044d\3\2\2\2\u044d"+
		"\u044f\3\2\2\2\u044e\u044c\3\2\2\2\u044f\u0453\5z>\2\u0450\u0452\5\u00ec"+
		"w\2\u0451\u0450\3\2\2\2\u0452\u0455\3\2\2\2\u0453\u0451\3\2\2\2\u0453"+
		"\u0454\3\2\2\2\u0454\u0456\3\2\2\2\u0455\u0453\3\2\2\2\u0456\u0457\7l"+
		"\2\2\u0457\u0458\5v<\2\u0458\u045b\3\2\2\2\u0459\u045b\5\u00a0Q\2\u045a"+
		"\u044c\3\2\2\2\u045a\u0459\3\2\2\2\u045b\u00a5\3\2\2\2\u045c\u045e\5\u00ec"+
		"w\2\u045d\u045c\3\2\2\2\u045e\u0461\3\2\2\2\u045f\u045d\3\2\2\2\u045f"+
		"\u0460\3\2\2\2\u0460\u0462\3\2\2\2\u0461\u045f\3\2\2\2\u0462\u0465\5z"+
		">\2\u0463\u0464\7j\2\2\u0464\u0466\7E\2\2\u0465\u0463\3\2\2\2\u0465\u0466"+
		"\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0468\7-\2\2\u0468\u00a7\3\2\2\2\u0469"+
		"\u046a\7/\2\2\u046a\u046b\5\u00aaV\2\u046b\u00a9\3\2\2\2\u046c\u0471\5"+
		"\u00acW\2\u046d\u046e\7D\2\2\u046e\u0470\5\u00acW\2\u046f\u046d\3\2\2"+
		"\2\u0470\u0473\3\2\2\2\u0471\u046f\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u00ab"+
		"\3\2\2\2\u0473\u0471\3\2\2\2\u0474\u0477\5\26\f\2\u0475\u0477\5\"\22\2"+
		"\u0476\u0474\3\2\2\2\u0476\u0475\3\2\2\2\u0477\u00ad\3\2\2\2\u0478\u047b"+
		"\5\u0102\u0082\2\u0479\u047b\7C\2\2\u047a\u0478\3\2\2\2\u047a\u0479\3"+
		"\2\2\2\u047b\u00af\3\2\2\2\u047c\u047d\5\u0102\u0082\2\u047d\u00b1\3\2"+
		"\2\2\u047e\u047f\7(\2\2\u047f\u0480\5\u0102\u0082\2\u0480\u00b3\3\2\2"+
		"\2\u0481\u0483\5\u00b6\\\2\u0482\u0481\3\2\2\2\u0483\u0486\3\2\2\2\u0484"+
		"\u0482\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0487\3\2\2\2\u0486\u0484\3\2"+
		"\2\2\u0487\u0489\5\u00b8]\2\u0488\u048a\5\u00a8U\2\u0489\u0488\3\2\2\2"+
		"\u0489\u048a\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u048c\5\u00bc_\2\u048c"+
		"\u00b5\3\2\2\2\u048d\u0492\5\u00ecw\2\u048e\u0492\7%\2\2\u048f\u0492\7"+
		"$\2\2\u0490\u0492\7#\2\2\u0491\u048d\3\2\2\2\u0491\u048e\3\2\2\2\u0491"+
		"\u048f\3\2\2\2\u0491\u0490\3\2\2\2\u0492\u00b7\3\2\2\2\u0493\u0495\5^"+
		"\60\2\u0494\u0493\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0496\3\2\2\2\u0496"+
		"\u0497\5\u00ba^\2\u0497\u0499\7=\2\2\u0498\u049a\5\u009cO\2\u0499\u0498"+
		"\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049c\7>\2\2\u049c"+
		"\u00b9\3\2\2\2\u049d\u049e\7j\2\2\u049e\u00bb\3\2\2\2\u049f\u04a1\7?\2"+
		"\2\u04a0\u04a2\5\u00be`\2\u04a1\u04a0\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2"+
		"\u04a4\3\2\2\2\u04a3\u04a5\5\u0104\u0083\2\u04a4\u04a3\3\2\2\2\u04a4\u04a5"+
		"\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a7\7@\2\2\u04a7\u00bd\3\2\2\2\u04a8"+
		"\u04aa\5\60\31\2\u04a9\u04a8\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ab\3"+
		"\2\2\2\u04ab\u04ac\7-\2\2\u04ac\u04ae\7=\2\2\u04ad\u04af\5\u0194\u00cb"+
		"\2\u04ae\u04ad\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b1"+
		"\7>\2\2\u04b1\u04d7\7C\2\2\u04b2\u04b4\5\60\31\2\u04b3\u04b2\3\2\2\2\u04b3"+
		"\u04b4\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b6\7*\2\2\u04b6\u04b8\7=\2"+
		"\2\u04b7\u04b9\5\u0194\u00cb\2\u04b8\u04b7\3\2\2\2\u04b8\u04b9\3\2\2\2"+
		"\u04b9\u04ba\3\2\2\2\u04ba\u04bb\7>\2\2\u04bb\u04d7\7C\2\2\u04bc\u04bd"+
		"\5@!\2\u04bd\u04bf\7E\2\2\u04be\u04c0\5\60\31\2\u04bf\u04be\3\2\2\2\u04bf"+
		"\u04c0\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c2\7*\2\2\u04c2\u04c4\7=\2"+
		"\2\u04c3\u04c5\5\u0194\u00cb\2\u04c4\u04c3\3\2\2\2\u04c4\u04c5\3\2\2\2"+
		"\u04c5\u04c6\3\2\2\2\u04c6\u04c7\7>\2\2\u04c7\u04c8\7C\2\2\u04c8\u04d7"+
		"\3\2\2\2\u04c9\u04ca\5\u0166\u00b4\2\u04ca\u04cc\7E\2\2\u04cb\u04cd\5"+
		"\60\31\2\u04cc\u04cb\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce"+
		"\u04cf\7*\2\2\u04cf\u04d1\7=\2\2\u04d0\u04d2\5\u0194\u00cb\2\u04d1\u04d0"+
		"\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u04d4\7>\2\2\u04d4"+
		"\u04d5\7C\2\2\u04d5\u04d7\3\2\2\2\u04d6\u04a9\3\2\2\2\u04d6\u04b3\3\2"+
		"\2\2\u04d6\u04bc\3\2\2\2\u04d6\u04c9\3\2\2\2\u04d7\u00bf\3\2\2\2\u04d8"+
		"\u04da\5\\/\2\u04d9\u04d8\3\2\2\2\u04da\u04dd\3\2\2\2\u04db\u04d9\3\2"+
		"\2\2\u04db\u04dc\3\2\2\2\u04dc\u04de\3\2\2\2\u04dd\u04db\3\2\2\2\u04de"+
		"\u04df\7\22\2\2\u04df\u04e1\7j\2\2\u04e0\u04e2\5d\63\2\u04e1\u04e0\3\2"+
		"\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e4\5\u00c2b\2\u04e4"+
		"\u00c1\3\2\2\2\u04e5\u04e7\7?\2\2\u04e6\u04e8\5\u00c4c\2\u04e7\u04e6\3"+
		"\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04ea\3\2\2\2\u04e9\u04eb\7D\2\2\u04ea"+
		"\u04e9\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ed\3\2\2\2\u04ec\u04ee\5\u00ca"+
		"f\2\u04ed\u04ec\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef"+
		"\u04f0\7@\2\2\u04f0\u00c3\3\2\2\2\u04f1\u04f6\5\u00c6d\2\u04f2\u04f3\7"+
		"D\2\2\u04f3\u04f5\5\u00c6d\2\u04f4\u04f2\3\2\2\2\u04f5\u04f8\3\2\2\2\u04f6"+
		"\u04f4\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u00c5\3\2\2\2\u04f8\u04f6\3\2"+
		"\2\2\u04f9\u04fb\5\u00c8e\2\u04fa\u04f9\3\2\2\2\u04fb\u04fe\3\2\2\2\u04fc"+
		"\u04fa\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u04ff\3\2\2\2\u04fe\u04fc\3\2"+
		"\2\2\u04ff\u0505\7j\2\2\u0500\u0502\7=\2\2\u0501\u0503\5\u0194\u00cb\2"+
		"\u0502\u0501\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0506"+
		"\7>\2\2\u0505\u0500\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0508\3\2\2\2\u0507"+
		"\u0509\5h\65\2\u0508\u0507\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u00c7\3\2"+
		"\2\2\u050a\u050b\5\u00ecw\2\u050b\u00c9\3\2\2\2\u050c\u0510\7C\2\2\u050d"+
		"\u050f\5j\66\2\u050e\u050d\3\2\2\2\u050f\u0512\3\2\2\2\u0510\u050e\3\2"+
		"\2\2\u0510\u0511\3\2\2\2\u0511\u00cb\3\2\2\2\u0512\u0510\3\2\2\2\u0513"+
		"\u0516\5\u00ceh\2\u0514\u0516\5\u00e0q\2\u0515\u0513\3\2\2\2\u0515\u0514"+
		"\3\2\2\2\u0516\u00cd\3\2\2\2\u0517\u0519\5\u00d0i\2\u0518\u0517\3\2\2"+
		"\2\u0519\u051c\3\2\2\2\u051a\u0518\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u051d"+
		"\3\2\2\2\u051c\u051a\3\2\2\2\u051d\u051e\7\36\2\2\u051e\u0520\7j\2\2\u051f"+
		"\u0521\5^\60\2\u0520\u051f\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0523\3\2"+
		"\2\2\u0522\u0524\5\u00d2j\2\u0523\u0522\3\2\2\2\u0523\u0524\3\2\2\2\u0524"+
		"\u0525\3\2\2\2\u0525\u0526\5\u00d4k\2\u0526\u00cf\3\2\2\2\u0527\u052f"+
		"\5\u00ecw\2\u0528\u052f\7%\2\2\u0529\u052f\7$\2\2\u052a\u052f\7#\2\2\u052b"+
		"\u052f\7\3\2\2\u052c\u052f\7(\2\2\u052d\u052f\7)\2\2\u052e\u0527\3\2\2"+
		"\2\u052e\u0528\3\2\2\2\u052e\u0529\3\2\2\2\u052e\u052a\3\2\2\2\u052e\u052b"+
		"\3\2\2\2\u052e\u052c\3\2\2\2\u052e\u052d\3\2\2\2\u052f\u00d1\3\2\2\2\u0530"+
		"\u0531\7\23\2\2\u0531\u0532\5f\64\2\u0532\u00d3\3\2\2\2\u0533\u0537\7"+
		"?\2\2\u0534\u0536\5\u00d6l\2\u0535\u0534\3\2\2\2\u0536\u0539\3\2\2\2\u0537"+
		"\u0535\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u053a\3\2\2\2\u0539\u0537\3\2"+
		"\2\2\u053a\u053b\7@\2\2\u053b\u00d5\3\2\2\2\u053c\u0542\5\u00d8m\2\u053d"+
		"\u0542\5\u00dco\2\u053e\u0542\5X-\2\u053f\u0542\5\u00ccg\2\u0540\u0542"+
		"\7C\2\2\u0541\u053c\3\2\2\2\u0541\u053d\3\2\2\2\u0541\u053e\3\2\2\2\u0541"+
		"\u053f\3\2\2\2\u0541\u0540\3\2\2\2\u0542\u00d7\3\2\2\2\u0543\u0545\5\u00da"+
		"n\2\u0544\u0543\3\2\2\2\u0545\u0548\3\2\2\2\u0546\u0544\3\2\2\2\u0546"+
		"\u0547\3\2\2\2\u0547\u0549\3\2\2\2\u0548\u0546\3\2\2\2\u0549\u054a\5z"+
		">\2\u054a\u054b\5r:\2\u054b\u054c\7C\2\2\u054c\u00d9\3\2\2\2\u054d\u0552"+
		"\5\u00ecw\2\u054e\u0552\7%\2\2\u054f\u0552\7(\2\2\u0550\u0552\7\24\2\2"+
		"\u0551\u054d\3\2\2\2\u0551\u054e\3\2\2\2\u0551\u054f\3\2\2\2\u0551\u0550"+
		"\3\2\2\2\u0552\u00db\3\2\2\2\u0553\u0555\5\u00dep\2\u0554\u0553\3\2\2"+
		"\2\u0555\u0558\3\2\2\2\u0556\u0554\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u0559"+
		"\3\2\2\2\u0558\u0556\3\2\2\2\u0559\u055a\5\u0096L\2\u055a\u055b\5\u00ae"+
		"X\2\u055b\u00dd\3\2\2\2\u055c\u0563\5\u00ecw\2\u055d\u0563\7%\2\2\u055e"+
		"\u0563\7\3\2\2\u055f\u0563\7\16\2\2\u0560\u0563\7(\2\2\u0561\u0563\7)"+
		"\2\2\u0562\u055c\3\2\2\2\u0562\u055d\3\2\2\2\u0562\u055e\3\2\2\2\u0562"+
		"\u055f\3\2\2\2\u0562\u0560\3\2\2\2\u0562\u0561\3\2\2\2\u0563\u00df\3\2"+
		"\2\2\u0564\u0566\5\u00d0i\2\u0565\u0564\3\2\2\2\u0566\u0569\3\2\2\2\u0567"+
		"\u0565\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u056a\3\2\2\2\u0569\u0567\3\2"+
		"\2\2\u056a\u056b\7k\2\2\u056b\u056c\7\36\2\2\u056c\u056d\7j\2\2\u056d"+
		"\u056e\5\u00e2r\2\u056e\u00e1\3\2\2\2\u056f\u0573\7?\2\2\u0570\u0572\5"+
		"\u00e4s\2\u0571\u0570\3\2\2\2\u0572\u0575\3\2\2\2\u0573\u0571\3\2\2\2"+
		"\u0573\u0574\3\2\2\2\u0574\u0576\3\2\2\2\u0575\u0573\3\2\2\2\u0576\u0577"+
		"\7@\2\2\u0577\u00e3\3\2\2\2\u0578\u057e\5\u00e6t\2\u0579\u057e\5\u00d8"+
		"m\2\u057a\u057e\5X-\2\u057b\u057e\5\u00ccg\2\u057c\u057e\7C\2\2\u057d"+
		"\u0578\3\2\2\2\u057d\u0579\3\2\2\2\u057d\u057a\3\2\2\2\u057d\u057b\3\2"+
		"\2\2\u057d\u057c\3\2\2\2\u057e\u00e5\3\2\2\2\u057f\u0581\5\u00e8u\2\u0580"+
		"\u057f\3\2\2\2\u0581\u0584\3\2\2\2\u0582\u0580\3\2\2\2\u0582\u0583\3\2"+
		"\2\2\u0583\u0585\3\2\2\2\u0584\u0582\3\2\2\2\u0585\u0586\5z>\2\u0586\u0587"+
		"\7j\2\2\u0587\u0588\7=\2\2\u0588\u058a\7>\2\2\u0589\u058b\5&\24\2\u058a"+
		"\u0589\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u058d\3\2\2\2\u058c\u058e\5\u00ea"+
		"v\2\u058d\u058c\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u058f\3\2\2\2\u058f"+
		"\u0590\7C\2\2\u0590\u00e7\3\2\2\2\u0591\u0595\5\u00ecw\2\u0592\u0595\7"+
		"%\2\2\u0593\u0595\7\3\2\2\u0594\u0591\3\2\2\2\u0594\u0592\3\2\2\2\u0594"+
		"\u0593\3\2\2\2\u0595\u00e9\3\2\2\2\u0596\u0597\7\16\2\2\u0597\u0598\5"+
		"\u00f4{\2\u0598\u00eb\3\2\2\2\u0599\u059d\5\u00eex\2\u059a\u059d\5\u00fa"+
		"~\2\u059b\u059d\5\u00fc\177\2\u059c\u0599\3\2\2\2\u059c\u059a\3\2\2\2"+
		"\u059c\u059b\3\2\2\2\u059d\u00ed\3\2\2\2\u059e\u059f\7k\2\2\u059f\u05a0"+
		"\5<\37\2\u05a0\u05a2\7=\2\2\u05a1\u05a3\5\u00f0y\2\u05a2\u05a1\3\2\2\2"+
		"\u05a2\u05a3\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u05a5\7>\2\2\u05a5\u00ef"+
		"\3\2\2\2\u05a6\u05ab\5\u00f2z\2\u05a7\u05a8\7D\2\2\u05a8\u05aa\5\u00f2"+
		"z\2\u05a9\u05a7\3\2\2\2\u05aa\u05ad\3\2\2\2\u05ab\u05a9\3\2\2\2\u05ab"+
		"\u05ac\3\2\2\2\u05ac\u00f1\3\2\2\2\u05ad\u05ab\3\2\2\2\u05ae\u05af\7j"+
		"\2\2\u05af\u05b0\7F\2\2\u05b0\u05b1\5\u00f4{\2\u05b1\u00f3\3\2\2\2\u05b2"+
		"\u05b6\5\u01b6\u00dc\2\u05b3\u05b6\5\u00f6|\2\u05b4\u05b6\5\u00ecw\2\u05b5"+
		"\u05b2\3\2\2\2\u05b5\u05b3\3\2\2\2\u05b5\u05b4\3\2\2\2\u05b6\u00f5\3\2"+
		"\2\2\u05b7\u05b9\7?\2\2\u05b8\u05ba\5\u00f8}\2\u05b9\u05b8\3\2\2\2\u05b9"+
		"\u05ba\3\2\2\2\u05ba\u05bc\3\2\2\2\u05bb\u05bd\7D\2\2\u05bc\u05bb\3\2"+
		"\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05be\3\2\2\2\u05be\u05bf\7@\2\2\u05bf"+
		"\u00f7\3\2\2\2\u05c0\u05c5\5\u00f4{\2\u05c1\u05c2\7D\2\2\u05c2\u05c4\5"+
		"\u00f4{\2\u05c3\u05c1\3\2\2\2\u05c4\u05c7\3\2\2\2\u05c5\u05c3\3\2\2\2"+
		"\u05c5\u05c6\3\2\2\2\u05c6\u00f9\3\2\2\2\u05c7\u05c5\3\2\2\2\u05c8\u05c9"+
		"\7k\2\2\u05c9\u05ca\5<\37\2\u05ca\u00fb\3\2\2\2\u05cb\u05cc\7k\2\2\u05cc"+
		"\u05cd\5<\37\2\u05cd\u05ce\7=\2\2\u05ce\u05cf\5\u00f4{\2\u05cf\u05d0\7"+
		">\2\2\u05d0\u00fd\3\2\2\2\u05d1\u05d3\7?\2\2\u05d2\u05d4\5\u0100\u0081"+
		"\2\u05d3\u05d2\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d6\3\2\2\2\u05d5\u05d7"+
		"\7D\2\2\u05d6\u05d5\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8"+
		"\u05d9\7@\2\2\u05d9\u00ff\3\2\2\2\u05da\u05df\5x=\2\u05db\u05dc\7D\2\2"+
		"\u05dc\u05de\5x=\2\u05dd\u05db\3\2\2\2\u05de\u05e1\3\2\2\2\u05df\u05dd"+
		"\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0\u0101\3\2\2\2\u05e1\u05df\3\2\2\2\u05e2"+
		"\u05e4\7?\2\2\u05e3\u05e5\5\u0104\u0083\2\u05e4\u05e3\3\2\2\2\u05e4\u05e5"+
		"\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05e7\7@\2\2\u05e7\u0103\3\2\2\2\u05e8"+
		"\u05ec\5\u0106\u0084\2\u05e9\u05eb\5\u0106\u0084\2\u05ea\u05e9\3\2\2\2"+
		"\u05eb\u05ee\3\2\2\2\u05ec\u05ea\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u0105"+
		"\3\2\2\2\u05ee\u05ec\3\2\2\2\u05ef\u05f3\5\u0108\u0085\2\u05f0\u05f3\5"+
		"X-\2\u05f1\u05f3\5\u010c\u0087\2\u05f2\u05ef\3\2\2\2\u05f2\u05f0\3\2\2"+
		"\2\u05f2\u05f1\3\2\2\2\u05f3\u0107\3\2\2\2\u05f4\u05f5\5\u010a\u0086\2"+
		"\u05f5\u05f6\7C\2\2\u05f6\u0109\3\2\2\2\u05f7\u05f9\5\u00a2R\2\u05f8\u05f7"+
		"\3\2\2\2\u05f9\u05fc\3\2\2\2\u05fa\u05f8\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb"+
		"\u05fd\3\2\2\2\u05fc\u05fa\3\2\2\2\u05fd\u05fe\5z>\2\u05fe\u05ff\5r:\2"+
		"\u05ff\u010b\3\2\2\2\u0600\u0607\5\u0110\u0089\2\u0601\u0607\5\u0114\u008b"+
		"\2\u0602\u0607\5\u011c\u008f\2\u0603\u0607\5\u011e\u0090\2\u0604\u0607"+
		"\5\u0130\u0099\2\u0605\u0607\5\u0136\u009c\2\u0606\u0600\3\2\2\2\u0606"+
		"\u0601\3\2\2\2\u0606\u0602\3\2\2\2\u0606\u0603\3\2\2\2\u0606\u0604\3\2"+
		"\2\2\u0606\u0605\3\2\2\2\u0607\u010d\3\2\2\2\u0608\u060e\5\u0110\u0089"+
		"\2\u0609\u060e\5\u0116\u008c\2\u060a\u060e\5\u0120\u0091\2\u060b\u060e"+
		"\5\u0132\u009a\2\u060c\u060e\5\u0138\u009d\2\u060d\u0608\3\2\2\2\u060d"+
		"\u0609\3\2\2\2\u060d\u060a\3\2\2\2\u060d\u060b\3\2\2\2\u060d\u060c\3\2"+
		"\2\2\u060e\u010f\3\2\2\2\u060f\u061c\5\u0102\u0082\2\u0610\u061c\5\u0112"+
		"\u008a\2\u0611\u061c\5\u0118\u008d\2\u0612\u061c\5\u0122\u0092\2\u0613"+
		"\u061c\5\u0124\u0093\2\u0614\u061c\5\u0134\u009b\2\u0615\u061c\5\u0148"+
		"\u00a5\2\u0616\u061c\5\u014a\u00a6\2\u0617\u061c\5\u014c\u00a7\2\u0618"+
		"\u061c\5\u0150\u00a9\2\u0619\u061c\5\u014e\u00a8\2\u061a\u061c\5\u0152"+
		"\u00aa\2\u061b\u060f\3\2\2\2\u061b\u0610\3\2\2\2\u061b\u0611\3\2\2\2\u061b"+
		"\u0612\3\2\2\2\u061b\u0613\3\2\2\2\u061b\u0614\3\2\2\2\u061b\u0615\3\2"+
		"\2\2\u061b\u0616\3\2\2\2\u061b\u0617\3\2\2\2\u061b\u0618\3\2\2\2\u061b"+
		"\u0619\3\2\2\2\u061b\u061a\3\2\2\2\u061c\u0111\3\2\2\2\u061d\u061e\7C"+
		"\2\2\u061e\u0113\3\2\2\2\u061f\u0620\7j\2\2\u0620\u0621\7L\2\2\u0621\u0622"+
		"\5\u010c\u0087\2\u0622\u0115\3\2\2\2\u0623\u0624\7j\2\2\u0624\u0625\7"+
		"L\2\2\u0625\u0626\5\u010e\u0088\2\u0626\u0117\3\2\2\2\u0627\u0628\5\u011a"+
		"\u008e\2\u0628\u0629\7C\2\2\u0629\u0119\3\2\2\2\u062a\u0632\5\u01b0\u00d9"+
		"\2\u062b\u0632\5\u01ce\u00e8\2\u062c\u0632\5\u01d0\u00e9\2\u062d\u0632"+
		"\5\u01d6\u00ec\2\u062e\u0632\5\u01da\u00ee\2\u062f\u0632\5\u018e\u00c8"+
		"\2\u0630\u0632\5\u017a\u00be\2\u0631\u062a\3\2\2\2\u0631\u062b\3\2\2\2"+
		"\u0631\u062c\3\2\2\2\u0631\u062d\3\2\2\2\u0631\u062e\3\2\2\2\u0631\u062f"+
		"\3\2\2\2\u0631\u0630\3\2\2\2\u0632\u011b\3\2\2\2\u0633\u0634\7\30\2\2"+
		"\u0634\u0635\7=\2\2\u0635\u0636\5\u01a4\u00d3\2\u0636\u0637\7>\2\2\u0637"+
		"\u0638\5\u010c\u0087\2\u0638\u011d\3\2\2\2\u0639\u063a\7\30\2\2\u063a"+
		"\u063b\7=\2\2\u063b\u063c\5\u01a4\u00d3\2\u063c\u063d\7>\2\2\u063d\u063e"+
		"\5\u010e\u0088\2\u063e\u063f\7\21\2\2\u063f\u0640\5\u010c\u0087\2\u0640"+
		"\u011f\3\2\2\2\u0641\u0642\7\30\2\2\u0642\u0643\7=\2\2\u0643\u0644\5\u01a4"+
		"\u00d3\2\u0644\u0645\7>\2\2\u0645\u0646\5\u010e\u0088\2\u0646\u0647\7"+
		"\21\2\2\u0647\u0648\5\u010e\u0088\2\u0648\u0121\3\2\2\2\u0649\u064a\7"+
		"\4\2\2\u064a\u064b\5\u01a4\u00d3\2\u064b\u064c\7C\2\2\u064c\u0654\3\2"+
		"\2\2\u064d\u064e\7\4\2\2\u064e\u064f\5\u01a4\u00d3\2\u064f\u0650\7L\2"+
		"\2\u0650\u0651\5\u01a4\u00d3\2\u0651\u0652\7C\2\2\u0652\u0654\3\2\2\2"+
		"\u0653\u0649\3\2\2\2\u0653\u064d\3\2\2\2\u0654\u0123\3\2\2\2\u0655\u0656"+
		"\7+\2\2\u0656\u0657\7=\2\2\u0657\u0658\5\u01a4\u00d3\2\u0658\u0659\7>"+
		"\2\2\u0659\u065a\5\u0126\u0094\2\u065a\u0125\3\2\2\2\u065b\u065f\7?\2"+
		"\2\u065c\u065e\5\u0128\u0095\2\u065d\u065c\3\2\2\2\u065e\u0661\3\2\2\2"+
		"\u065f\u065d\3\2\2\2\u065f\u0660\3\2\2\2\u0660\u0665\3\2\2\2\u0661\u065f"+
		"\3\2\2\2\u0662\u0664\5\u012c\u0097\2\u0663\u0662\3\2\2\2\u0664\u0667\3"+
		"\2\2\2\u0665\u0663\3\2\2\2\u0665\u0666\3\2\2\2\u0666\u0668\3\2\2\2\u0667"+
		"\u0665\3\2\2\2\u0668\u0669\7@\2\2\u0669\u0127\3\2\2\2\u066a\u066b\5\u012a"+
		"\u0096\2\u066b\u066c\5\u0104\u0083\2\u066c\u0129\3\2\2\2\u066d\u0671\5"+
		"\u012c\u0097\2\u066e\u0670\5\u012c\u0097\2\u066f\u066e\3\2\2\2\u0670\u0673"+
		"\3\2\2\2\u0671\u066f\3\2\2\2\u0671\u0672\3\2\2\2\u0672\u012b\3\2\2\2\u0673"+
		"\u0671\3\2\2\2\u0674\u0675\7\b\2\2\u0675\u0676\5\u01a2\u00d2\2\u0676\u0677"+
		"\7L\2\2\u0677\u067f\3\2\2\2\u0678\u0679\7\b\2\2\u0679\u067a\5\u012e\u0098"+
		"\2\u067a\u067b\7L\2\2\u067b\u067f\3\2\2\2\u067c\u067d\7\16\2\2\u067d\u067f"+
		"\7L\2\2\u067e\u0674\3\2\2\2\u067e\u0678\3\2\2\2\u067e\u067c\3\2\2\2\u067f"+
		"\u012d\3\2\2\2\u0680\u0681\7j\2\2\u0681\u012f\3\2\2\2\u0682\u0683\7\64"+
		"\2\2\u0683\u0684\7=\2\2\u0684\u0685\5\u01a4\u00d3\2\u0685\u0686\7>\2\2"+
		"\u0686\u0687\5\u010c\u0087\2\u0687\u0131\3\2\2\2\u0688\u0689\7\64\2\2"+
		"\u0689\u068a\7=\2\2\u068a\u068b\5\u01a4\u00d3\2\u068b\u068c\7>\2\2\u068c"+
		"\u068d\5\u010e\u0088\2\u068d\u0133\3\2\2\2\u068e\u068f\7\17\2\2\u068f"+
		"\u0690\5\u010c\u0087\2\u0690\u0691\7\64\2\2\u0691\u0692\7=\2\2\u0692\u0693"+
		"\5\u01a4\u00d3\2\u0693\u0694\7>\2\2\u0694\u0695\7C\2\2\u0695\u0135\3\2"+
		"\2\2\u0696\u0699\5\u013a\u009e\2\u0697\u0699\5\u0144\u00a3\2\u0698\u0696"+
		"\3\2\2\2\u0698\u0697\3\2\2\2\u0699\u0137\3\2\2\2\u069a\u069d\5\u013c\u009f"+
		"\2\u069b\u069d\5\u0146\u00a4\2\u069c\u069a\3\2\2\2\u069c\u069b\3\2\2\2"+
		"\u069d\u0139\3\2\2\2\u069e\u069f\7\27\2\2\u069f\u06a1\7=\2\2\u06a0\u06a2"+
		"\5\u013e\u00a0\2\u06a1\u06a0\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06a3\3"+
		"\2\2\2\u06a3\u06a5\7C\2\2\u06a4\u06a6\5\u01a4\u00d3\2\u06a5\u06a4\3\2"+
		"\2\2\u06a5\u06a6\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7\u06a9\7C\2\2\u06a8"+
		"\u06aa\5\u0140\u00a1\2\u06a9\u06a8\3\2\2\2\u06a9\u06aa\3\2\2\2\u06aa\u06ab"+
		"\3\2\2\2\u06ab\u06ac\7>\2\2\u06ac\u06ad\5\u010c\u0087\2\u06ad\u013b\3"+
		"\2\2\2\u06ae\u06af\7\27\2\2\u06af\u06b1\7=\2\2\u06b0\u06b2\5\u013e\u00a0"+
		"\2\u06b1\u06b0\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b5"+
		"\7C\2\2\u06b4\u06b6\5\u01a4\u00d3\2\u06b5\u06b4\3\2\2\2\u06b5\u06b6\3"+
		"\2\2\2\u06b6\u06b7\3\2\2\2\u06b7\u06b9\7C\2\2\u06b8\u06ba\5\u0140\u00a1"+
		"\2\u06b9\u06b8\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb\u06bc"+
		"\7>\2\2\u06bc\u06bd\5\u010e\u0088\2\u06bd\u013d\3\2\2\2\u06be\u06c1\5"+
		"\u0142\u00a2\2\u06bf\u06c1\5\u010a\u0086\2\u06c0\u06be\3\2\2\2\u06c0\u06bf"+
		"\3\2\2\2\u06c1\u013f\3\2\2\2\u06c2\u06c3\5\u0142\u00a2\2\u06c3\u0141\3"+
		"\2\2\2\u06c4\u06c9\5\u011a\u008e\2\u06c5\u06c6\7D\2\2\u06c6\u06c8\5\u011a"+
		"\u008e\2\u06c7\u06c5\3\2\2\2\u06c8\u06cb\3\2\2\2\u06c9\u06c7\3\2\2\2\u06c9"+
		"\u06ca\3\2\2\2\u06ca\u0143\3\2\2\2\u06cb\u06c9\3\2\2\2\u06cc\u06cd\7\27"+
		"\2\2\u06cd\u06d1\7=\2\2\u06ce\u06d0\5\u00a2R\2\u06cf\u06ce\3\2\2\2\u06d0"+
		"\u06d3\3\2\2\2\u06d1\u06cf\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2\u06d4\3\2"+
		"\2\2\u06d3\u06d1\3\2\2\2\u06d4\u06d5\5z>\2\u06d5\u06d6\5v<\2\u06d6\u06d7"+
		"\7L\2\2\u06d7\u06d8\5\u01a4\u00d3\2\u06d8\u06d9\7>\2\2\u06d9\u06da\5\u010c"+
		"\u0087\2\u06da\u0145\3\2\2\2\u06db\u06dc\7\27\2\2\u06dc\u06e0\7=\2\2\u06dd"+
		"\u06df\5\u00a2R\2\u06de\u06dd\3\2\2\2\u06df\u06e2\3\2\2\2\u06e0\u06de"+
		"\3\2\2\2\u06e0\u06e1\3\2\2\2\u06e1\u06e3\3\2\2\2\u06e2\u06e0\3\2\2\2\u06e3"+
		"\u06e4\5z>\2\u06e4\u06e5\5v<\2\u06e5\u06e6\7L\2\2\u06e6\u06e7\5\u01a4"+
		"\u00d3\2\u06e7\u06e8\7>\2\2\u06e8\u06e9\5\u010e\u0088\2\u06e9\u0147\3"+
		"\2\2\2\u06ea\u06ec\7\6\2\2\u06eb\u06ed\7j\2\2\u06ec\u06eb\3\2\2\2\u06ec"+
		"\u06ed\3\2\2\2\u06ed\u06ee\3\2\2\2\u06ee\u06ef\7C\2\2\u06ef\u0149\3\2"+
		"\2\2\u06f0\u06f2\7\r\2\2\u06f1\u06f3\7j\2\2\u06f2\u06f1\3\2\2\2\u06f2"+
		"\u06f3\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u06f5\7C\2\2\u06f5\u014b\3\2"+
		"\2\2\u06f6\u06f8\7&\2\2\u06f7\u06f9\5\u01a4\u00d3\2\u06f8\u06f7\3\2\2"+
		"\2\u06f8\u06f9\3\2\2\2\u06f9\u06fa\3\2\2\2\u06fa\u06fb\7C\2\2\u06fb\u014d"+
		"\3\2\2\2\u06fc\u06fd\7.\2\2\u06fd\u06fe\5\u01a4\u00d3\2\u06fe\u06ff\7"+
		"C\2\2\u06ff\u014f\3\2\2\2\u0700\u0701\7,\2\2\u0701\u0702\7=\2\2\u0702"+
		"\u0703\5\u01a4\u00d3\2\u0703\u0704\7>\2\2\u0704\u0705\5\u0102\u0082\2"+
		"\u0705\u0151\3\2\2\2\u0706\u0707\7\61\2\2\u0707\u0708\5\u0102\u0082\2"+
		"\u0708\u0709\5\u0154\u00ab\2\u0709\u0713\3\2\2\2\u070a\u070b\7\61\2\2"+
		"\u070b\u070d\5\u0102\u0082\2\u070c\u070e\5\u0154\u00ab\2\u070d\u070c\3"+
		"\2\2\2\u070d\u070e\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u0710\5\u015c\u00af"+
		"\2\u0710\u0713\3\2\2\2\u0711\u0713\5\u015e\u00b0\2\u0712\u0706\3\2\2\2"+
		"\u0712\u070a\3\2\2\2\u0712\u0711\3\2\2\2\u0713\u0153\3\2\2\2\u0714\u0718"+
		"\5\u0156\u00ac\2\u0715\u0717\5\u0156\u00ac\2\u0716\u0715\3\2\2\2\u0717"+
		"\u071a\3\2\2\2\u0718\u0716\3\2\2\2\u0718\u0719\3\2\2\2\u0719\u0155\3\2"+
		"\2\2\u071a\u0718\3\2\2\2\u071b\u071c\7\t\2\2\u071c\u071d\7=\2\2\u071d"+
		"\u071e\5\u0158\u00ad\2\u071e\u071f\7>\2\2\u071f\u0720\5\u0102\u0082\2"+
		"\u0720\u0157\3\2\2\2\u0721\u0723\5\u00a2R\2\u0722\u0721\3\2\2\2\u0723"+
		"\u0726\3\2\2\2\u0724\u0722\3\2\2\2\u0724\u0725\3\2\2\2\u0725\u0727\3\2"+
		"\2\2\u0726\u0724\3\2\2\2\u0727\u0728\5\u015a\u00ae\2\u0728\u0729\5v<\2"+
		"\u0729\u0159\3\2\2\2\u072a\u072f\5\u0082B\2\u072b\u072c\7Z\2\2\u072c\u072e"+
		"\5\26\f\2\u072d\u072b\3\2\2\2\u072e\u0731\3\2\2\2\u072f\u072d\3\2\2\2"+
		"\u072f\u0730\3\2\2\2\u0730\u015b\3\2\2\2\u0731\u072f\3\2\2\2\u0732\u0733"+
		"\7\25\2\2\u0733\u0734\5\u0102\u0082\2\u0734\u015d\3\2\2\2\u0735\u0736"+
		"\7\61\2\2\u0736\u0737\5\u0160\u00b1\2\u0737\u0739\5\u0102\u0082\2\u0738"+
		"\u073a\5\u0154\u00ab\2\u0739\u0738\3\2\2\2\u0739\u073a\3\2\2\2\u073a\u073c"+
		"\3\2\2\2\u073b\u073d\5\u015c\u00af\2\u073c\u073b\3\2\2\2\u073c\u073d\3"+
		"\2\2\2\u073d\u015f\3\2\2\2\u073e\u073f\7=\2\2\u073f\u0741\5\u0162\u00b2"+
		"\2\u0740\u0742\7C\2\2\u0741\u0740\3\2\2\2\u0741\u0742\3\2\2\2\u0742\u0743"+
		"\3\2\2\2\u0743\u0744\7>\2\2\u0744\u0161\3\2\2\2\u0745\u074a\5\u0164\u00b3"+
		"\2\u0746\u0747\7C\2\2\u0747\u0749\5\u0164\u00b3\2\u0748\u0746\3\2\2\2"+
		"\u0749\u074c\3\2\2\2\u074a\u0748\3\2\2\2\u074a\u074b\3\2\2\2\u074b\u0163"+
		"\3\2\2\2\u074c\u074a\3\2\2\2\u074d\u074f\5\u00a2R\2\u074e\u074d\3\2\2"+
		"\2\u074f\u0752\3\2\2\2\u0750\u074e\3\2\2\2\u0750\u0751\3\2\2\2\u0751\u0753"+
		"\3\2\2\2\u0752\u0750\3\2\2\2\u0753\u0754\5z>\2\u0754\u0755\5v<\2\u0755"+
		"\u0756\7F\2\2\u0756\u0757\5\u01a4\u00d3\2\u0757\u0165\3\2\2\2\u0758\u075b"+
		"\5\u0174\u00bb\2\u0759\u075b\5\u019c\u00cf\2\u075a\u0758\3\2\2\2\u075a"+
		"\u0759\3\2\2\2\u075b\u075f\3\2\2\2\u075c\u075e\5\u016e\u00b8\2\u075d\u075c"+
		"\3\2\2\2\u075e\u0761\3\2\2\2\u075f\u075d\3\2\2\2\u075f\u0760\3\2\2\2\u0760"+
		"\u0167\3\2\2\2\u0761\u075f\3\2\2\2\u0762\u0780\5\2\2\2\u0763\u0768\5<"+
		"\37\2\u0764\u0765\7A\2\2\u0765\u0767\7B\2\2\u0766\u0764\3\2\2\2\u0767"+
		"\u076a\3\2\2\2\u0768\u0766\3\2\2\2\u0768\u0769\3\2\2\2\u0769\u076b\3\2"+
		"\2\2\u076a\u0768\3\2\2\2\u076b\u076c\7E\2\2\u076c\u076d\7\13\2\2\u076d"+
		"\u0780\3\2\2\2\u076e\u076f\7\62\2\2\u076f\u0770\7E\2\2\u0770\u0780\7\13"+
		"\2\2\u0771\u0780\7-\2\2\u0772\u0773\5<\37\2\u0773\u0774\7E\2\2\u0774\u0775"+
		"\7-\2\2\u0775\u0780\3\2\2\2\u0776\u0777\7=\2\2\u0777\u0778\5\u01a4\u00d3"+
		"\2\u0778\u0779\7>\2\2\u0779\u0780\3\2\2\2\u077a\u0780\5\u017a\u00be\2"+
		"\u077b\u0780\5\u0182\u00c2\2\u077c\u0780\5\u0188\u00c5\2\u077d\u0780\5"+
		"\u018e\u00c8\2\u077e\u0780\5\u0196\u00cc\2\u077f\u0762\3\2\2\2\u077f\u0763"+
		"\3\2\2\2\u077f\u076e\3\2\2\2\u077f\u0771\3\2\2\2\u077f\u0772\3\2\2\2\u077f"+
		"\u0776\3\2\2\2\u077f\u077a\3\2\2\2\u077f\u077b\3\2\2\2\u077f\u077c\3\2"+
		"\2\2\u077f\u077d\3\2\2\2\u077f\u077e\3\2\2\2\u0780\u0169\3\2\2\2\u0781"+
		"\u0782\3\2\2\2\u0782\u016b\3\2\2\2\u0783\u07a0\5\2\2\2\u0784\u0789\5<"+
		"\37\2\u0785\u0786\7A\2\2\u0786\u0788\7B\2\2\u0787\u0785\3\2\2\2\u0788"+
		"\u078b\3\2\2\2\u0789\u0787\3\2\2\2\u0789\u078a\3\2\2\2\u078a\u078c\3\2"+
		"\2\2\u078b\u0789\3\2\2\2\u078c\u078d\7E\2\2\u078d\u078e\7\13\2\2\u078e"+
		"\u07a0\3\2\2\2\u078f\u0790\7\62\2\2\u0790\u0791\7E\2\2\u0791\u07a0\7\13"+
		"\2\2\u0792\u07a0\7-\2\2\u0793\u0794\5<\37\2\u0794\u0795\7E\2\2\u0795\u0796"+
		"\7-\2\2\u0796\u07a0\3\2\2\2\u0797\u0798\7=\2\2\u0798\u0799\5\u01a4\u00d3"+
		"\2\u0799\u079a\7>\2\2\u079a\u07a0\3\2\2\2\u079b\u07a0\5\u017a\u00be\2"+
		"\u079c\u07a0\5\u0182\u00c2\2\u079d\u07a0\5\u018e\u00c8\2\u079e\u07a0\5"+
		"\u0196\u00cc\2\u079f\u0783\3\2\2\2\u079f\u0784\3\2\2\2\u079f\u078f\3\2"+
		"\2\2\u079f\u0792\3\2\2\2\u079f\u0793\3\2\2\2\u079f\u0797\3\2\2\2\u079f"+
		"\u079b\3\2\2\2\u079f\u079c\3\2\2\2\u079f\u079d\3\2\2\2\u079f\u079e\3\2"+
		"\2\2\u07a0\u016d\3\2\2\2\u07a1\u07a7\5\u017c\u00bf\2\u07a2\u07a7\5\u0184"+
		"\u00c3\2\u07a3\u07a7\5\u018a\u00c6\2\u07a4\u07a7\5\u0190\u00c9\2\u07a5"+
		"\u07a7\5\u0198\u00cd\2\u07a6\u07a1\3\2\2\2\u07a6\u07a2\3\2\2\2\u07a6\u07a3"+
		"\3\2\2\2\u07a6\u07a4\3\2\2\2\u07a6\u07a5\3\2\2\2\u07a7\u016f\3\2\2\2\u07a8"+
		"\u07a9\3\2\2\2\u07a9\u0171\3\2\2\2\u07aa\u07af\5\u017c\u00bf\2\u07ab\u07af"+
		"\5\u0184\u00c3\2\u07ac\u07af\5\u0190\u00c9\2\u07ad\u07af\5\u0198\u00cd"+
		"\2\u07ae\u07aa\3\2\2\2\u07ae\u07ab\3\2\2\2\u07ae\u07ac\3\2\2\2\u07ae\u07ad"+
		"\3\2\2\2\u07af\u0173\3\2\2\2\u07b0\u07d9\5\2\2\2\u07b1\u07b6\5<\37\2\u07b2"+
		"\u07b3\7A\2\2\u07b3\u07b5\7B\2\2\u07b4\u07b2\3\2\2\2\u07b5\u07b8\3\2\2"+
		"\2\u07b6\u07b4\3\2\2\2\u07b6\u07b7\3\2\2\2\u07b7\u07b9\3\2\2\2\u07b8\u07b6"+
		"\3\2\2\2\u07b9\u07ba\7E\2\2\u07ba\u07bb\7\13\2\2\u07bb\u07d9\3\2\2\2\u07bc"+
		"\u07c1\5|?\2\u07bd\u07be\7A\2\2\u07be\u07c0\7B\2\2\u07bf\u07bd\3\2\2\2"+
		"\u07c0\u07c3\3\2\2\2\u07c1\u07bf\3\2\2\2\u07c1\u07c2\3\2\2\2\u07c2\u07c4"+
		"\3\2\2\2\u07c3\u07c1\3\2\2\2\u07c4\u07c5\7E\2\2\u07c5\u07c6\7\13\2\2\u07c6"+
		"\u07d9\3\2\2\2\u07c7\u07c8\7\62\2\2\u07c8\u07c9\7E\2\2\u07c9\u07d9\7\13"+
		"\2\2\u07ca\u07d9\7-\2\2\u07cb\u07cc\5<\37\2\u07cc\u07cd\7E\2\2\u07cd\u07ce"+
		"\7-\2\2\u07ce\u07d9\3\2\2\2\u07cf\u07d0\7=\2\2\u07d0\u07d1\5\u01a4\u00d3"+
		"\2\u07d1\u07d2\7>\2\2\u07d2\u07d9\3\2\2\2\u07d3\u07d9\5\u017e\u00c0\2"+
		"\u07d4\u07d9\5\u0186\u00c4\2\u07d5\u07d9\5\u018c\u00c7\2\u07d6\u07d9\5"+
		"\u0192\u00ca\2\u07d7\u07d9\5\u019a\u00ce\2\u07d8\u07b0\3\2\2\2\u07d8\u07b1"+
		"\3\2\2\2\u07d8\u07bc\3\2\2\2\u07d8\u07c7\3\2\2\2\u07d8\u07ca\3\2\2\2\u07d8"+
		"\u07cb\3\2\2\2\u07d8\u07cf\3\2\2\2\u07d8\u07d3\3\2\2\2\u07d8\u07d4\3\2"+
		"\2\2\u07d8\u07d5\3\2\2\2\u07d8\u07d6\3\2\2\2\u07d8\u07d7\3\2\2\2\u07d9"+
		"\u0175\3\2\2\2\u07da\u07db\3\2\2\2\u07db\u0177\3\2\2\2\u07dc\u0804\5\2"+
		"\2\2\u07dd\u07e2\5<\37\2\u07de\u07df\7A\2\2\u07df\u07e1\7B\2\2\u07e0\u07de"+
		"\3\2\2\2\u07e1\u07e4\3\2\2\2\u07e2\u07e0\3\2\2\2\u07e2\u07e3\3\2\2\2\u07e3"+
		"\u07e5\3\2\2\2\u07e4\u07e2\3\2\2\2\u07e5\u07e6\7E\2\2\u07e6\u07e7\7\13"+
		"\2\2\u07e7\u0804\3\2\2\2\u07e8\u07ed\5|?\2\u07e9\u07ea\7A\2\2\u07ea\u07ec"+
		"\7B\2\2\u07eb\u07e9\3\2\2\2\u07ec\u07ef\3\2\2\2\u07ed\u07eb\3\2\2\2\u07ed"+
		"\u07ee\3\2\2\2\u07ee\u07f0\3\2\2\2\u07ef\u07ed\3\2\2\2\u07f0\u07f1\7E"+
		"\2\2\u07f1\u07f2\7\13\2\2\u07f2\u0804\3\2\2\2\u07f3\u07f4\7\62\2\2\u07f4"+
		"\u07f5\7E\2\2\u07f5\u0804\7\13\2\2\u07f6\u0804\7-\2\2\u07f7\u07f8\5<\37"+
		"\2\u07f8\u07f9\7E\2\2\u07f9\u07fa\7-\2\2\u07fa\u0804\3\2\2\2\u07fb\u07fc"+
		"\7=\2\2\u07fc\u07fd\5\u01a4\u00d3\2\u07fd\u07fe\7>\2\2\u07fe\u0804\3\2"+
		"\2\2\u07ff\u0804\5\u017e\u00c0\2\u0800\u0804\5\u0186\u00c4\2\u0801\u0804"+
		"\5\u0192\u00ca\2\u0802\u0804\5\u019a\u00ce\2\u0803\u07dc\3\2\2\2\u0803"+
		"\u07dd\3\2\2\2\u0803\u07e8\3\2\2\2\u0803\u07f3\3\2\2\2\u0803\u07f6\3\2"+
		"\2\2\u0803\u07f7\3\2\2\2\u0803\u07fb\3\2\2\2\u0803\u07ff\3\2\2\2\u0803"+
		"\u0800\3\2\2\2\u0803\u0801\3\2\2\2\u0803\u0802\3\2\2\2\u0804\u0179\3\2"+
		"\2\2\u0805\u0807\7!\2\2\u0806\u0808\5\60\31\2\u0807\u0806\3\2\2\2\u0807"+
		"\u0808\3\2\2\2\u0808\u080c\3\2\2\2\u0809\u080b\5\u00ecw\2\u080a\u0809"+
		"\3\2\2\2\u080b\u080e\3\2\2\2\u080c\u080a\3\2\2\2\u080c\u080d\3\2\2\2\u080d"+
		"\u080f\3\2\2\2\u080e\u080c\3\2\2\2\u080f\u081a\7j\2\2\u0810\u0814\7E\2"+
		"\2\u0811\u0813\5\u00ecw\2\u0812\u0811\3\2\2\2\u0813\u0816\3\2\2\2\u0814"+
		"\u0812\3\2\2\2\u0814\u0815\3\2\2\2\u0815\u0817\3\2\2\2\u0816\u0814\3\2"+
		"\2\2\u0817\u0819\7j\2\2\u0818\u0810\3\2\2\2\u0819\u081c\3\2\2\2\u081a"+
		"\u0818\3\2\2\2\u081a\u081b\3\2\2\2\u081b\u081e\3\2\2\2\u081c\u081a\3\2"+
		"\2\2\u081d\u081f\5\u0180\u00c1\2\u081e\u081d\3\2\2\2\u081e\u081f\3\2\2"+
		"\2\u081f\u0820\3\2\2\2\u0820\u0822\7=\2\2\u0821\u0823\5\u0194\u00cb\2"+
		"\u0822\u0821\3\2\2\2\u0822\u0823\3\2\2\2\u0823\u0824\3\2\2\2\u0824\u0826"+
		"\7>\2\2\u0825\u0827\5h\65\2\u0826\u0825\3\2\2\2\u0826\u0827\3\2\2\2\u0827"+
		"\u0859\3\2\2\2\u0828\u0829\5@!\2\u0829\u082a\7E\2\2\u082a\u082c\7!\2\2"+
		"\u082b\u082d\5\60\31\2\u082c\u082b\3\2\2\2\u082c\u082d\3\2\2\2\u082d\u0831"+
		"\3\2\2\2\u082e\u0830\5\u00ecw\2\u082f\u082e\3\2\2\2\u0830\u0833\3\2\2"+
		"\2\u0831\u082f\3\2\2\2\u0831\u0832\3\2\2\2\u0832\u0834\3\2\2\2\u0833\u0831"+
		"\3\2\2\2\u0834\u0836\7j\2\2\u0835\u0837\5\u0180\u00c1\2\u0836\u0835\3"+
		"\2\2\2\u0836\u0837\3\2\2\2\u0837\u0838\3\2\2\2\u0838\u083a\7=\2\2\u0839"+
		"\u083b\5\u0194\u00cb\2\u083a\u0839\3\2\2\2\u083a\u083b\3\2\2\2\u083b\u083c"+
		"\3\2\2\2\u083c\u083e\7>\2\2\u083d\u083f\5h\65\2\u083e\u083d\3\2\2\2\u083e"+
		"\u083f\3\2\2\2\u083f\u0859\3\2\2\2\u0840\u0841\5\u0166\u00b4\2\u0841\u0842"+
		"\7E\2\2\u0842\u0844\7!\2\2\u0843\u0845\5\60\31\2\u0844\u0843\3\2\2\2\u0844"+
		"\u0845\3\2\2\2\u0845\u0849\3\2\2\2\u0846\u0848\5\u00ecw\2\u0847\u0846"+
		"\3\2\2\2\u0848\u084b\3\2\2\2\u0849\u0847\3\2\2\2\u0849\u084a\3\2\2\2\u084a"+
		"\u084c\3\2\2\2\u084b\u0849\3\2\2\2\u084c\u084e\7j\2\2\u084d\u084f\5\u0180"+
		"\u00c1\2\u084e\u084d\3\2\2\2\u084e\u084f\3\2\2\2\u084f\u0850\3\2\2\2\u0850"+
		"\u0852\7=\2\2\u0851\u0853\5\u0194\u00cb\2\u0852\u0851\3\2\2\2\u0852\u0853"+
		"\3\2\2\2\u0853\u0854\3\2\2\2\u0854\u0856\7>\2\2\u0855\u0857\5h\65\2\u0856"+
		"\u0855\3\2\2\2\u0856\u0857\3\2\2\2\u0857\u0859\3\2\2\2\u0858\u0805\3\2"+
		"\2\2\u0858\u0828\3\2\2\2\u0858\u0840\3\2\2\2\u0859\u017b\3\2\2\2\u085a"+
		"\u085b\7E\2\2\u085b\u085d\7!\2\2\u085c\u085e\5\60\31\2\u085d\u085c\3\2"+
		"\2\2\u085d\u085e\3\2\2\2\u085e\u0862\3\2\2\2\u085f\u0861\5\u00ecw\2\u0860"+
		"\u085f\3\2\2\2\u0861\u0864\3\2\2\2\u0862\u0860\3\2\2\2\u0862\u0863\3\2"+
		"\2\2\u0863\u0865\3\2\2\2\u0864\u0862\3\2\2\2\u0865\u0867\7j\2\2\u0866"+
		"\u0868\5\u0180\u00c1\2\u0867\u0866\3\2\2\2\u0867\u0868\3\2\2\2\u0868\u0869"+
		"\3\2\2\2\u0869\u086b\7=\2\2\u086a\u086c\5\u0194\u00cb\2\u086b\u086a\3"+
		"\2\2\2\u086b\u086c\3\2\2\2\u086c\u086d\3\2\2\2\u086d\u086f\7>\2\2\u086e"+
		"\u0870\5h\65\2\u086f\u086e\3\2\2\2\u086f\u0870\3\2\2\2\u0870\u017d\3\2"+
		"\2\2\u0871\u0873\7!\2\2\u0872\u0874\5\60\31\2\u0873\u0872\3\2\2\2\u0873"+
		"\u0874\3\2\2\2\u0874\u0878\3\2\2\2\u0875\u0877\5\u00ecw\2\u0876\u0875"+
		"\3\2\2\2\u0877\u087a\3\2\2\2\u0878\u0876\3\2\2\2\u0878\u0879\3\2\2\2\u0879"+
		"\u087b\3\2\2\2\u087a\u0878\3\2\2\2\u087b\u0886\7j\2\2\u087c\u0880\7E\2"+
		"\2\u087d\u087f\5\u00ecw\2\u087e\u087d\3\2\2\2\u087f\u0882\3\2\2\2\u0880"+
		"\u087e\3\2\2\2\u0880\u0881\3\2\2\2\u0881\u0883\3\2\2\2\u0882\u0880\3\2"+
		"\2\2\u0883\u0885\7j\2\2\u0884\u087c\3\2\2\2\u0885\u0888\3\2\2\2\u0886"+
		"\u0884\3\2\2\2\u0886\u0887\3\2\2\2\u0887\u088a\3\2\2\2\u0888\u0886\3\2"+
		"\2\2\u0889\u088b\5\u0180\u00c1\2\u088a\u0889\3\2\2\2\u088a\u088b\3\2\2"+
		"\2\u088b\u088c\3\2\2\2\u088c\u088e\7=\2\2\u088d\u088f\5\u0194\u00cb\2"+
		"\u088e\u088d\3\2\2\2\u088e\u088f\3\2\2\2\u088f\u0890\3\2\2\2\u0890\u0892"+
		"\7>\2\2\u0891\u0893\5h\65\2\u0892\u0891\3\2\2\2\u0892\u0893\3\2\2\2\u0893"+
		"\u08ad\3\2\2\2\u0894\u0895\5@!\2\u0895\u0896\7E\2\2\u0896\u0898\7!\2\2"+
		"\u0897\u0899\5\60\31\2\u0898\u0897\3\2\2\2\u0898\u0899\3\2\2\2\u0899\u089d"+
		"\3\2\2\2\u089a\u089c\5\u00ecw\2\u089b\u089a\3\2\2\2\u089c\u089f\3\2\2"+
		"\2\u089d\u089b\3\2\2\2\u089d\u089e\3\2\2\2\u089e\u08a0\3\2\2\2\u089f\u089d"+
		"\3\2\2\2\u08a0\u08a2\7j\2\2\u08a1\u08a3\5\u0180\u00c1\2\u08a2\u08a1\3"+
		"\2\2\2\u08a2\u08a3\3\2\2\2\u08a3\u08a4\3\2\2\2\u08a4\u08a6\7=\2\2\u08a5"+
		"\u08a7\5\u0194\u00cb\2\u08a6\u08a5\3\2\2\2\u08a6\u08a7\3\2\2\2\u08a7\u08a8"+
		"\3\2\2\2\u08a8\u08aa\7>\2\2\u08a9\u08ab\5h\65\2\u08aa\u08a9\3\2\2\2\u08aa"+
		"\u08ab\3\2\2\2\u08ab\u08ad\3\2\2\2\u08ac\u0871\3\2\2\2\u08ac\u0894\3\2"+
		"\2\2\u08ad\u017f\3\2\2\2\u08ae\u08b2\5\60\31\2\u08af\u08b0\7H\2\2\u08b0"+
		"\u08b2\7G\2\2\u08b1\u08ae\3\2\2\2\u08b1\u08af\3\2\2\2\u08b2\u0181\3\2"+
		"\2\2\u08b3\u08b4\5\u0166\u00b4\2\u08b4\u08b5\7E\2\2\u08b5\u08b6\7j\2\2"+
		"\u08b6\u08c1\3\2\2\2\u08b7\u08b8\7*\2\2\u08b8\u08b9\7E\2\2\u08b9\u08c1"+
		"\7j\2\2\u08ba\u08bb\5<\37\2\u08bb\u08bc\7E\2\2\u08bc\u08bd\7*\2\2\u08bd"+
		"\u08be\7E\2\2\u08be\u08bf\7j\2\2\u08bf\u08c1\3\2\2\2\u08c0\u08b3\3\2\2"+
		"\2\u08c0\u08b7\3\2\2\2\u08c0\u08ba\3\2\2\2\u08c1\u0183\3\2\2\2\u08c2\u08c3"+
		"\7E\2\2\u08c3\u08c4\7j\2\2\u08c4\u0185\3\2\2\2\u08c5\u08c6\7*\2\2\u08c6"+
		"\u08c7\7E\2\2\u08c7\u08cf\7j\2\2\u08c8\u08c9\5<\37\2\u08c9\u08ca\7E\2"+
		"\2\u08ca\u08cb\7*\2\2\u08cb\u08cc\7E\2\2\u08cc\u08cd\7j\2\2\u08cd\u08cf"+
		"\3\2\2\2\u08ce\u08c5\3\2\2\2\u08ce\u08c8\3\2\2\2\u08cf\u0187\3\2\2\2\u08d0"+
		"\u08d1\5@!\2\u08d1\u08d2\7A\2\2\u08d2\u08d3\5\u01a4\u00d3\2\u08d3\u08d4"+
		"\7B\2\2\u08d4\u08db\3\2\2\2\u08d5\u08d6\5\u016c\u00b7\2\u08d6\u08d7\7"+
		"A\2\2\u08d7\u08d8\5\u01a4\u00d3\2\u08d8\u08d9\7B\2\2\u08d9\u08db\3\2\2"+
		"\2\u08da\u08d0\3\2\2\2\u08da\u08d5\3\2\2\2\u08db\u08e3\3\2\2\2\u08dc\u08dd"+
		"\5\u016a\u00b6\2\u08dd\u08de\7A\2\2\u08de\u08df\5\u01a4\u00d3\2\u08df"+
		"\u08e0\7B\2\2\u08e0\u08e2\3\2\2\2\u08e1\u08dc\3\2\2\2\u08e2\u08e5\3\2"+
		"\2\2\u08e3\u08e1\3\2\2\2\u08e3\u08e4\3\2\2\2\u08e4\u0189\3\2\2\2\u08e5"+
		"\u08e3\3\2\2\2\u08e6\u08e7\5\u0172\u00ba\2\u08e7\u08e8\7A\2\2\u08e8\u08e9"+
		"\5\u01a4\u00d3\2\u08e9\u08ea\7B\2\2\u08ea\u08f2\3\2\2\2\u08eb\u08ec\5"+
		"\u0170\u00b9\2\u08ec\u08ed\7A\2\2\u08ed\u08ee\5\u01a4\u00d3\2\u08ee\u08ef"+
		"\7B\2\2\u08ef\u08f1\3\2\2\2\u08f0\u08eb\3\2\2\2\u08f1\u08f4\3\2\2\2\u08f2"+
		"\u08f0\3\2\2\2\u08f2\u08f3\3\2\2\2\u08f3\u018b\3\2\2\2\u08f4\u08f2\3\2"+
		"\2\2\u08f5\u08f6\5@!\2\u08f6\u08f7\7A\2\2\u08f7\u08f8\5\u01a4\u00d3\2"+
		"\u08f8\u08f9\7B\2\2\u08f9\u0900\3\2\2\2\u08fa\u08fb\5\u0178\u00bd\2\u08fb"+
		"\u08fc\7A\2\2\u08fc\u08fd\5\u01a4\u00d3\2\u08fd\u08fe\7B\2\2\u08fe\u0900"+
		"\3\2\2\2\u08ff\u08f5\3\2\2\2\u08ff\u08fa\3\2\2\2\u0900\u0908\3\2\2\2\u0901"+
		"\u0902\5\u0176\u00bc\2\u0902\u0903\7A\2\2\u0903\u0904\5\u01a4\u00d3\2"+
		"\u0904\u0905\7B\2\2\u0905\u0907\3\2\2\2\u0906\u0901\3\2\2\2\u0907\u090a"+
		"\3\2\2\2\u0908\u0906\3\2\2\2\u0908\u0909\3\2\2\2\u0909\u018d\3\2\2\2\u090a"+
		"\u0908\3\2\2\2\u090b\u090c\5B\"\2\u090c\u090e\7=\2\2\u090d\u090f\5\u0194"+
		"\u00cb\2\u090e\u090d\3\2\2\2\u090e\u090f\3\2\2\2\u090f\u0910\3\2\2\2\u0910"+
		"\u0911\7>\2\2\u0911\u0950\3\2\2\2\u0912\u0913\5<\37\2\u0913\u0915\7E\2"+
		"\2\u0914\u0916\5\60\31\2\u0915\u0914\3\2\2\2\u0915\u0916\3\2\2\2\u0916"+
		"\u0917\3\2\2\2\u0917\u0918\7j\2\2\u0918\u091a\7=\2\2\u0919\u091b\5\u0194"+
		"\u00cb\2\u091a\u0919\3\2\2\2\u091a\u091b\3\2\2\2\u091b\u091c\3\2\2\2\u091c"+
		"\u091d\7>\2\2\u091d\u0950\3\2\2\2\u091e\u091f\5@!\2\u091f\u0921\7E\2\2"+
		"\u0920\u0922\5\60\31\2\u0921\u0920\3\2\2\2\u0921\u0922\3\2\2\2\u0922\u0923"+
		"\3\2\2\2\u0923\u0924\7j\2\2\u0924\u0926\7=\2\2\u0925\u0927\5\u0194\u00cb"+
		"\2\u0926\u0925\3\2\2\2\u0926\u0927\3\2\2\2\u0927\u0928\3\2\2\2\u0928\u0929"+
		"\7>\2\2\u0929\u0950\3\2\2\2\u092a\u092b\5\u0166\u00b4\2\u092b\u092d\7"+
		"E\2\2\u092c\u092e\5\60\31\2\u092d\u092c\3\2\2\2\u092d\u092e\3\2\2\2\u092e"+
		"\u092f\3\2\2\2\u092f\u0930\7j\2\2\u0930\u0932\7=\2\2\u0931\u0933\5\u0194"+
		"\u00cb\2\u0932\u0931\3\2\2\2\u0932\u0933\3\2\2\2\u0933\u0934\3\2\2\2\u0934"+
		"\u0935\7>\2\2\u0935\u0950\3\2\2\2\u0936\u0937\7*\2\2\u0937\u0939\7E\2"+
		"\2\u0938\u093a\5\60\31\2\u0939\u0938\3\2\2\2\u0939\u093a\3\2\2\2\u093a"+
		"\u093b\3\2\2\2\u093b\u093c\7j\2\2\u093c\u093e\7=\2\2\u093d\u093f\5\u0194"+
		"\u00cb\2\u093e\u093d\3\2\2\2\u093e\u093f\3\2\2\2\u093f\u0940\3\2\2\2\u0940"+
		"\u0950\7>\2\2\u0941\u0942\5<\37\2\u0942\u0943\7E\2\2\u0943\u0944\7*\2"+
		"\2\u0944\u0946\7E\2\2\u0945\u0947\5\60\31\2\u0946\u0945\3\2\2\2\u0946"+
		"\u0947\3\2\2\2\u0947\u0948\3\2\2\2\u0948\u0949\7j\2\2\u0949\u094b\7=\2"+
		"\2\u094a\u094c\5\u0194\u00cb\2\u094b\u094a\3\2\2\2\u094b\u094c\3\2\2\2"+
		"\u094c\u094d\3\2\2\2\u094d\u094e\7>\2\2\u094e\u0950\3\2\2\2\u094f\u090b"+
		"\3\2\2\2\u094f\u0912\3\2\2\2\u094f\u091e\3\2\2\2\u094f\u092a\3\2\2\2\u094f"+
		"\u0936\3\2\2\2\u094f\u0941\3\2\2\2\u0950\u018f\3\2\2\2\u0951\u0953\7E"+
		"\2\2\u0952\u0954\5\60\31\2\u0953\u0952\3\2\2\2\u0953\u0954\3\2\2\2\u0954"+
		"\u0955\3\2\2\2\u0955\u0956\7j\2\2\u0956\u0958\7=\2\2\u0957\u0959\5\u0194"+
		"\u00cb\2\u0958\u0957\3\2\2\2\u0958\u0959\3\2\2\2\u0959\u095a\3\2\2\2\u095a"+
		"\u095b\7>\2\2\u095b\u0191\3\2\2\2\u095c\u095d\5B\"\2\u095d\u095f\7=\2"+
		"\2\u095e\u0960\5\u0194\u00cb\2\u095f\u095e\3\2\2\2\u095f\u0960\3\2\2\2"+
		"\u0960\u0961\3\2\2\2\u0961\u0962\7>\2\2\u0962\u0995\3\2\2\2\u0963\u0964"+
		"\5<\37\2\u0964\u0966\7E\2\2\u0965\u0967\5";
	private static final String _serializedATNSegment1 =
		"\60\31\2\u0966\u0965\3\2\2\2\u0966\u0967\3\2\2\2\u0967\u0968\3\2\2\2\u0968"+
		"\u0969\7j\2\2\u0969\u096b\7=\2\2\u096a\u096c\5\u0194\u00cb\2\u096b\u096a"+
		"\3\2\2\2\u096b\u096c\3\2\2\2\u096c\u096d\3\2\2\2\u096d\u096e\7>\2\2\u096e"+
		"\u0995\3\2\2\2\u096f\u0970\5@!\2\u0970\u0972\7E\2\2\u0971\u0973\5\60\31"+
		"\2\u0972\u0971\3\2\2\2\u0972\u0973\3\2\2\2\u0973\u0974\3\2\2\2\u0974\u0975"+
		"\7j\2\2\u0975\u0977\7=\2\2\u0976\u0978\5\u0194\u00cb\2\u0977\u0976\3\2"+
		"\2\2\u0977\u0978\3\2\2\2\u0978\u0979\3\2\2\2\u0979\u097a\7>\2\2\u097a"+
		"\u0995\3\2\2\2\u097b\u097c\7*\2\2\u097c\u097e\7E\2\2\u097d\u097f\5\60"+
		"\31\2\u097e\u097d\3\2\2\2\u097e\u097f\3\2\2\2\u097f\u0980\3\2\2\2\u0980"+
		"\u0981\7j\2\2\u0981\u0983\7=\2\2\u0982\u0984\5\u0194\u00cb\2\u0983\u0982"+
		"\3\2\2\2\u0983\u0984\3\2\2\2\u0984\u0985\3\2\2\2\u0985\u0995\7>\2\2\u0986"+
		"\u0987\5<\37\2\u0987\u0988\7E\2\2\u0988\u0989\7*\2\2\u0989\u098b\7E\2"+
		"\2\u098a\u098c\5\60\31\2\u098b\u098a\3\2\2\2\u098b\u098c\3\2\2\2\u098c"+
		"\u098d\3\2\2\2\u098d\u098e\7j\2\2\u098e\u0990\7=\2\2\u098f\u0991\5\u0194"+
		"\u00cb\2\u0990\u098f\3\2\2\2\u0990\u0991\3\2\2\2\u0991\u0992\3\2\2\2\u0992"+
		"\u0993\7>\2\2\u0993\u0995\3\2\2\2\u0994\u095c\3\2\2\2\u0994\u0963\3\2"+
		"\2\2\u0994\u096f\3\2\2\2\u0994\u097b\3\2\2\2\u0994\u0986\3\2\2\2\u0995"+
		"\u0193\3\2\2\2\u0996\u099b\5\u01a4\u00d3\2\u0997\u0998\7D\2\2\u0998\u099a"+
		"\5\u01a4\u00d3\2\u0999\u0997\3\2\2\2\u099a\u099d\3\2\2\2\u099b\u0999\3"+
		"\2\2\2\u099b\u099c\3\2\2\2\u099c\u0195\3\2\2\2\u099d\u099b\3\2\2\2\u099e"+
		"\u099f\5@!\2\u099f\u09a1\7^\2\2\u09a0\u09a2\5\60\31\2\u09a1\u09a0\3\2"+
		"\2\2\u09a1\u09a2\3\2\2\2\u09a2\u09a3\3\2\2\2\u09a3\u09a4\7j\2\2\u09a4"+
		"\u09ce\3\2\2\2\u09a5\u09a6\5\22\n\2\u09a6\u09a8\7^\2\2\u09a7\u09a9\5\60"+
		"\31\2\u09a8\u09a7\3\2\2\2\u09a8\u09a9\3\2\2\2\u09a9\u09aa\3\2\2\2\u09aa"+
		"\u09ab\7j\2\2\u09ab\u09ce\3\2\2\2\u09ac\u09ad\5\u0166\u00b4\2\u09ad\u09af"+
		"\7^\2\2\u09ae\u09b0\5\60\31\2\u09af\u09ae\3\2\2\2\u09af\u09b0\3\2\2\2"+
		"\u09b0\u09b1\3\2\2\2\u09b1\u09b2\7j\2\2\u09b2\u09ce\3\2\2\2\u09b3\u09b4"+
		"\7*\2\2\u09b4\u09b6\7^\2\2\u09b5\u09b7\5\60\31\2\u09b6\u09b5\3\2\2\2\u09b6"+
		"\u09b7\3\2\2\2\u09b7\u09b8\3\2\2\2\u09b8\u09ce\7j\2\2\u09b9\u09ba\5<\37"+
		"\2\u09ba\u09bb\7E\2\2\u09bb\u09bc\7*\2\2\u09bc\u09be\7^\2\2\u09bd\u09bf"+
		"\5\60\31\2\u09be\u09bd\3\2\2\2\u09be\u09bf\3\2\2\2\u09bf\u09c0\3\2\2\2"+
		"\u09c0\u09c1\7j\2\2\u09c1\u09ce\3\2\2\2\u09c2\u09c3\5\26\f\2\u09c3\u09c5"+
		"\7^\2\2\u09c4\u09c6\5\60\31\2\u09c5\u09c4\3\2\2\2\u09c5\u09c6\3\2\2\2"+
		"\u09c6\u09c7\3\2\2\2\u09c7\u09c8\7!\2\2\u09c8\u09ce\3\2\2\2\u09c9\u09ca"+
		"\5$\23\2\u09ca\u09cb\7^\2\2\u09cb\u09cc\7!\2\2\u09cc\u09ce\3\2\2\2\u09cd"+
		"\u099e\3\2\2\2\u09cd\u09a5\3\2\2\2\u09cd\u09ac\3\2\2\2\u09cd\u09b3\3\2"+
		"\2\2\u09cd\u09b9\3\2\2\2\u09cd\u09c2\3\2\2\2\u09cd\u09c9\3\2\2\2\u09ce"+
		"\u0197\3\2\2\2\u09cf\u09d1\7^\2\2\u09d0\u09d2\5\60\31\2\u09d1\u09d0\3"+
		"\2\2\2\u09d1\u09d2\3\2\2\2\u09d2\u09d3\3\2\2\2\u09d3\u09d4\7j\2\2\u09d4"+
		"\u0199\3\2\2\2\u09d5\u09d6\5@!\2\u09d6\u09d8\7^\2\2\u09d7\u09d9\5\60\31"+
		"\2\u09d8\u09d7\3\2\2\2\u09d8\u09d9\3\2\2\2\u09d9\u09da\3\2\2\2\u09da\u09db"+
		"\7j\2\2\u09db\u09fe\3\2\2\2\u09dc\u09dd\5\22\n\2\u09dd\u09df\7^\2\2\u09de"+
		"\u09e0\5\60\31\2\u09df\u09de\3\2\2\2\u09df\u09e0\3\2\2\2\u09e0\u09e1\3"+
		"\2\2\2\u09e1\u09e2\7j\2\2\u09e2\u09fe\3\2\2\2\u09e3\u09e4\7*\2\2\u09e4"+
		"\u09e6\7^\2\2\u09e5\u09e7\5\60\31\2\u09e6\u09e5\3\2\2\2\u09e6\u09e7\3"+
		"\2\2\2\u09e7\u09e8\3\2\2\2\u09e8\u09fe\7j\2\2\u09e9\u09ea\5<\37\2\u09ea"+
		"\u09eb\7E\2\2\u09eb\u09ec\7*\2\2\u09ec\u09ee\7^\2\2\u09ed\u09ef\5\60\31"+
		"\2\u09ee\u09ed\3\2\2\2\u09ee\u09ef\3\2\2\2\u09ef\u09f0\3\2\2\2\u09f0\u09f1"+
		"\7j\2\2\u09f1\u09fe\3\2\2\2\u09f2\u09f3\5\26\f\2\u09f3\u09f5\7^\2\2\u09f4"+
		"\u09f6\5\60\31\2\u09f5\u09f4\3\2\2\2\u09f5\u09f6\3\2\2\2\u09f6\u09f7\3"+
		"\2\2\2\u09f7\u09f8\7!\2\2\u09f8\u09fe\3\2\2\2\u09f9\u09fa\5$\23\2\u09fa"+
		"\u09fb\7^\2\2\u09fb\u09fc\7!\2\2\u09fc\u09fe\3\2\2\2\u09fd\u09d5\3\2\2"+
		"\2\u09fd\u09dc\3\2\2\2\u09fd\u09e3\3\2\2\2\u09fd\u09e9\3\2\2\2\u09fd\u09f2"+
		"\3\2\2\2\u09fd\u09f9\3\2\2\2\u09fe\u019b\3\2\2\2\u09ff\u0a00\7!\2\2\u0a00"+
		"\u0a01\5\n\6\2\u0a01\u0a03\5\u019e\u00d0\2\u0a02\u0a04\5&\24\2\u0a03\u0a02"+
		"\3\2\2\2\u0a03\u0a04\3\2\2\2\u0a04\u0a16\3\2\2\2\u0a05\u0a06\7!\2\2\u0a06"+
		"\u0a07\5\24\13\2\u0a07\u0a09\5\u019e\u00d0\2\u0a08\u0a0a\5&\24\2\u0a09"+
		"\u0a08\3\2\2\2\u0a09\u0a0a\3\2\2\2\u0a0a\u0a16\3\2\2\2\u0a0b\u0a0c\7!"+
		"\2\2\u0a0c\u0a0d\5\n\6\2\u0a0d\u0a0e\5&\24\2\u0a0e\u0a0f\5\u00fe\u0080"+
		"\2\u0a0f\u0a16\3\2\2\2\u0a10\u0a11\7!\2\2\u0a11\u0a12\5\24\13\2\u0a12"+
		"\u0a13\5&\24\2\u0a13\u0a14\5\u00fe\u0080\2\u0a14\u0a16\3\2\2\2\u0a15\u09ff"+
		"\3\2\2\2\u0a15\u0a05\3\2\2\2\u0a15\u0a0b\3\2\2\2\u0a15\u0a10\3\2\2\2\u0a16"+
		"\u019d\3\2\2\2\u0a17\u0a1b\5\u01a0\u00d1\2\u0a18\u0a1a\5\u01a0\u00d1\2"+
		"\u0a19\u0a18\3\2\2\2\u0a1a\u0a1d\3\2\2\2\u0a1b\u0a19\3\2\2\2\u0a1b\u0a1c"+
		"\3\2\2\2\u0a1c\u019f\3\2\2\2\u0a1d\u0a1b\3\2\2\2\u0a1e\u0a20\5\u00ecw"+
		"\2\u0a1f\u0a1e\3\2\2\2\u0a20\u0a23\3\2\2\2\u0a21\u0a1f\3\2\2\2\u0a21\u0a22"+
		"\3\2\2\2\u0a22\u0a24\3\2\2\2\u0a23\u0a21\3\2\2\2\u0a24\u0a25\7A\2\2\u0a25"+
		"\u0a26\5\u01a4\u00d3\2\u0a26\u0a27\7B\2\2\u0a27\u01a1\3\2\2\2\u0a28\u0a29"+
		"\5\u01a4\u00d3\2\u0a29\u01a3\3\2\2\2\u0a2a\u0a2d\5\u01a6\u00d4\2\u0a2b"+
		"\u0a2d\5\u01ae\u00d8\2\u0a2c\u0a2a\3\2\2\2\u0a2c\u0a2b\3\2\2\2\u0a2d\u01a5"+
		"\3\2\2\2\u0a2e\u0a2f\5\u01a8\u00d5\2\u0a2f\u0a30\7]\2\2\u0a30\u0a31\5"+
		"\u01ac\u00d7\2\u0a31\u01a7\3\2\2\2\u0a32\u0a3d\7j\2\2\u0a33\u0a35\7=\2"+
		"\2\u0a34\u0a36\5\u009cO\2\u0a35\u0a34\3\2\2\2\u0a35\u0a36\3\2\2\2\u0a36"+
		"\u0a37\3\2\2\2\u0a37\u0a3d\7>\2\2\u0a38\u0a39\7=\2\2\u0a39\u0a3a\5\u01aa"+
		"\u00d6\2\u0a3a\u0a3b\7>\2\2\u0a3b\u0a3d\3\2\2\2\u0a3c\u0a32\3\2\2\2\u0a3c"+
		"\u0a33\3\2\2\2\u0a3c\u0a38\3\2\2\2\u0a3d\u01a9\3\2\2\2\u0a3e\u0a43\7j"+
		"\2\2\u0a3f\u0a40\7D\2\2\u0a40\u0a42\7j\2\2\u0a41\u0a3f\3\2\2\2\u0a42\u0a45"+
		"\3\2\2\2\u0a43\u0a41\3\2\2\2\u0a43\u0a44\3\2\2\2\u0a44\u01ab\3\2\2\2\u0a45"+
		"\u0a43\3\2\2\2\u0a46\u0a49\5\u01a4\u00d3\2\u0a47\u0a49\5\u0102\u0082\2"+
		"\u0a48\u0a46\3\2\2\2\u0a48\u0a47\3\2\2\2\u0a49\u01ad\3\2\2\2\u0a4a\u0a4d"+
		"\5\u01b6\u00dc\2\u0a4b\u0a4d\5\u01b0\u00d9\2\u0a4c\u0a4a\3\2\2\2\u0a4c"+
		"\u0a4b\3\2\2\2\u0a4d\u01af\3\2\2\2\u0a4e\u0a4f\5\u01b2\u00da\2\u0a4f\u0a50"+
		"\5\u01b4\u00db\2\u0a50\u0a51\5\u01a4\u00d3\2\u0a51\u01b1\3\2\2\2\u0a52"+
		"\u0a56\5@!\2\u0a53\u0a56\5\u0182\u00c2\2\u0a54\u0a56\5\u0188\u00c5\2\u0a55"+
		"\u0a52\3\2\2\2\u0a55\u0a53\3\2\2\2\u0a55\u0a54\3\2\2\2\u0a56\u01b3\3\2"+
		"\2\2\u0a57\u0a58\t\4\2\2\u0a58\u01b5\3\2\2\2\u0a59\u0a61\5\u01b8\u00dd"+
		"\2\u0a5a\u0a5b\5\u01b8\u00dd\2\u0a5b\u0a5c\7K\2\2\u0a5c\u0a5d\5\u01a4"+
		"\u00d3\2\u0a5d\u0a5e\7L\2\2\u0a5e\u0a5f\5\u01b6\u00dc\2\u0a5f\u0a61\3"+
		"\2\2\2\u0a60\u0a59\3\2\2\2\u0a60\u0a5a\3\2\2\2\u0a61\u01b7\3\2\2\2\u0a62"+
		"\u0a63\b\u00dd\1\2\u0a63\u0a64\5\u01ba\u00de\2\u0a64\u0a6a\3\2\2\2\u0a65"+
		"\u0a66\f\3\2\2\u0a66\u0a67\7R\2\2\u0a67\u0a69\5\u01ba\u00de\2\u0a68\u0a65"+
		"\3\2\2\2\u0a69\u0a6c\3\2\2\2\u0a6a\u0a68\3\2\2\2\u0a6a\u0a6b\3\2\2\2\u0a6b"+
		"\u01b9\3\2\2\2\u0a6c\u0a6a\3\2\2\2\u0a6d\u0a6e\b\u00de\1\2\u0a6e\u0a6f"+
		"\5\u01bc\u00df\2\u0a6f\u0a75\3\2\2\2\u0a70\u0a71\f\3\2\2\u0a71\u0a72\7"+
		"Q\2\2\u0a72\u0a74\5\u01bc\u00df\2\u0a73\u0a70\3\2\2\2\u0a74\u0a77\3\2"+
		"\2\2\u0a75\u0a73\3\2\2\2\u0a75\u0a76\3\2\2\2\u0a76\u01bb\3\2\2\2\u0a77"+
		"\u0a75\3\2\2\2\u0a78\u0a79\b\u00df\1\2\u0a79\u0a7a\5\u01be\u00e0\2\u0a7a"+
		"\u0a80\3\2\2\2\u0a7b\u0a7c\f\3\2\2\u0a7c\u0a7d\7Z\2\2\u0a7d\u0a7f\5\u01be"+
		"\u00e0\2\u0a7e\u0a7b\3\2\2\2\u0a7f\u0a82\3\2\2\2\u0a80\u0a7e\3\2\2\2\u0a80"+
		"\u0a81\3\2\2\2\u0a81\u01bd\3\2\2\2\u0a82\u0a80\3\2\2\2\u0a83\u0a84\b\u00e0"+
		"\1\2\u0a84\u0a85\5\u01c0\u00e1\2\u0a85\u0a8b\3\2\2\2\u0a86\u0a87\f\3\2"+
		"\2\u0a87\u0a88\7[\2\2\u0a88\u0a8a\5\u01c0\u00e1\2\u0a89\u0a86\3\2\2\2"+
		"\u0a8a\u0a8d\3\2\2\2\u0a8b\u0a89\3\2\2\2\u0a8b\u0a8c\3\2\2\2\u0a8c\u01bf"+
		"\3\2\2\2\u0a8d\u0a8b\3\2\2\2\u0a8e\u0a8f\b\u00e1\1\2\u0a8f\u0a90\5\u01c2"+
		"\u00e2\2\u0a90\u0a96\3\2\2\2\u0a91\u0a92\f\3\2\2\u0a92\u0a93\7Y\2\2\u0a93"+
		"\u0a95\5\u01c2\u00e2\2\u0a94\u0a91\3\2\2\2\u0a95\u0a98\3\2\2\2\u0a96\u0a94"+
		"\3\2\2\2\u0a96\u0a97\3\2\2\2\u0a97\u01c1\3\2\2\2\u0a98\u0a96\3\2\2\2\u0a99"+
		"\u0a9a\b\u00e2\1\2\u0a9a\u0a9b\5\u01c4\u00e3\2\u0a9b\u0aa4\3\2\2\2\u0a9c"+
		"\u0a9d\f\4\2\2\u0a9d\u0a9e\7M\2\2\u0a9e\u0aa3\5\u01c4\u00e3\2\u0a9f\u0aa0"+
		"\f\3\2\2\u0aa0\u0aa1\7P\2\2\u0aa1\u0aa3\5\u01c4\u00e3\2\u0aa2\u0a9c\3"+
		"\2\2\2\u0aa2\u0a9f\3\2\2\2\u0aa3\u0aa6\3\2\2\2\u0aa4\u0aa2\3\2\2\2\u0aa4"+
		"\u0aa5\3\2\2\2\u0aa5\u01c3\3\2\2\2\u0aa6\u0aa4\3\2\2\2\u0aa7\u0aa8\b\u00e3"+
		"\1\2\u0aa8\u0aa9\5\u01c6\u00e4\2\u0aa9\u0abb\3\2\2\2\u0aaa\u0aab\f\7\2"+
		"\2\u0aab\u0aac\7H\2\2\u0aac\u0aba\5\u01c6\u00e4\2\u0aad\u0aae\f\6\2\2"+
		"\u0aae\u0aaf\7G\2\2\u0aaf\u0aba\5\u01c6\u00e4\2\u0ab0\u0ab1\f\5\2\2\u0ab1"+
		"\u0ab2\7N\2\2\u0ab2\u0aba\5\u01c6\u00e4\2\u0ab3\u0ab4\f\4\2\2\u0ab4\u0ab5"+
		"\7O\2\2\u0ab5\u0aba\5\u01c6\u00e4\2\u0ab6\u0ab7\f\3\2\2\u0ab7\u0ab8\7"+
		"\34\2\2\u0ab8\u0aba\5\22\n\2\u0ab9\u0aaa\3\2\2\2\u0ab9\u0aad\3\2\2\2\u0ab9"+
		"\u0ab0\3\2\2\2\u0ab9\u0ab3\3\2\2\2\u0ab9\u0ab6\3\2\2\2\u0aba\u0abd\3\2"+
		"\2\2\u0abb\u0ab9\3\2\2\2\u0abb\u0abc\3\2\2\2\u0abc\u01c5\3\2\2\2\u0abd"+
		"\u0abb\3\2\2\2\u0abe\u0abf\b\u00e4\1\2\u0abf\u0ac0\5\u01c8\u00e5\2\u0ac0"+
		"\u0ad0\3\2\2\2\u0ac1\u0ac2\f\5\2\2\u0ac2\u0ac3\7H\2\2\u0ac3\u0ac4\7H\2"+
		"\2\u0ac4\u0acf\5\u01c8\u00e5\2\u0ac5\u0ac6\f\4\2\2\u0ac6\u0ac7\7G\2\2"+
		"\u0ac7\u0ac8\7G\2\2\u0ac8\u0acf\5\u01c8\u00e5\2\u0ac9\u0aca\f\3\2\2\u0aca"+
		"\u0acb\7G\2\2\u0acb\u0acc\7G\2\2\u0acc\u0acd\7G\2\2\u0acd\u0acf\5\u01c8"+
		"\u00e5\2\u0ace\u0ac1\3\2\2\2\u0ace\u0ac5\3\2\2\2\u0ace\u0ac9\3\2\2\2\u0acf"+
		"\u0ad2\3\2\2\2\u0ad0\u0ace\3\2\2\2\u0ad0\u0ad1\3\2\2\2\u0ad1\u01c7\3\2"+
		"\2\2\u0ad2\u0ad0\3\2\2\2\u0ad3\u0ad4\b\u00e5\1\2\u0ad4\u0ad5\5\u01ca\u00e6"+
		"\2\u0ad5\u0ade\3\2\2\2\u0ad6\u0ad7\f\4\2\2\u0ad7\u0ad8\7U\2\2\u0ad8\u0add"+
		"\5\u01ca\u00e6\2\u0ad9\u0ada\f\3\2\2\u0ada\u0adb\7V\2\2\u0adb\u0add\5"+
		"\u01ca\u00e6\2\u0adc\u0ad6\3\2\2\2\u0adc\u0ad9\3\2\2\2\u0add\u0ae0\3\2"+
		"\2\2\u0ade\u0adc\3\2\2\2\u0ade\u0adf\3\2\2\2\u0adf\u01c9\3\2\2\2\u0ae0"+
		"\u0ade\3\2\2\2\u0ae1\u0ae2\b\u00e6\1\2\u0ae2\u0ae3\5\u01cc\u00e7\2\u0ae3"+
		"\u0aef\3\2\2\2\u0ae4\u0ae5\f\5\2\2\u0ae5\u0ae6\7W\2\2\u0ae6\u0aee\5\u01cc"+
		"\u00e7\2\u0ae7\u0ae8\f\4\2\2\u0ae8\u0ae9\7X\2\2\u0ae9\u0aee\5\u01cc\u00e7"+
		"\2\u0aea\u0aeb\f\3\2\2\u0aeb\u0aec\7\\\2\2\u0aec\u0aee\5\u01cc\u00e7\2"+
		"\u0aed\u0ae4\3\2\2\2\u0aed\u0ae7\3\2\2\2\u0aed\u0aea\3\2\2\2\u0aee\u0af1"+
		"\3\2\2\2\u0aef\u0aed\3\2\2\2\u0aef\u0af0\3\2\2\2\u0af0\u01cb\3\2\2\2\u0af1"+
		"\u0aef\3\2\2\2\u0af2\u0afa\5\u01ce\u00e8\2\u0af3\u0afa\5\u01d0\u00e9\2"+
		"\u0af4\u0af5\7U\2\2\u0af5\u0afa\5\u01cc\u00e7\2\u0af6\u0af7\7V\2\2\u0af7"+
		"\u0afa\5\u01cc\u00e7\2\u0af8\u0afa\5\u01d2\u00ea\2\u0af9\u0af2\3\2\2\2"+
		"\u0af9\u0af3\3\2\2\2\u0af9\u0af4\3\2\2\2\u0af9\u0af6\3\2\2\2\u0af9\u0af8"+
		"\3\2\2\2\u0afa\u01cd\3\2\2\2\u0afb\u0afc\7S\2\2\u0afc\u0afd\5\u01cc\u00e7"+
		"\2\u0afd\u01cf\3\2\2\2\u0afe\u0aff\7T\2\2\u0aff\u0b00\5\u01cc\u00e7\2"+
		"\u0b00\u01d1\3\2\2\2\u0b01\u0b08\5\u01d4\u00eb\2\u0b02\u0b03\7J\2\2\u0b03"+
		"\u0b08\5\u01cc\u00e7\2\u0b04\u0b05\7I\2\2\u0b05\u0b08\5\u01cc\u00e7\2"+
		"\u0b06\u0b08\5\u01de\u00f0\2\u0b07\u0b01\3\2\2\2\u0b07\u0b02\3\2\2\2\u0b07"+
		"\u0b04\3\2\2\2\u0b07\u0b06\3\2\2\2\u0b08\u01d3\3\2\2\2\u0b09\u0b0c\5\u0166"+
		"\u00b4\2\u0b0a\u0b0c\5@!\2\u0b0b\u0b09\3\2\2\2\u0b0b\u0b0a\3\2\2\2\u0b0c"+
		"\u0b11\3\2\2\2\u0b0d\u0b10\5\u01d8\u00ed\2\u0b0e\u0b10\5\u01dc\u00ef\2"+
		"\u0b0f\u0b0d\3\2\2\2\u0b0f\u0b0e\3\2\2\2\u0b10\u0b13\3\2\2\2\u0b11\u0b0f"+
		"\3\2\2\2\u0b11\u0b12\3\2\2\2\u0b12\u01d5\3\2\2\2\u0b13\u0b11\3\2\2\2\u0b14"+
		"\u0b15\5\u01d4\u00eb\2\u0b15\u0b16\7S\2\2\u0b16\u01d7\3\2\2\2\u0b17\u0b18"+
		"\7S\2\2\u0b18\u01d9\3\2\2\2\u0b19\u0b1a\5\u01d4\u00eb\2\u0b1a\u0b1b\7"+
		"T\2\2\u0b1b\u01db\3\2\2\2\u0b1c\u0b1d\7T\2\2\u0b1d\u01dd\3\2\2\2\u0b1e"+
		"\u0b1f\7=\2\2\u0b1f\u0b20\5\n\6\2\u0b20\u0b21\7>\2\2\u0b21\u0b22\5\u01cc"+
		"\u00e7\2\u0b22\u0b3a\3\2\2\2\u0b23\u0b24\7=\2\2\u0b24\u0b28\5\22\n\2\u0b25"+
		"\u0b27\5.\30\2\u0b26\u0b25\3\2\2\2\u0b27\u0b2a\3\2\2\2\u0b28\u0b26\3\2"+
		"\2\2\u0b28\u0b29\3\2\2\2\u0b29\u0b2b\3\2\2\2\u0b2a\u0b28\3\2\2\2\u0b2b"+
		"\u0b2c\7>\2\2\u0b2c\u0b2d\5\u01d2\u00ea\2\u0b2d\u0b3a\3\2\2\2\u0b2e\u0b2f"+
		"\7=\2\2\u0b2f\u0b33\5\22\n\2\u0b30\u0b32\5.\30\2\u0b31\u0b30\3\2\2\2\u0b32"+
		"\u0b35\3\2\2\2\u0b33\u0b31\3\2\2\2\u0b33\u0b34\3\2\2\2\u0b34\u0b36\3\2"+
		"\2\2\u0b35\u0b33\3\2\2\2\u0b36\u0b37\7>\2\2\u0b37\u0b38\5\u01a6\u00d4"+
		"\2\u0b38\u0b3a\3\2\2\2\u0b39\u0b1e\3\2\2\2\u0b39\u0b23\3\2\2\2\u0b39\u0b2e"+
		"\3\2\2\2\u0b3a\u01df\3\2\2\2\u0147\u01e8\u01f0\u01f5\u01fc\u0200\u0204"+
		"\u020d\u0211\u0215\u0217\u021d\u0222\u0229\u022e\u0230\u0236\u023b\u0240"+
		"\u0245\u0250\u025e\u0263\u026b\u0272\u0278\u027d\u0288\u028b\u0299\u029e"+
		"\u02a3\u02a8\u02ae\u02b8\u02c0\u02ca\u02d2\u02de\u02e2\u02e7\u02ed\u02f5"+
		"\u02fe\u0309\u0326\u032a\u032f\u0335\u0338\u033b\u0347\u0352\u0360\u0367"+
		"\u0370\u0377\u037c\u038b\u0392\u0398\u039c\u03a0\u03a4\u03a8\u03ad\u03b1"+
		"\u03b5\u03b7\u03bc\u03c3\u03c8\u03ca\u03d0\u03d5\u03d9\u03ec\u03f1\u0401"+
		"\u0406\u040c\u0412\u0414\u0418\u041d\u0421\u0428\u042f\u0437\u043a\u043f"+
		"\u0447\u044c\u0453\u045a\u045f\u0465\u0471\u0476\u047a\u0484\u0489\u0491"+
		"\u0494\u0499\u04a1\u04a4\u04a9\u04ae\u04b3\u04b8\u04bf\u04c4\u04cc\u04d1"+
		"\u04d6\u04db\u04e1\u04e7\u04ea\u04ed\u04f6\u04fc\u0502\u0505\u0508\u0510"+
		"\u0515\u051a\u0520\u0523\u052e\u0537\u0541\u0546\u0551\u0556\u0562\u0567"+
		"\u0573\u057d\u0582\u058a\u058d\u0594\u059c\u05a2\u05ab\u05b5\u05b9\u05bc"+
		"\u05c5\u05d3\u05d6\u05df\u05e4\u05ec\u05f2\u05fa\u0606\u060d\u061b\u0631"+
		"\u0653\u065f\u0665\u0671\u067e\u0698\u069c\u06a1\u06a5\u06a9\u06b1\u06b5"+
		"\u06b9\u06c0\u06c9\u06d1\u06e0\u06ec\u06f2\u06f8\u070d\u0712\u0718\u0724"+
		"\u072f\u0739\u073c\u0741\u074a\u0750\u075a\u075f\u0768\u077f\u0789\u079f"+
		"\u07a6\u07ae\u07b6\u07c1\u07d8\u07e2\u07ed\u0803\u0807\u080c\u0814\u081a"+
		"\u081e\u0822\u0826\u082c\u0831\u0836\u083a\u083e\u0844\u0849\u084e\u0852"+
		"\u0856\u0858\u085d\u0862\u0867\u086b\u086f\u0873\u0878\u0880\u0886\u088a"+
		"\u088e\u0892\u0898\u089d\u08a2\u08a6\u08aa\u08ac\u08b1\u08c0\u08ce\u08da"+
		"\u08e3\u08f2\u08ff\u0908\u090e\u0915\u091a\u0921\u0926\u092d\u0932\u0939"+
		"\u093e\u0946\u094b\u094f\u0953\u0958\u095f\u0966\u096b\u0972\u0977\u097e"+
		"\u0983\u098b\u0990\u0994\u099b\u09a1\u09a8\u09af\u09b6\u09be\u09c5\u09cd"+
		"\u09d1\u09d8\u09df\u09e6\u09ee\u09f5\u09fd\u0a03\u0a09\u0a15\u0a1b\u0a21"+
		"\u0a2c\u0a35\u0a3c\u0a43\u0a48\u0a4c\u0a55\u0a60\u0a6a\u0a75\u0a80\u0a8b"+
		"\u0a96\u0aa2\u0aa4\u0ab9\u0abb\u0ace\u0ad0\u0adc\u0ade\u0aed\u0aef\u0af9"+
		"\u0b07\u0b0b\u0b0f\u0b11\u0b28\u0b33\u0b39";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}