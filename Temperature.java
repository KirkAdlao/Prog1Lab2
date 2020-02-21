import java.util.*;
/*program that prompts the user for the temperature in Celsius in the past 3 days 
and output the average temperature*/

public class Temperature {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n************   Average Temperature Calculator   ************\n");

        //Asking user for input

        System.out.println("Please give me the Temperature in Celsius in the past 3 days");

        double temperature1 = sc.nextDouble();
        double temperature2 = sc.nextDouble();
        double temperature3 = sc.nextDouble();

        //calculator

        double average = (temperature1 + temperature2 + temperature3)/3;

        //printf rounds the number
        System.out.printf("\nThe average temperature in the past 3 days is " + "%.2f", average);

    }
}
