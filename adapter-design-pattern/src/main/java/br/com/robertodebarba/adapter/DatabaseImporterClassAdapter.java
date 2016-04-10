package br.com.robertodebarba.adapter;

public class DatabaseImporterClassAdapter extends DatabaseImporter implements Importer {

    public void setLocation(final String location) {
	super.connect(location);
	super.setDatabase();
    }

    public void loadData() {
	super.queryData();
    }

}
