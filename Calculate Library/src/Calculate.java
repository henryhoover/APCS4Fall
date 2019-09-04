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

}
