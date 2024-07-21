package learning.java;

public class TotalPunctuationCharactersInAString {

	public static void main(String[] args) {
	String s ="My name is Akshay,i m learning basics java programming in String.will u help me? ";
	int count = 0;
	for(int i= 0;i<s.length();i++) {
		if(s.charAt(i)==','  || s.charAt(i)=='.' || s.charAt(i)=='?'  ) {
			count++;
		}
	}System.out.print("total punctuation characters in a string "+count);

	}

}
