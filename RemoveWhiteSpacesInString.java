package learning.java;

public class RemoveWhiteSpacesInString {

	public static void main(String[] args) {
	String str = " A  KS  HAY SHA R MA";
String str1 = str.replaceAll("\\s","");
System.out.print(str1);
	}

}
