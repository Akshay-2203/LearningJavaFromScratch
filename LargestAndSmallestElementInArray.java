package learning.java;

import java.util.Scanner;

public class LargestAndSmallestElementInArray {

	public static void main(String[] args) {
		int a[] = new int[5];int max;int min;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter array elements");
		for(int i=0;i<5;i++) {
			a[i] = sc.nextInt();
		}
//		largest
//		 max = a[0];
//		 for(int i=1;i<5;i++) {
//			 if(a[i]>max) {
//				 max = a[i];
//			 }
//		 }
//		 System.out.print("maximum element " + max);
//		 smallest
		 min = a[0];
		 for(int i=1;i<5;i++) {
			 if(a[i]<min) {
				 min = a[i];
			 }
		 }
		 System.out.print("minimum element " + min);
	}
	
	 

}
