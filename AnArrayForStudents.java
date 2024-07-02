package learning.java;

import java.util.Arrays;

public class AnArrayForStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] students = {"Annu","Mannu","Vanshi","Tannu","Payal","Akanksha"};
		int[] rollNO = {23,18,9,33,19,2};
		for(int i = 0;i<students.length;i++) {
			System.out.print(students[i] + " : " + rollNO[i] +" ");
		}
		Arrays.sort(students);
		System.out.println();
		for(int i = 0;i<students.length;i++) {
			System.out.print(students[i] + " " + rollNO[i]);
		}
	}

}
