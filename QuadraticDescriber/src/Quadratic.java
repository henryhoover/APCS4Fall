//henry wang
// 9/30/19
//4th period
//does the calculations to print out a description for the quadratic client

public class Quadratic { //we got srs issues
	
	public static double discriminant(double a, double b, double c) { //a call to discriminant returns the discriminant value of a quadratic equation based on the values passed. accepts 3 doubles, returns a double
		return (b * b) - (4 * a * c);
	}
	

	public static double sqrt(double number) { //gonna be honest here: idk
		double div = number;
		if(number < 0) {
			throw new IllegalArgumentException("no square roots of negative numbers");
		}
		return(0.5 * (number / div) + div);
	}
	
	public static double round2(double number) { //we gottem
		number = (number * 100); 
		number = (number + .5);
		number = (int) number;
		number = (number / 100);
		number = (double) number;
		return number;	
	}
	
	public static String quadForm(double a, double b, double c) { //need round2 so uhhhhh
		if(b == 0) {
			System.out.println(round2(c));
		}

		if(discriminant(a, b, c) == 0) {
			System.out.println(round2(b * -1 / 2 *a));	
		}
		
		if(discriminant(a, b, c) > 0) {
			System.out.println(round2(b * -1 + (sqrt(b * b - (4 * a * c)))));
		}
		return("no real roots");
	}
	
	public static double max(double number1, double number2) { //a call to max returns the larger of the values passed. accepts two doubles returns a double
		if (number1 > number2) {
			return(number1);
		} if (number2 > number1) {
			return(number2);
		}
		return(number1);
		}
		
	public static double max(double number1, double number2, double number3) { //call to this max (overload) returns the largest value of three values. accepts 3 doubles returns a double
		if (number1 > number2) {
			if (number1 >number3) {
				return(number1);
			}
		} if (number2 > number1) {
			if (number2 > number3) {
				return(number2);
			}
		} if (number3 > number1) {
			if (number3 > number2) {
				return(number3);
			}
		}
		return(number1);
	}

	public static double min(double number1, double number2) { //call to min returns the smaller value for the values passed. accepts two ints and returns an int
		if(number1 < number2) {
			return(number1);
		} if(number2 < number1) {
			return(number2);
		}
		return(number1);
	}

	public static String quadrDescriber (double a, double b, double c) { //call to quadrDescriber creates the strings that are printed to QuadraticClient
			System.out.println("Description of the graph of:");
			System.out.println(a + "x^2" + b + "x" + c);
			
			if(a > 0) {
				System.out.println("Opens: Up");
			} if(a < 0) {
				System.out.println("Opens: Down");
			}
			
			System.out.println("Axis of symmetry: " + c);
			System.out.println("Vertex: (" + (b * -1) / (2 * a) + "," + c + ")");
			System.out.println("x-intercept(s): " + quadForm(a, b, c));
			System.out.println("y-intercept: " );
			
				
			
	}
		
		
		

	}


