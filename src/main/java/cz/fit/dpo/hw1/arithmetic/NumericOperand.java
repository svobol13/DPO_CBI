package cz.fit.dpo.hw1.arithmetic;

import cz.fit.dpo.hw1.arithmetic.elements.ExpressionElement;
import cz.fit.dpo.hw1.arithmetic.elements.Number;

/**
 * Represents number in the arithmetic expression
 * 
 * @author Jan Kurš
 */
public class NumericOperand extends ArithmeticComponent{
	private Integer value;
	
	public NumericOperand(Integer value) {
		this.value = value;
	}

	@Override
	public Integer evaluate() {
		return this.value;
	}

	@Override
	public ExpressionElement getExpressionElement() {
		return new Number(this.value);
	}
	
}
