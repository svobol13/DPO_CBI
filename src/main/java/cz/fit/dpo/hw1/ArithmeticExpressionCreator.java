package cz.fit.dpo.hw1;

import cz.fit.dpo.hw1.arithmetic.AddOperator;
import cz.fit.dpo.hw1.arithmetic.ArithmeticComponent;
import cz.fit.dpo.hw1.arithmetic.ArithmeticExpression;
import cz.fit.dpo.hw1.arithmetic.NumericOperand;
import cz.fit.dpo.hw1.arithmetic.SubstractOperator;


/**
 * Stupid class which can create some {@link ArithmeticExpression}s.
 * 
 * @author Jan Kurš
 *
 */
public class ArithmeticExpressionCreator
{
	/**
	 * Creates 3 - (1 + 2)
	 * 
	 * This is ugly. I don't like creating expressions in this
	 * 	form. I never know, what expression I have created...
	 */
	public ArithmeticExpression createExpression1()
	{
		return createExpressionFromRPN("312+-");
	}

	/**
	 * Creates (3 - 1) + 2
	 *
	 * This is ugly. I don't like creating expressions in this
	 * 	form. I never know, what expression I have created...
	 */
	public ArithmeticExpression createExpression2()
	{
		return createExpressionFromRPN("31-2+");
	}
	
	/**
	 * Creates any expression from the RPN input. This is nice and
	 * 	universal. 
	 * 
	 * @see http://en.wikipedia.org/wiki/Reverse_Polish_notation
	 * 	
	 * @param input in Reverse Polish Notation
	 * @return {@link ArithmeticExpression} equivalent to the RPN input.
	 */
	public ArithmeticExpression createExpressionFromRPN(String input)
	{
		ExpressionBuildingDirector director = new ExpressionBuildingDirector(new RPNExpressionBuilder());
		ArithmeticExpression e = new ArithmeticExpression();
		e.setRoot(director.buildFromString(input));

		return e;
	}
}
