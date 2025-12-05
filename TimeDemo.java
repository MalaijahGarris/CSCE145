// Ma'laijah Garris

import java.util.Scanner;

public class TimeDemo {
public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
String repeat = "Yes";

while (repeat.equalsIgnoreCase("Yes")) {

// First object
TimeConverter tc1 = new TimeConverter();

try {
System.out.println("Enter the hours on the military clock:");
int h = keyboard.nextInt();

System.out.println("Enter the minutes on the military clock:");
int m = keyboard.nextInt();

System.out.println("Enter the seconds on the military clock:");
int s = keyboard.nextInt();

tc1.updateTime(h, m, s);
System.out.print("12-hour clock time → ");
tc1.displayTime();
}
catch (Exception ex) {
System.out.println("EXCEPTION: Invalid time entered!");
keyboard.nextLine();
}

keyboard.nextLine();

// Second object
TimeConverter tc2 = new TimeConverter();
try {
System.out.println("Enter 24 hour clock time in the format \"hours:minutes:seconds\"");
String input = keyboard.nextLine();

tc2.updateTime(input);
System.out.print("12-hour clock time → ");
tc2.displayTime();
}
catch (Exception ex) {
System.out.println("EXCEPTION: Invalid time entered!");
}

System.out.println("Would you like to do this again? Enter \"Yes\" or \"No\":");
repeat = keyboard.nextLine();
}

System.out.println("Exiting the program!");
keyboard.close();
}
}
