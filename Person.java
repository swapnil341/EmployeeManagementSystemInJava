import java.util.Scanner;

public class Person {
	// Fields
	private Scanner sc = new Scanner(System.in);
	private String name;
	private MyDate dateOfBirth;

	// Methods

	// Constructors
	public Person() {
		this("", new MyDate());
	}

	public Person(String name, MyDate date) {
		this.name = name;
		this.dateOfBirth = date;
	}

	// Settors
	public void setName(String name) {
		this.name = name;
	}

	public void setDateOfBirth() {
		System.out.print("Day: ");
		int day = sc.nextInt();

		System.out.print("Month: ");
		int month = sc.nextInt();

		System.out.print("Year: ");
		int year = sc.nextInt();

		this.dateOfBirth = new MyDate(day, month, year);
	}

	// Gettors
	public String getName() {
		return this.name;
	}

	public MyDate getDateOfBirth() {
		return this.dateOfBirth;
	}

	public String toString() {
		return String.format("Name: %s\nDate of Birth: %s", this.name, this.dateOfBirth.toString());
	}

}
