package learning.java;

import java.util.Scanner;

public class ReverseANumber{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print(" Enter a number ");
		int no= sc.nextInt();
	int temp = no;
		int rev = 0, rem;
		while(temp!= 0){
		rem = temp%10;
		rev = rev*10+rem;
		temp = temp/10;
		}
		System.out.print(rev);
	}		
}