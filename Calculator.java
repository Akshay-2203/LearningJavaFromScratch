package learning.java;

import java.util.Scanner;

public class Calculator {
	public void print() {
		System.out.print("Hello");
	}
	public int add(int a,int b) {
		return a+b;
	}
	public int subtract(int a,int b) {
		return a-b;
	}
	public int multiply(int a,int b) {
		return a*b;
	}
	public int divide(int a,int b) {
		return a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = input.nextInt();
		System.out.println("Enter 2nd number");
		int b = input.nextInt();
//			System.out.println("Enter 1 to add,Enter 2 to subtract,Enter 3 to multiply,Enter 4 to divide");
//			int c = input.nextInt();
//			switch(c) {
//			case 1 :
//				int result = a+b;
//				System.out.println(result);
//				break;
//			case 2 : 
//				result = a-b;
//				System.out.println(result);
//				break;
//			case 3 : 
//				result = a*b;
//				System.out.println(result);
//				break;
//			case 4 : 
//				result = a/b;
//				System.out.println(result);
//				break;
//			default:
//				System.out.println("Wrong input");
//				break;
		Calculator c = new Calculator();
		int result = c.add(a, b);
		System.out.println(result);
		c.print();
		}
	}

