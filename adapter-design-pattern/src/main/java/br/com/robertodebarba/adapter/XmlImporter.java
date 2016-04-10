package br.com.robertodebarba.adapter;

public class XmlImporter {

    public void openFile(final String fileName) {
	System.out.println("Openning file " + fileName);
    }

    public void checkFormat() {
	System.out.println("Check XML format.");
    }

    public void loadXml() {
	System.out.println("Loading XML data.");
    }
}
