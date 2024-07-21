package learning.java;

import java.util.Scanner;

public class PerfectSquareOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter an integer");
		int n = sc.nextInt();
		int temp = 0;int i;
		for(i=1; i<=n;i++) {
		if(n==i*i) {
			temp =1;
			break;
		}

	}
	if(temp==1) 
		System.out.print("perfect square");
	else 
		System.out.print("not perfect square");
}
	

}
