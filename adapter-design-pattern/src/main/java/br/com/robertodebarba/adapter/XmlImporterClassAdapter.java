package br.com.robertodebarba.adapter;

public class XmlImporterClassAdapter extends XmlImporter implements Importer {

    public void setLocation(final String location) {
	super.openFile(location);
	super.checkFormat();
    }

    public void loadData() {
	super.loadXml();
    }

}
