package learning.java;

import java.util.Scanner;

public class AsciiValueOfAnyCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any character");
		char ch;
		ch = sc.next().charAt(0);    
		int a = ch;
		System.out.print("Ascii value of "+ ch +" is " + a);
		

	}

}
