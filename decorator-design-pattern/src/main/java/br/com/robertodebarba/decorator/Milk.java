package br.com.robertodebarba.decorator;

public class Milk extends CoffeeDecorator {

    public Milk(final Coffee decoratedCoffee) {
	super(decoratedCoffee);
    }

    public double getCost() {
	return super.decoratedCoffee.getCost() + 1.5;
    }

    public String getIngredients() {
	return super.decoratedCoffee.getIngredients() + " + milk";
    }

}
