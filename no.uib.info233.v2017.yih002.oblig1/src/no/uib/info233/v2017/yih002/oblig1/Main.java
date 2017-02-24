package no.uib.info233.v2017.yih002.oblig1;

public class Main {

	public static void main (String[] args) {

		Bag bagQueue = new Bag();
		Bag spinning = new Bag();
		Bag swimming = new Bag();
		Bag running = new Bag();
		Bag computerProgramming = new Bag();

		AthletePerson initPerson = new AthletePerson();

		spinning.add(initPerson);
		swimming.add(initPerson);
		running.add(initPerson);
		computerProgramming.add(initPerson);

		AthletePerson athlete1 = new AthletePerson();
		AthletePerson athlete2 = new AthletePerson();
		AthletePerson athlete3 = new AthletePerson();



		ChuckNorrisPerson chuck1 = new ChuckNorrisPerson();
		ChuckNorrisPerson chuck2 = new ChuckNorrisPerson();
		ChuckNorrisPerson chuck3 = new ChuckNorrisPerson();




		GeekPerson geek1 = new GeekPerson();
		GeekPerson geek2 = new GeekPerson();
		GeekPerson geek3 = new GeekPerson();


        bagQueue.add(athlete1);
        bagQueue.add(geek1);
        bagQueue.add(chuck1);
        bagQueue.add(chuck2);
        bagQueue.add(athlete2);
        bagQueue.add(geek2);
        bagQueue.add(geek3);
        bagQueue.add(chuck3);
        bagQueue.add(athlete3);


        Simulator simulator = new Simulator(bagQueue);
        SimulationStep simulationStep = new SimulationStep();

        simulator.setQueue(bagQueue);
        simulator.setComputerProgramming(computerProgramming);
        simulator.setSpinning(spinning);
        simulator.setSwimming(swimming);
        simulator.setRunning(running);

        simulator.simulate(simulationStep);

	}

}
