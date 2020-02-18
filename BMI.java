import java.util.*;
public class BMI {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("************************************");
        System.out.println("*********                  *********");
        System.out.println("*********  BMI Calculator  *********");
        System.out.println("*********                  *********");
        System.out.println("************************************");
        System.out.println("                                    ");


        //Get input
        System.out.println("What is your weight in pounds?");

        double weight = sc.nextDouble();

        System.out.println("What is your height in feet(inches)?");
        double height = sc.nextDouble();

        //Convertor

        double kilograms = weight*0.453592;
        System.out.println("Your weight in kilograms :" + kilograms);


        double meters = height*0.3048;
        System.out.println("Your height in meters :" + meters);

        //BMI calculator
        double bmi = (703*weight/(height*height));
        System.out.println("Your calculated BMI = " + bmi);
        

    }

}