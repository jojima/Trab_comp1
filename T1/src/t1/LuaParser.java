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
		public FuncnameContext funcname;
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
			setState(145);
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
				setState(130); ((StatContext)_localctx).funcname = funcname();
				 TabelaDeSimbolos.adicionarSimbolo((((StatContext)_localctx).funcname!=null?_input.getText(((StatContext)_localctx).funcname.start,((StatContext)_localctx).funcname.stop):null),Tipo.FUNCAO); 
				setState(132); funcbody();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(134); match(16);
				setState(135); match(39);
				setState(136); ((StatContext)_localctx).VARNAME = match(VARNAME);
				 TabelaDeSimbolos.adicionarSimbolo((((StatContext)_localctx).VARNAME!=null?((StatContext)_localctx).VARNAME.getText():null),Tipo.FUNCAO); 
				setState(138); funcbody();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(139); match(16);
				setState(140); namelist();
				setState(143);
				_la = _input.LA(1);
				if (_la==10) {
					{
					setState(141); match(10);
					setState(142); explist();
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
			setState(152);
			switch (_input.LA(1)) {
			case 4:
				enterOuterAlt(_localctx, 1);
				{
				setState(147); match(4);
				setState(149);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 5) | (1L << 17) | (1L << 22) | (1L << 24) | (1L << 35) | (1L << 39) | (1L << 43) | (1L << 46) | (1L << 47) | (1L << VARNAME) | (1L << REALNUM) | (1L << STRING))) != 0)) {
					{
					setState(148); explist();
					}
				}

				}
				break;
			case 15:
				enterOuterAlt(_localctx, 2);
				{
				setState(151); match(15);
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
			setState(154); match(VARNAME);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==23) {
				{
				{
				setState(155); match(23);
				setState(156); match(VARNAME);
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			_la = _input.LA(1);
			if (_la==25) {
				{
				setState(162); match(25);
				setState(163); match(VARNAME);
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
			setState(166); var();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==20) {
				{
				{
				setState(167); match(20);
				setState(168); var();
				}
				}
				setState(173);
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
			setState(185);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174); ((VarContext)_localctx).VARNAME = match(VARNAME);
				 TabelaDeSimbolos.adicionarSimbolo((((VarContext)_localctx).VARNAME!=null?((VarContext)_localctx).VARNAME.getText():null),Tipo.VARIAVEL); 
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176); prefixexp();
				setState(177); match(27);
				setState(178); exp();
				setState(179); match(31);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181); prefixexp();
				setState(182); match(23);
				setState(183); match(VARNAME);
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
			setState(187); ((NamelistContext)_localctx).VARNAME = match(VARNAME);
			 TabelaDeSimbolos.adicionarSimbolo((((NamelistContext)_localctx).VARNAME!=null?((NamelistContext)_localctx).VARNAME.getText():null),Tipo.VARIAVEL); 
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(189); match(20);
					setState(190); ((NamelistContext)_localctx).VARNAME = match(VARNAME);
					 TabelaDeSimbolos.adicionarSimbolo((((NamelistContext)_localctx).VARNAME!=null?((NamelistContext)_localctx).VARNAME.getText():null),Tipo.VARIAVEL); 
					}
					} 
				}
				setState(196);
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
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(197); exp();
					setState(198); match(20);
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(205); exp();
			}
		}
		catch (RecognitionException re) {
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
			setState(244);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207); match(43);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208); match(22);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(209); match(3);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(210); match(REALNUM);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(211); match(STRING);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(212); match(24);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(213); function();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(214); prefixexp();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(215); tableconstructor();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(216); unop();
				setState(217); exp();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(219); match(43);
				setState(220); expa();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(221); match(22);
				setState(222); expa();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(223); match(3);
				setState(224); expa();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(225); match(REALNUM);
				setState(226); expa();
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(227); match(STRING);
				setState(228); expa();
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(229); match(24);
				setState(230); expa();
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(231); function();
				setState(232); expa();
				}
				break;

			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(234); prefixexp();
				setState(235); expa();
				}
				break;

			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(237); tableconstructor();
				setState(238); expa();
				}
				break;

			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(240); unop();
				setState(241); exp();
				setState(242); expa();
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
			setState(253);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246); binop();
				setState(247); exp();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249); binop();
				setState(250); exp();
				setState(251); expa();
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
			setState(268);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255); ((PrefixexpContext)_localctx).VARNAME = match(VARNAME);
				 TabelaDeSimbolos.adicionarSimbolo((((PrefixexpContext)_localctx).VARNAME!=null?((PrefixexpContext)_localctx).VARNAME.getText():null),Tipo.VARIAVEL); 
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257); match(17);
				setState(258); exp();
				setState(259); match(41);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261); match(VARNAME);
				setState(262); prefixexpa();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(263); match(17);
				setState(264); exp();
				setState(265); match(41);
				setState(266); prefixexpa();
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
			setState(296);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270); match(27);
				setState(271); exp();
				setState(272); match(31);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274); match(23);
				setState(275); match(VARNAME);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(276); args();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(277); match(25);
				setState(278); match(VARNAME);
				setState(279); args();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(280); match(27);
				setState(281); exp();
				setState(282); match(31);
				setState(283); prefixexpa();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(285); match(23);
				setState(286); match(VARNAME);
				setState(287); prefixexpa();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(288); args();
				setState(289); prefixexpa();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(291); match(25);
				setState(292); match(VARNAME);
				setState(293); args();
				setState(294); prefixexpa();
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
			setState(306);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298); prefixexp();
				setState(299); args();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301); prefixexp();
				setState(302); match(25);
				setState(303); match(VARNAME);
				setState(304); args();
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
			setState(315);
			switch (_input.LA(1)) {
			case 17:
				enterOuterAlt(_localctx, 1);
				{
				setState(308); match(17);
				setState(310);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 5) | (1L << 17) | (1L << 22) | (1L << 24) | (1L << 35) | (1L << 39) | (1L << 43) | (1L << 46) | (1L << 47) | (1L << VARNAME) | (1L << REALNUM) | (1L << STRING))) != 0)) {
					{
					setState(309); explist();
					}
				}

				setState(312); match(41);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 2);
				{
				setState(313); tableconstructor();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(314); match(STRING);
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
			setState(317); match(39);
			setState(318); funcbody();
			}
		}
		catch (RecognitionException re) {
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
			setState(320); match(17);
			setState(322);
			_la = _input.LA(1);
			if (_la==24 || _la==VARNAME) {
				{
				setState(321); parlist();
				}
			}

			setState(324); match(41);
			setState(325); block();
			setState(326); match(40);
			}
		}
		catch (RecognitionException re) {
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
			setState(334);
			switch (_input.LA(1)) {
			case VARNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(328); namelist();
				setState(331);
				_la = _input.LA(1);
				if (_la==20) {
					{
					setState(329); match(20);
					setState(330); match(24);
					}
				}

				}
				break;
			case 24:
				enterOuterAlt(_localctx, 2);
				{
				setState(333); match(24);
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
			setState(336); match(5);
			setState(338);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 5) | (1L << 17) | (1L << 22) | (1L << 24) | (1L << 27) | (1L << 35) | (1L << 39) | (1L << 43) | (1L << 46) | (1L << 47) | (1L << VARNAME) | (1L << REALNUM) | (1L << STRING))) != 0)) {
				{
				setState(337); fieldlist();
				}
			}

			setState(340); match(9);
			}
		}
		catch (RecognitionException re) {
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
			setState(342); field();
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(343); match(FIELDSEP);
					setState(344); field();
					}
					} 
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(351);
			_la = _input.LA(1);
			if (_la==FIELDSEP) {
				{
				setState(350); match(FIELDSEP);
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
		public Token VARNAME;
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
			setState(364);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353); match(27);
				setState(354); exp();
				setState(355); match(31);
				setState(356); match(10);
				setState(357); exp();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359); ((FieldContext)_localctx).VARNAME = match(VARNAME);
				 TabelaDeSimbolos.adicionarSimbolo((((FieldContext)_localctx).VARNAME!=null?((FieldContext)_localctx).VARNAME.getText():null),Tipo.VARIAVEL); 
				setState(361); match(10);
				setState(362); exp();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(363); exp();
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
			setState(366);
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
			setState(368);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\67\u0175\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\5\49\n\4\7\4;\n\4\f\4\16\4>\13\4\3\4\3\4\5\4"+
		"B\n\4\5\4D\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5c\n\5"+
		"\f\5\16\5f\13\5\3\5\3\5\5\5j\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5v\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0092\n\5\5\5\u0094"+
		"\n\5\3\6\3\6\5\6\u0098\n\6\3\6\5\6\u009b\n\6\3\7\3\7\3\7\7\7\u00a0\n\7"+
		"\f\7\16\7\u00a3\13\7\3\7\3\7\5\7\u00a7\n\7\3\b\3\b\3\b\7\b\u00ac\n\b\f"+
		"\b\16\b\u00af\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00bc"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\7\n\u00c3\n\n\f\n\16\n\u00c6\13\n\3\13\3\13\3"+
		"\13\7\13\u00cb\n\13\f\13\16\13\u00ce\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f7"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0100\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u010f\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u012b\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0135\n\20\3\21\3\21\5\21\u0139\n"+
		"\21\3\21\3\21\3\21\5\21\u013e\n\21\3\22\3\22\3\22\3\23\3\23\5\23\u0145"+
		"\n\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u014e\n\24\3\24\5\24\u0151"+
		"\n\24\3\25\3\25\5\25\u0155\n\25\3\25\3\25\3\26\3\26\3\26\7\26\u015c\n"+
		"\26\f\26\16\26\u015f\13\26\3\26\5\26\u0162\n\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u016f\n\27\3\30\3\30\3\31\3\31"+
		"\3\31\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\4\16\2"+
		"\3\3\n\n\r\r\20\20\25\25\34\34\36 \"#&&,,..\61\61\4\2%%\60\61\u01a1\2"+
		"\62\3\2\2\2\4\64\3\2\2\2\6<\3\2\2\2\b\u0093\3\2\2\2\n\u009a\3\2\2\2\f"+
		"\u009c\3\2\2\2\16\u00a8\3\2\2\2\20\u00bb\3\2\2\2\22\u00bd\3\2\2\2\24\u00cc"+
		"\3\2\2\2\26\u00f6\3\2\2\2\30\u00ff\3\2\2\2\32\u010e\3\2\2\2\34\u012a\3"+
		"\2\2\2\36\u0134\3\2\2\2 \u013d\3\2\2\2\"\u013f\3\2\2\2$\u0142\3\2\2\2"+
		"&\u0150\3\2\2\2(\u0152\3\2\2\2*\u0158\3\2\2\2,\u016e\3\2\2\2.\u0170\3"+
		"\2\2\2\60\u0172\3\2\2\2\62\63\5\4\3\2\63\3\3\2\2\2\64\65\5\6\4\2\65\5"+
		"\3\2\2\2\668\5\b\5\2\679\7\t\2\28\67\3\2\2\289\3\2\2\29;\3\2\2\2:\66\3"+
		"\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=C\3\2\2\2><\3\2\2\2?A\5\n\6\2@B\7"+
		"\t\2\2A@\3\2\2\2AB\3\2\2\2BD\3\2\2\2C?\3\2\2\2CD\3\2\2\2D\7\3\2\2\2EF"+
		"\5\16\b\2FG\7\f\2\2GH\5\24\13\2H\u0094\3\2\2\2I\u0094\5\36\20\2JK\7\24"+
		"\2\2KL\5\4\3\2LM\7*\2\2M\u0094\3\2\2\2NO\7\b\2\2OP\5\26\f\2PQ\7\24\2\2"+
		"QR\5\4\3\2RS\7*\2\2S\u0094\3\2\2\2TU\7\27\2\2UV\5\4\3\2VW\7$\2\2WX\5\26"+
		"\f\2X\u0094\3\2\2\2YZ\7\17\2\2Z[\5\26\f\2[\\\7/\2\2\\d\5\4\3\2]^\7\4\2"+
		"\2^_\5\26\f\2_`\7/\2\2`a\5\4\3\2ac\3\2\2\2b]\3\2\2\2cf\3\2\2\2db\3\2\2"+
		"\2de\3\2\2\2ei\3\2\2\2fd\3\2\2\2gh\7(\2\2hj\5\4\3\2ig\3\2\2\2ij\3\2\2"+
		"\2jk\3\2\2\2kl\7*\2\2l\u0094\3\2\2\2mn\7\16\2\2no\7\62\2\2op\7\f\2\2p"+
		"q\5\26\f\2qr\7\26\2\2ru\5\26\f\2st\7\26\2\2tv\5\26\f\2us\3\2\2\2uv\3\2"+
		"\2\2vw\3\2\2\2wx\7\24\2\2xy\5\4\3\2yz\7*\2\2z\u0094\3\2\2\2{|\7\16\2\2"+
		"|}\5\22\n\2}~\7\'\2\2~\177\5\24\13\2\177\u0080\7\24\2\2\u0080\u0081\5"+
		"\4\3\2\u0081\u0082\7*\2\2\u0082\u0094\3\2\2\2\u0083\u0084\7)\2\2\u0084"+
		"\u0085\5\f\7\2\u0085\u0086\b\5\1\2\u0086\u0087\5$\23\2\u0087\u0094\3\2"+
		"\2\2\u0088\u0089\7\22\2\2\u0089\u008a\7)\2\2\u008a\u008b\7\62\2\2\u008b"+
		"\u008c\b\5\1\2\u008c\u0094\5$\23\2\u008d\u008e\7\22\2\2\u008e\u0091\5"+
		"\22\n\2\u008f\u0090\7\f\2\2\u0090\u0092\5\24\13\2\u0091\u008f\3\2\2\2"+
		"\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093E\3\2\2\2\u0093I\3\2\2\2"+
		"\u0093J\3\2\2\2\u0093N\3\2\2\2\u0093T\3\2\2\2\u0093Y\3\2\2\2\u0093m\3"+
		"\2\2\2\u0093{\3\2\2\2\u0093\u0083\3\2\2\2\u0093\u0088\3\2\2\2\u0093\u008d"+
		"\3\2\2\2\u0094\t\3\2\2\2\u0095\u0097\7\6\2\2\u0096\u0098\5\24\13\2\u0097"+
		"\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u009b\7\21"+
		"\2\2\u009a\u0095\3\2\2\2\u009a\u0099\3\2\2\2\u009b\13\3\2\2\2\u009c\u00a1"+
		"\7\62\2\2\u009d\u009e\7\31\2\2\u009e\u00a0\7\62\2\2\u009f\u009d\3\2\2"+
		"\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a6"+
		"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\33\2\2\u00a5\u00a7\7\62\2\2"+
		"\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\r\3\2\2\2\u00a8\u00ad\5"+
		"\20\t\2\u00a9\u00aa\7\26\2\2\u00aa\u00ac\5\20\t\2\u00ab\u00a9\3\2\2\2"+
		"\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\17"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7\62\2\2\u00b1\u00bc\b\t\1\2"+
		"\u00b2\u00b3\5\32\16\2\u00b3\u00b4\7\35\2\2\u00b4\u00b5\5\26\f\2\u00b5"+
		"\u00b6\7!\2\2\u00b6\u00bc\3\2\2\2\u00b7\u00b8\5\32\16\2\u00b8\u00b9\7"+
		"\31\2\2\u00b9\u00ba\7\62\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b0\3\2\2\2\u00bb"+
		"\u00b2\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bc\21\3\2\2\2\u00bd\u00be\7\62\2"+
		"\2\u00be\u00c4\b\n\1\2\u00bf\u00c0\7\26\2\2\u00c0\u00c1\7\62\2\2\u00c1"+
		"\u00c3\b\n\1\2\u00c2\u00bf\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\23\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8"+
		"\5\26\f\2\u00c8\u00c9\7\26\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c7\3\2\2\2"+
		"\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf"+
		"\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\5\26\f\2\u00d0\25\3\2\2\2\u00d1"+
		"\u00f7\7-\2\2\u00d2\u00f7\7\30\2\2\u00d3\u00f7\7\5\2\2\u00d4\u00f7\7\64"+
		"\2\2\u00d5\u00f7\7\66\2\2\u00d6\u00f7\7\32\2\2\u00d7\u00f7\5\"\22\2\u00d8"+
		"\u00f7\5\32\16\2\u00d9\u00f7\5(\25\2\u00da\u00db\5\60\31\2\u00db\u00dc"+
		"\5\26\f\2\u00dc\u00f7\3\2\2\2\u00dd\u00de\7-\2\2\u00de\u00f7\5\30\r\2"+
		"\u00df\u00e0\7\30\2\2\u00e0\u00f7\5\30\r\2\u00e1\u00e2\7\5\2\2\u00e2\u00f7"+
		"\5\30\r\2\u00e3\u00e4\7\64\2\2\u00e4\u00f7\5\30\r\2\u00e5\u00e6\7\66\2"+
		"\2\u00e6\u00f7\5\30\r\2\u00e7\u00e8\7\32\2\2\u00e8\u00f7\5\30\r\2\u00e9"+
		"\u00ea\5\"\22\2\u00ea\u00eb\5\30\r\2\u00eb\u00f7\3\2\2\2\u00ec\u00ed\5"+
		"\32\16\2\u00ed\u00ee\5\30\r\2\u00ee\u00f7\3\2\2\2\u00ef\u00f0\5(\25\2"+
		"\u00f0\u00f1\5\30\r\2\u00f1\u00f7\3\2\2\2\u00f2\u00f3\5\60\31\2\u00f3"+
		"\u00f4\5\26\f\2\u00f4\u00f5\5\30\r\2\u00f5\u00f7\3\2\2\2\u00f6\u00d1\3"+
		"\2\2\2\u00f6\u00d2\3\2\2\2\u00f6\u00d3\3\2\2\2\u00f6\u00d4\3\2\2\2\u00f6"+
		"\u00d5\3\2\2\2\u00f6\u00d6\3\2\2\2\u00f6\u00d7\3\2\2\2\u00f6\u00d8\3\2"+
		"\2\2\u00f6\u00d9\3\2\2\2\u00f6\u00da\3\2\2\2\u00f6\u00dd\3\2\2\2\u00f6"+
		"\u00df\3\2\2\2\u00f6\u00e1\3\2\2\2\u00f6\u00e3\3\2\2\2\u00f6\u00e5\3\2"+
		"\2\2\u00f6\u00e7\3\2\2\2\u00f6\u00e9\3\2\2\2\u00f6\u00ec\3\2\2\2\u00f6"+
		"\u00ef\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f7\27\3\2\2\2\u00f8\u00f9\5.\30"+
		"\2\u00f9\u00fa\5\26\f\2\u00fa\u0100\3\2\2\2\u00fb\u00fc\5.\30\2\u00fc"+
		"\u00fd\5\26\f\2\u00fd\u00fe\5\30\r\2\u00fe\u0100\3\2\2\2\u00ff\u00f8\3"+
		"\2\2\2\u00ff\u00fb\3\2\2\2\u0100\31\3\2\2\2\u0101\u0102\7\62\2\2\u0102"+
		"\u010f\b\16\1\2\u0103\u0104\7\23\2\2\u0104\u0105\5\26\f\2\u0105\u0106"+
		"\7+\2\2\u0106\u010f\3\2\2\2\u0107\u0108\7\62\2\2\u0108\u010f\5\34\17\2"+
		"\u0109\u010a\7\23\2\2\u010a\u010b\5\26\f\2\u010b\u010c\7+\2\2\u010c\u010d"+
		"\5\34\17\2\u010d\u010f\3\2\2\2\u010e\u0101\3\2\2\2\u010e\u0103\3\2\2\2"+
		"\u010e\u0107\3\2\2\2\u010e\u0109\3\2\2\2\u010f\33\3\2\2\2\u0110\u0111"+
		"\7\35\2\2\u0111\u0112\5\26\f\2\u0112\u0113\7!\2\2\u0113\u012b\3\2\2\2"+
		"\u0114\u0115\7\31\2\2\u0115\u012b\7\62\2\2\u0116\u012b\5 \21\2\u0117\u0118"+
		"\7\33\2\2\u0118\u0119\7\62\2\2\u0119\u012b\5 \21\2\u011a\u011b\7\35\2"+
		"\2\u011b\u011c\5\26\f\2\u011c\u011d\7!\2\2\u011d\u011e\5\34\17\2\u011e"+
		"\u012b\3\2\2\2\u011f\u0120\7\31\2\2\u0120\u0121\7\62\2\2\u0121\u012b\5"+
		"\34\17\2\u0122\u0123\5 \21\2\u0123\u0124\5\34\17\2\u0124\u012b\3\2\2\2"+
		"\u0125\u0126\7\33\2\2\u0126\u0127\7\62\2\2\u0127\u0128\5 \21\2\u0128\u0129"+
		"\5\34\17\2\u0129\u012b\3\2\2\2\u012a\u0110\3\2\2\2\u012a\u0114\3\2\2\2"+
		"\u012a\u0116\3\2\2\2\u012a\u0117\3\2\2\2\u012a\u011a\3\2\2\2\u012a\u011f"+
		"\3\2\2\2\u012a\u0122\3\2\2\2\u012a\u0125\3\2\2\2\u012b\35\3\2\2\2\u012c"+
		"\u012d\5\32\16\2\u012d\u012e\5 \21\2\u012e\u0135\3\2\2\2\u012f\u0130\5"+
		"\32\16\2\u0130\u0131\7\33\2\2\u0131\u0132\7\62\2\2\u0132\u0133\5 \21\2"+
		"\u0133\u0135\3\2\2\2\u0134\u012c\3\2\2\2\u0134\u012f\3\2\2\2\u0135\37"+
		"\3\2\2\2\u0136\u0138\7\23\2\2\u0137\u0139\5\24\13\2\u0138\u0137\3\2\2"+
		"\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013e\7+\2\2\u013b\u013e"+
		"\5(\25\2\u013c\u013e\7\66\2\2\u013d\u0136\3\2\2\2\u013d\u013b\3\2\2\2"+
		"\u013d\u013c\3\2\2\2\u013e!\3\2\2\2\u013f\u0140\7)\2\2\u0140\u0141\5$"+
		"\23\2\u0141#\3\2\2\2\u0142\u0144\7\23\2\2\u0143\u0145\5&\24\2\u0144\u0143"+
		"\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\7+\2\2\u0147"+
		"\u0148\5\4\3\2\u0148\u0149\7*\2\2\u0149%\3\2\2\2\u014a\u014d\5\22\n\2"+
		"\u014b\u014c\7\26\2\2\u014c\u014e\7\32\2\2\u014d\u014b\3\2\2\2\u014d\u014e"+
		"\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u0151\7\32\2\2\u0150\u014a\3\2\2\2"+
		"\u0150\u014f\3\2\2\2\u0151\'\3\2\2\2\u0152\u0154\7\7\2\2\u0153\u0155\5"+
		"*\26\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0157\7\13\2\2\u0157)\3\2\2\2\u0158\u015d\5,\27\2\u0159\u015a\7\67\2"+
		"\2\u015a\u015c\5,\27\2\u015b\u0159\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b"+
		"\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u0160"+
		"\u0162\7\67\2\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162+\3\2\2\2"+
		"\u0163\u0164\7\35\2\2\u0164\u0165\5\26\f\2\u0165\u0166\7!\2\2\u0166\u0167"+
		"\7\f\2\2\u0167\u0168\5\26\f\2\u0168\u016f\3\2\2\2\u0169\u016a\7\62\2\2"+
		"\u016a\u016b\b\27\1\2\u016b\u016c\7\f\2\2\u016c\u016f\5\26\f\2\u016d\u016f"+
		"\5\26\f\2\u016e\u0163\3\2\2\2\u016e\u0169\3\2\2\2\u016e\u016d\3\2\2\2"+
		"\u016f-\3\2\2\2\u0170\u0171\t\2\2\2\u0171/\3\2\2\2\u0172\u0173\t\3\2\2"+
		"\u0173\61\3\2\2\2!8<ACdiu\u0091\u0093\u0097\u009a\u00a1\u00a6\u00ad\u00bb"+
		"\u00c4\u00cc\u00f6\u00ff\u010e\u012a\u0134\u0138\u013d\u0144\u014d\u0150"+
		"\u0154\u015d\u0161\u016e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}