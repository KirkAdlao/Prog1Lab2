import java.util.*;

/* This program prompts the user for an amount of seconds and displays 
the time in the format minutes:seconds. 
*/

public class Time {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nType the amount of seconds:\n");

		int totalSeconds = sc.nextInt(); //user input
		int minutes = totalSeconds / 60; //conversion
		int seconds = totalSeconds & 60; //conversion

		System.out.printf("\nThe requested output is %d:%d\n", minutes,seconds);
		
	}
}