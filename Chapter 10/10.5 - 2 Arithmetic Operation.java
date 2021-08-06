/*
 *  Name Program    : Arithmetic Operation
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 10
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 5th August 2021
 *  Language        : Java Language
 * 
 * 	Input
 * 	-----
 *  2
 *  3
 * 
 * 	Output
 * 	------
 * 	5
 * 	-1
 * 	6
 * 	0.67
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration & inisialization
	    int firstNumber = 0, secondNumber = 0, result;
        float resultFloat;

		// Variable instantiation
		Scanner sc = new Scanner(System.in);
        Function function = new Function();

        // Get input from console
        try{

            firstNumber = sc.nextInt();
            secondNumber = sc.nextInt();

        }catch(Exception e){

        }

        // Calculate add
        result = function.add(firstNumber, secondNumber);
        System.out.println(result);

        // Calculate substraction
        result = function.substraction(firstNumber, secondNumber);
        System.out.println(result);

        // Calculate multiplication
        result = function.multiplication(firstNumber, secondNumber);
        System.out.println(result);
        
        // Calculate division
        resultFloat = function.division(firstNumber, secondNumber);
        System.out.println(resultFloat);
	}
}

//10.5 - 2 Arithmetic Operation

// Print class
class Function{

    // Constructor
    Function(){

    }

    // Method for calculate add from firstNumber & secondNumber
    public static int add(int firstNumber, int secondNumber){

        return (firstNumber + secondNumber);
    }

    // Method for calculate substraction from firstNumber & secondNumber
    public static int substraction(int firstNumber, int secondNumber){

        return (firstNumber - secondNumber);
    }

    // Method for calculate multiplication from firstNumber & secondNumber
    public static int multiplication(int firstNumber, int secondNumber){

        return (firstNumber * secondNumber);
    }

    // Method for calculate division from firstNumber & secondNumber
    public static float division(int firstNumber, int secondNumber){

        float resultFloat;
    
        // Condition when divider is equal with zero
        if(secondNumber == 0){
    
            return 0;
        }
    
        // Condition when divider is not equal with zero
        else{
    
            return (float) firstNumber / (float) secondNumber;
        }
        
    }
}

