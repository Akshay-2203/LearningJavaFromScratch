package learning.java;

import java.util.Scanner;

public class LearningArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0;i<arr.length;i++) {
			System.out.println("Enter your " + i + " number");
			arr[i] = input.nextInt();
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.println("your " + i + " number is " + arr[i]);
		}
		input.close();
	}

}
