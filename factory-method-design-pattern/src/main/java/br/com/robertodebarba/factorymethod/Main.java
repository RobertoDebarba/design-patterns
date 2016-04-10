package br.com.robertodebarba.factorymethod;

public class Main {

    public static void main(final String[] args) {
	final Gender man = GenderFactory.getPerson("Male");
	man.printGreeting();

	final Gender woman = GenderFactory.getPerson("Female");
	woman.printGreeting();
    }

}
