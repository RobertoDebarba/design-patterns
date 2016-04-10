package br.com.robertodebarba.abstractfactory;

public class ChevroletFactory extends CarFactory {

    @Override
    public Door getDoor() {
	return new ChevroletDoor();
    }

    @Override
    public Wheel getWheel() {
	return new ChevroletWheel();
    }

}
