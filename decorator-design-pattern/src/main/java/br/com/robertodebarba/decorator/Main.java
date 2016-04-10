package br.com.robertodebarba.decorator;

public class Main {

    public static void main(final String[] args) {
	Coffee coffee = new SimpleCoffee();
	System.out.println(coffee.getIngredients() + ": " + coffee.getCost());
	
	coffee = new Milk(coffee);
	System.out.println(coffee.getIngredients() + ": " + coffee.getCost());
	
	coffee = new Sugar(coffee);
	System.out.println(coffee.getIngredients() + ": " + coffee.getCost());
    }

}
