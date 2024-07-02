package learning.java;

public class LearningMultidimensionalA {

	public static void main(String[] args) {
	int marks[][] = { 
			{98,12,13},
			{15,16,17},  
			{18,19,20},
			{21,22,23}

};
	for(int i =0;i<marks.length;i++) {
		for(int j = 0;j<marks[0].length;j++) {
			System.out.print(marks[i][j] + " ");
		}
		System.out.println();
	}
	

	}

}
