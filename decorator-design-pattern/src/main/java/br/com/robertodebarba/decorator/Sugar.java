package br.com.robertodebarba.decorator;

public class Sugar extends CoffeeDecorator {

    public Sugar(final Coffee decoratedCoffee) {
	super(decoratedCoffee);
    }

    public double getCost() {
	return super.decoratedCoffee.getCost() + 0.3;
    }

    public String getIngredients() {
	return super.decoratedCoffee.getIngredients() + " + sugar";
    }

}
