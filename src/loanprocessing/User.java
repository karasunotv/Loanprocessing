package loanprocessing;

import java.time.LocalDateTime;
import java.util.Random;

public class User {

	private String name;
	private int age;
	private String email;
	private double salary;
	private Loan loan;

	LocalDateTime now = LocalDateTime.now();

	public String userId() {
		Random rand = new Random();
		char firstLetter = name.charAt(0);
		int rand_int1 = rand.nextInt(99);

		return Character.toString(firstLetter) + rand_int1;

	}

	public void loanStatus() {

		if (age < 18) {
			System.out.println("Loaned denied" + " TOO YOUNG");
		} else if (loan.getAmount() > 60000.00) {
			System.out.println("Loaned denied" + " loan is more than 60000");
		} else if (loan.getAmount() > (3 * salary)) {
			System.out.println("Loaned denied" + " loan is 3 times your salary");
		} else {
			System.out.println("Congratz, your loan was approved" + "\n" + name + "\n" + userId() + "\n"
					+ loan.getAmount() + "\n" + now);
		}
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", email=" + email + ", salary=" + salary + ", loan=" + loan
				+ "]";
	}

	public User(String name, int age, String email, double salary, Loan loan) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.salary = salary;
		this.loan = loan;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

}
