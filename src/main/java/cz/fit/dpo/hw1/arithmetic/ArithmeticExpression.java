package cz.fit.dpo.hw1.arithmetic;

import java.util.Iterator;

import cz.fit.dpo.hw1.arithmetic.elements.ExpressionElement;

public class ArithmeticExpression
{
	private ArithmeticComponent root;
	
	public Integer evaluate()
	{
		return root.evaluate();
	}
	
	public void setRoot(ArithmeticComponent root)
	{
		this.root = root;
	}

	/**
	 * {@link #root} field getter.
	 * 
	 * @deprecated Do not provide access to the inner representation
	 */
	public ArithmeticComponent getRoot()
	{
		throw new UnsupportedOperationException();
	}
	
	public Iterator<ExpressionElement> getInOrderIterator()
	{
		return this.root.inOrderIterator();
	}

	public Iterator<ExpressionElement> getPostOrderIterator()
	{
		return this.root.postOrderIterator();
	}

}
