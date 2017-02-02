package oblig1;

/**
 * 
 * @author kristofferh
 * @version 0.1
 * @param <T>
 */

public interface BagInterface <T> {

	/**
	 * Returns current number of entries in the bag.
	 * @return The integer number of entries in the bag.
	 */
	public int getCurrentSize();
	
	/**
	 * Checks if the bag is full.
	 * @return True if the bag is full, false if not.
	 */
	public boolean isFull();
	
	/**
	 * Checks if the bag is empty.
	 * @return True if the bag is empty, false if not.
	 */
	public boolean isEmpty(); 
	
	/**
	 * Adds a new entry to the bag. 
	 * @param newEntry The object to be added as a new entry.
	 * @return True if the addition is successful, false if not. 
	 */
	public boolean add(T newEntry);
	
	/**
	 * Removes one unspecified entry from the bag, if possible.
	 * @return The entry that was removed, or null if nothing was removed.
	 */
	public T remove();
	
	/**
	 * Removes one occurrence of a given entry from the bag, if possible.
	 * @param anEntry The entry to be removed.
	 * @return True if the removal was successful, false if not. 
	 */
	public boolean remove(T anEntry);
	
	/**
	 * Removes all entries from the bag.
	 */
	public void clear();
	
	/**
	 * Checks the frequency of a given entry. 
	 * @param anEntry The entry to be checked.
	 * @return An integer with the number of entries.
	 */
	public int getFrequencyOf(T anEntry);
	
	/**
	 * Checks if the bag contains a given entry.
	 * @param anEntry The entry to locate.
	 * @return True if the bag contains anEntry, false if not.
	 */
	public boolean contains(T anEntry);
	
	/**
	 * Retrieves all entries that are in this bag.
	 * @return A newly allocated array of all entries in the bag. 
	 * 		   Note: If the bag is empty, the returned array is empty.
	 */
	public T[] toArray();
	
	
	
	
	
	

}
