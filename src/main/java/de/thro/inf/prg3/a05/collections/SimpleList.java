package de.thro.inf.prg3.a05.collections;

import java.util.function.Function;

/**
 * A simple list containing just a few basic methods
 * Inherits the Iterable interface to ease the handling (e.g. extended for-loop)
 *
 * @param <T> type of the items which will be saved in the list
 */
public interface SimpleList<T> extends Iterable<T> {

	/**
	 * Add a given object to the back of the list.
	 *
	 * @param o item to add
	 */
	void add(T o);

	/**
	 * @return current size of the list
	 */
	int size();

	/**
	 * Re
	 */
	default <T> SimpleList<T> makeInstance()  {
		return new SimpleListImpl<T>();
	}

	/**
	 * Generate a new list using the given filter instance.
	 *
	 * @param filter SimpleFilter instance to determine which elements should be included
	 * @return a new, filtered list
	 */
	@SuppressWarnings("unchecked")
	default SimpleList<T> filter(SimpleFilter<T> filter) {
		SimpleList<T> result = makeInstance();

		for (T o : this) {
			if (filter.include(o)) {
				result.add(o);
			}
		}
		return result;
	}

	/**
	 * @param transform
	 * @param <R>
	 * @return
	 */
	@SuppressWarnings("unchecked")
	default <R> SimpleList<R> map(Function<? super T,? extends R> transform) {
		SimpleList<R> result = makeInstance();
		for (T t : this) {
			result.add(transform.apply(t));
		}
		return result;
	}
}
