package br.com.robertodebarba.adapter;

public class DatabaseImporterObjectAdapter implements Importer {

    private final DatabaseImporter databaseImporter;

    public DatabaseImporterObjectAdapter(final DatabaseImporter databaseImporter) {
	this.databaseImporter = databaseImporter;
    }

    public void setLocation(final String location) {
	this.databaseImporter.connect(location);
	this.databaseImporter.setDatabase();
    }

    public void loadData() {
	this.databaseImporter.queryData();
    }

}
