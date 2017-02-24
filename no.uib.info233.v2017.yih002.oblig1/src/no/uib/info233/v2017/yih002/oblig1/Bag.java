package no.uib.info233.v2017.yih002.oblig1;

/**
 * @author Kristoffer Hansen
 * @version 0.2
 */

public class Bag implements BagInterface<Person> {

    private Person[] personArray;
    private int arrLocation;
    private int arrSize;

    public Bag() {
        personArray = new Person[10];
        arrLocation = 0;
        arrSize = 10;
    }

    /**
     * @param newEntry The object to be added as a new entry.
     * @return True if the person was added to the bag, false if not.
     */
    @Override
    public boolean add(Person newEntry) {
        personArray[arrLocation] = newEntry;

        if (personArray[arrLocation].equals(newEntry)) {
            arrLocation = arrLocation + 1;
        }
        if (arrLocation >= arrSize) {
            toArray();
        }
        return personArray[arrLocation - 1].equals(newEntry);
    }

    /**
     * Removes a person from the array.
     *
     * @return The removed person, null if there is an empty array.
     */
    @Override
    public Person remove() {
        Person removedPerson = null;
        int i = 0;
        while (i < personArray.length) {
            if (personArray[i] != null) {
                removedPerson = personArray[i];
                personArray[i] = null;
            }
            i++;
        }
        return removedPerson;
    }

    /**
     * @param anEntry The entry to be removed.
     * @return True if the person was removed, false if not.
     */
    @Override
    public boolean remove(Person anEntry) {
        boolean removed = false;

        int i = 0;
        while (i < personArray.length) {
            if (personArray[i] == anEntry) {
                personArray[i] = null;
                removed = true;
            }
            i++;
        }
        return removed;
    }

    /**
     * Empty out the bag and set size to 10.
     */
    @Override
    public void clear() {
        personArray = new Person[10];
    }

    /**
     * Checks if an entry is in the array.
     *
     * @param anEntry The entry to be checked.
     * @return True if the person is in the array, false if not.
     */
    @Override
    public boolean contains(Person anEntry) {
        boolean containsPerson = false;

        for (Person aPersonArray : personArray) {
            if (aPersonArray == anEntry) {
                containsPerson = true;
            }
        }
        return containsPerson;
    }

    /**
     * Checks if the bag is empty or not.
     *
     * @return True if the bag is empty, false if not.
     */
    @Override
    public boolean isEmpty() {
        return arrSize == 0;
    }


    /**
     * Checks the size of the bag.
     * Checks the size of the bag.
     *
     * @return The size of the bag.
     */
    @Override
    public int getCurrentSize() {
        int sizeCount = 0;

        for (Person aPersonArray : personArray) {
            if (aPersonArray != null)
                sizeCount++;
        }
        return sizeCount;
    }

    /**
     * @return A new array with a double size
     */
    @Override
    public Person[] toArray() {
        Person[] newArray = new Person[arrSize * 2];
        System.arraycopy(personArray, 0, newArray, 0, personArray.length);
        personArray = newArray;
        return personArray;
    }


    /**
     * Find the next person in the array.
     *
     * @return The next person in the array, null if the array is empty.
     */
    @Override
    public Person getNext() {
        Person nextPerson = null;

        for (Person aPersonArray : personArray) {
            if (aPersonArray != null) {
                nextPerson = aPersonArray;
                break;
            }
        }
        return nextPerson;
    }


}
