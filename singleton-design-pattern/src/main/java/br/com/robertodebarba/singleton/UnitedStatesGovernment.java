package br.com.robertodebarba.singleton;

public class UnitedStatesGovernment {

    private static UnitedStatesGovernment government;

    private UnitedStatesGovernment() {
	//Singleton
    }

    public static UnitedStatesGovernment election() {
	if (government == null) {
	    government = new UnitedStatesGovernment();
	}
	return government;
    }

    public void startNewWar() {
	System.out.println("A new War was started!");
    }

}
