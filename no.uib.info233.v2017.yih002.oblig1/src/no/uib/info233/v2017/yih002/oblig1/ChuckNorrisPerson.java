package no.uib.info233.v2017.yih002.oblig1;

import java.util.Arrays;
import java.util.List;

/**
 * Class that represents a ChuckNorrisPerson.
 * @author Kristoffer Hansen
 * @version 0.2
 */
public class ChuckNorrisPerson extends Person {

	/**
	 * Constructor for ChuckNorrisPerson
	 */
	public ChuckNorrisPerson() {
		super.setPersonType("Chuck Norris");
	}

    /**
     * Accessor for ChuckNorrisPerson
     * @return The PersonType
     */
    public String getPersonType() {
        return super.getPersonType();
    }

    /**
     * Calculates which activity the ChuckNorrisPerson will choose
     * @param countArray Array containing amount of people in each activity.
     * @return chosen activity as a String.
     */
	public String chooseActivity(String[] countArray) {
        String activity;
        List activities = Arrays.asList(countArray);

        if (activities.contains("computerProgramming")) {
            activity = "computerProgramming";
        } else if (activities.contains("spinning")) {
            activity = "spinning";
        } else if (activities.contains("swimming")) {
            activity = "swimming";
        } else if (activities.contains("running")) {
            activity = "running";
        } else {
            activity = "leave";
        }
        return activity;
	}
}

