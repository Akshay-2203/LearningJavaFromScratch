package learning.java;

//import java.util.Scanner;

public class FindSquarejava {

	public static void main(String[] args) {
		int n;
//		System.out.print("enter any number");
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		double m = Math.sqrt(n);
//		System.out.print("Square root of "+n +"is "+m);
//	(without sqrt)
		int num = 9;
		double temp;
		double sqrt = num/2;
//		sqrt = 9/2=4
		do {
			temp = sqrt;
//			temp = 4
			sqrt = (temp+(num/temp))/2;
//			= 4+(9/4)/2 = 4+9/4/2=4+2/2 6/2 = 3
//			= 3+(9/3)/2 = 3+3/2=6/2=3
		}while((temp-sqrt)!=0);
		System.out.print("square root of a number is " + sqrt);

	}

}
