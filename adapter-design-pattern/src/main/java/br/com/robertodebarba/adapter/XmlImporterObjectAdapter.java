package br.com.robertodebarba.adapter;

public class XmlImporterObjectAdapter implements Importer {

    private final XmlImporter xmlImporter;

    public XmlImporterObjectAdapter(final XmlImporter xmlImporter) {
	this.xmlImporter = xmlImporter;
    }

    public void setLocation(final String location) {
	this.xmlImporter.openFile(location);
	this.xmlImporter.checkFormat();
    }

    public void loadData() {
	this.xmlImporter.loadXml();
    }

}
