import java.util.Random;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation!!!!");

		int wagePerHour = 20;
		int fullDayHour = 8;
		int halfDayHour = 4;
		int wagePerDay = 0;
		int monthlySalary = 0;
		int days = 1;

		Random random = new Random();

		while (days <= 20) {
			int attendance = random.nextInt(3);

			switch (attendance) {
			case 0:
				System.out.println("Employee Absent.");
				wagePerDay = 0;
				break;

			case 1:
				System.out.println("Employee Present Part Time.");
				wagePerDay = halfDayHour * wagePerHour;
				break;

			default:
				System.out.println("Employee Present Full Time.");
				wagePerDay = fullDayHour * wagePerHour;

			}
			monthlySalary = monthlySalary + wagePerDay;
			days++;
		}
		System.out.println("Monthly Salary is: " + monthlySalary);
	}

}