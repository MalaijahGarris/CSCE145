// Ma'laijah Garris

public class TimeConverter {
private int hours;
private int minutes;
private int seconds;
private String timeOfDay;

// Exception class for invalid time
public class TimeException extends Exception {
public TimeException(String message) {
super(message);
}
}

// updateTime method with numeric parameters
public void updateTime(int h, int m, int s) throws TimeException {
// Validate time values
if (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59) {
throw new TimeException("Invalid time entered!");
}

// Determine AM/PM
if (h == 0) {
this.hours = 12;
this.timeOfDay = "AM";
}
else if (h == 12) {
this.hours = 12;
this.timeOfDay = "PM";
}
else if (h > 12) {
this.hours = h - 12;
this.timeOfDay = "PM";
}
else {
this.hours = h;
this.timeOfDay = "AM";
}

this.minutes = m;
this.seconds = s;
}

// Overloaded updateTime method for string format
public void updateTime(String timeStr) throws TimeException {
try {
String[] parts = timeStr.split(":");
int h = Integer.parseInt(parts[0]);
int m = Integer.parseInt(parts[1]);
int s = Integer.parseInt(parts[2]);
updateTime(h, m, s);
}
catch (Exception e) {
throw new TimeException("Invalid time entered! (Non-numeric value)");
}
}

// displayTime
public void displayTime() {
System.out.println(this.hours + ":" + this.minutes + ":" + this.seconds + " " + this.timeOfDay);
}
}
