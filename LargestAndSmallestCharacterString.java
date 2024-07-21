package learning.java;

import java.util.Scanner;

public class LargestAndSmallestCharacterString {
	void max_min(String str) {
		char max = str.charAt(0);
		char min = str.charAt(0);
		for(int i=1;i<str.length();i++) {
			char ch = str.charAt(i);
			if(max<ch)
				max = ch;
			if(min>ch)
				min = ch;
		}
		System.out.println("largest character is: "+ max);
		System.out.println("smallest character is: "+ min);
	}

	public static void main(String[] args) {
		LargestAndSmallestCharacterString obj = new LargestAndSmallestCharacterString();
		Scanner sc = new Scanner(System.in);
		System.out.println("input: ");
		String str = sc.nextLine();
		obj.max_min(str);

	}

}
