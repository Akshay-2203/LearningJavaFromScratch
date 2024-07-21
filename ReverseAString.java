package learning.java;

public class ReverseAString {

	public static void main(String[] args) {
		String str = "ABC";
		String reverseStr = "";
		char ch;
		for(int i=0;i<str.length();i++) {
			ch = str.charAt(i);
			reverseStr = ch+reverseStr;
		}
		System.out.print("reversed string is: "+ reverseStr);

	}

}
