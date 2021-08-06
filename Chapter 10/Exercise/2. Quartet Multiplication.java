/*
 *  Name Program    : Quartet Multiplication
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 10
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 5th August 2021
 *  Language        : Java Language
 * 
 * 	Input
 * 	-----
 *  1 
 *  2
 *  3
 * 4
 * 
 * 	Output
 * 	------
 *  24
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration & inisialization
	    int firstNumber = 0, secondNumber = 0, thirdNumber = 0, fourthNumber = 0, result;

		// Variable instantiation
		Scanner sc = new Scanner(System.in);
        Function function = new Function();

        // Get input from console
        try{

            firstNumber = sc.nextInt();
            secondNumber = sc.nextInt();
            thirdNumber = sc.nextInt();
            fourthNumber = sc.nextInt();

        }catch(Exception e){

        }

        // Calculate multiplication
        result = function.quartetMultiplication(firstNumber, secondNumber, thirdNumber, fourthNumber);

        System.out.println(result);
	}
}

// Print class
class Function{

    // Constructor
    Function(){

    }

    // Method for calculate multiplication from 4 number
    public static int quartetMultiplication(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber){

        return (firstNumber * secondNumber * thirdNumber * fourthNumber);
    }
}

