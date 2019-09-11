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
	
	public static double average(double number1, double number2, double number3) {
		return (number1 + number2 + number3) / 2;
		
	}
	
	public static double toDegrees(double radian1) {
		return (radian1 * 180) / 3.14159;
		
	}
	
	public static double toRadians(double degree) {
		return (degree * 3.14159) / 180;
		
	}
	
	public static double discriminant(double a, double b, double c) {
		return (b * b) - (4 * a * c);
	}
	
	public static String toImproperFract(int number, int numer, int denom) {
		String answer = "0";
		answer = number * denom + numer + "/" + denom;
		return(answer);
		
	}
	
	public static String toMixedNum(int numer, int denom) {
		String answer = "0";
		answer = (numer / denom) % numer + "/" + denom;
		return(answer);
	
	}
	
	public static String foil(int a, int b, int c, int d, String string) {
		String answer = "0";
		answer = (a * c) + string + "^2" + +(a * d) + string + "+" + (b * c) + string + + (b * d);
		return(answer);
	}
	
	public static boolean isDivisibleBy(int a, int b) {
		return(a % b == 0);
	}
	
	public static double absValue(double a) {
		if(a >= 0) {
			return(a);
		} else {
			return(a / -1);
		}
		
	}


	


}
