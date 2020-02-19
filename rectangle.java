import java.util.*;

//This program calculates the area and perimeter of a rectangle

public class rectangle {

  public static void main (String [] args) { 
    Scanner sc = new Scanner(System.in);

    //Get input from user
    System.out.println("\nEnter the width\n");
    double width = sc.nextDouble();

    System.out.println("\nEnter the length\n");
    double length = sc.nextDouble();

    //Calculator
    double perimiter = (2 * length + 2 * width);
    System.out.println("");
    System.out.println("perimiter of the rectangle is " + perimiter);

    double area = (length * width);
    System.out.println("");
    System.out.println("area of the rectangle is " + area);

  }
}
