package learning.java;

import java.util.Scanner;

public class AddingSubtractionAndMultiplicationOfTwoMatrics {
	public static void main( String[]args) {
		Scanner sc = new Scanner(System.in);
		int a[][]= new int[2][2];
		int b[][]= new int[2][2];
		int c[][]= new int[2][2];
		System.out.print("enter first matrix data:");
		for(int i =0; i <2;i++) {
			for (int j=0;j<2;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.print("enter Second matrix data:");
		for(int i =0; i <2;i++) {
			for (int j=0;j<2;j++) {
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println(" first matrix ");
		for(int i =0; i <2;i++) {
			for (int j=0;j<2;j++) {
						System.out.print(	a[i][j]+" ");
			}	System.out.println();
			
		}
		System.out.println(" second matrix ");
		for(int i =0; i <2;i++) {
			for (int j=0;j<2;j++) {
						System.out.print(	b[i][j]+" ");
			}	System.out.println();
			
		}
		System.out.println("sum of two matrix");
		for(int i =0; i <2;i++) {
			for (int j=0;j<2;j++) {
			c[i][j]= a[i][j]+b[i][j];
//			its method is used for subtraction and multiplication also by using (-and *)
			System.out.print(c[i][j]+" ");
			}	System.out.println();
		}
	}

}
