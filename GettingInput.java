

import java.util.Scanner;

public class GettingInput {

	public static void main(String[] args) {
	
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter first initial");
		String firstInitial = keyboard.next();
		System.out.println("Enter last name");
		String lastName = keyboard.next();
		System.out.println("house number");
		int houseNumber = keyboard.nextInt();
		System.out.println("streetName");
		String streetName = keyboard.next();
		System.out.println("steetType");
		String streetType = keyboard.next();
		System.out.println("City");
		String city = keyboard.next();
		
		keyboard.close();

		System.out.print(firstInitial + " " + lastName + " " + houseNumber + " "); 
		System.out.println(streetName + " " + streetType + " " + city);
		
	}

}
