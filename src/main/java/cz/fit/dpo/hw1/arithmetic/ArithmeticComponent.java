/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.fit.dpo.hw1.arithmetic;

import cz.fit.dpo.hw1.arithmetic.elements.ExpressionElement;
import cz.fit.dpo.hw1.arithmetic.elements.UnknownElement;
import cz.fit.dpo.hw1.arithmetic.iterator.InOrderIterator;
import cz.fit.dpo.hw1.arithmetic.iterator.PostOrderIterator;
import javax.naming.OperationNotSupportedException;

/**
 *
 * @author gregy
 */
public abstract class ArithmeticComponent {
	private ArithmeticComponent[] children;
	private ArithmeticComponent parent;
	
	public ArithmeticComponent() {
		children = new ArithmeticComponent[this.getArity()];
	}

	public void setParent(ArithmeticComponent parent) {
		this.parent = parent;
	}

	public abstract Integer evaluate();

	public ArithmeticComponent getParent() {
		return null;
	}
	public int getArity() {
		return 0;
	}

	public ArithmeticComponent getChild(int index) {
		return null;
	}

	public void setChild(int index, ArithmeticComponent child) {
		if(index >= getArity()) {
			throw new IndexOutOfBoundsException("Prilis mnoho deti!");
		}
		child.setParent(this);
		children[index] = child;
	}

	public ArithmeticComponent getFirstOperand() {
		return getChild(0);
	}
	
	public ArithmeticComponent getSecondOperand() {
		return getChild(1);
	}

	public InOrderIterator inOrderIterator() {
		return new InOrderIterator(this);
	}

	public PostOrderIterator postOrderIterator() {
		return new PostOrderIterator(this);
	}

	public ExpressionElement getExpressionElement() {
		return new UnknownElement();
	}

	
}
