package br.com.robertodebarba.decorator;

public class SimpleCoffee implements Coffee {

    public double getCost() {
	return 1;
    }

    public String getIngredients() {
	return "Simple coffee";
    }

}
