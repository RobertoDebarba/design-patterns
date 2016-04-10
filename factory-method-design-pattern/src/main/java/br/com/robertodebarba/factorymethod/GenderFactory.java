package br.com.robertodebarba.factorymethod;

public final class GenderFactory {

    private GenderFactory() {
	// Factory Method
    }

    public static Gender getPerson(final String genderDescription) {
	if (genderDescription.equals("Male")) {
	    return new Man();
	}
	if (genderDescription.equals("Female")) {
	    return new Woman();
	}

	throw new RuntimeException(String.format("%s is not supported!", genderDescription));

    }
}
