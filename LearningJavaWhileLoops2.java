package learning.java;

import java.util.Scanner;

public class LearningJavaWhileLoops2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean haslearnt = false;
		while(!haslearnt) {
			System.out.println("go to school,try to learn");
			System.out.println("have you understood");
			haslearnt = sc.nextBoolean();
		}
		
	}

}
