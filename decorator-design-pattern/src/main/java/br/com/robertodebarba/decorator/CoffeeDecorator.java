package br.com.robertodebarba.decorator;

public abstract class CoffeeDecorator implements Coffee {

    protected Coffee decoratedCoffee;

    public CoffeeDecorator(final Coffee decoratedCoffee) {
	this.decoratedCoffee = decoratedCoffee;
    }
    
}
