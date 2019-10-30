package de.thro.inf.prg3.a05.collections;

import java.util.Iterator;

/**
 * @author Peter Kurfer
 * Created on 10/6/17.
 */

/**
 * Simple implementation of a linked List implementing own List Interface
 *
 * @param <E> The generic type for each Element in the List
 */
public class SimpleListImpl<E> implements SimpleList<E>
{
	/**
	 * Inner class for one Element of the List
	 */
	private class Element
	{
		E       item;
		Element next;

		/**
		 * Constructor
		 * Sets the item to store in the Element
		 *
		 * @param item The item to store in the Element
		 */
		Element(E item)
		{
			this.item = item;
			this.next = null;
		}
	}

	/**
	 * Inner class for the Iterator of the List
	 */
	private class SimpleIteratorImpl implements Iterator<E>
	{
		Element current = head;

		/**
		 * Check if there is one more Element in the List
		 *
		 * @return True / False whether there is one more Element in the List
		 */
		@Override
		public boolean hasNext()
		{
			return current != null;
		}

		/**
		 * Return the value of the next Element in the List
		 *
		 * @return Value of next Element
		 */
		@Override
		public E next()
		{
			E value = current.item;

			current = current.next;

			return value;
		}
	}

	private Element head;

	/**
	 * Return a new Instance of the Iterator of the List
	 *
	 * @return New Instance of the Iterator
	 */
	@Override
	public Iterator<E> iterator()
	{
		return new SimpleIteratorImpl();
	}

	/**
	 * Add a new Element to the back of the List
	 *
	 * @param e The Value to store
	 */
	@Override
	public void add(E e)
	{
		Element tail = head;

		while (tail != null && tail.next != null)
			tail = tail.next;

		if (head == null) head      = new Element(e);
		else              tail.next = new Element(e);
	}

	/**
	 * Get the size of the List
	 *
	 * @return The size of the List
	 */
	@Override
	public int size()
	{
		int count = 0;

		for (E element : this)
			count ++;

		return count;
	}
}