package learning.java;

public class ProblemsOfArray {

	public static void main(String[] args) {
		
int numbers[] = {1, 2, 3, 4, 5};
//int sum = 0;
//for (int number: numbers) {
//	sum+= number;
//}
//System.out.print("Sum is "+ sum);
//int min = Integer.MAX_VALUE;
//for (int number : numbers) {
//	if(number<min) {
//		min = number;
//	}
//}

//System.out.print("minimum is "+min);

int max = Integer.MIN_VALUE;
for(int number : numbers) {
	if (number > max) {
	max = number;
    }
}

System.out.print("maximum is "+max);
	}
}
