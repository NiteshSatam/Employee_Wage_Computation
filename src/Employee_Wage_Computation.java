import java.util.Random;

public class Employee_Wage_Computation {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation!!!!");

		Random random = new Random();
		int attendance = random.nextInt(3);

		if (attendance == 2)
			System.out.println("Employee is present full time.");
		else if (attendance == 1)
			System.out.println("Employee is present half time.");
		else
			System.out.println("Employee is absent.");

	}

}
