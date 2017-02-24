package no.uib.info233.v2017.yih002.oblig1;

import java.util.ArrayList;

/**
 * This class runs the entire simulation. The constructor takes on input a bag of persons,
 * then each simulateStep() will remove an element from the bag of people and process it according to the rules.
 * @version 0.2
 * @author Kristoffer Hansen
 */

@SuppressWarnings("unused")
public class Simulator {

	private Bag spinning;
	private Bag swimming;
	private Bag running;
	private Bag computerProgramming;
	private Bag queue;
	private SimulationStep simulationStep;
	private ArrayList<Integer> countArray;
	private Integer integer;
	private String chosenActivity;

    /**
     * Constructor for the Simulator class.
     * @param people
     */
	public Simulator(BagInterface<Person> people) {

		BagInterface<Person> queue = people;
		BagInterface<Person> spinning = new Bag();
		BagInterface<Person> swimming = new Bag();
		BagInterface<Person> running = new Bag();
		BagInterface<Person> computerProgramming = new Bag();
		SimulationStep simulationStep = new SimulationStep();
		chosenActivity = null;

		AthletePerson initPerson = new AthletePerson();
	}

    /**
     * Takes a person out of the queue, moves it to an activity or removes it from the queue.
     * @param simulationStep Handles a new SimulationStep.
     * @return The simulationStep.
     */
	public SimulationStep simulateStep(SimulationStep simulationStep) {
		
		Person currentPerson = simulationStep.getCurrentlyProcessedPerson(this);
		System.out.println(currentPerson.toString());
		simulationStep.getActivityDistributionBefore(this);
	
        chosenActivity = simulationStep.getCurrentlyProcessedPersonsChosenActivity(currentPerson);
        if (chosenActivity.equals("leave")) {
            queue.remove(currentPerson);
            System.out.println(currentPerson + " left the queue\n");
        } else {
            System.out.println("Should be added to an activity bag");
            simulationStep.getActivityDistributionAfter(chosenActivity, this, currentPerson);
            
            System.out.println("("+"," + spinning.getCurrentSize() + "," + swimming.getCurrentSize() + "," + running.getCurrentSize() 
            + "," + computerProgramming.getCurrentSize() + ")" + currentPerson.toString() + " is " + chosenActivity);
            
            System.out.println("Was removed from the queue: " + queue.remove(currentPerson) + "\n");
        }

        simulate(simulationStep);
        return simulationStep;
	}

	/**
	 * 
	 * @param simulationStep
	 */
	public void simulate(SimulationStep simulationStep) { 
		SimulationStep newSimStep = new SimulationStep();

		if (queue.getCurrentSize() > 0) {
			simulateStep(newSimStep);
		} else {
			System.out.println("Queue bag empty");
		}
	}

	public Bag getQueue() {
		return queue;
	}

	public Bag getSpinning() {
		return spinning;
	}

	public Bag getRunning() {
		return running;
	}

	public Bag getSwimming() {
		return swimming;
	}

	public Bag getComputerProgramming() {
		return computerProgramming;
	}

	public void addToQueue(Person newPerson) {
		queue.add(newPerson);
	}

	public void addToSpinning(Person newPerson) {
		spinning.add(newPerson);
	}

	public void addToRunning(Person newPerson) {
		running.add(newPerson);
	}

	public void addToSwimming(Person newPerson) {
		swimming.add(newPerson);
	}

	public void addToComputerProgramming(Person newPerson) {
		computerProgramming.add(newPerson);
	}

    public void setQueue(Bag bagQueue) {
	    queue = bagQueue;
    }

    public void setSpinning(Bag bagSpinning) {
	    spinning = bagSpinning;
    }

    public void setSwimming(Bag bagSwimming) {
	    swimming = bagSwimming;
    }

    public void setRunning(Bag bagRunning) {
	    running = bagRunning;
    }

    public void setComputerProgramming(Bag bagComputerProgramming) {
	    computerProgramming = bagComputerProgramming;
    }
}

