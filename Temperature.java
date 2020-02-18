import java.util.*;
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

        System.out.println("The average temperature in the past 3 days is " + average);

    }
}
