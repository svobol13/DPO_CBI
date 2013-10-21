/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.fit.dpo.hw1;

import cz.fit.dpo.hw1.arithmetic.ArithmeticComponent;
import java.util.Stack;

/**
 *
 * @author gregy
 */
public class RPNExpressionBuilder extends ExpressionBuilder {
	Stack<ArithmeticComponent> buffer;

	@Override
	public void addComponent(ArithmeticComponent operation) {
		if(buffer.size() < operation.getArity()) {
			throw new RuntimeException("Spatny format vstupnich dat. Nedostatek argumentu pro operaci!");
		}
		for(int i=operation.getArity()-1;i>=0;i--) {
			operation.setChild(i, buffer.pop());
		}
		
	}

	@Override
	public ArithmeticComponent getResult() {
		if(buffer.size() > 1) {
			throw new RuntimeException("Spatny format vstupnich dat, zbyly neprirazene operandy!");
		}
		if(buffer.size() < 1) {
			throw new RuntimeException("Chyba volani, builder je prazdny.");
		}
		return buffer.peek();
	}
	
}
