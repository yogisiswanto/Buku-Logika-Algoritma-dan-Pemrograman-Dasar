/*
 *  Name Program    : Maximum
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 10
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 4th August 2021
 *  Language        : Java Language
 * 
 * 	Input
 * 	-----
 *  1 
 *  2
 *  3
 * 
 * 	Output
 * 	------
 *  3
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration & inisialization
	    int firstNumber = 0, secondNumber = 0, thirdNumber = 0, result;

		// Variable instantiation
		Scanner sc = new Scanner(System.in);
        Function function = new Function();

        // Get input from console
        try{

            firstNumber = sc.nextInt();
            secondNumber = sc.nextInt();
            thirdNumber = sc.nextInt();

        }catch(Exception e){

        }

        // Search maximum value
        result = function.maximum(firstNumber, secondNumber, thirdNumber);

        System.out.println(result);
	}
}

// Print class
class Function{

    // Constructor
    Function(){

    }

    // Method for search maximum value
    public static int maximum(int firstNumber, int secondNumber, int thirdNumber){

        // Condition when firstNumber is greater than secondNumber
        if(firstNumber > secondNumber){

            // Condition when firstNumber is greater than thirdNumber
            if(firstNumber > thirdNumber){

                return firstNumber;
            }

            // Condition when thirdNumber is greater than firstNumber
            else{

                return thirdNumber;
            }
        }

        // Condition when secondNumber is greater than firstNumber 
        else{
            
            // Condition when secondNumber is greater than thirdNumber
            if(secondNumber > thirdNumber){

                return secondNumber;
            }

            // Condition when thirdNumber is greater than secondNumber
            else{

                return thirdNumber;
            }
        }
    }
}

