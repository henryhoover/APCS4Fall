//HENRY WANG
//8/29/19
//PERIOD 4
//THIS IS A GROUP OF METHODS THAT DO MATH CALCULATIONS AKA A LIBRARY

public class Calculate { 					
	public static int square(int number) { //a call to square returns the square of the value passed. accepts and returns integer
		int answer=0;
		answer =  number * number;
		return answer;
		
	}
	
	public static int cube(int number) { //a call to cube returns the cube of the value passed. accepts and returns integer
		return number * number * number;
		
	}
	
	public static double average(double number1, double number2) { //a call to average returns the average of values passed. accepts 2 doubles, returns a double
		return (number1 + number2) / 2;
		
	}
	
	public static double average(double number1, double number2, double number3) { //a call to this average returns the average of values passed. accepts 3 doubles, returns a double
		return (number1 + number2 + number3) / 2;
		
	}
	
	public static double toDegrees(double radian1) { //call to toDegrees returns a value of degrees equivalent to the radian value passed. accepts a double and returns a double
		return (radian1 * 180) / 3.14159;
		
	}
	
	public static double toRadians(double degree) { //a call to toRadians returns an equivalent radian value for the degree value passed. accepts a double and returns a double
		return (degree * 3.14159) / 180;
		
	}
	
	public static double discriminant(double a, double b, double c) { //a call to discriminant returns the discriminant value of a quadratic equation based on the values passed. accepts 3 doubles, returns a double
		return (b * b) - (4 * a * c);
	}
	
	public static String toImproperFract(int number, int numer, int denom) { //a call to toImproperFract returns an equivalent improper fraction for the mixed number passed. accepts 3 integers, returns a string
		String answer = "0";
		answer = number * denom + numer + "/" + denom;
		return(answer);
		
	}
	
	public static String toMixedNum(int numer, int denom) { //a call to toMixedNum returns an equivalent mixed number for the improper fraction passed. accepts 2 integers, returns a string
		String answer = "0";
		answer = (numer / denom) % numer + "/" + denom;
		return(answer);
	
	}
	
	public static String foil(int a, int b, int c, int d, String string) { //a call to foil returns a standard form quadratic equation based on the values passed. accepts 4 integers and a string, returns a string
		String answer = "0";
		answer = (a * c) + string + "^2" + +(a * d) + string + "+" + (b * c) + string + + (b * d);
		return(answer);
	}
	
	public static boolean isDivisibleBy(int number, int factor) { //a call to isDivisibleBy returns a boolean based on whether the two values passed are evenly divisible. accepts 2 integers, returns a boolean
		return(number % factor == 0);
	}
	
	public static double absValue(double number) { //a call to absValue returns the absolute value of the value passed. accepts and returns a double
		if(number >= 0) {
			return(number);
		} else {
			return(number / -1);
		}
		
	}
	
	public static double max(double number1, double number2) {
		if (number1 > number2) {
			return(number1);
		} if (number2 > number1) {
			return(number2);
		}
		return(number1);
		}
		
	public static double max(double number1, double number2, double number3) {
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

	public static int min(int number1, int number2) {
		if(number1 < number2) {
			return(number1);
		} if(number2 < number1) {
			return(number2);
		}
		return(number1);
	}
	
	public static double round2(double number) { //how do u do this????
		if(number != 0) {
			return (number * 100) / 100;
		}
		return(number);
	}

	public static double exponent(double base, int power) { //figure this one oout
		int repeat = power;
		if(power == 0) {
			return(1);
		} while (power > 0; power ++;); {
			return(base * base);
		}
		return(1);
	}
	
	public static int factorial(int number) {
		while (number > 0) {
			return(number * (number -1));
		}
		return(1);
	}
	
	public static boolean isPrime(int number) {
		int factor = 2;
		if(isDivisibleBy(number, factor) == false) {
			factor++;
			return(true);
		} else {
			return(false);
		}
	}
	
	public static int gcf(int number1, int number2) { //uhhhhhhhhh

		if(isPrime(number1 | number2) == false) {
			
		}
		return(1);
	}
}


