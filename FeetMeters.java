import java.util.*;

// This program converts meters to feet

public class FeetMeters {
 	 
 	 public static void main(String[] args) {
 	 	Scanner sc = new Scanner (System.in);

 	 	System.out.println("\nPlease enter the unit you want to convert from meters to feet\n");

 	 	//Get input from user
 	 	double meter = sc.nextInt();
 	 	double conversion;

 	 	//Conversions 

 	 	double feet = 3.28084;
 	 	conversion = meter * feet;

 	 	System.out.println("");
 	 	System.out.println(meter + " meter is equal to " + conversion);
 	 }
}