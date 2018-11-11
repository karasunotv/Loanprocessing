package loanprocessing;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);

		LocalDateTime now = LocalDateTime.now();

		System.out.println("Enter name: ");
		String a = s.nextLine();

		System.out.println("Enter age: ");
		int b = s1.nextInt();

		System.out.println("Enter email: ");
		String email = s.nextLine();

		System.out.println("Enter salary: ");
		double c = s1.nextDouble();

		System.out.println("Enter loan amount: ");
		double d = s1.nextDouble();

		System.out.println("Enter rate of interest: ");
		double e = s1.nextDouble();

		User newUser = new User(a, b, email, c, new Loan(d, e));
		newUser.loanStatus();
		// System.out.println();
	}

}
