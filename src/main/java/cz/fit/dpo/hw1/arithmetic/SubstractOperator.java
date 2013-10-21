package cz.fit.dpo.hw1.arithmetic;

import cz.fit.dpo.hw1.arithmetic.elements.ExpressionElement;
import cz.fit.dpo.hw1.arithmetic.elements.SubstractOperation;
/**
 * Represents + operation
 * 
 * @author Jan Kurš
 * 
 */
public class SubstractOperator extends ArithmeticComponent
{
	private ArithmeticComponent[] children;

	public SubstractOperator(ArithmeticComponent left, ArithmeticComponent right) {
		children = new ArithmeticComponent[2];
		children[0] = left;
		children[1] = right;
	}

	@Override
	public Integer evaluate() {
		return getChild(0).evaluate() - getChild(1).evaluate();
	}

	@Override
	public int getArity() {
		return 2;
	}

	@Override
	public ArithmeticComponent getChild(int index) {
		return super.getChild(index); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public ExpressionElement getExpressionElement() {
		return new SubstractOperation();
	}
	

}
