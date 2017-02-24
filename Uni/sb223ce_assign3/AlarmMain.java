package sb223ce_assign3;

public class AlarmMain {

	public static void main(String[] args) {

		// Call the constructor
		AlarmClock alarm = new AlarmClock(23, 48);  //provide parameters

		alarm.displayTime(); // call the method to display time

		alarm.setAlarm(6, 15); // set the time according to given parameters

		// tick the time for 500 times
		for (int i = 0; i < 500; i++) {
			alarm.timeTick();
		}

		alarm.displayTime(); // call the method to display time

	}

}
