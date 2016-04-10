package br.com.robertodebarba.abstractfactory;

public class Main {

    public static void main(final String[] args) {
	final CarFactory peugeotFactory = CarFactory.getFactory("Peugeot");
	final Door peugeotDoor = peugeotFactory.getDoor();
	final Wheel peugeotWheel = peugeotFactory.getWheel();

	peugeotDoor.close();
	peugeotWheel.road();

	final CarFactory chevroletFactory = CarFactory.getFactory("Chevrolet");
	final Door chevroletDoor = chevroletFactory.getDoor();
	final Wheel chevroletWheel = chevroletFactory.getWheel();

	chevroletDoor.close();
	chevroletWheel.road();
    }

}
