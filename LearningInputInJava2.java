package learning.java;

import java.util.Scanner;

public class LearningInputInJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 6;
//		int b = 7;
//		if(a>b) {
//			System.out.print("a is greater than b");
//		}
//		else {
//			System.out.print("b is greater than a");
//		}
		Scanner input = new Scanner(System.in);
		System.out.println("Enter integer value");
		int a = input.nextInt();
//		System.out.println("Enter your first number b");
//		int b = input.nextInt();
//		if(a>b) {
//			System.out.print("a is greater than b");
//		}
//		else {
//			System.out.print("b is greater than a");
//		}
		System.out.println("Enter Float value");
		float b = input.nextFloat();
//		System.out.println("Enter String value");
//		String c = input.next();
		System.out.println("Enter String with spaces value");
		String d = input.nextLine();
		 System.out.println("You entered: " + d);
	        
	        
	        input.close();
	}

}
