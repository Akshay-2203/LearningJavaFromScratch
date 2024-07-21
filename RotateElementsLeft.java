package learning.java;

public class RotateElementsLeft {

	public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9};
	System.out.print("input Array:");
	for(int i = 0; i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	int first = a[0];
	for(int j=0; j<a.length-1;j++) {
		a[j]= a[j+1];
	}
	a[a.length-1]= first;
	System.out.println();
	System.out.println("output array:");
	for(int i = 0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
		}

}
