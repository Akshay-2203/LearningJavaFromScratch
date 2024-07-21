package learning.java;

public class CopyOneElementIntoAnother {

	public static void main(String[] args) {
		int[]arr1 = new int[]{1,2,3,4,5,6 };
		int[]arr2 = new int[arr1.length];
		int i;
		for(i=0;i<arr1.length;i++) {
			arr2[i] = arr1[i];
			
		}
		System.out.println("elements of an original array:");
		for(i=0;i<arr1.length;i++) {
			System.out.print (arr1[i]+" ");
			
		}
		System.out.println ();
		System.out.println ("elements of new array");
		for(i=0;i<arr2.length;i++) {
			System.out.print (arr2[i]+" ");
			
		}
	
	}

}
