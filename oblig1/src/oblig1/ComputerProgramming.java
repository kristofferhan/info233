package oblig1;

/**
 * Class for the activity computer programming.
 * @author kristofferh
 * @version 0.1
 */
public class ComputerProgramming<T> implements BagInterface<T> {
	
	private ComputerProgramming<T> people;

	public ComputerProgramming<T> getPeople() {
		return people;
	}

	public void setPeople(ComputerProgramming<T> people) {
		this.people = people;
	}
	
	@Override
	public int getCurrentSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(T newEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(T anEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFrequencyOf(T anEntry) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}