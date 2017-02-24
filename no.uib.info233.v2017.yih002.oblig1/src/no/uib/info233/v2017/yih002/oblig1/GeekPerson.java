package no.uib.info233.v2017.yih002.oblig1;

import java.util.Arrays;
import java.util.List;

/**
 * Class that represents a GeekPerson.
 * @author Kristoffer Hansen
 * @version 0.2
 */
public class GeekPerson extends Person {

    /**
     * Constructor for the class
     */
    public GeekPerson() {
        super.setPersonType("Geek");
    }

    /**
     * Accessor for GeekPerson.
     * @return The PersonType
     */
    public String getPersonType() {
        return super.getPersonType();
    }

    /**
     * Calculates which activity the GeekPerson will choose.
     * @param countArray Array containing amount of people in each activity.
     * @return chosen activity as a String.
     */
    public String chooseActivity(String[] countArray) {
        String activity;
        List activities = Arrays.asList(countArray);

        if (activities.contains("computerProgramming")) {
            activity = "computerProgramming";
        } else {
            activity = "leave";
        }
        return activity;
    }
}

