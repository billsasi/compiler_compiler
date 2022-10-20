// Generated from Pascal.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PascalParser}.
 */
public interface PascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PascalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PascalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PascalParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PascalParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PascalParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PascalParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PascalParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterLabelDeclarationPart(PascalParser.LabelDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitLabelDeclarationPart(PascalParser.LabelDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(PascalParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(PascalParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinitionPart(PascalParser.ConstantDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinitionPart(PascalParser.ConstantDefinitionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinition(PascalParser.ConstantDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinition(PascalParser.ConstantDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(PascalParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(PascalParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(PascalParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(PascalParser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedInteger(PascalParser.UnsignedIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedInteger(PascalParser.UnsignedIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedReal(PascalParser.UnsignedRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedReal(PascalParser.UnsignedRealContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#scaleFactor}.
	 * @param ctx the parse tree
	 */
	void enterScaleFactor(PascalParser.ScaleFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#scaleFactor}.
	 * @param ctx the parse tree
	 */
	void exitScaleFactor(PascalParser.ScaleFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(PascalParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(PascalParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#constantIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantIdentifier(PascalParser.ConstantIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#constantIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantIdentifier(PascalParser.ConstantIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(PascalParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(PascalParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinitionPart(PascalParser.TypeDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinitionPart(PascalParser.TypeDefinitionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(PascalParser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(PascalParser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PascalParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PascalParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(PascalParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(PascalParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#scalarType}.
	 * @param ctx the parse tree
	 */
	void enterScalarType(PascalParser.ScalarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#scalarType}.
	 * @param ctx the parse tree
	 */
	void exitScalarType(PascalParser.ScalarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#subrangeType}.
	 * @param ctx the parse tree
	 */
	void enterSubrangeType(PascalParser.SubrangeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#subrangeType}.
	 * @param ctx the parse tree
	 */
	void exitSubrangeType(PascalParser.SubrangeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(PascalParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(PascalParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void enterStructuredType(PascalParser.StructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void exitStructuredType(PascalParser.StructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(PascalParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(PascalParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#indexType}.
	 * @param ctx the parse tree
	 */
	void enterIndexType(PascalParser.IndexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#indexType}.
	 * @param ctx the parse tree
	 */
	void exitIndexType(PascalParser.IndexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#componentType}.
	 * @param ctx the parse tree
	 */
	void enterComponentType(PascalParser.ComponentTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#componentType}.
	 * @param ctx the parse tree
	 */
	void exitComponentType(PascalParser.ComponentTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#recordType}.
	 * @param ctx the parse tree
	 */
	void enterRecordType(PascalParser.RecordTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#recordType}.
	 * @param ctx the parse tree
	 */
	void exitRecordType(PascalParser.RecordTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void enterFieldList(PascalParser.FieldListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void exitFieldList(PascalParser.FieldListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#fixedPart}.
	 * @param ctx the parse tree
	 */
	void enterFixedPart(PascalParser.FixedPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#fixedPart}.
	 * @param ctx the parse tree
	 */
	void exitFixedPart(PascalParser.FixedPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#recordSection}.
	 * @param ctx the parse tree
	 */
	void enterRecordSection(PascalParser.RecordSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#recordSection}.
	 * @param ctx the parse tree
	 */
	void exitRecordSection(PascalParser.RecordSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variantType}.
	 * @param ctx the parse tree
	 */
	void enterVariantType(PascalParser.VariantTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variantType}.
	 * @param ctx the parse tree
	 */
	void exitVariantType(PascalParser.VariantTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#tagField}.
	 * @param ctx the parse tree
	 */
	void enterTagField(PascalParser.TagFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#tagField}.
	 * @param ctx the parse tree
	 */
	void exitTagField(PascalParser.TagFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variant}.
	 * @param ctx the parse tree
	 */
	void enterVariant(PascalParser.VariantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variant}.
	 * @param ctx the parse tree
	 */
	void exitVariant(PascalParser.VariantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#caseLabel}.
	 * @param ctx the parse tree
	 */
	void enterCaseLabel(PascalParser.CaseLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#caseLabel}.
	 * @param ctx the parse tree
	 */
	void exitCaseLabel(PascalParser.CaseLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#setType}.
	 * @param ctx the parse tree
	 */
	void enterSetType(PascalParser.SetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#setType}.
	 * @param ctx the parse tree
	 */
	void exitSetType(PascalParser.SetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(PascalParser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(PascalParser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#fileType}.
	 * @param ctx the parse tree
	 */
	void enterFileType(PascalParser.FileTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#fileType}.
	 * @param ctx the parse tree
	 */
	void exitFileType(PascalParser.FileTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#pointerType}.
	 * @param ctx the parse tree
	 */
	void enterPointerType(PascalParser.PointerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#pointerType}.
	 * @param ctx the parse tree
	 */
	void exitPointerType(PascalParser.PointerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationPart(PascalParser.VariableDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationPart(PascalParser.VariableDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(PascalParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(PascalParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterProcedureAndFunctionDeclarationPart(PascalParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitProcedureAndFunctionDeclarationPart(PascalParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureOrFunctionDeclaration(PascalParser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureOrFunctionDeclaration(PascalParser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(PascalParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(PascalParser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#procedureHeading}.
	 * @param ctx the parse tree
	 */
	void enterProcedureHeading(PascalParser.ProcedureHeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#procedureHeading}.
	 * @param ctx the parse tree
	 */
	void exitProcedureHeading(PascalParser.ProcedureHeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterSection(PascalParser.FormalParameterSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterSection(PascalParser.FormalParameterSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void enterParameterGroup(PascalParser.ParameterGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void exitParameterGroup(PascalParser.ParameterGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(PascalParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(PascalParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#functionHeading}.
	 * @param ctx the parse tree
	 */
	void enterFunctionHeading(PascalParser.FunctionHeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#functionHeading}.
	 * @param ctx the parse tree
	 */
	void exitFunctionHeading(PascalParser.FunctionHeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#resultType}.
	 * @param ctx the parse tree
	 */
	void enterResultType(PascalParser.ResultTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#resultType}.
	 * @param ctx the parse tree
	 */
	void exitResultType(PascalParser.ResultTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#statementPart}.
	 * @param ctx the parse tree
	 */
	void enterStatementPart(PascalParser.StatementPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#statementPart}.
	 * @param ctx the parse tree
	 */
	void exitStatementPart(PascalParser.StatementPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PascalParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PascalParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnlabelledStatement(PascalParser.UnlabelledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnlabelledStatement(PascalParser.UnlabelledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(PascalParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(PascalParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(PascalParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(PascalParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PascalParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PascalParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#entireVariable}.
	 * @param ctx the parse tree
	 */
	void enterEntireVariable(PascalParser.EntireVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#entireVariable}.
	 * @param ctx the parse tree
	 */
	void exitEntireVariable(PascalParser.EntireVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableIdentifier(PascalParser.VariableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableIdentifier(PascalParser.VariableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#componentVariable}.
	 * @param ctx the parse tree
	 */
	void enterComponentVariable(PascalParser.ComponentVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#componentVariable}.
	 * @param ctx the parse tree
	 */
	void exitComponentVariable(PascalParser.ComponentVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#indexedVariable}.
	 * @param ctx the parse tree
	 */
	void enterIndexedVariable(PascalParser.IndexedVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#indexedVariable}.
	 * @param ctx the parse tree
	 */
	void exitIndexedVariable(PascalParser.IndexedVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#arrayVariable}.
	 * @param ctx the parse tree
	 */
	void enterArrayVariable(PascalParser.ArrayVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#arrayVariable}.
	 * @param ctx the parse tree
	 */
	void exitArrayVariable(PascalParser.ArrayVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#fieldDesignator}.
	 * @param ctx the parse tree
	 */
	void enterFieldDesignator(PascalParser.FieldDesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#fieldDesignator}.
	 * @param ctx the parse tree
	 */
	void exitFieldDesignator(PascalParser.FieldDesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#recordVariable}.
	 * @param ctx the parse tree
	 */
	void enterRecordVariable(PascalParser.RecordVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#recordVariable}.
	 * @param ctx the parse tree
	 */
	void exitRecordVariable(PascalParser.RecordVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#fieldIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldIdentifier(PascalParser.FieldIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#fieldIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldIdentifier(PascalParser.FieldIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#fileBuffer}.
	 * @param ctx the parse tree
	 */
	void enterFileBuffer(PascalParser.FileBufferContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#fileBuffer}.
	 * @param ctx the parse tree
	 */
	void exitFileBuffer(PascalParser.FileBufferContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#fileVariable}.
	 * @param ctx the parse tree
	 */
	void enterFileVariable(PascalParser.FileVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#fileVariable}.
	 * @param ctx the parse tree
	 */
	void exitFileVariable(PascalParser.FileVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#referencedVariable}.
	 * @param ctx the parse tree
	 */
	void enterReferencedVariable(PascalParser.ReferencedVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#referencedVariable}.
	 * @param ctx the parse tree
	 */
	void exitReferencedVariable(PascalParser.ReferencedVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#pointerVariable}.
	 * @param ctx the parse tree
	 */
	void enterPointerVariable(PascalParser.PointerVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#pointerVariable}.
	 * @param ctx the parse tree
	 */
	void exitPointerVariable(PascalParser.PointerVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PascalParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PascalParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperator(PascalParser.RelationalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperator(PascalParser.RelationalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(PascalParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(PascalParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#addingOperator}.
	 * @param ctx the parse tree
	 */
	void enterAddingOperator(PascalParser.AddingOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#addingOperator}.
	 * @param ctx the parse tree
	 */
	void exitAddingOperator(PascalParser.AddingOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PascalParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PascalParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#multiplyingOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingOperator(PascalParser.MultiplyingOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#multiplyingOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingOperator(PascalParser.MultiplyingOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PascalParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PascalParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedConstant(PascalParser.UnsignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedConstant(PascalParser.UnsignedConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDesignator(PascalParser.FunctionDesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDesignator(PascalParser.FunctionDesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionIdentifier(PascalParser.FunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionIdentifier(PascalParser.FunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(PascalParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(PascalParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(PascalParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(PascalParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(PascalParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(PascalParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureStatement(PascalParser.ProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureStatement(PascalParser.ProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#procedureIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterProcedureIdentifier(PascalParser.ProcedureIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#procedureIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitProcedureIdentifier(PascalParser.ProcedureIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void enterActualParameter(PascalParser.ActualParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void exitActualParameter(PascalParser.ActualParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#goToStatement}.
	 * @param ctx the parse tree
	 */
	void enterGoToStatement(PascalParser.GoToStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#goToStatement}.
	 * @param ctx the parse tree
	 */
	void exitGoToStatement(PascalParser.GoToStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(PascalParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(PascalParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(PascalParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(PascalParser.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructuredStatement(PascalParser.StructuredStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructuredStatement(PascalParser.StructuredStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(PascalParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(PascalParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(PascalParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(PascalParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PascalParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PascalParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(PascalParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(PascalParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#caseListElement}.
	 * @param ctx the parse tree
	 */
	void enterCaseListElement(PascalParser.CaseListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#caseListElement}.
	 * @param ctx the parse tree
	 */
	void exitCaseListElement(PascalParser.CaseListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#caseLabelList}.
	 * @param ctx the parse tree
	 */
	void enterCaseLabelList(PascalParser.CaseLabelListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#caseLabelList}.
	 * @param ctx the parse tree
	 */
	void exitCaseLabelList(PascalParser.CaseLabelListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#repetitiveStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepetitiveStatement(PascalParser.RepetitiveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#repetitiveStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepetitiveStatement(PascalParser.RepetitiveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(PascalParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(PascalParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(PascalParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(PascalParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(PascalParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(PascalParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#controlVariable}.
	 * @param ctx the parse tree
	 */
	void enterControlVariable(PascalParser.ControlVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#controlVariable}.
	 * @param ctx the parse tree
	 */
	void exitControlVariable(PascalParser.ControlVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#forList}.
	 * @param ctx the parse tree
	 */
	void enterForList(PascalParser.ForListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#forList}.
	 * @param ctx the parse tree
	 */
	void exitForList(PascalParser.ForListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void enterInitialValue(PascalParser.InitialValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void exitInitialValue(PascalParser.InitialValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void enterFinalValue(PascalParser.FinalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void exitFinalValue(PascalParser.FinalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void enterWithStatement(PascalParser.WithStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void exitWithStatement(PascalParser.WithStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#recordVariableList}.
	 * @param ctx the parse tree
	 */
	void enterRecordVariableList(PascalParser.RecordVariableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#recordVariableList}.
	 * @param ctx the parse tree
	 */
	void exitRecordVariableList(PascalParser.RecordVariableListContext ctx);
}