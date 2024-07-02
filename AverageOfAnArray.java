package learning.java;

public class AverageOfAnArray {
	public int avg(int[] abc) {
		int sum = 0;
		for(int i = 0;i<abc.length;i++) {
			sum += abc[i];
		}
		return sum/abc.length;
	}
	public static void main(String[] args) {
	int[] abc = {1,5,6,7,9,10};
	AverageOfAnArray a = new AverageOfAnArray();
	System.out.print(a.avg(abc));
	}

}
