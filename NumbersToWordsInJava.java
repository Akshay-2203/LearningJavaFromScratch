package learning.java;

import java.util.Scanner;

public class NumbersToWordsInJava {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number");
	int number = sc.nextInt();
	if(number<1 || number>999){
		System.out.print("invalid number");
		
	} else {
		int a = number%10;
//		last digit
		int b = number/10;
		int c = b%10;
		int d = number/100;
		System.out.println(a); 
	
		System.out.println(c); 
		System.out.println(d); 
	
     String sD[]= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	String tY[]= {"","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"}	;
	
if(number<20) {
		System.out.print(sD[number]);
				
	} else {
		if(number>=20 && number>100) 
			System.out.println(tY[number]);
		
	}
	}

	}
}
