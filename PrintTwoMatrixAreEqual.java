package learning.java;

import java.util.Scanner;

public class PrintTwoMatrixAreEqual {

	public static void main(String[] args) {
		int a[][] = new int[3][3]; int b[][] = new int[3][3];
		int i;int j;
		boolean isEqual = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first matrix value");
		for(i = 0;i<3;i++) {
			for(j=0; j<3;j++) {
				System.out.println(i+"enter value "+j);
				a[i][j] = sc.nextInt();
			}
		}	System.out.println("enter second matrix value");
		for(i = 0;i<3;i++) {
			for(j=0; j<3;j++) {
				System.out.println(i+"enter value "+j);
				b[i][j] = sc.nextInt();
			}
		}
		for(i = 0;i<3;i++) {
			for(j=0; j<3;j++) {
				if(a[i][j]!=b[i][j]) {
					isEqual = false;
				}
			}
		}
		if(isEqual) {
			System.out.print("Matrix are equal");
		}
		else {
			System.out.print("Matrix are not equal");
		}

	}

}
