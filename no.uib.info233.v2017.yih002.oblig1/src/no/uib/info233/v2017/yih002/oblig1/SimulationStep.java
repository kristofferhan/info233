package no.uib.info233.v2017.yih002.oblig1;

/**
 * Class that handles each step in the simulation.
 * @author Kristofer Hansen
 * @version 0.1
 */
@SuppressWarnings("unused")
public class SimulationStep {

	private Integer spinningCount;
	private Integer swimmingCount;
	private Integer runningCount;
	private Integer programmingCount;
	private Integer[] countArray;
	private String [] smallestActivity;
	private Bag simulationQueue;
	
	/**
	 * Constructor for the class
	 */
	public SimulationStep() {
		smallestActivity = new String[4];
		spinningCount = new Integer(0);
		swimmingCount = new Integer(0);
		runningCount = new Integer(0);
		programmingCount = new Integer(0);
		countArray = new Integer[]{programmingCount, spinningCount, swimmingCount, runningCount};
		Bag simulationQueue = new Bag();
	}

	/**
	 * Adds the size of the bags to an array, returns the size of the smallest bag.
     *
	 * @return The activity distribution before the current persons choose an activity.
	 */
	public int getActivityDistributionBefore(Simulator simulator) {
		Simulator bags = simulator;
        Integer smallestBag = 99999;

        // spinning
        Bag spinningBag = bags.getSpinning();
        spinningCount = spinningBag.getCurrentSize();

        if (spinningCount < smallestBag) {
            smallestActivity[0] = "spinning";
            smallestActivity[1] = null;
            smallestActivity[2] = null;
            smallestActivity[3] = null;
            smallestBag = spinningCount;
        } else if (spinningCount.equals(smallestBag)) {
            smallestActivity[0] = "spinning";
        }

        //swimming
        Bag swimmingBag = bags.getSwimming();
        swimmingCount = swimmingBag.getCurrentSize();

        if (swimmingCount < smallestBag) {
            smallestActivity[1] = "swimming";
            smallestActivity[0] = null;
            smallestActivity[2] = null;
            smallestActivity[3] = null;
            smallestBag = swimmingCount;
        } else if (swimmingCount.equals(smallestBag)) {
            smallestActivity[1] = "swimming";
        }

        //running
        Bag runningBag = bags.getRunning();
        runningCount = runningBag.getCurrentSize();

        if (runningCount < smallestBag) {
            smallestActivity[2] = "running";
            smallestActivity[0] = null;
            smallestActivity[1] = null;
            smallestActivity[3] = null;
            smallestBag = runningCount;
        } else if (runningCount.equals(smallestBag)) {
            smallestActivity[2] = "running";
        }

        //programming
        Bag programmingBag = bags.getComputerProgramming();
        programmingCount = programmingBag.getCurrentSize();

        if (programmingCount < smallestBag) {
            smallestActivity[3] = "programming";
            smallestActivity[0] = null;
            smallestActivity[1] = null;
            smallestActivity[2] = null;
            smallestBag = programmingCount;
        } else if (programmingCount.equals(smallestBag)) {
            smallestActivity[3] = "programming";
        }

        return smallestBag;
    }

	/**
	 * Processes the chosen activity, places the person to the bag for that activity
     * Gets the size of that bag and returns it
	 * @param chosenActivity The activity chosen by the current person
	 * @param simulator
	 * @param distPerson
	 * @return
	 */
	public int getActivityDistributionAfter(String chosenActivity, Simulator simulator, Person distPerson) {
		int updatedAmount = 0;
        Bag activityBag;

		switch (chosenActivity) {
			case "computerProgramming":
				simulator.addToComputerProgramming(distPerson);
				activityBag = simulator.getComputerProgramming();
				updatedAmount = activityBag.getCurrentSize();

				break;
			case "running":
				simulator.addToRunning(distPerson);
				activityBag = simulator.getRunning();
				updatedAmount = activityBag.getCurrentSize();

				break;
			case "swimming":
				simulator.addToSwimming(distPerson);
				activityBag = simulator.getSwimming();
				updatedAmount = activityBag.getCurrentSize();

				break;
			case "spinning":
				simulator.addToSpinning(distPerson);
				activityBag = simulator.getSpinning();
				updatedAmount = activityBag.getCurrentSize();
				break;
		}

		return updatedAmount;
	}

	/**
	 *
	 * @return Names for the different activities.
	 */
	public String getActivityNames() {
		return smallestActivity.toString();
	}

    /**
	 *
	 * @return The person being processed.
	 */
	public Person getCurrentlyProcessedPerson(Simulator simulator) {
		Bag stepQueue = simulator.getQueue();
		return stepQueue.getNext();
	}

	/**
	 * @param currentPerson The currently processed person.
	 * @return The chosen activity of the currently processed person.
	 */
	public String getCurrentlyProcessedPersonsChosenActivity(Person currentPerson) {
		String chosenActivity = null;

		switch (currentPerson.getPersonType()) {
			case "Chuck Norris": {
				ChuckNorrisPerson person = new ChuckNorrisPerson();
				chosenActivity = person.chooseActivity(smallestActivity);

				break;
			}
			case "Athlete": {
				AthletePerson person = new AthletePerson();
				chosenActivity = person.chooseActivity(smallestActivity);

				break;
			}
			case "Geek": {
				GeekPerson person = new GeekPerson();
				chosenActivity = person.chooseActivity(smallestActivity);
				break;
			}
		}
		System.out.println("Chosen activity: " + chosenActivity);
		return chosenActivity;
	}

	public String[] getSmallestActivity() {
	    return smallestActivity;
    }

    public Integer getSpinningCount() {
	    return spinningCount;
    }

}

