// Generated from D:\Documentos\GitHub\Trab_comp1\T1\src\t1\Lua.g4 by ANTLR 4.1

   package t1;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LuaParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__46=1, T__45=2, T__44=3, T__43=4, T__42=5, T__41=6, T__40=7, T__39=8, 
		T__38=9, T__37=10, T__36=11, T__35=12, T__34=13, T__33=14, T__32=15, T__31=16, 
		T__30=17, T__29=18, T__28=19, T__27=20, T__26=21, T__25=22, T__24=23, 
		T__23=24, T__22=25, T__21=26, T__20=27, T__19=28, T__18=29, T__17=30, 
		T__16=31, T__15=32, T__14=33, T__13=34, T__12=35, T__11=36, T__10=37, 
		T__9=38, T__8=39, T__7=40, T__6=41, T__5=42, T__4=43, T__3=44, T__2=45, 
		T__1=46, T__0=47, VARNAME=48, COMMENT=49, REALNUM=50, BLANK=51, STRING=52, 
		FIELDSEP=53;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'elseif'", "'true'", "'return'", "'{'", "'while'", 
		"';'", "'..'", "'}'", "'='", "'^'", "'for'", "'if'", "'<='", "'break'", 
		"'local'", "'('", "'do'", "'*'", "','", "'repeat'", "'false'", "'.'", 
		"'...'", "':'", "'>='", "'['", "'~='", "'=='", "'<'", "']'", "'>'", "'or'", 
		"'until'", "'#'", "'%'", "'in'", "'else'", "'function'", "'end'", "')'", 
		"'and'", "'nil'", "'+'", "'then'", "'not'", "'-'", "VARNAME", "COMMENT", 
		"REALNUM", "BLANK", "STRING", "FIELDSEP"
	};
	public static final int
		RULE_programa = 0, RULE_block = 1, RULE_chunk = 2, RULE_stat = 3, RULE_laststat = 4, 
		RULE_funcname = 5, RULE_varlist = 6, RULE_var = 7, RULE_namelist = 8, 
		RULE_explist = 9, RULE_exp = 10, RULE_expa = 11, RULE_prefixexp = 12, 
		RULE_prefixexpa = 13, RULE_functioncall = 14, RULE_args = 15, RULE_function = 16, 
		RULE_funcbody = 17, RULE_parlist = 18, RULE_tableconstructor = 19, RULE_fieldlist = 20, 
		RULE_field = 21, RULE_binop = 22, RULE_unop = 23;
	public static final String[] ruleNames = {
		"programa", "block", "chunk", "stat", "laststat", "funcname", "varlist", 
		"var", "namelist", "explist", "exp", "expa", "prefixexp", "prefixexpa", 
		"functioncall", "args", "function", "funcbody", "parlist", "tableconstructor", 
		"fieldlist", "field", "binop", "unop"
	};

	@Override
	public String getGrammarFileName() { return "Lua.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	   public static String grupo="558303 - 558273";

	public LuaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); block();
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
		public ChunkContext chunk() {
			return getRuleContext(ChunkContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); chunk();
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

	public static class ChunkContext extends ParserRuleContext {
		public LaststatContext laststat() {
			return getRuleContext(LaststatContext.class,0);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public ChunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chunk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitChunk(this);
		}
	}

	public final ChunkContext chunk() throws RecognitionException {
		ChunkContext _localctx = new ChunkContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_chunk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 12) | (1L << 13) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 21) | (1L << 39) | (1L << VARNAME))) != 0)) {
				{
				{
				setState(52); stat();
				setState(54);
				_la = _input.LA(1);
				if (_la==7) {
					{
					setState(53); match(7);
					}
				}

				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			_la = _input.LA(1);
			if (_la==4 || _la==15) {
				{
				setState(61); laststat();
				setState(63);
				_la = _input.LA(1);
				if (_la==7) {
					{
					setState(62); match(7);
					}
				}

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

	public static class StatContext extends ParserRuleContext {
		public Token VARNAME;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public NamelistContext namelist() {
			return getRuleContext(NamelistContext.class,0);
		}
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public TerminalNode VARNAME() { return getToken(LuaParser.VARNAME, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stat);
		int _la;
		try {
			setState(144);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67); varlist();
				setState(68); match(10);
				setState(69); explist();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71); functioncall();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72); match(18);
				setState(73); block();
				setState(74); match(40);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76); match(6);
				setState(77); exp();
				setState(78); match(18);
				setState(79); block();
				setState(80); match(40);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82); match(21);
				setState(83); block();
				setState(84); match(34);
				setState(85); exp();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(87); match(13);
				setState(88); exp();
				setState(89); match(45);
				setState(90); block();
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(91); match(2);
					setState(92); exp();
					setState(93); match(45);
					setState(94); block();
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(103);
				_la = _input.LA(1);
				if (_la==38) {
					{
					setState(101); match(38);
					setState(102); block();
					}
				}

				setState(105); match(40);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(107); match(12);
				setState(108); match(VARNAME);
				setState(109); match(10);
				setState(110); exp();
				setState(111); match(20);
				setState(112); exp();
				setState(115);
				_la = _input.LA(1);
				if (_la==20) {
					{
					setState(113); match(20);
					setState(114); exp();
					}
				}

				setState(117); match(18);
				setState(118); block();
				setState(119); match(40);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(121); match(12);
				setState(122); namelist();
				setState(123); match(37);
				setState(124); explist();
				setState(125); match(18);
				setState(126); block();
				setState(127); match(40);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(129); match(39);
				setState(130); funcname();
				setState(131); funcbody();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(133); match(16);
				setState(134); match(39);
				setState(135); ((StatContext)_localctx).VARNAME = match(VARNAME);
				 TabelaDeSimbolos.adicionarSimbolo((((StatContext)_localctx).VARNAME!=null?((StatContext)_localctx).VARNAME.getText():null),Tipo.FUNCAO); 
				setState(137); funcbody();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(138); match(16);
				setState(139); namelist();
				setState(142);
				_la = _input.LA(1);
				if (_la==10) {
					{
					setState(140); match(10);
					setState(141); explist();
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

	public static class LaststatContext extends ParserRuleContext {
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public LaststatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_laststat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterLaststat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitLaststat(this);
		}
	}

	public final LaststatContext laststat() throws RecognitionException {
		LaststatContext _localctx = new LaststatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_laststat);
		int _la;
		try {
			setState(151);
			switch (_input.LA(1)) {
			case 4:
				enterOuterAlt(_localctx, 1);
				{
				setState(146); match(4);
				setState(148);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 5) | (1L << 17) | (1L << 22) | (1L << 24) | (1L << 35) | (1L << 39) | (1L << 43) | (1L << 46) | (1L << 47) | (1L << VARNAME) | (1L << REALNUM) | (1L << STRING))) != 0)) {
					{
					setState(147); explist();
					}
				}

				}
				break;
			case 15:
				enterOuterAlt(_localctx, 2);
				{
				setState(150); match(15);
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

	public static class FuncnameContext extends ParserRuleContext {
		public Token VARNAME;
		public TerminalNode VARNAME(int i) {
			return getToken(LuaParser.VARNAME, i);
		}
		public List<TerminalNode> VARNAME() { return getTokens(LuaParser.VARNAME); }
		public FuncnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFuncname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFuncname(this);
		}
	}

	public final FuncnameContext funcname() throws RecognitionException {
		FuncnameContext _localctx = new FuncnameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); ((FuncnameContext)_localctx).VARNAME = match(VARNAME);
			 TabelaDeSimbolos.adicionarSimbolo((((FuncnameContext)_localctx).VARNAME!=null?((FuncnameContext)_localctx).VARNAME.getText():null),Tipo.FUNCAO); 
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==23) {
				{
				{
				setState(155); match(23);
				setState(156); ((FuncnameContext)_localctx).VARNAME = match(VARNAME);
				 TabelaDeSimbolos.adicionarSimbolo((((FuncnameContext)_localctx).VARNAME!=null?((FuncnameContext)_localctx).VARNAME.getText():null),Tipo.FUNCAO); 
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			_la = _input.LA(1);
			if (_la==25) {
				{
				setState(163); match(25);
				setState(164); ((FuncnameContext)_localctx).VARNAME = match(VARNAME);
				 TabelaDeSimbolos.adicionarSimbolo((((FuncnameContext)_localctx).VARNAME!=null?((FuncnameContext)_localctx).VARNAME.getText():null),Tipo.FUNCAO); 
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

	public static class VarlistContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitVarlist(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); var();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==20) {
				{
				{
				setState(169); match(20);
				setState(170); var();
				}
				}
				setState(175);
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

	public static class VarContext extends ParserRuleContext {
		public Token VARNAME;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PrefixexpContext prefixexp() {
			return getRuleContext(PrefixexpContext.class,0);
		}
		public TerminalNode VARNAME() { return getToken(LuaParser.VARNAME, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var);
		try {
			setState(187);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176); ((VarContext)_localctx).VARNAME = match(VARNAME);
				 TabelaDeSimbolos.adicionarSimbolo((((VarContext)_localctx).VARNAME!=null?((VarContext)_localctx).VARNAME.getText():null),Tipo.VARIAVEL); 
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178); prefixexp();
				setState(179); match(27);
				setState(180); exp();
				setState(181); match(31);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183); prefixexp();
				setState(184); match(23);
				setState(185); match(VARNAME);
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

	public static class NamelistContext extends ParserRuleContext {
		public Token VARNAME;
		public TerminalNode VARNAME(int i) {
			return getToken(LuaParser.VARNAME, i);
		}
		public List<TerminalNode> VARNAME() { return getTokens(LuaParser.VARNAME); }
		public NamelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterNamelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitNamelist(this);
		}
	}

	public final NamelistContext namelist() throws RecognitionException {
		NamelistContext _localctx = new NamelistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_namelist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189); ((NamelistContext)_localctx).VARNAME = match(VARNAME);
			 TabelaDeSimbolos.adicionarSimbolo((((NamelistContext)_localctx).VARNAME!=null?((NamelistContext)_localctx).VARNAME.getText():null),Tipo.VARIAVEL); 
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(191); match(20);
					setState(192); ((NamelistContext)_localctx).VARNAME = match(VARNAME);
					 TabelaDeSimbolos.adicionarSimbolo((((NamelistContext)_localctx).VARNAME!=null?((NamelistContext)_localctx).VARNAME.getText():null),Tipo.VARIAVEL); 
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class ExplistContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExplist(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_explist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(199); exp();
					setState(200); match(20);
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(207); exp();
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

	public static class ExpContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PrefixexpContext prefixexp() {
			return getRuleContext(PrefixexpContext.class,0);
		}
		public ExpaContext expa() {
			return getRuleContext(ExpaContext.class,0);
		}
		public TerminalNode REALNUM() { return getToken(LuaParser.REALNUM, 0); }
		public TableconstructorContext tableconstructor() {
			return getRuleContext(TableconstructorContext.class,0);
		}
		public TerminalNode STRING() { return getToken(LuaParser.STRING, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public UnopContext unop() {
			return getRuleContext(UnopContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exp);
		try {
			setState(246);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209); match(43);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210); match(22);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211); match(3);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(212); match(REALNUM);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(213); match(STRING);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(214); match(24);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(215); function();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(216); prefixexp();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(217); tableconstructor();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(218); unop();
				setState(219); exp();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(221); match(43);
				setState(222); expa();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(223); match(22);
				setState(224); expa();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(225); match(3);
				setState(226); expa();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(227); match(REALNUM);
				setState(228); expa();
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(229); match(STRING);
				setState(230); expa();
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(231); match(24);
				setState(232); expa();
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(233); function();
				setState(234); expa();
				}
				break;

			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(236); prefixexp();
				setState(237); expa();
				}
				break;

			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(239); tableconstructor();
				setState(240); expa();
				}
				break;

			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(242); unop();
				setState(243); exp();
				setState(244); expa();
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

	public static class ExpaContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpaContext expa() {
			return getRuleContext(ExpaContext.class,0);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public ExpaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExpa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExpa(this);
		}
	}

	public final ExpaContext expa() throws RecognitionException {
		ExpaContext _localctx = new ExpaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expa);
		try {
			setState(255);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248); binop();
				setState(249); exp();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251); binop();
				setState(252); exp();
				setState(253); expa();
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

	public static class PrefixexpContext extends ParserRuleContext {
		public Token VARNAME;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PrefixexpaContext prefixexpa() {
			return getRuleContext(PrefixexpaContext.class,0);
		}
		public TerminalNode VARNAME() { return getToken(LuaParser.VARNAME, 0); }
		public PrefixexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterPrefixexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitPrefixexp(this);
		}
	}

	public final PrefixexpContext prefixexp() throws RecognitionException {
		PrefixexpContext _localctx = new PrefixexpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_prefixexp);
		try {
			setState(270);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257); ((PrefixexpContext)_localctx).VARNAME = match(VARNAME);
				 TabelaDeSimbolos.adicionarSimbolo((((PrefixexpContext)_localctx).VARNAME!=null?((PrefixexpContext)_localctx).VARNAME.getText():null),Tipo.VARIAVEL); 
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259); match(17);
				setState(260); exp();
				setState(261); match(41);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(263); match(VARNAME);
				setState(264); prefixexpa();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(265); match(17);
				setState(266); exp();
				setState(267); match(41);
				setState(268); prefixexpa();
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

	public static class PrefixexpaContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PrefixexpaContext prefixexpa() {
			return getRuleContext(PrefixexpaContext.class,0);
		}
		public TerminalNode VARNAME() { return getToken(LuaParser.VARNAME, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public PrefixexpaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixexpa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterPrefixexpa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitPrefixexpa(this);
		}
	}

	public final PrefixexpaContext prefixexpa() throws RecognitionException {
		PrefixexpaContext _localctx = new PrefixexpaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_prefixexpa);
		try {
			setState(298);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272); match(27);
				setState(273); exp();
				setState(274); match(31);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276); match(23);
				setState(277); match(VARNAME);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(278); args();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(279); match(25);
				setState(280); match(VARNAME);
				setState(281); args();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(282); match(27);
				setState(283); exp();
				setState(284); match(31);
				setState(285); prefixexpa();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(287); match(23);
				setState(288); match(VARNAME);
				setState(289); prefixexpa();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(290); args();
				setState(291); prefixexpa();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(293); match(25);
				setState(294); match(VARNAME);
				setState(295); args();
				setState(296); prefixexpa();
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

	public static class FunctioncallContext extends ParserRuleContext {
		public PrefixexpContext prefixexp() {
			return getRuleContext(PrefixexpContext.class,0);
		}
		public TerminalNode VARNAME() { return getToken(LuaParser.VARNAME, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFunctioncall(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functioncall);
		try {
			setState(308);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300); prefixexp();
				setState(301); args();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303); prefixexp();
				setState(304); match(25);
				setState(305); match(VARNAME);
				setState(306); args();
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

	public static class ArgsContext extends ParserRuleContext {
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public TableconstructorContext tableconstructor() {
			return getRuleContext(TableconstructorContext.class,0);
		}
		public TerminalNode STRING() { return getToken(LuaParser.STRING, 0); }
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_args);
		int _la;
		try {
			setState(317);
			switch (_input.LA(1)) {
			case 17:
				enterOuterAlt(_localctx, 1);
				{
				setState(310); match(17);
				setState(312);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 5) | (1L << 17) | (1L << 22) | (1L << 24) | (1L << 35) | (1L << 39) | (1L << 43) | (1L << 46) | (1L << 47) | (1L << VARNAME) | (1L << REALNUM) | (1L << STRING))) != 0)) {
					{
					setState(311); explist();
					}
				}

				setState(314); match(41);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 2);
				{
				setState(315); tableconstructor();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(316); match(STRING);
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

	public static class FunctionContext extends ParserRuleContext {
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319); match(39);
			setState(320); funcbody();
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

	public static class FuncbodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParlistContext parlist() {
			return getRuleContext(ParlistContext.class,0);
		}
		public FuncbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFuncbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFuncbody(this);
		}
	}

	public final FuncbodyContext funcbody() throws RecognitionException {
		FuncbodyContext _localctx = new FuncbodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_funcbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322); match(17);
			setState(324);
			_la = _input.LA(1);
			if (_la==24 || _la==VARNAME) {
				{
				setState(323); parlist();
				}
			}

			setState(326); match(41);
			setState(327); block();
			setState(328); match(40);
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

	public static class ParlistContext extends ParserRuleContext {
		public NamelistContext namelist() {
			return getRuleContext(NamelistContext.class,0);
		}
		public ParlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterParlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitParlist(this);
		}
	}

	public final ParlistContext parlist() throws RecognitionException {
		ParlistContext _localctx = new ParlistContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parlist);
		int _la;
		try {
			setState(336);
			switch (_input.LA(1)) {
			case VARNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(330); namelist();
				setState(333);
				_la = _input.LA(1);
				if (_la==20) {
					{
					setState(331); match(20);
					setState(332); match(24);
					}
				}

				}
				break;
			case 24:
				enterOuterAlt(_localctx, 2);
				{
				setState(335); match(24);
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

	public static class TableconstructorContext extends ParserRuleContext {
		public FieldlistContext fieldlist() {
			return getRuleContext(FieldlistContext.class,0);
		}
		public TableconstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableconstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterTableconstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitTableconstructor(this);
		}
	}

	public final TableconstructorContext tableconstructor() throws RecognitionException {
		TableconstructorContext _localctx = new TableconstructorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tableconstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338); match(5);
			setState(340);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 5) | (1L << 17) | (1L << 22) | (1L << 24) | (1L << 27) | (1L << 35) | (1L << 39) | (1L << 43) | (1L << 46) | (1L << 47) | (1L << VARNAME) | (1L << REALNUM) | (1L << STRING))) != 0)) {
				{
				setState(339); fieldlist();
				}
			}

			setState(342); match(9);
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

	public static class FieldlistContext extends ParserRuleContext {
		public TerminalNode FIELDSEP(int i) {
			return getToken(LuaParser.FIELDSEP, i);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<TerminalNode> FIELDSEP() { return getTokens(LuaParser.FIELDSEP); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFieldlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFieldlist(this);
		}
	}

	public final FieldlistContext fieldlist() throws RecognitionException {
		FieldlistContext _localctx = new FieldlistContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fieldlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(344); field();
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(345); match(FIELDSEP);
					setState(346); field();
					}
					} 
				}
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(353);
			_la = _input.LA(1);
			if (_la==FIELDSEP) {
				{
				setState(352); match(FIELDSEP);
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

	public static class FieldContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode VARNAME() { return getToken(LuaParser.VARNAME, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_field);
		try {
			setState(365);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355); match(27);
				setState(356); exp();
				setState(357); match(31);
				setState(358); match(10);
				setState(359); exp();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361); match(VARNAME);
				setState(362); match(10);
				setState(363); exp();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364); exp();
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

	public static class BinopContext extends ParserRuleContext {
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitBinop(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 8) | (1L << 11) | (1L << 14) | (1L << 19) | (1L << 26) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 32) | (1L << 33) | (1L << 36) | (1L << 42) | (1L << 44) | (1L << 47))) != 0)) ) {
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

	public static class UnopContext extends ParserRuleContext {
		public UnopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterUnop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitUnop(this);
		}
	}

	public final UnopContext unop() throws RecognitionException {
		UnopContext _localctx = new UnopContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_unop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 35) | (1L << 46) | (1L << 47))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\67\u0176\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\5\49\n\4\7\4;\n\4\f\4\16\4>\13\4\3\4\3\4\5\4"+
		"B\n\4\5\4D\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5c\n\5"+
		"\f\5\16\5f\13\5\3\5\3\5\5\5j\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5v\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0091\n\5\5\5\u0093\n\5"+
		"\3\6\3\6\5\6\u0097\n\6\3\6\5\6\u009a\n\6\3\7\3\7\3\7\3\7\3\7\7\7\u00a1"+
		"\n\7\f\7\16\7\u00a4\13\7\3\7\3\7\3\7\5\7\u00a9\n\7\3\b\3\b\3\b\7\b\u00ae"+
		"\n\b\f\b\16\b\u00b1\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u00be\n\t\3\n\3\n\3\n\3\n\3\n\7\n\u00c5\n\n\f\n\16\n\u00c8\13\n\3\13"+
		"\3\13\3\13\7\13\u00cd\n\13\f\13\16\13\u00d0\13\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u00f9\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0102\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0111\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u012d\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0137\n\20\3\21\3\21\5\21"+
		"\u013b\n\21\3\21\3\21\3\21\5\21\u0140\n\21\3\22\3\22\3\22\3\23\3\23\5"+
		"\23\u0147\n\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u0150\n\24\3\24"+
		"\5\24\u0153\n\24\3\25\3\25\5\25\u0157\n\25\3\25\3\25\3\26\3\26\3\26\7"+
		"\26\u015e\n\26\f\26\16\26\u0161\13\26\3\26\5\26\u0164\n\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0170\n\27\3\30\3\30\3\31"+
		"\3\31\3\31\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\4"+
		"\16\2\3\3\n\n\r\r\20\20\25\25\34\34\36 \"#&&,,..\61\61\4\2%%\60\61\u01a2"+
		"\2\62\3\2\2\2\4\64\3\2\2\2\6<\3\2\2\2\b\u0092\3\2\2\2\n\u0099\3\2\2\2"+
		"\f\u009b\3\2\2\2\16\u00aa\3\2\2\2\20\u00bd\3\2\2\2\22\u00bf\3\2\2\2\24"+
		"\u00ce\3\2\2\2\26\u00f8\3\2\2\2\30\u0101\3\2\2\2\32\u0110\3\2\2\2\34\u012c"+
		"\3\2\2\2\36\u0136\3\2\2\2 \u013f\3\2\2\2\"\u0141\3\2\2\2$\u0144\3\2\2"+
		"\2&\u0152\3\2\2\2(\u0154\3\2\2\2*\u015a\3\2\2\2,\u016f\3\2\2\2.\u0171"+
		"\3\2\2\2\60\u0173\3\2\2\2\62\63\5\4\3\2\63\3\3\2\2\2\64\65\5\6\4\2\65"+
		"\5\3\2\2\2\668\5\b\5\2\679\7\t\2\28\67\3\2\2\289\3\2\2\29;\3\2\2\2:\66"+
		"\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=C\3\2\2\2><\3\2\2\2?A\5\n\6\2@"+
		"B\7\t\2\2A@\3\2\2\2AB\3\2\2\2BD\3\2\2\2C?\3\2\2\2CD\3\2\2\2D\7\3\2\2\2"+
		"EF\5\16\b\2FG\7\f\2\2GH\5\24\13\2H\u0093\3\2\2\2I\u0093\5\36\20\2JK\7"+
		"\24\2\2KL\5\4\3\2LM\7*\2\2M\u0093\3\2\2\2NO\7\b\2\2OP\5\26\f\2PQ\7\24"+
		"\2\2QR\5\4\3\2RS\7*\2\2S\u0093\3\2\2\2TU\7\27\2\2UV\5\4\3\2VW\7$\2\2W"+
		"X\5\26\f\2X\u0093\3\2\2\2YZ\7\17\2\2Z[\5\26\f\2[\\\7/\2\2\\d\5\4\3\2]"+
		"^\7\4\2\2^_\5\26\f\2_`\7/\2\2`a\5\4\3\2ac\3\2\2\2b]\3\2\2\2cf\3\2\2\2"+
		"db\3\2\2\2de\3\2\2\2ei\3\2\2\2fd\3\2\2\2gh\7(\2\2hj\5\4\3\2ig\3\2\2\2"+
		"ij\3\2\2\2jk\3\2\2\2kl\7*\2\2l\u0093\3\2\2\2mn\7\16\2\2no\7\62\2\2op\7"+
		"\f\2\2pq\5\26\f\2qr\7\26\2\2ru\5\26\f\2st\7\26\2\2tv\5\26\f\2us\3\2\2"+
		"\2uv\3\2\2\2vw\3\2\2\2wx\7\24\2\2xy\5\4\3\2yz\7*\2\2z\u0093\3\2\2\2{|"+
		"\7\16\2\2|}\5\22\n\2}~\7\'\2\2~\177\5\24\13\2\177\u0080\7\24\2\2\u0080"+
		"\u0081\5\4\3\2\u0081\u0082\7*\2\2\u0082\u0093\3\2\2\2\u0083\u0084\7)\2"+
		"\2\u0084\u0085\5\f\7\2\u0085\u0086\5$\23\2\u0086\u0093\3\2\2\2\u0087\u0088"+
		"\7\22\2\2\u0088\u0089\7)\2\2\u0089\u008a\7\62\2\2\u008a\u008b\b\5\1\2"+
		"\u008b\u0093\5$\23\2\u008c\u008d\7\22\2\2\u008d\u0090\5\22\n\2\u008e\u008f"+
		"\7\f\2\2\u008f\u0091\5\24\13\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2"+
		"\u0091\u0093\3\2\2\2\u0092E\3\2\2\2\u0092I\3\2\2\2\u0092J\3\2\2\2\u0092"+
		"N\3\2\2\2\u0092T\3\2\2\2\u0092Y\3\2\2\2\u0092m\3\2\2\2\u0092{\3\2\2\2"+
		"\u0092\u0083\3\2\2\2\u0092\u0087\3\2\2\2\u0092\u008c\3\2\2\2\u0093\t\3"+
		"\2\2\2\u0094\u0096\7\6\2\2\u0095\u0097\5\24\13\2\u0096\u0095\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u009a\7\21\2\2\u0099\u0094\3"+
		"\2\2\2\u0099\u0098\3\2\2\2\u009a\13\3\2\2\2\u009b\u009c\7\62\2\2\u009c"+
		"\u00a2\b\7\1\2\u009d\u009e\7\31\2\2\u009e\u009f\7\62\2\2\u009f\u00a1\b"+
		"\7\1\2\u00a0\u009d\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a8\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\33"+
		"\2\2\u00a6\u00a7\7\62\2\2\u00a7\u00a9\b\7\1\2\u00a8\u00a5\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\r\3\2\2\2\u00aa\u00af\5\20\t\2\u00ab\u00ac\7\26\2"+
		"\2\u00ac\u00ae\5\20\t\2\u00ad\u00ab\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\17\3\2\2\2\u00b1\u00af\3\2\2"+
		"\2\u00b2\u00b3\7\62\2\2\u00b3\u00be\b\t\1\2\u00b4\u00b5\5\32\16\2\u00b5"+
		"\u00b6\7\35\2\2\u00b6\u00b7\5\26\f\2\u00b7\u00b8\7!\2\2\u00b8\u00be\3"+
		"\2\2\2\u00b9\u00ba\5\32\16\2\u00ba\u00bb\7\31\2\2\u00bb\u00bc\7\62\2\2"+
		"\u00bc\u00be\3\2\2\2\u00bd\u00b2\3\2\2\2\u00bd\u00b4\3\2\2\2\u00bd\u00b9"+
		"\3\2\2\2\u00be\21\3\2\2\2\u00bf\u00c0\7\62\2\2\u00c0\u00c6\b\n\1\2\u00c1"+
		"\u00c2\7\26\2\2\u00c2\u00c3\7\62\2\2\u00c3\u00c5\b\n\1\2\u00c4\u00c1\3"+
		"\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\23\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\5\26\f\2\u00ca\u00cb\7\26"+
		"\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d1\u00d2\5\26\f\2\u00d2\25\3\2\2\2\u00d3\u00f9\7-\2\2\u00d4\u00f9"+
		"\7\30\2\2\u00d5\u00f9\7\5\2\2\u00d6\u00f9\7\64\2\2\u00d7\u00f9\7\66\2"+
		"\2\u00d8\u00f9\7\32\2\2\u00d9\u00f9\5\"\22\2\u00da\u00f9\5\32\16\2\u00db"+
		"\u00f9\5(\25\2\u00dc\u00dd\5\60\31\2\u00dd\u00de\5\26\f\2\u00de\u00f9"+
		"\3\2\2\2\u00df\u00e0\7-\2\2\u00e0\u00f9\5\30\r\2\u00e1\u00e2\7\30\2\2"+
		"\u00e2\u00f9\5\30\r\2\u00e3\u00e4\7\5\2\2\u00e4\u00f9\5\30\r\2\u00e5\u00e6"+
		"\7\64\2\2\u00e6\u00f9\5\30\r\2\u00e7\u00e8\7\66\2\2\u00e8\u00f9\5\30\r"+
		"\2\u00e9\u00ea\7\32\2\2\u00ea\u00f9\5\30\r\2\u00eb\u00ec\5\"\22\2\u00ec"+
		"\u00ed\5\30\r\2\u00ed\u00f9\3\2\2\2\u00ee\u00ef\5\32\16\2\u00ef\u00f0"+
		"\5\30\r\2\u00f0\u00f9\3\2\2\2\u00f1\u00f2\5(\25\2\u00f2\u00f3\5\30\r\2"+
		"\u00f3\u00f9\3\2\2\2\u00f4\u00f5\5\60\31\2\u00f5\u00f6\5\26\f\2\u00f6"+
		"\u00f7\5\30\r\2\u00f7\u00f9\3\2\2\2\u00f8\u00d3\3\2\2\2\u00f8\u00d4\3"+
		"\2\2\2\u00f8\u00d5\3\2\2\2\u00f8\u00d6\3\2\2\2\u00f8\u00d7\3\2\2\2\u00f8"+
		"\u00d8\3\2\2\2\u00f8\u00d9\3\2\2\2\u00f8\u00da\3\2\2\2\u00f8\u00db\3\2"+
		"\2\2\u00f8\u00dc\3\2\2\2\u00f8\u00df\3\2\2\2\u00f8\u00e1\3\2\2\2\u00f8"+
		"\u00e3\3\2\2\2\u00f8\u00e5\3\2\2\2\u00f8\u00e7\3\2\2\2\u00f8\u00e9\3\2"+
		"\2\2\u00f8\u00eb\3\2\2\2\u00f8\u00ee\3\2\2\2\u00f8\u00f1\3\2\2\2\u00f8"+
		"\u00f4\3\2\2\2\u00f9\27\3\2\2\2\u00fa\u00fb\5.\30\2\u00fb\u00fc\5\26\f"+
		"\2\u00fc\u0102\3\2\2\2\u00fd\u00fe\5.\30\2\u00fe\u00ff\5\26\f\2\u00ff"+
		"\u0100\5\30\r\2\u0100\u0102\3\2\2\2\u0101\u00fa\3\2\2\2\u0101\u00fd\3"+
		"\2\2\2\u0102\31\3\2\2\2\u0103\u0104\7\62\2\2\u0104\u0111\b\16\1\2\u0105"+
		"\u0106\7\23\2\2\u0106\u0107\5\26\f\2\u0107\u0108\7+\2\2\u0108\u0111\3"+
		"\2\2\2\u0109\u010a\7\62\2\2\u010a\u0111\5\34\17\2\u010b\u010c\7\23\2\2"+
		"\u010c\u010d\5\26\f\2\u010d\u010e\7+\2\2\u010e\u010f\5\34\17\2\u010f\u0111"+
		"\3\2\2\2\u0110\u0103\3\2\2\2\u0110\u0105\3\2\2\2\u0110\u0109\3\2\2\2\u0110"+
		"\u010b\3\2\2\2\u0111\33\3\2\2\2\u0112\u0113\7\35\2\2\u0113\u0114\5\26"+
		"\f\2\u0114\u0115\7!\2\2\u0115\u012d\3\2\2\2\u0116\u0117\7\31\2\2\u0117"+
		"\u012d\7\62\2\2\u0118\u012d\5 \21\2\u0119\u011a\7\33\2\2\u011a\u011b\7"+
		"\62\2\2\u011b\u012d\5 \21\2\u011c\u011d\7\35\2\2\u011d\u011e\5\26\f\2"+
		"\u011e\u011f\7!\2\2\u011f\u0120\5\34\17\2\u0120\u012d\3\2\2\2\u0121\u0122"+
		"\7\31\2\2\u0122\u0123\7\62\2\2\u0123\u012d\5\34\17\2\u0124\u0125\5 \21"+
		"\2\u0125\u0126\5\34\17\2\u0126\u012d\3\2\2\2\u0127\u0128\7\33\2\2\u0128"+
		"\u0129\7\62\2\2\u0129\u012a\5 \21\2\u012a\u012b\5\34\17\2\u012b\u012d"+
		"\3\2\2\2\u012c\u0112\3\2\2\2\u012c\u0116\3\2\2\2\u012c\u0118\3\2\2\2\u012c"+
		"\u0119\3\2\2\2\u012c\u011c\3\2\2\2\u012c\u0121\3\2\2\2\u012c\u0124\3\2"+
		"\2\2\u012c\u0127\3\2\2\2\u012d\35\3\2\2\2\u012e\u012f\5\32\16\2\u012f"+
		"\u0130\5 \21\2\u0130\u0137\3\2\2\2\u0131\u0132\5\32\16\2\u0132\u0133\7"+
		"\33\2\2\u0133\u0134\7\62\2\2\u0134\u0135\5 \21\2\u0135\u0137\3\2\2\2\u0136"+
		"\u012e\3\2\2\2\u0136\u0131\3\2\2\2\u0137\37\3\2\2\2\u0138\u013a\7\23\2"+
		"\2\u0139\u013b\5\24\13\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u0140\7+\2\2\u013d\u0140\5(\25\2\u013e\u0140\7\66"+
		"\2\2\u013f\u0138\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140"+
		"!\3\2\2\2\u0141\u0142\7)\2\2\u0142\u0143\5$\23\2\u0143#\3\2\2\2\u0144"+
		"\u0146\7\23\2\2\u0145\u0147\5&\24\2\u0146\u0145\3\2\2\2\u0146\u0147\3"+
		"\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\7+\2\2\u0149\u014a\5\4\3\2\u014a"+
		"\u014b\7*\2\2\u014b%\3\2\2\2\u014c\u014f\5\22\n\2\u014d\u014e\7\26\2\2"+
		"\u014e\u0150\7\32\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0153"+
		"\3\2\2\2\u0151\u0153\7\32\2\2\u0152\u014c\3\2\2\2\u0152\u0151\3\2\2\2"+
		"\u0153\'\3\2\2\2\u0154\u0156\7\7\2\2\u0155\u0157\5*\26\2\u0156\u0155\3"+
		"\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\7\13\2\2\u0159"+
		")\3\2\2\2\u015a\u015f\5,\27\2\u015b\u015c\7\67\2\2\u015c\u015e\5,\27\2"+
		"\u015d\u015b\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160"+
		"\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0164\7\67\2\2"+
		"\u0163\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164+\3\2\2\2\u0165\u0166\7"+
		"\35\2\2\u0166\u0167\5\26\f\2\u0167\u0168\7!\2\2\u0168\u0169\7\f\2\2\u0169"+
		"\u016a\5\26\f\2\u016a\u0170\3\2\2\2\u016b\u016c\7\62\2\2\u016c\u016d\7"+
		"\f\2\2\u016d\u0170\5\26\f\2\u016e\u0170\5\26\f\2\u016f\u0165\3\2\2\2\u016f"+
		"\u016b\3\2\2\2\u016f\u016e\3\2\2\2\u0170-\3\2\2\2\u0171\u0172\t\2\2\2"+
		"\u0172/\3\2\2\2\u0173\u0174\t\3\2\2\u0174\61\3\2\2\2!8<ACdiu\u0090\u0092"+
		"\u0096\u0099\u00a2\u00a8\u00af\u00bd\u00c6\u00ce\u00f8\u0101\u0110\u012c"+
		"\u0136\u013a\u013f\u0146\u014f\u0152\u0156\u015f\u0163\u016f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}