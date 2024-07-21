package learning.java;

import java.util.Scanner;

public class FrequencyOfOddAndEvenMatrix {

	public static void main(String[] args) {
		int a[][] = new int[3][3]; int b[][] = new int[3][3];
		int i;int j;
		int freqOdd = 0;
		int freqEven =0;
		boolean isEqual = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first matrix value");
		for(i = 0;i<3;i++) {
			for(j=0; j<3;j++) {
				System.out.println(i+"enter value "+j);
				a[i][j] = sc.nextInt();
			}
		}
		for(i = 0;i<3;i++) {
			for(j=0; j<3;j++) {
				if(a[i][j]%2==0) {
					freqEven++;
				}else {
					freqOdd++;
				}
			}
		}
		System.out.println("freq of even matrix is:"+ freqEven);
		System.out.println("freq of even matrix is:"+ freqOdd);
		
	}

}
