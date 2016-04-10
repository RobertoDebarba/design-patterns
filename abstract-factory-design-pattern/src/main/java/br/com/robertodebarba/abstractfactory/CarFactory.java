package br.com.robertodebarba.abstractfactory;

public abstract class CarFactory {

    public static CarFactory getFactory(String brandName) {
	if (brandName.equals("Peugeot")) {
	    return new PeugeotFactory();
	}
	if (brandName.equals("Chevrolet")) {
	    return new ChevroletFactory();
	}

	throw new RuntimeException(String.format("%s is not supported!", brandName));
    }

    public abstract Door getDoor();

    public abstract Wheel getWheel();

}
