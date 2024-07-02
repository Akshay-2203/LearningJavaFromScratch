package learning.java;

public class SumOfAnArray {
	public int sum(int[] abc) {
		int sum = 0;
		for(int i = 0;i<abc.length;i++) {
			sum+= abc[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		
		int abc[]= {1,2,3,4,5};
		SumOfAnArray a =  new SumOfAnArray();
		System.out.print(a.sum(abc));
		
	}

}
