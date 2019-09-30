// henry wang
// 9/30/19
// 4th period
// takes user inputs and calls quadratic to give a description


import java.util.*;

public class QuadraticClient { //still got srs issues
	
	public static void main(String[] args) {
		//scanner
		Scanner userInput = new Scanner(System.in);
		//welcome
		System.out.println("Welcome to the Quadratic Describer");
		//start loop
				//ask input
			//read input
			//call quadrdescriber and sendd input
		System.out.println("Provide values for coefficients a, b, and c");
		System.out.println("a: ");
		double a = userInput.nextDouble();
		
		System.out.println("b: ");
		double b = userInput.nextDouble();
		
		System.out.println("c: ");
		double c = userInput.nextDouble();
	String description = Quadratic.quadrDescriber(a, b, c);
	//print string returned by quadrdescriber
	System.out.println(description);
	//go again?
	System.out.println("Do you want to go again?");
	String yes = userInput.next();
	String no = userInput.next();
	
	System.out.println("Alright, I'm about to head out.");
	userInput.close();
}
	
}