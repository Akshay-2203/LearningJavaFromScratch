package learning.java;

import java.util.Arrays;
import java.util.Scanner;

public class StringsAreAnagramOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "LISTEN";
		String t = "SILENT";
	 char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        boolean result = Arrays.equals(a,b);
        if(result ==true)
         System.out.println("strings are anagram");
        else
        	 System.out.println("strings are not anagram");

	}

}
