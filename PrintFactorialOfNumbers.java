package learning.java;

public class PrintFactorialOfNumbers {

	public static void main(String[] args) {
		int no =5;
		int fact = 1;
//		for(int i=1; i<=no;i++) {
//			fact = fact*i;
//			System.out.print("Factorial of"+ no+" is"+fact+" ");
//		}
		
		for (int i=no;i>=1;i--) {
			fact = fact*i;
			
		}System.out.print(" Factorial of"+ no + "is" + fact+" ");
		
		
	}

}
