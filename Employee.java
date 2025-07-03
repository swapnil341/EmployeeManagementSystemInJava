package sampleTest;

import java.util.Scanner;

public class Employee extends Person {
	// Fields
	private Scanner sc = new Scanner(System.in);
	private int id;
	private String department;
	private double salary;
	private MyDate dateOfJoining;

	// Methods

	// Constructors
	public Employee() {
		this("", new MyDate(), 0, "", 0.0, new MyDate());
	}

	public Employee(String name, MyDate dob, int id, String department, double salary, MyDate date) {
		super(name, dob);
		this.id = id;
		this.department = department;
		this.salary = salary;
		this.dateOfJoining = date;
	}

	// settors
	public final void setId(int id) {
		this.id = id;
	}

	public final void setDepartment(String department) {
		this.department = department;
	}

	public final void setSalary(double salary) {
		this.salary = salary;
	}

	public final void setDateOfJoining() {
		System.out.print("Day: ");
		int day = sc.nextInt();

		System.out.print("Month: ");
		int month = sc.nextInt();

		System.out.print("Year: ");
		int year = sc.nextInt();

		this.dateOfJoining = new MyDate(day, month, year);
	}

	// gettors
	public final int getId() {
		return this.id;
	}

	public final String getDepartment() {
		return this.department;
	}

	public final double getSalary() {
		return this.salary;
	}

	public final MyDate getDateOfJoining() {
		return this.dateOfJoining;
	}

	// toString()
	@Override
	public final String toString() {
		return String.format("%s\nId: %d\nDepartment: %s\nSalary: %f\nDate of Joining: %s\n", super.toString(), this.id,
				this.department, this.salary, this.dateOfJoining.toString());
	}

}
v
