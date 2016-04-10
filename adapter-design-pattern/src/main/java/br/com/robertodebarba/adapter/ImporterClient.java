package br.com.robertodebarba.adapter;

public class ImporterClient {

    private final Importer importer;

    public ImporterClient(final Importer importer) {
	this.importer = importer;
    }

    public void runImport() {
	this.importer.setLocation("location/example");
	this.importer.loadData();
    }

}
