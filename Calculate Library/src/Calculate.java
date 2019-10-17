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
	
	public static String toImproperFrac(int number, int numer, int denom) { //a call to toImproperFract returns an equivalent improper fraction for the mixed number passed. accepts 3 integers, returns a string
		String answer = "0";
		answer = number * denom + numer + "/" + denom;
		return(answer);
		
	}
	
	public static String toMixedNum(int numer, int denom) { //a call to toMixedNum returns an equivalent mixed number for the improper fraction passed. accepts 2 integers, returns a string
		String answer = "0";
		answer = (numer / denom)  + "_" +  (numer / denom) % denom + "/" + denom;
		return(answer);
	
	}
	
	public static String foil(int a, int b, int c, int d, String string) { //a call to foil returns a standard form quadratic equation based on the values passed. accepts 4 integers and a string, returns a string
		String answer = "0";
		answer = (a * c) + string + "^2" + +(a * d) + string + "+" + (b * c) + string + + (b * d);
		return(answer);
	}
	
	public static boolean isDivisibleBy(int number, int factor) { //a call to isDivisibleBy returns a boolean based on whether the two values passed are evenly divisible. accepts 2 integers, returns a boolean
		if(factor == 0) {
			throw new IllegalArgumentException("cannot divide by 0");
		}
		return(number % factor == 0);

	}
	
	public static double absValue(double number) { //a call to absValue returns the absolute value of the value passed. accepts and returns a double
		if(number >= 0) {
			return(number);
		} else {
			return(number / -1);
		}
		
	}
	
	public static double max(double number1, double number2) { //a call to max returns the larger of the values passed. accepts two doubles returns a double
		if (number1 > number2) {
			return(number1);
		}
		return (number2);
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

	public static int min(int number1, int number2) { //call to min returns the smaller value for the values passed. accepts two ints and returns an int
		if(number1 < number2) {
			return(number1);
		} 
		return(number2);
	}
	
	public static double round2(double number) { //a call to round2 rounds a double to 2 decimal places. accepts and returns a double
		number = (number * 100); 
		number = (number + .5);
		number = (int) number;
		number = (number / 100);
		number = (double) number;
		return number;	
	}

	public static double exponent(double base, int power) { //a call to exponent raises a value to the integer value. accepts double and integer, returns a double
		if(power < 0) {
			throw new IllegalArgumentException("no negative powers");
		}
		if(power == 0) {
			return(1);
		}
		int repeats = 1;
		double answer = base;
		while (repeats != power) {
			answer = base * base;
			repeats++;
	}
		return(answer);

	}
	
	
	public static int factorial(int number) { //a call to factorial returns the factorial of the value passed. accepts and returns an int
		int answer = number;
		int mult = number -1;
		if (number < 0) {
			throw new IllegalArgumentException("no negative factorials");
		}
		do {
			answer = number;
			mult = mult - 1;
			return(answer);
		} while (mult != 1);

		}
		
	
	
	public static boolean isPrime(int number) { //call to isPrime determines if an integer is prime. accepts an int and returns a boolean
		int factor = 2;
		if(isDivisibleBy(number, factor) == false) {
			factor++;
			return(true);
		} else {
			return(false);
		}
	}
	
	public static int gcf(int number1, int number2) { //a call to gcf returns the greatest ccommon factor of the 2 values passed. accepts 2 integers, rerturns an int
		int factor = 1;
		double larger = max(number1, number2);
		double smaller = min(number1, number2);
		for (int i = 1; i <= (int)larger; i++) {
			if (isDivisibleBy((int)larger, i) == true) {
				if (isDivisibleBy((int)smaller, i) == true) {
					factor = i;
				}
			}
		}
		return(factor);
		}

	
	public static double sqrt(double number) { //a call to sqrt returns the square root of the value passed (rounded to 2 decimal places). accecpts and returns an int
		double answer = number / 2;
		if (number < 0) {
			throw new IllegalArgumentException("no negative square roots"); 
		}
		while (((answer * answer) - number) >= .005 || ((answer * answer) - number) <= -.005) {
			answer = 0.5 * (number / answer + answer);
		}
		return round2(answer);
	}
	
	public static String quadForm(int a, int b, int c) { //need round2 so uhhhhh
		if(b == 0) {
			System.out.println(round2(c));
		}

		if(discriminant(a, b, c) == 0) {
			System.out.println(round2((b * -1) / (2 *a)));	
		}
		
		if(discriminant(a, b, c) > 0) {
			System.out.println(round2(b * -1) + (sqrt(b * b - (4 * a * c))));
		}
		return("no real roots");
	}
}


