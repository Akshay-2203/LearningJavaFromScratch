package learning.java;

public class CountVowelAndConsonant {

	public static void main(String[] args) {
		String s ="kjfakshcvasjcbshvcjasncljascljasbcljasbclnaslcjsblcknscjlvaslkcnaslcgsduedh";
		int countVowel=0;
		int countConsonant=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				countVowel++;
			}else {
				countConsonant++;
			}
			
		}
		System.out.println("vowel is: "+ countVowel);
		System.out.println("consonant is: "+ countConsonant);

	}

}
