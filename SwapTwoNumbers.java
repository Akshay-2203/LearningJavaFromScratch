package learning.java;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a,b,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("before swapping "+ a+" "+ b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping "+ a+" " + b);
		

	}

}
