package br.com.robertodebarba.adapter;

public class DatabaseImporter {

    public void connect(final String Url) {
	System.out.println("Connectiong database " + Url);
    }

    public void setDatabase() {
	System.out.println("Setting database.");
    }

    public void queryData() {
	System.out.println("Loading data.");
    }
}
