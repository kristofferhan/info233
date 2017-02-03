package oblig1;

/**
 * This class runs the entire simulation. The constructor takes on input a bag of persons, 
 * then each simulateStep() will remove an element from the bag of people and process it according to the rules.
 * @author kristofferh
 * @version 0.1
 */

public class Simulator {

    private SimulationStep step = new SimulationStep();

    public Simulator(Queue<Person> personBag) {

    }

    public SimulationStep simulateStep() {
        return step;
    }

    public void simulate() {

    }

}