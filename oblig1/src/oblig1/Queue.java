package oblig1;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 
 * @author kristofferh
 * @version 0.1
 */

public class Queue<T> implements BagInterface<T> {
	private Deque<T> bagItems;
	
	public Queue() {
		bagItems = new ArrayDeque<>();
	}
	
	@Override
	public int getCurrentSize() {
		return bagItems.size();
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return bagItems.size() == 0;
	}

	@Override
	public boolean add(T newEntry) {
		return bagItems.add(newEntry);
	}

	@Override
	public T remove() {
		return bagItems.remove();
	}

	@Override
	public boolean remove(T anEntry) {
		return bagItems.remove(anEntry);
	}

	@Override
	public void clear() {
		bagItems.clear();
	}

	@Override
	public int getFrequencyOf(T anEntry) {
		int counter = 0;
		for (T bagItem: bagItems) {
			if (anEntry.equals(bagItem)){
				counter++;
			}
		}
		return counter;
	}

	@Override
	public T[] toArray() {
		return null;
	}
	
	

}
