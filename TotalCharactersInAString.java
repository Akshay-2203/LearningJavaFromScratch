package learning.java;

public class TotalCharactersInAString {

	public static void main(String[] args) {
		String s = "Akshay Sharma";
		int count =0;
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				count++;
			}
			
		}System.out.println("total characters in a string "+count);

	}

}
