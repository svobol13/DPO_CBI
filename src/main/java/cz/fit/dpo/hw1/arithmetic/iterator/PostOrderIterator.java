package cz.fit.dpo.hw1.arithmetic.iterator;

import cz.fit.dpo.hw1.arithmetic.ArithmeticComponent;
import java.util.Iterator;

import cz.fit.dpo.hw1.arithmetic.elements.ExpressionElement;

public class PostOrderIterator implements Iterator<ExpressionElement>
{

	private ArithmeticComponent current;
	
	public PostOrderIterator(ArithmeticComponent start) {
		current = start;
	}

	@Override
	public boolean hasNext()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ExpressionElement next()
	{
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void remove()
	{

		
	}

}
