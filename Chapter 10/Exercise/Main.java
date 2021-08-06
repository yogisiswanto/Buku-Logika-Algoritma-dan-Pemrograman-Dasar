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
	    int firstNumber = 0, secondNumber = 0;

		// Variable instantiation
		Scanner sc = new Scanner(System.in);
        
        // Get input from console
        try{

            firstNumber = sc.nextInt();
            secondNumber = sc.nextInt();

        }catch(Exception e){

        }

        // Swap
        Function function = new Function(firstNumber, secondNumber);
        firstNumber = function.getSecondNumber();
        secondNumber = function.getFirstNumber();

        System.out.println("First Number = " + firstNumber + " Second Number = " + secondNumber);
	}
}

// Function class
class Function{

    // Attribute
    private int firstNumber;
    private int secondNumber;

    // Constructor
    Function(int firstNumber, int secondNumber){

        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber; 
    }

    // Method for get value from firstNumber
    public int getFirstNumber(){

        return this.firstNumber;
    }

    // Method for get value from secondNumber
    public int getSecondNumber(){

        return this.secondNumber;
    }
}

