package learning.java;

public class ArraysInJava {

	public static void main(String[] args) {
		int arr[]= {1,1,1,1,1};
		int[] res = new int[arr.length];
		res[0]= arr[0];
		for( int i=1  ; i<arr.length;i++) {
			res[i]= res[i-1]+arr[i];
	} 
		for( int i=0; i<arr.length;i++) {
			System.out.print(res[i] + " ");
		}
	
		
		

	}

}
