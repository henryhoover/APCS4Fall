// henry wang
// 9/30/19
// 4th period
// takes user inputs and calls quadratic to give a description

import java.util.*;

public class QuadraticClient { //receives user input and calls quadratic to print a description.
	
	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.println("Welcome to the Quadratic Describer");

		System.out.println("Provide values for coefficients a, b, and c");
		System.out.println("a: ");
		double a = userInput.nextDouble();
		
		System.out.println("b: ");
		double b = userInput.nextDouble();
		
		System.out.println("c: ");
		double c = userInput.nextDouble();
		
	String description = Quadratic.quadrDescriber(a, b, c);

	System.out.println(description);

	System.out.println("Do you want to go again? (type \"no\" to quit)");
	String no = userInput.next();
	
	if(no == "no") {
		System.out.println("Alright, I'm about to head out.");
		userInput.close();
	} else {
		System.out.println("Provide values for coefficients a, b, and c");
		System.out.println("a: ");
		a = userInput.nextDouble();
		
		System.out.println("b: ");
		b = userInput.nextDouble();
		
		System.out.println("c: ");
		c = userInput.nextDouble();
		
		description = Quadratic.quadrDescriber(a, b, c);

	System.out.println(description);

	System.out.println("Do you want to go again? (type \"no\" to quit)");
	}

}
	
}