package learning.java;

public class PrintEvenOddPositions {

	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4,5,6,7,8,9};
//		even
		for(int i=0;i<arr.length;i=i+2) {
		System.out.println("index = " + i + "," + "value=" + arr[i]);	
		}
		System.out.println("***************");
//		odd
		for(int i=1;i<arr.length;i=i+2) {
		System.out.println("index = " + i + "," + "value=" + arr[i]);	
		}
	}

}
 