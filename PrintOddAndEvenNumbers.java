package learning.java;

public class PrintOddAndEvenNumbers {

	public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,6};
System.out.println(" odd numbers are-:");
for(int i=0;i< arr.length;i++) {
	if(arr[i]%2!=0) {
		System.out.println(arr[i]+" ");
	}
}System.out.println(" even numbers are-:");
for(int i=0;i< arr.length;i++) {
	if(arr[i]%2==0) {
		System.out.println(arr[i]+" ");
	}
}
	}

}
