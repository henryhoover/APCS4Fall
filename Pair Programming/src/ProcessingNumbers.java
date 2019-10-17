//henry wang
//10/2/19
//4th period
//the class for pair programming that accepts the numbers as userinput and returns the max/min/even max/ sum of evens

import java.util.*;

public class ProcessingNumbers {
	public static void main (String[] args) {
		
		//set up scanner and get how many #s, also initialize evenMax and evenSum 
		Scanner userInput = new Scanner(System.in);
		System.out.println("How many numbers do you want to input?");
		int nums = userInput.nextInt();
		int evenMax = 0;
		int evenSum = 0;
		
		// store the 1st input w/ the variables and are outside the loop so they can get printed
			System.out.println("What's the first number?");
			int first = userInput.nextInt();
			int max = first;
			int min = first;
			
			if(first % 2 ==0) {
				evenSum += first;
				evenMax = first;
			}

		//start loop to keep getting #s and update variables
		for(int i =  2; i <= nums; i++) {
			
			System.out.println("What's the next number?");
			
			int next = userInput.nextInt();
			
			if(next > max) {
				max = next;
			}
			
			if(next < min) {
				min = next;
			}
			
			if(next % 2 == 0) { //check if # is even by seeing if its evenly divisible by 2
				if(next > evenMax) {
					evenMax = next;
				}
				evenSum += next;
			} 

		}
		
		//print out the stuff
		System.out.println("Largest number: " + max);
		System.out.println("Smallest number: " + min);
		if(evenMax == 0) {
				System.out.println("There are no evens");
		} else {
			System.out.println("Largest even number: " + evenMax);
		}
		if(evenSum == 0) {
			System.out.println("There are no evens");
		} else {
			System.out.println("Sum of the even numbers: " + evenSum);

		}
			
		userInput.close();
	}

}