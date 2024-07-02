package learning.java;
import java.util.Scanner;
public class LearningInputInJava {

    Scanner input = new Scanner(System.in);
	  System.out.print("Enter your roll number: ");
	  int rollNo = input.nextInt(); // Read the integer roll number

	        // Consume the newline character left behind by nextInt()
	        input.nextLine();

	        System.out.print("Enter your name: ");
	        String name = input.nextLine(); // Read the entire line for the name

	        System.out.println("Roll No. is " + rollNo);
	        System.out.println("Your name is: " + name);

	        input.close();
	}

}
