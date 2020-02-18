import java.util.*;
public class Name {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please type your 'lastname,firstname' in this format");

		String firstFormat = sc.next();

		int indexComma = firstFormat.indexOf(',');

		System.out.printf("%nYou have inserted '%s'",firstFormat ); 
		System.out.printf("%nIndex of comma is %d",indexComma );

		String last = firstFormat.subString(0,indexComma);

		last = last.subString(0,1).toUpperCase() + last.subString(1) + 

		String first = firstFormat.subString(indexComma +2);
		fist = first.subString(0,1).toUpperCase() + first.subString(1).toUpperCase();


		System.printf("%n First name is %s ", first);

		System.printf("%n Last name is %s ", last);

		System.printf("%The final format is %s %s", first, last);



	}
}