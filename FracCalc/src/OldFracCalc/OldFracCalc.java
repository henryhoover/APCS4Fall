//Henry Wang
//12/20/19
//4th period
//Calculator adds/subtracts/multiplies/divides whole numbers/mixed numbers/fractions by taking an equation as an input

package OldFracCalc;
import java.util.Scanner;

public class OldFracCalc {
	public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	
    	Scanner userInput = new Scanner(System.in);
    	String input = userInput.nextLine();
    		
    	System.out.println(produceAnswer(input));
    	
    	int scan = 0;
    	
    	while(scan == 0) {
    	if(input == "quit") {
    		scan = 1;
    		userInput.close();
    	}
    	else {
    		input = userInput.nextLine();
    	}
    	}
    }

	public static String produceAnswer(String input)
    {
		
		String[] parts = input.split(" ");
		String operand1 = parts[0];
		String operator = parts[1];
		String operand2 = parts[2];
		String answer = "0";
		
		if(operand1.split("_").length == 2) {
			operand1 = mixConvert(operand1);
		} else if(operand1.split("/").length != 2 && operand1.split("_").length != 2) {
			
			operand1 = Integer.parseInt(operand1) + "/" + 1;
		}
		if(operand2.split("_").length == 2) {
			operand2 = mixConvert(operand2);
		} else if(operand2.split("/").length != 2 && operand2.split("_").length != 2) {
			
			operand2 = Integer.parseInt(operand2) + "/" + 1;
		}
		
		answer = fracMath(operand1, operand2, operator);
		
		return(simplifyAns(answer));
    }
	
	//helper methods
	
	public static String mixConvert(String operand) { //mixConvert takes the operand and calls toImproperFract to convert the operand into an improper fraction by getting the parts of the mixed number
		int opernumb = Integer.parseInt(operand.split("_")[0]);
		int opernum = Integer.parseInt(operand.split("_")[1].split("/")[0]);
		int operden = Integer.parseInt(operand.split("_")[1].split("/")[1]);
		return(toImproperFract(opernumb, opernum, operden));
	}
	
	public static String commonDenom1(String frac1, String frac2) {
		String[] commonFracs = new String[2];
		int frac1num = Integer.parseInt(frac1.split("/")[0]);
		int frac1den = Integer.parseInt(frac1.split("/")[1]);
		int frac2num = Integer.parseInt(frac2.split("/")[0]);
		int frac2den = Integer.parseInt(frac2.split("/")[1]);
		
		commonFracs[0] = (frac1num * frac2den) + "/" + (frac1den * frac2den);
		commonFracs[1] = ((frac2num * frac1den) + "/" + (frac2den * frac1den));
		return(commonFracs[0]);
	}
	
	public static String commonDenom2(String frac1, String frac2) {
		String[] commonFracs = new String[2];
		int frac1num = Integer.parseInt(frac1.split("/")[0]);
		int frac1den = Integer.parseInt(frac1.split("/")[1]);
		int frac2num = Integer.parseInt(frac2.split("/")[0]);
		int frac2den = Integer.parseInt(frac2.split("/")[1]);
		
		commonFracs[0] = (frac1num * frac2den) + "/" + (frac1den * frac2den);
		commonFracs[1] = ((frac2num * frac1den) + "/" + (frac2den * frac1den));
		return(commonFracs[1]);
	}
	
	public static String fracMath(String frac1, String frac2, String operator) {
        int numResult = 0;
        int denResult = 0;
        String frac1Result = "0";
        String frac2Result = "0";
        String answer = "0";

        if(operator.equals("+") || operator.equals("-")) {
            frac1Result = commonDenom1(frac1, frac2);
            frac2Result = commonDenom2(frac1, frac2);
            if(operator.equals("+")) {

                answer = (Integer.parseInt(frac1Result.split("/")[0]) + Integer.parseInt(frac2Result.split("/")[0])) + "/" + frac1Result.split("/")[1];

            } else if(operator.equals("-")) {

                answer = (Integer.parseInt(frac1Result.split("/")[0]) + (Integer.parseInt(frac2Result.split("/")[0]) * -1) + "/" + frac1Result.split("/")[1]);

            }

        } else if(operator.equals("*")){
        	 numResult = Integer.parseInt(frac1.split("/")[0]) * Integer.parseInt(frac2.split("/")[0]);
             denResult = Integer.parseInt(frac1.split("/")[1]) * Integer.parseInt(frac2.split("/")[1]);
             answer = numResult + "/" + denResult;
        } else if(operator.equals("/")) {

            numResult = Integer.parseInt(frac1.split("/")[0]) * Integer.parseInt(frac2.split("/")[1]);
            denResult = Integer.parseInt(frac1.split("/")[1]) / Integer.parseInt(frac2.split("/")[0]);
            answer = numResult + "/" + denResult;

        }
        
        return(answer);
}
	
public static String simplifyAns(String answer) {
		
		int answerNum = Integer.parseInt(answer.split("/")[0]);
		int answerDen = Integer.parseInt(answer.split("/")[1]);
		int answerMixNumb = 0;
		
		if(answer.split("/")[1].equals("1") || answer.split("/")[0].equals(answer.split("/")[1])) {
			answer = Integer.toString(Integer.parseInt(answer));
		} else if(answerNum > answerDen && answerDen != 1) {
				answerNum /= gcf(answerNum, answerDen);
				answerDen /= gcf(answerNum, answerDen);
				
				}
		return(answer);
		}
	public static String toImproperFract(int number, int numer, int denom) { //a call to toImproperFract returns an equivalent improper fraction for the mixed number passed. accepts 3 integers, returns a string
		String answer = "0";
		answer = number * denom + numer + "/" + denom;
		return(answer);
		
	}
	public static String toMixedNum(int numer, int denom) { //a call to toMixedNum returns an equivalent mixed number for the improper fraction passed. accepts 2 integers, returns a string
		
		String answer = "0";
		answer = (numer / denom)  + "_" +  (numer % denom) + "/" + denom;
		return(answer);

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

	public static boolean isDivisibleBy(int number, int factor) { //a call to isDivisibleBy returns a boolean based on whether the two values passed are evenly divisible. accepts 2 integers, returns a boolean
		if(factor == 0) {
			throw new IllegalArgumentException("cannot divide by 0");
		}
		return(number % factor == 0);
	}
}
