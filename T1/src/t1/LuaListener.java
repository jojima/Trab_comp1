package t1;
// Generated from D:\TrabalhosGit\Trab_comp1\T1\src\t1\Lua.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LuaParser}.
 */
public interface LuaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LuaParser#funcname}.
	 * @param ctx the parse tree
	 */
	void enterFuncname(@NotNull LuaParser.FuncnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#funcname}.
	 * @param ctx the parse tree
	 */
	void exitFuncname(@NotNull LuaParser.FuncnameContext ctx);

	/**
	 * Enter a parse tree produced by {@link LuaParser#fieldsep}.
	 * @param ctx the parse tree
	 */
	void enterFieldsep(@NotNull LuaParser.FieldsepContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#fieldsep}.
	 * @param ctx the parse tree
	 */
	void exitFieldsep(@NotNull LuaParser.FieldsepContext ctx);

	/**
	 * Enter a parse tree produced by {@link LuaParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(@NotNull LuaParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(@NotNull LuaParser.FunctioncallContext ctx);

	/**
	 * Enter a parse tree produced by {@link LuaParser#parlist}.
	 * @param ctx the parse tree
	 */
	void enterParlist(@NotNull LuaParser.ParlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#parlist}.
	 * @param ctx the parse tree
	 */
	void exitParlist(@NotNull LuaParser.ParlistContext ctx);

	/**
	 * Enter a parse tree produced by {@link LuaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull LuaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull LuaParser.ProgramaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LuaParser#chunk}.
	 * @param ctx the parse tree
	 */
	void enterChunk(@NotNull LuaParser.ChunkContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#chunk}.
	 * @param ctx the parse tree
	 */
	void exitChunk(@NotNull LuaParser.ChunkContext ctx);

	/**
	 * Enter a parse tree produced by {@link LuaParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(@NotNull LuaParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(@NotNull LuaParser.ExplistContext ctx);

	/**
	 * Enter a parse tree produced by {@link LuaParser#unop}.
	 * @param ctx the parse tree
	 */
	void enterUnop(@NotNull LuaParser.UnopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#unop}.
	 * @param ctx the parse tree
	 */
	void exitUnop(@NotNull LuaParser.UnopContext ctx);

	/**
	 * Enter a parse tree produced by {@link LuaParser#prefixexp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixexp(@NotNull LuaParser.PrefixexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#prefixexp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixexp(@NotNull LuaParser.PrefixexpContext ctx);

	/**
	 * Enter a parse tree produced by {@link LuaParser#namelist}.
	 * @param ctx the parse tree
	 */
	void enterNamelist(@NotNull LuaParser.NamelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#namelist}.
	 * @param ctx the parse tree
	 */
	void exitNamelist(@NotNull LuaParser.NamelistContext ctx);

	/**
	 * Enter a parse tree produced by {@link LuaParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull LuaParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull LuaParser.FunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link LuaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull LuaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull LuaParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link LuaParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(@NotNull LuaParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(@NotNull LuaParser.VarlistContext ctx);

	/**
	 * Enter a parse tree produced by {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(@NotNull LuaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(@NotNull LuaParser.ExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link LuaParser#funcbody}.
	 * @param ctx the parse tree
	 */
	void enterFuncbody(@NotNull LuaParser.FuncbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#funcbody}.
	 * @param ctx the parse tree
	 */
	void exitFuncbody(@NotNull LuaParser.FuncbodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull LuaParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull LuaParser.StatContext ctx);

	/**
	 * Enter a parse tree produced by {@link LuaParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull LuaParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull LuaParser.VarContext ctx);

	/**
	 * Enter a parse tree produced by {@link LuaParser#expA}.
	 * @param ctx the parse tree
	 */
	void enterExpA(@NotNull LuaParser.ExpAContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#expA}.
	 * @param ctx the parse tree
	 */
	void exitExpA(@NotNull LuaParser.ExpAContext ctx);

	/**
	 * Enter a parse tree produced by {@link LuaParser#fieldlist}.
	 * @param ctx the parse tree
	 */
	void enterFieldlist(@NotNull LuaParser.FieldlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#fieldlist}.
	 * @param ctx the parse tree
	 */
	void exitFieldlist(@NotNull LuaParser.FieldlistContext ctx);

	/**
	 * Enter a parse tree produced by {@link LuaParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(@NotNull LuaParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(@NotNull LuaParser.ArgsContext ctx);

	/**
	 * Enter a parse tree produced by {@link LuaParser#prefixexpA}.
	 * @param ctx the parse tree
	 */
	void enterPrefixexpA(@NotNull LuaParser.PrefixexpAContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#prefixexpA}.
	 * @param ctx the parse tree
	 */
	void exitPrefixexpA(@NotNull LuaParser.PrefixexpAContext ctx);

	/**
	 * Enter a parse tree produced by {@link LuaParser#prefixexpB}.
	 * @param ctx the parse tree
	 */
	void enterPrefixexpB(@NotNull LuaParser.PrefixexpBContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#prefixexpB}.
	 * @param ctx the parse tree
	 */
	void exitPrefixexpB(@NotNull LuaParser.PrefixexpBContext ctx);

	/**
	 * Enter a parse tree produced by {@link LuaParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(@NotNull LuaParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(@NotNull LuaParser.FieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link LuaParser#laststat}.
	 * @param ctx the parse tree
	 */
	void enterLaststat(@NotNull LuaParser.LaststatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#laststat}.
	 * @param ctx the parse tree
	 */
	void exitLaststat(@NotNull LuaParser.LaststatContext ctx);

	/**
	 * Enter a parse tree produced by {@link LuaParser#tableconstructor}.
	 * @param ctx the parse tree
	 */
	void enterTableconstructor(@NotNull LuaParser.TableconstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#tableconstructor}.
	 * @param ctx the parse tree
	 */
	void exitTableconstructor(@NotNull LuaParser.TableconstructorContext ctx);

	/**
	 * Enter a parse tree produced by {@link LuaParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(@NotNull LuaParser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(@NotNull LuaParser.BinopContext ctx);
}