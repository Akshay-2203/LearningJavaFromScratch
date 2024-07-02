package learning.java;

public class LearningMathRandom {
	
	public static void main(String[] args) {
		
		System.out.print(getRandom(10, 20));
	}
	public static int getRandom(int a, int b) {
//		return(int)(Math.random()*6);
		return (int) (Math.random()*(b-a+1)+a);
		
	}

}
