// Generated from pascal2.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pascal2Parser}.
 */
public interface pascal2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(pascal2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(pascal2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#programHeading}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeading(pascal2Parser.ProgramHeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#programHeading}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeading(pascal2Parser.ProgramHeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(pascal2Parser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(pascal2Parser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(pascal2Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(pascal2Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#usesUnitsPart}.
	 * @param ctx the parse tree
	 */
	void enterUsesUnitsPart(pascal2Parser.UsesUnitsPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#usesUnitsPart}.
	 * @param ctx the parse tree
	 */
	void exitUsesUnitsPart(pascal2Parser.UsesUnitsPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterLabelDeclarationPart(pascal2Parser.LabelDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitLabelDeclarationPart(pascal2Parser.LabelDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(pascal2Parser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(pascal2Parser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinitionPart(pascal2Parser.ConstantDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinitionPart(pascal2Parser.ConstantDefinitionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinition(pascal2Parser.ConstantDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinition(pascal2Parser.ConstantDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#constantChr}.
	 * @param ctx the parse tree
	 */
	void enterConstantChr(pascal2Parser.ConstantChrContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#constantChr}.
	 * @param ctx the parse tree
	 */
	void exitConstantChr(pascal2Parser.ConstantChrContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(pascal2Parser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(pascal2Parser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(pascal2Parser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(pascal2Parser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedInteger(pascal2Parser.UnsignedIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedInteger(pascal2Parser.UnsignedIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedReal(pascal2Parser.UnsignedRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedReal(pascal2Parser.UnsignedRealContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(pascal2Parser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(pascal2Parser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#bool_}.
	 * @param ctx the parse tree
	 */
	void enterBool_(pascal2Parser.Bool_Context ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#bool_}.
	 * @param ctx the parse tree
	 */
	void exitBool_(pascal2Parser.Bool_Context ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(pascal2Parser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(pascal2Parser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinitionPart(pascal2Parser.TypeDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinitionPart(pascal2Parser.TypeDefinitionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(pascal2Parser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(pascal2Parser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(pascal2Parser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(pascal2Parser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#procedureType}.
	 * @param ctx the parse tree
	 */
	void enterProcedureType(pascal2Parser.ProcedureTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#procedureType}.
	 * @param ctx the parse tree
	 */
	void exitProcedureType(pascal2Parser.ProcedureTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#type_}.
	 * @param ctx the parse tree
	 */
	void enterType_(pascal2Parser.Type_Context ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#type_}.
	 * @param ctx the parse tree
	 */
	void exitType_(pascal2Parser.Type_Context ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(pascal2Parser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(pascal2Parser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#scalarType}.
	 * @param ctx the parse tree
	 */
	void enterScalarType(pascal2Parser.ScalarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#scalarType}.
	 * @param ctx the parse tree
	 */
	void exitScalarType(pascal2Parser.ScalarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#subrangeType}.
	 * @param ctx the parse tree
	 */
	void enterSubrangeType(pascal2Parser.SubrangeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#subrangeType}.
	 * @param ctx the parse tree
	 */
	void exitSubrangeType(pascal2Parser.SubrangeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(pascal2Parser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(pascal2Parser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#structuredType}.
	 * @param ctx the parse tree
	 */
	void enterStructuredType(pascal2Parser.StructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#structuredType}.
	 * @param ctx the parse tree
	 */
	void exitStructuredType(pascal2Parser.StructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 */
	void enterUnpackedStructuredType(pascal2Parser.UnpackedStructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 */
	void exitUnpackedStructuredType(pascal2Parser.UnpackedStructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#stringtype}.
	 * @param ctx the parse tree
	 */
	void enterStringtype(pascal2Parser.StringtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#stringtype}.
	 * @param ctx the parse tree
	 */
	void exitStringtype(pascal2Parser.StringtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(pascal2Parser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(pascal2Parser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(pascal2Parser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(pascal2Parser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#indexType}.
	 * @param ctx the parse tree
	 */
	void enterIndexType(pascal2Parser.IndexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#indexType}.
	 * @param ctx the parse tree
	 */
	void exitIndexType(pascal2Parser.IndexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#componentType}.
	 * @param ctx the parse tree
	 */
	void enterComponentType(pascal2Parser.ComponentTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#componentType}.
	 * @param ctx the parse tree
	 */
	void exitComponentType(pascal2Parser.ComponentTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#recordType}.
	 * @param ctx the parse tree
	 */
	void enterRecordType(pascal2Parser.RecordTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#recordType}.
	 * @param ctx the parse tree
	 */
	void exitRecordType(pascal2Parser.RecordTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#fieldList}.
	 * @param ctx the parse tree
	 */
	void enterFieldList(pascal2Parser.FieldListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#fieldList}.
	 * @param ctx the parse tree
	 */
	void exitFieldList(pascal2Parser.FieldListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#fixedPart}.
	 * @param ctx the parse tree
	 */
	void enterFixedPart(pascal2Parser.FixedPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#fixedPart}.
	 * @param ctx the parse tree
	 */
	void exitFixedPart(pascal2Parser.FixedPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#recordSection}.
	 * @param ctx the parse tree
	 */
	void enterRecordSection(pascal2Parser.RecordSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#recordSection}.
	 * @param ctx the parse tree
	 */
	void exitRecordSection(pascal2Parser.RecordSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#variantPart}.
	 * @param ctx the parse tree
	 */
	void enterVariantPart(pascal2Parser.VariantPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#variantPart}.
	 * @param ctx the parse tree
	 */
	void exitVariantPart(pascal2Parser.VariantPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(pascal2Parser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(pascal2Parser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#variant}.
	 * @param ctx the parse tree
	 */
	void enterVariant(pascal2Parser.VariantContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#variant}.
	 * @param ctx the parse tree
	 */
	void exitVariant(pascal2Parser.VariantContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#setType}.
	 * @param ctx the parse tree
	 */
	void enterSetType(pascal2Parser.SetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#setType}.
	 * @param ctx the parse tree
	 */
	void exitSetType(pascal2Parser.SetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(pascal2Parser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(pascal2Parser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#fileType}.
	 * @param ctx the parse tree
	 */
	void enterFileType(pascal2Parser.FileTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#fileType}.
	 * @param ctx the parse tree
	 */
	void exitFileType(pascal2Parser.FileTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#pointerType}.
	 * @param ctx the parse tree
	 */
	void enterPointerType(pascal2Parser.PointerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#pointerType}.
	 * @param ctx the parse tree
	 */
	void exitPointerType(pascal2Parser.PointerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationPart(pascal2Parser.VariableDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationPart(pascal2Parser.VariableDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(pascal2Parser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(pascal2Parser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterProcedureAndFunctionDeclarationPart(pascal2Parser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitProcedureAndFunctionDeclarationPart(pascal2Parser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureOrFunctionDeclaration(pascal2Parser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureOrFunctionDeclaration(pascal2Parser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(pascal2Parser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(pascal2Parser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(pascal2Parser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(pascal2Parser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterSection(pascal2Parser.FormalParameterSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterSection(pascal2Parser.FormalParameterSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void enterParameterGroup(pascal2Parser.ParameterGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void exitParameterGroup(pascal2Parser.ParameterGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(pascal2Parser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(pascal2Parser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#constList}.
	 * @param ctx the parse tree
	 */
	void enterConstList(pascal2Parser.ConstListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#constList}.
	 * @param ctx the parse tree
	 */
	void exitConstList(pascal2Parser.ConstListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(pascal2Parser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(pascal2Parser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#resultType}.
	 * @param ctx the parse tree
	 */
	void enterResultType(pascal2Parser.ResultTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#resultType}.
	 * @param ctx the parse tree
	 */
	void exitResultType(pascal2Parser.ResultTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(pascal2Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(pascal2Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnlabelledStatement(pascal2Parser.UnlabelledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnlabelledStatement(pascal2Parser.UnlabelledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(pascal2Parser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(pascal2Parser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(pascal2Parser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(pascal2Parser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(pascal2Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(pascal2Parser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(pascal2Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(pascal2Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationaloperator(pascal2Parser.RelationaloperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationaloperator(pascal2Parser.RelationaloperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(pascal2Parser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(pascal2Parser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#additiveoperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveoperator(pascal2Parser.AdditiveoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#additiveoperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveoperator(pascal2Parser.AdditiveoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(pascal2Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(pascal2Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeoperator(pascal2Parser.MultiplicativeoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeoperator(pascal2Parser.MultiplicativeoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void enterSignedFactor(pascal2Parser.SignedFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void exitSignedFactor(pascal2Parser.SignedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(pascal2Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(pascal2Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedConstant(pascal2Parser.UnsignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedConstant(pascal2Parser.UnsignedConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDesignator(pascal2Parser.FunctionDesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDesignator(pascal2Parser.FunctionDesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(pascal2Parser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(pascal2Parser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#set_}.
	 * @param ctx the parse tree
	 */
	void enterSet_(pascal2Parser.Set_Context ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#set_}.
	 * @param ctx the parse tree
	 */
	void exitSet_(pascal2Parser.Set_Context ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(pascal2Parser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(pascal2Parser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(pascal2Parser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(pascal2Parser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureStatement(pascal2Parser.ProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureStatement(pascal2Parser.ProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void enterActualParameter(pascal2Parser.ActualParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void exitActualParameter(pascal2Parser.ActualParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#parameterwidth}.
	 * @param ctx the parse tree
	 */
	void enterParameterwidth(pascal2Parser.ParameterwidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#parameterwidth}.
	 * @param ctx the parse tree
	 */
	void exitParameterwidth(pascal2Parser.ParameterwidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(pascal2Parser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(pascal2Parser.GotoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(pascal2Parser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(pascal2Parser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#emptyStatement_}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement_(pascal2Parser.EmptyStatement_Context ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#emptyStatement_}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement_(pascal2Parser.EmptyStatement_Context ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#empty_}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_(pascal2Parser.Empty_Context ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#empty_}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_(pascal2Parser.Empty_Context ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructuredStatement(pascal2Parser.StructuredStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructuredStatement(pascal2Parser.StructuredStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(pascal2Parser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(pascal2Parser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(pascal2Parser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(pascal2Parser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(pascal2Parser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(pascal2Parser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(pascal2Parser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(pascal2Parser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(pascal2Parser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(pascal2Parser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#caseListElement}.
	 * @param ctx the parse tree
	 */
	void enterCaseListElement(pascal2Parser.CaseListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#caseListElement}.
	 * @param ctx the parse tree
	 */
	void exitCaseListElement(pascal2Parser.CaseListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepetetiveStatement(pascal2Parser.RepetetiveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepetetiveStatement(pascal2Parser.RepetetiveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(pascal2Parser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(pascal2Parser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(pascal2Parser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(pascal2Parser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(pascal2Parser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(pascal2Parser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#forList}.
	 * @param ctx the parse tree
	 */
	void enterForList(pascal2Parser.ForListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#forList}.
	 * @param ctx the parse tree
	 */
	void exitForList(pascal2Parser.ForListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#initialValue}.
	 * @param ctx the parse tree
	 */
	void enterInitialValue(pascal2Parser.InitialValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#initialValue}.
	 * @param ctx the parse tree
	 */
	void exitInitialValue(pascal2Parser.InitialValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#finalValue}.
	 * @param ctx the parse tree
	 */
	void enterFinalValue(pascal2Parser.FinalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#finalValue}.
	 * @param ctx the parse tree
	 */
	void exitFinalValue(pascal2Parser.FinalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#withStatement}.
	 * @param ctx the parse tree
	 */
	void enterWithStatement(pascal2Parser.WithStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#withStatement}.
	 * @param ctx the parse tree
	 */
	void exitWithStatement(pascal2Parser.WithStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal2Parser#recordVariableList}.
	 * @param ctx the parse tree
	 */
	void enterRecordVariableList(pascal2Parser.RecordVariableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal2Parser#recordVariableList}.
	 * @param ctx the parse tree
	 */
	void exitRecordVariableList(pascal2Parser.RecordVariableListContext ctx);
}