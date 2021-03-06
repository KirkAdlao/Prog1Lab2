import java.util.*;
/* This program prompts the user for a name in the format lastname, firstname 
and output the name in the format Firstname Lastname*/

public class Name {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nPlease type your 'lastname, firstname' in this format\n");

		String firstFormat = sc.nextLine();

		int indexComma = firstFormat.indexOf(',');

		System.out.printf("%nYou have inserted '%s'",firstFormat); 
		System.out.printf("%nIndex of comma is %d",indexComma);

		String last = firstFormat.substring(0,indexComma);

		last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase(); 

		String first = firstFormat.substring(indexComma+2);
		first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();


		System.out.printf("%nFirst name is %s ", first);

		System.out.printf("%nLast name is %s ", last);

		System.out.printf("%The final format is %s %s", first, last);

	}
}