package br.com.robertodebarba.observer;

public class Gate implements AlarmListener {

    public void alarm() {
	System.out.println("Gate close!");
    }

}
