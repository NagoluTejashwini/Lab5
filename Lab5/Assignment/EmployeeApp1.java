package Lab5.Assignment;

import java.util.Scanner;

public class EmployeeApp1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary: ");
		double salary = sc.nextDouble();
		try {
			if(salary < 3000) {
				String s = String.valueOf(salary);
				throw new EmployeeException("your salary : "+salary+" is less than 3000");
			}
			else {
				System.out.println("Your salary is ablove 3000 which is: "+salary);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
