package br.com.robertodebarba.abstractfactory;

public class PeugeotFactory extends CarFactory {

    @Override
    public Door getDoor() {
	return new PeugeotDoor();
    }

    @Override
    public
    Wheel getWheel() {
	return new PeugeotWheel();
    }

}
