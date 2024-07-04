package learning.java;

public class FactorialUsingRecursion {
	public int factorial(int n) {
		if(n<3) {
			return n;
		}
		return n*factorial(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialUsingRecursion f = new FactorialUsingRecursion();
		int result = f.factorial(5);
		System.out.print(" Factorial is" +result+" ");
	}

}
