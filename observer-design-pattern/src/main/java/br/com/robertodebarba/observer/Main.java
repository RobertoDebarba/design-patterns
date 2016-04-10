package br.com.robertodebarba.observer;

public class Main {

    public static void main(final String[] args) {
	final AlarmSystem alarmSystem = new AlarmSystem();
	alarmSystem.addAlarmSystem(new Lighting());
	alarmSystem.addAlarmSystem(new Gate());

	alarmSystem.soundTheAlarm();
    }

}
