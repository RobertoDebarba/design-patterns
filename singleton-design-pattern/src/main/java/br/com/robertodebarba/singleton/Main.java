package br.com.robertodebarba.singleton;

public class Main {

    public static void main(final String[] args) {
	final UnitedStatesGovernment government = UnitedStatesGovernment.election();
	government.startNewWar();
    }

}
