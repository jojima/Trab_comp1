package t1;
// Generated from D:\TrabalhosGit\Trab_comp1\T1\src\t1\Lua.g4 by ANTLR 4.1
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
		T__1=46, T__0=47, VAR_NAME=48, RESERVED_WD=49, RESERVED_SYMBOL=50, COMMENT=51, 
		INT_NUM=52, REAL_NUM=53, BLANK=54, STRING=55;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'elseif'", "'true'", "'return'", "'{'", "'while'", 
		"';'", "'..'", "'}'", "'='", "'^'", "'for'", "'if'", "'<='", "'break'", 
		"'local'", "'('", "'do'", "'*'", "','", "'repeat'", "'false'", "'.'", 
		"'...'", "':'", "'>='", "'['", "'~='", "'=='", "'<'", "']'", "'>'", "'or'", 
		"'until'", "'#'", "'%'", "'in'", "'else'", "'function'", "'end'", "')'", 
		"'and'", "'nil'", "'+'", "'then'", "'not'", "'-'", "VAR_NAME", "RESERVED_WD", 
		"RESERVED_SYMBOL", "COMMENT", "INT_NUM", "REAL_NUM", "BLANK", "STRING"
	};
	public static final int
		RULE_programa = 0, RULE_chunk = 1, RULE_block = 2, RULE_stat = 3, RULE_laststat = 4, 
		RULE_funcname = 5, RULE_varlist = 6, RULE_var = 7, RULE_namelist = 8, 
		RULE_explist = 9, RULE_exp = 10, RULE_expA = 11, RULE_prefixexp = 12, 
		RULE_prefixexpB = 13, RULE_prefixexpA = 14, RULE_functioncall = 15, RULE_args = 16, 
		RULE_function = 17, RULE_funcbody = 18, RULE_parlist = 19, RULE_tableconstructor = 20, 
		RULE_fieldlist = 21, RULE_field = 22, RULE_fieldsep = 23, RULE_binop = 24, 
		RULE_unop = 25;
	public static final String[] ruleNames = {
		"programa", "chunk", "block", "stat", "laststat", "funcname", "varlist", 
		"var", "namelist", "explist", "exp", "expA", "prefixexp", "prefixexpB", 
		"prefixexpA", "functioncall", "args", "function", "funcbody", "parlist", 
		"tableconstructor", "fieldlist", "field", "fieldsep", "binop", "unop"
	};

	@Override
	public String getGrammarFileName() { return "Lua.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	   public static String grupo="<<558303-558273>>";

	public LuaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public ChunkContext chunk() {
			return getRuleContext(ChunkContext.class,0);
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
			setState(52); chunk();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 2, RULE_chunk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 12) | (1L << 13) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 21) | (1L << 39) | (1L << VAR_NAME))) != 0)) {
				{
				{
				setState(54); stat();
				setState(56);
				_la = _input.LA(1);
				if (_la==7) {
					{
					setState(55); match(7);
					}
				}

				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			_la = _input.LA(1);
			if (_la==4 || _la==15) {
				{
				setState(63); laststat();
				setState(65);
				_la = _input.LA(1);
				if (_la==7) {
					{
					setState(64); match(7);
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
		enterRule(_localctx, 4, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); chunk();
			}
		}
		catch (RecognitionException re) {
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
		public Token VAR_NAME;
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
		public TerminalNode VAR_NAME() { return getToken(LuaParser.VAR_NAME, 0); }
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
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71); varlist();
				setState(72); match(10);
				setState(73); explist();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); functioncall();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76); match(18);
				setState(77); block();
				setState(78); match(40);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(80); match(6);
				setState(81); exp();
				setState(82); match(18);
				setState(83); block();
				setState(84); match(40);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86); match(21);
				setState(87); block();
				setState(88); match(34);
				setState(89); exp();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(91); match(13);
				setState(92); exp();
				setState(93); match(45);
				setState(94); block();
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(95); match(2);
					setState(96); exp();
					setState(97); match(45);
					setState(98); block();
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(107);
				_la = _input.LA(1);
				if (_la==38) {
					{
					setState(105); match(38);
					setState(106); block();
					}
				}

				setState(109); match(40);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(111); match(12);
				setState(112); ((StatContext)_localctx).VAR_NAME = match(VAR_NAME);
				 TabelaDeSimbolos.adicionarSimbolo((((StatContext)_localctx).VAR_NAME!=null?((StatContext)_localctx).VAR_NAME.getText():null),Tipo.VARIAVEL); 
				setState(114); match(10);
				setState(115); exp();
				setState(116); match(20);
				setState(117); exp();
				setState(120);
				_la = _input.LA(1);
				if (_la==20) {
					{
					setState(118); match(20);
					setState(119); exp();
					}
				}

				setState(122); match(18);
				setState(123); block();
				setState(124); match(40);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(126); match(12);
				setState(127); namelist();
				setState(128); match(37);
				setState(129); explist();
				setState(130); match(18);
				setState(131); block();
				setState(132); match(40);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(134); match(39);
				setState(135); funcname();
				setState(136); funcbody();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(138); match(16);
				setState(139); match(39);
				setState(140); ((StatContext)_localctx).VAR_NAME = match(VAR_NAME);
				 TabelaDeSimbolos.adicionarSimbolo((((StatContext)_localctx).VAR_NAME!=null?((StatContext)_localctx).VAR_NAME.getText():null),Tipo.VARIAVEL); 
				setState(142); funcbody();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(143); match(16);
				setState(144); namelist();
				setState(147);
				_la = _input.LA(1);
				if (_la==10) {
					{
					setState(145); match(10);
					setState(146); explist();
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
			setState(156);
			switch (_input.LA(1)) {
			case 4:
				enterOuterAlt(_localctx, 1);
				{
				setState(151); match(4);
				setState(153);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 5) | (1L << 17) | (1L << 22) | (1L << 24) | (1L << 35) | (1L << 39) | (1L << 43) | (1L << 46) | (1L << 47) | (1L << VAR_NAME) | (1L << REAL_NUM) | (1L << STRING))) != 0)) {
					{
					setState(152); explist();
					}
				}

				}
				break;
			case 15:
				enterOuterAlt(_localctx, 2);
				{
				setState(155); match(15);
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
		public Token VAR_NAME;
		public TerminalNode VAR_NAME(int i) {
			return getToken(LuaParser.VAR_NAME, i);
		}
		public List<TerminalNode> VAR_NAME() { return getTokens(LuaParser.VAR_NAME); }
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
			setState(158); ((FuncnameContext)_localctx).VAR_NAME = match(VAR_NAME);
			 TabelaDeSimbolos.adicionarSimbolo((((FuncnameContext)_localctx).VAR_NAME!=null?((FuncnameContext)_localctx).VAR_NAME.getText():null),Tipo.VARIAVEL); 
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==23) {
				{
				{
				setState(160); match(23);
				setState(161); ((FuncnameContext)_localctx).VAR_NAME = match(VAR_NAME);
				 TabelaDeSimbolos.adicionarSimbolo((((FuncnameContext)_localctx).VAR_NAME!=null?((FuncnameContext)_localctx).VAR_NAME.getText():null),Tipo.VARIAVEL); 
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			_la = _input.LA(1);
			if (_la==25) {
				{
				setState(168); match(25);
				setState(169); ((FuncnameContext)_localctx).VAR_NAME = match(VAR_NAME);
				 TabelaDeSimbolos.adicionarSimbolo((((FuncnameContext)_localctx).VAR_NAME!=null?((FuncnameContext)_localctx).VAR_NAME.getText():null),Tipo.VARIAVEL); 
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
			setState(173); var();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==20) {
				{
				{
				setState(174); match(20);
				setState(175); var();
				}
				}
				setState(180);
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
		public Token VAR_NAME;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PrefixexpContext prefixexp() {
			return getRuleContext(PrefixexpContext.class,0);
		}
		public TerminalNode VAR_NAME() { return getToken(LuaParser.VAR_NAME, 0); }
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
			setState(193);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181); ((VarContext)_localctx).VAR_NAME = match(VAR_NAME);
				 TabelaDeSimbolos.adicionarSimbolo((((VarContext)_localctx).VAR_NAME!=null?((VarContext)_localctx).VAR_NAME.getText():null),Tipo.VARIAVEL); 
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183); prefixexp();
				setState(184); match(27);
				setState(185); exp();
				setState(186); match(31);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188); prefixexp();
				setState(189); match(23);
				setState(190); ((VarContext)_localctx).VAR_NAME = match(VAR_NAME);
				 TabelaDeSimbolos.adicionarSimbolo((((VarContext)_localctx).VAR_NAME!=null?((VarContext)_localctx).VAR_NAME.getText():null),Tipo.VARIAVEL); 
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
		public Token VAR_NAME;
		public TerminalNode VAR_NAME(int i) {
			return getToken(LuaParser.VAR_NAME, i);
		}
		public List<TerminalNode> VAR_NAME() { return getTokens(LuaParser.VAR_NAME); }
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
			setState(195); ((NamelistContext)_localctx).VAR_NAME = match(VAR_NAME);
			 TabelaDeSimbolos.adicionarSimbolo((((NamelistContext)_localctx).VAR_NAME!=null?((NamelistContext)_localctx).VAR_NAME.getText():null),Tipo.VARIAVEL); 
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(197); match(20);
					setState(198); ((NamelistContext)_localctx).VAR_NAME = match(VAR_NAME);
					 TabelaDeSimbolos.adicionarSimbolo((((NamelistContext)_localctx).VAR_NAME!=null?((NamelistContext)_localctx).VAR_NAME.getText():null),Tipo.VARIAVEL); 
					}
					} 
				}
				setState(204);
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
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(205); exp();
					setState(206); match(20);
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(213); exp();
			}
		}
		catch (RecognitionException re) {
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
		public Token VAR_NAME;
		public TerminalNode REAL_NUM() { return getToken(LuaParser.REAL_NUM, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpAContext expA() {
			return getRuleContext(ExpAContext.class,0);
		}
		public PrefixexpContext prefixexp() {
			return getRuleContext(PrefixexpContext.class,0);
		}
		public TerminalNode VAR_NAME() { return getToken(LuaParser.VAR_NAME, 0); }
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
			setState(257);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215); match(43);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216); match(22);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217); match(3);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(218); match(REAL_NUM);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(219); match(STRING);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(220); match(24);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(221); function();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(222); ((ExpContext)_localctx).VAR_NAME = match(VAR_NAME);
				 TabelaDeSimbolos.adicionarSimbolo((((ExpContext)_localctx).VAR_NAME!=null?((ExpContext)_localctx).VAR_NAME.getText():null),Tipo.VARIAVEL); 
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(224); prefixexp();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(225); tableconstructor();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(226); unop();
				setState(227); exp();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(229); match(43);
				setState(230); expA();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(231); match(22);
				setState(232); expA();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(233); match(3);
				setState(234); expA();
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(235); match(REAL_NUM);
				setState(236); expA();
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(237); match(STRING);
				setState(238); expA();
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(239); match(24);
				setState(240); expA();
				}
				break;

			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(241); function();
				setState(242); expA();
				}
				break;

			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(244); ((ExpContext)_localctx).VAR_NAME = match(VAR_NAME);
				 TabelaDeSimbolos.adicionarSimbolo((((ExpContext)_localctx).VAR_NAME!=null?((ExpContext)_localctx).VAR_NAME.getText():null),Tipo.VARIAVEL); 
				setState(246); expA();
				}
				break;

			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(247); prefixexp();
				setState(248); expA();
				}
				break;

			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(250); tableconstructor();
				setState(251); expA();
				}
				break;

			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(253); unop();
				setState(254); exp();
				setState(255); expA();
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

	public static class ExpAContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpAContext expA() {
			return getRuleContext(ExpAContext.class,0);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public ExpAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExpA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExpA(this);
		}
	}

	public final ExpAContext expA() throws RecognitionException {
		ExpAContext _localctx = new ExpAContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expA);
		try {
			setState(266);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259); binop();
				setState(260); exp();
				setState(261); expA();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263); binop();
				setState(264); exp();
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
		public Token VAR_NAME;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PrefixexpAContext prefixexpA() {
			return getRuleContext(PrefixexpAContext.class,0);
		}
		public TerminalNode VAR_NAME() { return getToken(LuaParser.VAR_NAME, 0); }
		public PrefixexpBContext prefixexpB() {
			return getRuleContext(PrefixexpBContext.class,0);
		}
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
			setState(301);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268); match(17);
				setState(269); exp();
				setState(270); match(41);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272); ((PrefixexpContext)_localctx).VAR_NAME = match(VAR_NAME);
				 TabelaDeSimbolos.adicionarSimbolo((((PrefixexpContext)_localctx).VAR_NAME!=null?((PrefixexpContext)_localctx).VAR_NAME.getText():null),Tipo.VARIAVEL); 
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(274); match(17);
				setState(275); exp();
				setState(276); match(41);
				setState(277); prefixexpA();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(279); ((PrefixexpContext)_localctx).VAR_NAME = match(VAR_NAME);
				 TabelaDeSimbolos.adicionarSimbolo((((PrefixexpContext)_localctx).VAR_NAME!=null?((PrefixexpContext)_localctx).VAR_NAME.getText():null),Tipo.VARIAVEL); 
				setState(281); prefixexpA();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(282); match(17);
				setState(283); exp();
				setState(284); match(41);
				setState(285); prefixexpB();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(287); ((PrefixexpContext)_localctx).VAR_NAME = match(VAR_NAME);
				 TabelaDeSimbolos.adicionarSimbolo((((PrefixexpContext)_localctx).VAR_NAME!=null?((PrefixexpContext)_localctx).VAR_NAME.getText():null),Tipo.VARIAVEL); 
				setState(289); prefixexpB();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(290); match(17);
				setState(291); exp();
				setState(292); match(41);
				setState(293); prefixexpA();
				setState(294); prefixexpB();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(296); ((PrefixexpContext)_localctx).VAR_NAME = match(VAR_NAME);
				 TabelaDeSimbolos.adicionarSimbolo((((PrefixexpContext)_localctx).VAR_NAME!=null?((PrefixexpContext)_localctx).VAR_NAME.getText():null),Tipo.VARIAVEL); 
				setState(298); prefixexpA();
				setState(299); prefixexpB();
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

	public static class PrefixexpBContext extends ParserRuleContext {
		public Token VAR_NAME;
		public PrefixexpAContext prefixexpA() {
			return getRuleContext(PrefixexpAContext.class,0);
		}
		public TerminalNode VAR_NAME() { return getToken(LuaParser.VAR_NAME, 0); }
		public PrefixexpBContext prefixexpB() {
			return getRuleContext(PrefixexpBContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public PrefixexpBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixexpB; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterPrefixexpB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitPrefixexpB(this);
		}
	}

	public final PrefixexpBContext prefixexpB() throws RecognitionException {
		PrefixexpBContext _localctx = new PrefixexpBContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_prefixexpB);
		try {
			setState(337);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303); args();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304); match(25);
				setState(305); ((PrefixexpBContext)_localctx).VAR_NAME = match(VAR_NAME);
				 TabelaDeSimbolos.adicionarSimbolo((((PrefixexpBContext)_localctx).VAR_NAME!=null?((PrefixexpBContext)_localctx).VAR_NAME.getText():null),Tipo.VARIAVEL); 
				setState(307); args();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(308); args();
				setState(309); prefixexpA();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(311); match(25);
				setState(312); ((PrefixexpBContext)_localctx).VAR_NAME = match(VAR_NAME);
				 TabelaDeSimbolos.adicionarSimbolo((((PrefixexpBContext)_localctx).VAR_NAME!=null?((PrefixexpBContext)_localctx).VAR_NAME.getText():null),Tipo.VARIAVEL); 
				setState(314); args();
				setState(315); prefixexpA();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(317); args();
				setState(318); prefixexpB();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(320); match(25);
				setState(321); ((PrefixexpBContext)_localctx).VAR_NAME = match(VAR_NAME);
				 TabelaDeSimbolos.adicionarSimbolo((((PrefixexpBContext)_localctx).VAR_NAME!=null?((PrefixexpBContext)_localctx).VAR_NAME.getText():null),Tipo.VARIAVEL); 
				setState(323); args();
				setState(324); prefixexpB();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(326); args();
				setState(327); prefixexpA();
				setState(328); prefixexpB();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(330); match(25);
				setState(331); ((PrefixexpBContext)_localctx).VAR_NAME = match(VAR_NAME);
				 TabelaDeSimbolos.adicionarSimbolo((((PrefixexpBContext)_localctx).VAR_NAME!=null?((PrefixexpBContext)_localctx).VAR_NAME.getText():null),Tipo.VARIAVEL); 
				setState(333); args();
				setState(334); prefixexpA();
				setState(335); prefixexpB();
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

	public static class PrefixexpAContext extends ParserRuleContext {
		public Token VAR_NAME;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PrefixexpAContext prefixexpA() {
			return getRuleContext(PrefixexpAContext.class,0);
		}
		public TerminalNode VAR_NAME() { return getToken(LuaParser.VAR_NAME, 0); }
		public PrefixexpAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixexpA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterPrefixexpA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitPrefixexpA(this);
		}
	}

	public final PrefixexpAContext prefixexpA() throws RecognitionException {
		PrefixexpAContext _localctx = new PrefixexpAContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_prefixexpA);
		try {
			setState(355);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339); match(27);
				setState(340); exp();
				setState(341); match(31);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343); match(23);
				setState(344); ((PrefixexpAContext)_localctx).VAR_NAME = match(VAR_NAME);
				 TabelaDeSimbolos.adicionarSimbolo((((PrefixexpAContext)_localctx).VAR_NAME!=null?((PrefixexpAContext)_localctx).VAR_NAME.getText():null),Tipo.VARIAVEL); 
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(346); match(27);
				setState(347); exp();
				setState(348); match(31);
				setState(349); prefixexpA();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(351); match(23);
				setState(352); ((PrefixexpAContext)_localctx).VAR_NAME = match(VAR_NAME);
				 TabelaDeSimbolos.adicionarSimbolo((((PrefixexpAContext)_localctx).VAR_NAME!=null?((PrefixexpAContext)_localctx).VAR_NAME.getText():null),Tipo.VARIAVEL); 
				setState(354); prefixexpA();
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
		public Token VAR_NAME;
		public PrefixexpContext prefixexp() {
			return getRuleContext(PrefixexpContext.class,0);
		}
		public TerminalNode VAR_NAME() { return getToken(LuaParser.VAR_NAME, 0); }
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
		enterRule(_localctx, 30, RULE_functioncall);
		try {
			setState(366);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357); prefixexp();
				setState(358); args();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360); prefixexp();
				setState(361); match(25);
				setState(362); ((FunctioncallContext)_localctx).VAR_NAME = match(VAR_NAME);
				 TabelaDeSimbolos.adicionarSimbolo((((FunctioncallContext)_localctx).VAR_NAME!=null?((FunctioncallContext)_localctx).VAR_NAME.getText():null),Tipo.VARIAVEL); 
				setState(364); args();
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
		enterRule(_localctx, 32, RULE_args);
		int _la;
		try {
			setState(375);
			switch (_input.LA(1)) {
			case 17:
				enterOuterAlt(_localctx, 1);
				{
				setState(368); match(17);
				setState(370);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 5) | (1L << 17) | (1L << 22) | (1L << 24) | (1L << 35) | (1L << 39) | (1L << 43) | (1L << 46) | (1L << 47) | (1L << VAR_NAME) | (1L << REAL_NUM) | (1L << STRING))) != 0)) {
					{
					setState(369); explist();
					}
				}

				setState(372); match(41);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 2);
				{
				setState(373); tableconstructor();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(374); match(STRING);
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
		enterRule(_localctx, 34, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377); match(39);
			setState(378); funcbody();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 36, RULE_funcbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380); match(17);
			setState(382);
			_la = _input.LA(1);
			if (_la==24 || _la==VAR_NAME) {
				{
				setState(381); parlist();
				}
			}

			setState(384); match(41);
			setState(385); block();
			setState(386); match(40);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 38, RULE_parlist);
		int _la;
		try {
			setState(394);
			switch (_input.LA(1)) {
			case VAR_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(388); namelist();
				setState(391);
				_la = _input.LA(1);
				if (_la==20) {
					{
					setState(389); match(20);
					setState(390); match(24);
					}
				}

				}
				break;
			case 24:
				enterOuterAlt(_localctx, 2);
				{
				setState(393); match(24);
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
		enterRule(_localctx, 40, RULE_tableconstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396); match(5);
			setState(398);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 5) | (1L << 17) | (1L << 22) | (1L << 24) | (1L << 27) | (1L << 35) | (1L << 39) | (1L << 43) | (1L << 46) | (1L << 47) | (1L << VAR_NAME) | (1L << REAL_NUM) | (1L << STRING))) != 0)) {
				{
				setState(397); fieldlist();
				}
			}

			setState(400); match(9);
			}
		}
		catch (RecognitionException re) {
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
		public List<FieldsepContext> fieldsep() {
			return getRuleContexts(FieldsepContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public FieldsepContext fieldsep(int i) {
			return getRuleContext(FieldsepContext.class,i);
		}
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
		enterRule(_localctx, 42, RULE_fieldlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(402); field();
			setState(408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(403); fieldsep();
					setState(404); field();
					}
					} 
				}
				setState(410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(412);
			_la = _input.LA(1);
			if (_la==7 || _la==20) {
				{
				setState(411); fieldsep();
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
		public Token VAR_NAME;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode VAR_NAME() { return getToken(LuaParser.VAR_NAME, 0); }
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
		enterRule(_localctx, 44, RULE_field);
		try {
			setState(425);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414); match(27);
				setState(415); exp();
				setState(416); match(31);
				setState(417); match(10);
				setState(418); exp();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420); ((FieldContext)_localctx).VAR_NAME = match(VAR_NAME);
				 TabelaDeSimbolos.adicionarSimbolo((((FieldContext)_localctx).VAR_NAME!=null?((FieldContext)_localctx).VAR_NAME.getText():null),Tipo.VARIAVEL); 
				setState(422); match(10);
				setState(423); exp();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(424); exp();
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

	public static class FieldsepContext extends ParserRuleContext {
		public FieldsepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldsep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFieldsep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFieldsep(this);
		}
	}

	public final FieldsepContext fieldsep() throws RecognitionException {
		FieldsepContext _localctx = new FieldsepContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fieldsep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_la = _input.LA(1);
			if ( !(_la==7 || _la==20) ) {
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
		enterRule(_localctx, 48, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
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
		enterRule(_localctx, 50, RULE_unop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\39\u01b4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\5\3;\n\3\7\3=\n\3\f\3\16\3@\13\3"+
		"\3\3\3\3\5\3D\n\3\5\3F\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\7\5g\n\5\f\5\16\5j\13\5\3\5\3\5\5\5n\n\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5{\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"\u0096\n\5\5\5\u0098\n\5\3\6\3\6\5\6\u009c\n\6\3\6\5\6\u009f\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\7\7\u00a6\n\7\f\7\16\7\u00a9\13\7\3\7\3\7\3\7\5\7\u00ae"+
		"\n\7\3\b\3\b\3\b\7\b\u00b3\n\b\f\b\16\b\u00b6\13\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c4\n\t\3\n\3\n\3\n\3\n\3\n\7\n\u00cb"+
		"\n\n\f\n\16\n\u00ce\13\n\3\13\3\13\3\13\7\13\u00d3\n\13\f\13\16\13\u00d6"+
		"\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0104\n\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u010d\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0130\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0154\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0166\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0171\n\21\3\22\3\22"+
		"\5\22\u0175\n\22\3\22\3\22\3\22\5\22\u017a\n\22\3\23\3\23\3\23\3\24\3"+
		"\24\5\24\u0181\n\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u018a\n\25"+
		"\3\25\5\25\u018d\n\25\3\26\3\26\5\26\u0191\n\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\7\27\u0199\n\27\f\27\16\27\u019c\13\27\3\27\5\27\u019f\n\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01ac\n\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\33\2\34\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\2\5\4\2\t\t\26\26\16\2\3\3\n\n\r\r\20\20\25"+
		"\25\34\34\36 \"#&&,,..\61\61\4\2%%\60\61\u01e7\2\66\3\2\2\2\4>\3\2\2\2"+
		"\6G\3\2\2\2\b\u0097\3\2\2\2\n\u009e\3\2\2\2\f\u00a0\3\2\2\2\16\u00af\3"+
		"\2\2\2\20\u00c3\3\2\2\2\22\u00c5\3\2\2\2\24\u00d4\3\2\2\2\26\u0103\3\2"+
		"\2\2\30\u010c\3\2\2\2\32\u012f\3\2\2\2\34\u0153\3\2\2\2\36\u0165\3\2\2"+
		"\2 \u0170\3\2\2\2\"\u0179\3\2\2\2$\u017b\3\2\2\2&\u017e\3\2\2\2(\u018c"+
		"\3\2\2\2*\u018e\3\2\2\2,\u0194\3\2\2\2.\u01ab\3\2\2\2\60\u01ad\3\2\2\2"+
		"\62\u01af\3\2\2\2\64\u01b1\3\2\2\2\66\67\5\4\3\2\67\3\3\2\2\28:\5\b\5"+
		"\29;\7\t\2\2:9\3\2\2\2:;\3\2\2\2;=\3\2\2\2<8\3\2\2\2=@\3\2\2\2><\3\2\2"+
		"\2>?\3\2\2\2?E\3\2\2\2@>\3\2\2\2AC\5\n\6\2BD\7\t\2\2CB\3\2\2\2CD\3\2\2"+
		"\2DF\3\2\2\2EA\3\2\2\2EF\3\2\2\2F\5\3\2\2\2GH\5\4\3\2H\7\3\2\2\2IJ\5\16"+
		"\b\2JK\7\f\2\2KL\5\24\13\2L\u0098\3\2\2\2M\u0098\5 \21\2NO\7\24\2\2OP"+
		"\5\6\4\2PQ\7*\2\2Q\u0098\3\2\2\2RS\7\b\2\2ST\5\26\f\2TU\7\24\2\2UV\5\6"+
		"\4\2VW\7*\2\2W\u0098\3\2\2\2XY\7\27\2\2YZ\5\6\4\2Z[\7$\2\2[\\\5\26\f\2"+
		"\\\u0098\3\2\2\2]^\7\17\2\2^_\5\26\f\2_`\7/\2\2`h\5\6\4\2ab\7\4\2\2bc"+
		"\5\26\f\2cd\7/\2\2de\5\6\4\2eg\3\2\2\2fa\3\2\2\2gj\3\2\2\2hf\3\2\2\2h"+
		"i\3\2\2\2im\3\2\2\2jh\3\2\2\2kl\7(\2\2ln\5\6\4\2mk\3\2\2\2mn\3\2\2\2n"+
		"o\3\2\2\2op\7*\2\2p\u0098\3\2\2\2qr\7\16\2\2rs\7\62\2\2st\b\5\1\2tu\7"+
		"\f\2\2uv\5\26\f\2vw\7\26\2\2wz\5\26\f\2xy\7\26\2\2y{\5\26\f\2zx\3\2\2"+
		"\2z{\3\2\2\2{|\3\2\2\2|}\7\24\2\2}~\5\6\4\2~\177\7*\2\2\177\u0098\3\2"+
		"\2\2\u0080\u0081\7\16\2\2\u0081\u0082\5\22\n\2\u0082\u0083\7\'\2\2\u0083"+
		"\u0084\5\24\13\2\u0084\u0085\7\24\2\2\u0085\u0086\5\6\4\2\u0086\u0087"+
		"\7*\2\2\u0087\u0098\3\2\2\2\u0088\u0089\7)\2\2\u0089\u008a\5\f\7\2\u008a"+
		"\u008b\5&\24\2\u008b\u0098\3\2\2\2\u008c\u008d\7\22\2\2\u008d\u008e\7"+
		")\2\2\u008e\u008f\7\62\2\2\u008f\u0090\b\5\1\2\u0090\u0098\5&\24\2\u0091"+
		"\u0092\7\22\2\2\u0092\u0095\5\22\n\2\u0093\u0094\7\f\2\2\u0094\u0096\5"+
		"\24\13\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"I\3\2\2\2\u0097M\3\2\2\2\u0097N\3\2\2\2\u0097R\3\2\2\2\u0097X\3\2\2\2"+
		"\u0097]\3\2\2\2\u0097q\3\2\2\2\u0097\u0080\3\2\2\2\u0097\u0088\3\2\2\2"+
		"\u0097\u008c\3\2\2\2\u0097\u0091\3\2\2\2\u0098\t\3\2\2\2\u0099\u009b\7"+
		"\6\2\2\u009a\u009c\5\24\13\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009f\7\21\2\2\u009e\u0099\3\2\2\2\u009e\u009d\3"+
		"\2\2\2\u009f\13\3\2\2\2\u00a0\u00a1\7\62\2\2\u00a1\u00a7\b\7\1\2\u00a2"+
		"\u00a3\7\31\2\2\u00a3\u00a4\7\62\2\2\u00a4\u00a6\b\7\1\2\u00a5\u00a2\3"+
		"\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00ad\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7\33\2\2\u00ab\u00ac\7"+
		"\62\2\2\u00ac\u00ae\b\7\1\2\u00ad\u00aa\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\r\3\2\2\2\u00af\u00b4\5\20\t\2\u00b0\u00b1\7\26\2\2\u00b1\u00b3\5\20"+
		"\t\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\17\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\62\2"+
		"\2\u00b8\u00c4\b\t\1\2\u00b9\u00ba\5\32\16\2\u00ba\u00bb\7\35\2\2\u00bb"+
		"\u00bc\5\26\f\2\u00bc\u00bd\7!\2\2\u00bd\u00c4\3\2\2\2\u00be\u00bf\5\32"+
		"\16\2\u00bf\u00c0\7\31\2\2\u00c0\u00c1\7\62\2\2\u00c1\u00c2\b\t\1\2\u00c2"+
		"\u00c4\3\2\2\2\u00c3\u00b7\3\2\2\2\u00c3\u00b9\3\2\2\2\u00c3\u00be\3\2"+
		"\2\2\u00c4\21\3\2\2\2\u00c5\u00c6\7\62\2\2\u00c6\u00cc\b\n\1\2\u00c7\u00c8"+
		"\7\26\2\2\u00c8\u00c9\7\62\2\2\u00c9\u00cb\b\n\1\2\u00ca\u00c7\3\2\2\2"+
		"\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\23"+
		"\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\5\26\f\2\u00d0\u00d1\7\26\2\2"+
		"\u00d1\u00d3\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00d8\5\26\f\2\u00d8\25\3\2\2\2\u00d9\u0104\7-\2\2\u00da\u0104\7\30\2"+
		"\2\u00db\u0104\7\5\2\2\u00dc\u0104\7\67\2\2\u00dd\u0104\79\2\2\u00de\u0104"+
		"\7\32\2\2\u00df\u0104\5$\23\2\u00e0\u00e1\7\62\2\2\u00e1\u0104\b\f\1\2"+
		"\u00e2\u0104\5\32\16\2\u00e3\u0104\5*\26\2\u00e4\u00e5\5\64\33\2\u00e5"+
		"\u00e6\5\26\f\2\u00e6\u0104\3\2\2\2\u00e7\u00e8\7-\2\2\u00e8\u0104\5\30"+
		"\r\2\u00e9\u00ea\7\30\2\2\u00ea\u0104\5\30\r\2\u00eb\u00ec\7\5\2\2\u00ec"+
		"\u0104\5\30\r\2\u00ed\u00ee\7\67\2\2\u00ee\u0104\5\30\r\2\u00ef\u00f0"+
		"\79\2\2\u00f0\u0104\5\30\r\2\u00f1\u00f2\7\32\2\2\u00f2\u0104\5\30\r\2"+
		"\u00f3\u00f4\5$\23\2\u00f4\u00f5\5\30\r\2\u00f5\u0104\3\2\2\2\u00f6\u00f7"+
		"\7\62\2\2\u00f7\u00f8\b\f\1\2\u00f8\u0104\5\30\r\2\u00f9\u00fa\5\32\16"+
		"\2\u00fa\u00fb\5\30\r\2\u00fb\u0104\3\2\2\2\u00fc\u00fd\5*\26\2\u00fd"+
		"\u00fe\5\30\r\2\u00fe\u0104\3\2\2\2\u00ff\u0100\5\64\33\2\u0100\u0101"+
		"\5\26\f\2\u0101\u0102\5\30\r\2\u0102\u0104\3\2\2\2\u0103\u00d9\3\2\2\2"+
		"\u0103\u00da\3\2\2\2\u0103\u00db\3\2\2\2\u0103\u00dc\3\2\2\2\u0103\u00dd"+
		"\3\2\2\2\u0103\u00de\3\2\2\2\u0103\u00df\3\2\2\2\u0103\u00e0\3\2\2\2\u0103"+
		"\u00e2\3\2\2\2\u0103\u00e3\3\2\2\2\u0103\u00e4\3\2\2\2\u0103\u00e7\3\2"+
		"\2\2\u0103\u00e9\3\2\2\2\u0103\u00eb\3\2\2\2\u0103\u00ed\3\2\2\2\u0103"+
		"\u00ef\3\2\2\2\u0103\u00f1\3\2\2\2\u0103\u00f3\3\2\2\2\u0103\u00f6\3\2"+
		"\2\2\u0103\u00f9\3\2\2\2\u0103\u00fc\3\2\2\2\u0103\u00ff\3\2\2\2\u0104"+
		"\27\3\2\2\2\u0105\u0106\5\62\32\2\u0106\u0107\5\26\f\2\u0107\u0108\5\30"+
		"\r\2\u0108\u010d\3\2\2\2\u0109\u010a\5\62\32\2\u010a\u010b\5\26\f\2\u010b"+
		"\u010d\3\2\2\2\u010c\u0105\3\2\2\2\u010c\u0109\3\2\2\2\u010d\31\3\2\2"+
		"\2\u010e\u010f\7\23\2\2\u010f\u0110\5\26\f\2\u0110\u0111\7+\2\2\u0111"+
		"\u0130\3\2\2\2\u0112\u0113\7\62\2\2\u0113\u0130\b\16\1\2\u0114\u0115\7"+
		"\23\2\2\u0115\u0116\5\26\f\2\u0116\u0117\7+\2\2\u0117\u0118\5\36\20\2"+
		"\u0118\u0130\3\2\2\2\u0119\u011a\7\62\2\2\u011a\u011b\b\16\1\2\u011b\u0130"+
		"\5\36\20\2\u011c\u011d\7\23\2\2\u011d\u011e\5\26\f\2\u011e\u011f\7+\2"+
		"\2\u011f\u0120\5\34\17\2\u0120\u0130\3\2\2\2\u0121\u0122\7\62\2\2\u0122"+
		"\u0123\b\16\1\2\u0123\u0130\5\34\17\2\u0124\u0125\7\23\2\2\u0125\u0126"+
		"\5\26\f\2\u0126\u0127\7+\2\2\u0127\u0128\5\36\20\2\u0128\u0129\5\34\17"+
		"\2\u0129\u0130\3\2\2\2\u012a\u012b\7\62\2\2\u012b\u012c\b\16\1\2\u012c"+
		"\u012d\5\36\20\2\u012d\u012e\5\34\17\2\u012e\u0130\3\2\2\2\u012f\u010e"+
		"\3\2\2\2\u012f\u0112\3\2\2\2\u012f\u0114\3\2\2\2\u012f\u0119\3\2\2\2\u012f"+
		"\u011c\3\2\2\2\u012f\u0121\3\2\2\2\u012f\u0124\3\2\2\2\u012f\u012a\3\2"+
		"\2\2\u0130\33\3\2\2\2\u0131\u0154\5\"\22\2\u0132\u0133\7\33\2\2\u0133"+
		"\u0134\7\62\2\2\u0134\u0135\b\17\1\2\u0135\u0154\5\"\22\2\u0136\u0137"+
		"\5\"\22\2\u0137\u0138\5\36\20\2\u0138\u0154\3\2\2\2\u0139\u013a\7\33\2"+
		"\2\u013a\u013b\7\62\2\2\u013b\u013c\b\17\1\2\u013c\u013d\5\"\22\2\u013d"+
		"\u013e\5\36\20\2\u013e\u0154\3\2\2\2\u013f\u0140\5\"\22\2\u0140\u0141"+
		"\5\34\17\2\u0141\u0154\3\2\2\2\u0142\u0143\7\33\2\2\u0143\u0144\7\62\2"+
		"\2\u0144\u0145\b\17\1\2\u0145\u0146\5\"\22\2\u0146\u0147\5\34\17\2\u0147"+
		"\u0154\3\2\2\2\u0148\u0149\5\"\22\2\u0149\u014a\5\36\20\2\u014a\u014b"+
		"\5\34\17\2\u014b\u0154\3\2\2\2\u014c\u014d\7\33\2\2\u014d\u014e\7\62\2"+
		"\2\u014e\u014f\b\17\1\2\u014f\u0150\5\"\22\2\u0150\u0151\5\36\20\2\u0151"+
		"\u0152\5\34\17\2\u0152\u0154\3\2\2\2\u0153\u0131\3\2\2\2\u0153\u0132\3"+
		"\2\2\2\u0153\u0136\3\2\2\2\u0153\u0139\3\2\2\2\u0153\u013f\3\2\2\2\u0153"+
		"\u0142\3\2\2\2\u0153\u0148\3\2\2\2\u0153\u014c\3\2\2\2\u0154\35\3\2\2"+
		"\2\u0155\u0156\7\35\2\2\u0156\u0157\5\26\f\2\u0157\u0158\7!\2\2\u0158"+
		"\u0166\3\2\2\2\u0159\u015a\7\31\2\2\u015a\u015b\7\62\2\2\u015b\u0166\b"+
		"\20\1\2\u015c\u015d\7\35\2\2\u015d\u015e\5\26\f\2\u015e\u015f\7!\2\2\u015f"+
		"\u0160\5\36\20\2\u0160\u0166\3\2\2\2\u0161\u0162\7\31\2\2\u0162\u0163"+
		"\7\62\2\2\u0163\u0164\b\20\1\2\u0164\u0166\5\36\20\2\u0165\u0155\3\2\2"+
		"\2\u0165\u0159\3\2\2\2\u0165\u015c\3\2\2\2\u0165\u0161\3\2\2\2\u0166\37"+
		"\3\2\2\2\u0167\u0168\5\32\16\2\u0168\u0169\5\"\22\2\u0169\u0171\3\2\2"+
		"\2\u016a\u016b\5\32\16\2\u016b\u016c\7\33\2\2\u016c\u016d\7\62\2\2\u016d"+
		"\u016e\b\21\1\2\u016e\u016f\5\"\22\2\u016f\u0171\3\2\2\2\u0170\u0167\3"+
		"\2\2\2\u0170\u016a\3\2\2\2\u0171!\3\2\2\2\u0172\u0174\7\23\2\2\u0173\u0175"+
		"\5\24\13\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2"+
		"\u0176\u017a\7+\2\2\u0177\u017a\5*\26\2\u0178\u017a\79\2\2\u0179\u0172"+
		"\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u0178\3\2\2\2\u017a#\3\2\2\2\u017b"+
		"\u017c\7)\2\2\u017c\u017d\5&\24\2\u017d%\3\2\2\2\u017e\u0180\7\23\2\2"+
		"\u017f\u0181\5(\25\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182"+
		"\3\2\2\2\u0182\u0183\7+\2\2\u0183\u0184\5\6\4\2\u0184\u0185\7*\2\2\u0185"+
		"\'\3\2\2\2\u0186\u0189\5\22\n\2\u0187\u0188\7\26\2\2\u0188\u018a\7\32"+
		"\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018d\3\2\2\2\u018b"+
		"\u018d\7\32\2\2\u018c\u0186\3\2\2\2\u018c\u018b\3\2\2\2\u018d)\3\2\2\2"+
		"\u018e\u0190\7\7\2\2\u018f\u0191\5,\27\2\u0190\u018f\3\2\2\2\u0190\u0191"+
		"\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\7\13\2\2\u0193+\3\2\2\2\u0194"+
		"\u019a\5.\30\2\u0195\u0196\5\60\31\2\u0196\u0197\5.\30\2\u0197\u0199\3"+
		"\2\2\2\u0198\u0195\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019f\5\60"+
		"\31\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f-\3\2\2\2\u01a0\u01a1"+
		"\7\35\2\2\u01a1\u01a2\5\26\f\2\u01a2\u01a3\7!\2\2\u01a3\u01a4\7\f\2\2"+
		"\u01a4\u01a5\5\26\f\2\u01a5\u01ac\3\2\2\2\u01a6\u01a7\7\62\2\2\u01a7\u01a8"+
		"\b\30\1\2\u01a8\u01a9\7\f\2\2\u01a9\u01ac\5\26\f\2\u01aa\u01ac\5\26\f"+
		"\2\u01ab\u01a0\3\2\2\2\u01ab\u01a6\3\2\2\2\u01ab\u01aa\3\2\2\2\u01ac/"+
		"\3\2\2\2\u01ad\u01ae\t\2\2\2\u01ae\61\3\2\2\2\u01af\u01b0\t\3\2\2\u01b0"+
		"\63\3\2\2\2\u01b1\u01b2\t\4\2\2\u01b2\65\3\2\2\2\":>CEhmz\u0095\u0097"+
		"\u009b\u009e\u00a7\u00ad\u00b4\u00c3\u00cc\u00d4\u0103\u010c\u012f\u0153"+
		"\u0165\u0170\u0174\u0179\u0180\u0189\u018c\u0190\u019a\u019e\u01ab";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}