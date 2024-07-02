package learning.java;

public class LearningStringBasics {

	public static void main(String[] args) {
		String name = "Anuj";
		String samename = "Anuj";
		String newName = new String("Anuj");
		System.out.println(name);
		System.out.println(newName);
		System.out.println("anuj kumar");
		if (name == samename) {
			System.out.println("both are same");		
		}
		if(name == newName) {
			System.out.println("both are same");
		} else {
			System.out.println("both are not same");
		}
		if(name.equalsIgnoreCase(newName)) {
			System.out.println("name and newname have same values");
		} else {
			System.out.println("name and newname have not same values");
		}
	}
	

}
