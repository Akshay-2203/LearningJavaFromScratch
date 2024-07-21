package learning.java;

import java.util.Scanner;

public class NumberIsNegativeOrPositive {

	public static void main(String[] args) {
		System.out.print("Enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>0) {
			System.out.print("number is positive");
		
		}else {
			System.out.print("number is negative");
		}

	}

}
