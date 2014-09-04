package org.matheclipse.core.reflection.system;

import org.matheclipse.core.eval.exception.Validate;
import org.matheclipse.core.eval.interfaces.AbstractFunctionEvaluator;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;

public class ExpandAll extends AbstractFunctionEvaluator {
	public ExpandAll() {
		super();
	}

	@Override
	public IExpr evaluate(final IAST ast) {
		Validate.checkRange(ast, 2, 3);

		IExpr patt = null;
		if (ast.size() > 2) {
			patt = ast.arg2();
		}
		IExpr temp = expandAll(ast.arg1(), patt);
		if (temp != null) {
			return temp;
		}

		return ast.arg1();
	}

	public static IExpr expandAll(final IExpr expr, IExpr patt) {
		if (!expr.isAST()) {
			return null;
		}
		IAST ast = (IAST) expr;
		if (patt != null && ast.isFree(patt, true)) {
			return null;
		}
		int j = ast.size();
		IExpr temp = null;
		for (int i = 1; i < ast.size(); i++) {
			if (ast.get(i).isAST()) {
				j = i;
				break;
			}
		}
		if (j >= ast.size()) {
			return null;
		}
		IAST result = null;
		for (int i = j; i < ast.size(); i++) {
			if (ast.get(i).isAST()) {
				temp = expandAll(ast.get(i), patt);
				if (temp != null) {
					if (result == null) {
						result = ast.clone();
					}
					result.set(i, temp);
				}
			}
		}
		if (result == null) {
			return Expand.expand(ast, patt);
		}
		temp = Expand.expand(result, patt);
		if (temp != null) {
			return temp;
		}
		return result;
	}

}