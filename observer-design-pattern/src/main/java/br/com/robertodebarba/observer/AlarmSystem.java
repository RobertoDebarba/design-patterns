package br.com.robertodebarba.observer;

import java.util.ArrayList;
import java.util.List;

public class AlarmSystem {

    private final List<AlarmListener> alarmSystens = new ArrayList<AlarmListener>();

    public void addAlarmSystem(final AlarmListener alarm) {
	this.alarmSystens.add(alarm);
    }

    public void soundTheAlarm() {
	System.out.println("Sound the alarm!");
	
	for (final AlarmListener alarmListener : this.alarmSystens) {
	    alarmListener.alarm();
	}
    }

}
