package br.com.robertodebarba.observer;

public class Lighting implements AlarmListener {

    public void alarm() {
	System.out.println("Lights up!");
    }

}
