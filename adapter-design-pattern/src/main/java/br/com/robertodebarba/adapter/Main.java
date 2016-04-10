package br.com.robertodebarba.adapter;

public class Main {

    public static void main(final String[] args) {
	Importer importer = new DatabaseImporterClassAdapter();
	new ImporterClient(importer).runImport();

	importer = new DatabaseImporterObjectAdapter(new DatabaseImporter());
	new ImporterClient(importer).runImport();

	importer = new XmlImporterClassAdapter();
	new ImporterClient(importer).runImport();

	importer = new XmlImporterObjectAdapter(new XmlImporter());
	new ImporterClient(importer).runImport();
    }

}
