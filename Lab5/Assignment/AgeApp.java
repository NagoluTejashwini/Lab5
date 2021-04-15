package Lab5.Assignment;

import java.util.Scanner;

public class AgeApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		try {
			if(age > 15) {
				System.out.println("Your age is ablove 15 which is: "+age);
			}
			else {
				throw new AgeException("your age is: "+age+" should be above 15");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
