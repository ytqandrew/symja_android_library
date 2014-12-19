package org.matheclipse.core.reflection.system;

import static org.matheclipse.core.expression.F.*;

import org.matheclipse.core.eval.exception.Validate;
import org.matheclipse.core.eval.interfaces.AbstractFunctionEvaluator;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.visit.VisitorExpr;

/**
 *  
 */
public class BooleanConvert extends AbstractFunctionEvaluator {

	public BooleanConvert() {
		super();
	}

	class BooleanConvertVisitor extends VisitorExpr {
		public BooleanConvertVisitor() {
			super();
		}

		@Override
		protected IExpr visitAST(IAST ast) {
			if (ast.isNot()) {
				if (ast.arg1().isAST()) {
					IAST notArg1 = (IAST) ast.arg1();
					if (notArg1.isASTSizeGE(Nand, 1)) {
						return notArg1.apply(And);
					} else if (notArg1.isASTSizeGE(Nor, 1)) {
						return notArg1.apply(Or);
					} else if (notArg1.isASTSizeGE(And, 1)) {
						return convertNand(notArg1);
					} else if (notArg1.isASTSizeGE(Or, 1)) {
						return convertNor(notArg1);
					}

				}
			} else if (ast.isASTSizeGE(Xor, 3)) {
				return convertXor(ast);
			} else if (ast.isASTSizeGE(Nand, 1)) {
				return convertNand(ast);
			} else if (ast.isASTSizeGE(Nor, 1)) {
				return convertNor(ast);
			}
			return super.visitAST(ast);
		}

		public IAST convertXor(IAST ast) {
			IExpr temp = ast.arg2();
			if (ast.size() > 3) {
				IAST clone = ast.clone();
				clone.remove(1);
				temp = convertXor(clone);
			}
			return F.Or(F.And(ast.arg1(), F.Not(temp)), F.And(F.Not(ast.arg1()), temp));
		}

		public IAST convertNand(IAST ast) {
			IAST result = F.Or();
			for (int i = 1; i < ast.size(); i++) {
				result.add(Not(ast.get(i)));
			}
			return result;
		}

		public IAST convertNor(IAST ast) {
			IAST result = F.And();
			for (int i = 1; i < ast.size(); i++) {
				result.add(Not(ast.get(i)));
			}
			return result;
		}
	}

	@Override
	public IExpr evaluate(final IAST ast) {
		Validate.checkSize(ast, 2);

		BooleanConvertVisitor bcVisitor = new BooleanConvertVisitor();
		IExpr result = ast.arg1().accept(bcVisitor);
		if (result != null) {
			return result;
		}
		return ast.arg1();
	}
}