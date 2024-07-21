package learning.java;

import java.util.Scanner;

public class ElementsInReverseOrder {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("enter elements on array");

		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.print("array elements");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("array reverse elements");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}

	
	}

}
