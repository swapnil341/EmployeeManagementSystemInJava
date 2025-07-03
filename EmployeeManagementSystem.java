import java.util.Scanner;

class EmployeeTester {
	private Scanner sc = new Scanner(System.in);
	private Employee[] employees = new Employee[10];
	private static int employeeCount = -1;

	public int menu() {
		System.out.println(
				"1) Add Employee \n2) Display All Employees \n3) Search Employee by ID \n4) Display Employees joined in given Year \n5) Find Employee with Maximum Salary \n6) Find Employee with Minimum Salary \n7) Exit the Application");
		return sc.nextInt();
	}
  
	public void operations(int choice) {
		switch (choice) {
		case 1:
			if (employeeCount < 10)
				addEmployee();
			else
				System.out.println("Employee Array is Full!\n");
			break;
		case 2:
			if (employeeCount >= 0)
				displayAllEmployees();
			else
				System.out.print("No Employee Data Present!\n");
			break;
		case 3:
			searchEmployeeById();
			break;
		case 4:
			displayEmployeesJoiningInGivenYear();
			break;
		case 5:
			findEmployeeWithMaxSalary();
			break;
		case 6:
			findEmployeeWithMinSalary();
			break;
		case 7:
			System.exit(0);
			;
		}
	}

	// Operation methods
	// case 1
	public void addEmployee() {
		EmployeeTester.employeeCount++;
		employees[employeeCount] = new Employee();
		sc.nextLine();
		System.out.print("Name: ");
		employees[employeeCount].setName(sc.nextLine());

		System.out.print("Date of Birth:\n ");
		employees[employeeCount].setDateOfBirth();

		System.out.print("ID: ");
		employees[employeeCount].setId(sc.nextInt());

		System.out.print("Department: ");
		sc.nextLine();
		employees[employeeCount].setDepartment(sc.nextLine());

		System.out.print("Salary: ");
		employees[employeeCount].setSalary(sc.nextDouble());

		System.out.print("Date of Joining: ");
		employees[employeeCount].setDateOfJoining();

	}

	// case 2
	public void displayAllEmployees() {
		for (int emp = 0; emp <= employeeCount; emp++) {
			System.out.println(employees[emp].toString());
		}

	}

	// case 3
	public void searchEmployeeById() {
		System.out.print("ID: ");
		int id = sc.nextInt();
		for (int emp = 0; emp <= employeeCount; emp++) {
			if (employees[emp].getId() == id) {
				System.out.println(employees[emp].toString());
				break;
			}
		}
		System.out.println("Employee not Found!");
	}

	// case 4
	public void displayEmployeesJoiningInGivenYear() {
		System.out.print("Joined Year: ");
		int year = sc.nextInt();
		for (int emp = 0; emp <= employeeCount; emp++) {
			if (employees[emp].getDateOfJoining().getYear() == year) {
				System.out.println(employees[emp].toString());
			}
		}
		System.out.println("Employee not Found!");
	}

	// case5
	public void findEmployeeWithMaxSalary() {
		double maxSalary = Double.MIN_VALUE;
		Employee maxSalaryEmployee = null;
		for (int emp = 0; emp <= employeeCount; emp++) {
			if (employees[emp].getSalary() > maxSalary) {
				maxSalary = employees[emp].getSalary();
				maxSalaryEmployee = employees[emp];
			}
		}
		System.out.println("Employee with Highest Salary: \n" + maxSalaryEmployee.toString());
	}

	// case 6
	public void findEmployeeWithMinSalary() {
		double minSalary = Double.MAX_VALUE;
		Employee minSalaryEmployee = null;
		for (int emp = 0; emp <= employeeCount; emp++) {
			if (employees[emp].getSalary() < minSalary) {
				minSalary = employees[emp].getSalary();
				minSalaryEmployee = employees[emp];
			}
		}
		System.out.println("Employee with Lowest Salary: \n" + minSalaryEmployee.toString());
	}

}

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		EmployeeTester t1 = new EmployeeTester();
		while (true) {
			t1.operations(t1.menu());
		}
	}

}
