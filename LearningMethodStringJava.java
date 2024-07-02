package learning.java;

public class LearningMethodStringJava {

	public static void main(String[] args) {
		String name = "  AkShAy  ";
System.out.println(name.toUpperCase());
System.out.println(name.toLowerCase());
System.out.println(name.trim());
System.out.println("akshay".startsWith("aks"));
System.out.println("sharma".endsWith("rma"));
System.out.println("akshu".equals("akshu"));
System.out.println("akshu".charAt(2));


int age = 2203;
String stringAge = String.valueOf(age);
System.out.println(age+2);
System.out.println(stringAge+2);
String sentence = " i love java, Java is a good language";
String newSentence = sentence.replace("java",  "cpp");
System.out.println(sentence);
System.out.println(newSentence);
	}

}
