	import java.util.*;

	//This program calculates your age

	public class MyAgeIs {
 	 public static void main(String[] args) {
 	 	Scanner sc = new Scanner (System.in);

 	 	System.out.println("\nPlease enter the year of your birth\n");

 	 	//Get user input
 	 	int yearborn = sc.nextInt();

 	 	int currentyear = 2020;
 	 	int age = currentyear - yearborn;

 	 	System.out.println("");
 	 	System.out.println("Your age is " + age);
 	 }
}
