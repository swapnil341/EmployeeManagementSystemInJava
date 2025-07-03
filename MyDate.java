package sampleTest;

public final class MyDate {
	// Fields
	private int day;
	private int month;
	private int year;

	// Constructor
	public MyDate() {
		this(0, 0, 0);
	}

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	// Methods

	// settors
	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// gettors
	public int getDay() {
		return this.day;
	}

	public int getMonth() {
		return this.month;
	}

	public int getYear() {
		return this.year;
	}

	// toString() method
	@Override
	public String toString() {
		return String.format("%d-%d-%d", this.day, this.month, this.year);
	}

}
