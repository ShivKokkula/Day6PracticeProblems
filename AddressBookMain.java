package AddressBookSystem;

import java.util.Scanner;

public class AddressBookMain {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Welcome to Address Boook Program");
				
		String[] firstName = new String[5];
		String[] lastName = new String[5];
		String[] address = new String[5];
		String[] city = new String[5];
		String[] state = new String[5];
		String[] zipCode = new String[5];
		String[] phoneNumber = new String[5];
		String[] email = new String[5];
		
		for(int i=0; i<=1; i++) {
			System.out.println("Enter contact details of Person:" +(i+1));
			System.out.println("First name:");
			firstName[i] = sc.next();
			System.out.println("Last name:");
			lastName[i] = sc.next();
			System.out.println("Address:");
			address[i] = sc.next();
			System.out.println("City:");
			city[i] = sc.next();
			System.out.println("State:");
			state[i] = sc.next();
			System.out.println("Zip Code:");
			zipCode[i] = sc.next();
			System.out.println("Phone Number:");
			phoneNumber[i] = sc.next();
			System.out.println("email:");
			email[i] = sc.next();
		}
		
		for(int i=0; i<=1; i++) {
			System.out.println("Enter contact details of Person:" +(i+1));
			System.out.println("First name:" +firstName[i]);
			System.out.println("Last name:" +lastName[i]);
			System.out.println("Address:" +address[i]);
			System.out.println("City:" +city[i]);
			System.out.println("State:" +state[i]);
			System.out.println("Zip Code:" +zipCode[i]);
			System.out.println("Phone Number:" +phoneNumber[i]);
			System.out.println("email:" +email[i]);
		}
		
		
	}

}
