package learning.java;

public class ArraysJava {

	public static void main(String[] args) {
		int nums[] = {0,2,1,5,3,4};
		int[]res = new int[nums.length];
		res[0]= nums[0];
		for(int i=0;i<nums.length;i++) {
			res[i]= nums[nums[i]];
			
		}
		for(int i =0;i<nums.length;i++) {
			
		
		System.out.print(res[i] + " ");
		}
	}

}
