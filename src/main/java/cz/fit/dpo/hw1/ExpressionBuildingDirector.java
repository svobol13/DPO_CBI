/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.fit.dpo.hw1;

import cz.fit.dpo.hw1.arithmetic.AddOperator;
import cz.fit.dpo.hw1.arithmetic.ArithmeticComponent;
import cz.fit.dpo.hw1.arithmetic.NumericOperand;
import cz.fit.dpo.hw1.arithmetic.SubstractOperator;

/**
 *
 * @author gregy
 */
public class ExpressionBuildingDirector {
	ExpressionBuilder builder;

	public ExpressionBuildingDirector(ExpressionBuilder builder) {
		this.builder = builder;
	}

	public ArithmeticComponent buildFromString(String input) {
		Integer res = null;

		for(int i=0;i<input.length();i++) {
			if(Character.isDigit(input.charAt(i))) {
				if(res != null) {
					res = res*10;
				}
				else {
					res = new Integer(0);
				}
				res += Character.digit(input.charAt(i), 10);

				continue;
			}

			if(res != null) {
				builder.addComponent(new NumericOperand(res));
			}

			switch(input.charAt(i)) {
				case '+':
					builder.addComponent(new AddOperator());
					break;
				case '-':
					builder.addComponent(new SubstractOperator());
					break;
				case ' ':
					continue;
				default:
					throw new RuntimeException("Nemohu zparsovat znak: " + input.charAt(i));
			}
		}

		return builder.getResult();


	}

	
	
}
