package learning.java;

public class TotalChractrsInString {

	public static void main(String[] args) {
		String s = "Learn Java";
		int count = 0;
		System.out.println("length of the string is"+ s.length());
		for (int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println(" count of characters "+ count);
	}

}
