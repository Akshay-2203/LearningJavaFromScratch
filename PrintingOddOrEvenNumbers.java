package learning.java;
import java.util.Scanner;
public class PrintingOddOrEvenNumbers {

	public static void main(String[] args) {
		for(int i=0; i<=20; i++) {
			if(i%2==0) {
				System.out.print(i+",");
			}	
		}
		System.out.println();
		for(int i=0; i<=20;i++) {
			if(i%2!=0) {
				System.out.print(i+",");
			}
		}
	}


}