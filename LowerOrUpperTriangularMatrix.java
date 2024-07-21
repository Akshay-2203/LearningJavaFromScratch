package learning.java;

import java.util.Scanner;

public class LowerOrUpperTriangularMatrix {
	public static void main(String[] args) {
	int a[][]= new int[5][5];
	System.out.println("Enter the order of matrix: ");
	System.out.print("Enter the number of rows: ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.print("enter the number of columns: ");
	int m = sc.nextInt();
	if(n==m) { 
		System.out.print("enter the elements");
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				if ( i>=j)
//					using reverse this method we can find upper triangular Matrix also
				a[i][j] = sc.nextInt();
			}
		}	System.out.println("lower triangular matrix");
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				System.out.print(" "+ a[i][j]);
			}System.out.println();
		}
	} else
		System.out.print("Matrix order is not proper");
	}

}
