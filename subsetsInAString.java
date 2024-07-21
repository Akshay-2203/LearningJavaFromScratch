package learning.java;

public class subsetsInAString {

	public static void main(String[] args) {
	String str = "KIRTI";
	int len = str.length();
	System.out.println("length of the string is: "+ len);
	int temp = 0;
	System.out.println("size of the array is: "+ len*(len+1)/2);
	String arr[] = new String[len*(len+1)/2] ;
	for(int i=0;i<len;i++) {
		for(int j=i;j<len;j++) {
			arr[temp] = str.substring(i, j+1);
			temp++;
		}
	}
	System.out.println("all subset for the given string: ");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+" ");
	}

	}

}
