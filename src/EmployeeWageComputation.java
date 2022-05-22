import java.util.Random;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation!!!!");

		int wagePerHour = 20;
		int fullDayHour = 8;
		int halfDayHour = 4;
		int wagePerDay = 0;

		Random random = new Random();
		int attendance = random.nextInt(3);

		switch (attendance) {
		case 0:
			System.out.println("Employee is absent.");
			break;
		case 1:
			System.out.println("Employee is present half time. ");
			wagePerDay = wagePerHour * halfDayHour;
			break;
		default:
			System.out.println("Employee is present full time.");
			wagePerDay = wagePerHour * fullDayHour;
		}
		System.out.println("Daily salary of employee is:" + wagePerDay);

	}

}
