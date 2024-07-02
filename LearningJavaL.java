package learning.java;

import java.util.Scanner;

public class LearningJavaL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number:");
		int n = sc.nextInt();
//		for( int i= 1; i<=10; i++ ) {
//			System.out.println(n+"x"+i+"="+i*n);
//				
//		}
		
//		for(int i=1; i <= n; i++) {
//		System.out.print(i +" ");}
		int sum = 0;
		for(int i= 1; i<=n; i++) {
			sum = sum+ 2*i;
		}
		System.out.print("sum is: " +sum);
	}

}
