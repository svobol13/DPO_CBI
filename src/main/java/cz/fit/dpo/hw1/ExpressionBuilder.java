/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.fit.dpo.hw1;

import cz.fit.dpo.hw1.arithmetic.ArithmeticComponent;

/**
 *
 * @author gregy
 */
public abstract class ExpressionBuilder {

	public abstract void addComponent(ArithmeticComponent operation);
	public abstract ArithmeticComponent getResult();
	
}
