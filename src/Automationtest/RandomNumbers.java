package Automationtest;

import java.util.Random;

public class RandomNumbers {

	// Worst
	// 1 - Ask for a range within which random numbers are to be generated
	// 2 - Store the numbers in an array
	// 3 - Do a sort and print smallest
	
	// Good
	// 1 - Ask for a range within which random numbers are to be generated
	// 2 - Store the numbers in an array in sorted fashion
	
	// Best
	// 1 - Ask for a range within which random numbers are to be generated
	// 2 - Compare while generating random numbers

	public static void main(String[] args){
		    Random random = new Random();
		    int min = random.nextInt((10000 - 0) + 1);
		    
		    for(int i = 1; i < 500; i++) {
		    	int generatedNum = random.nextInt((10000 - 0) + 1); // Choosing a random number 
		    	System.out.print(generatedNum + " ");
		    	if( generatedNum < min) {
		    		min = generatedNum;
		    	}
		    }
		    System.out.println();
		    System.out.println("The minimum number is : " + min);   
		}
	}


