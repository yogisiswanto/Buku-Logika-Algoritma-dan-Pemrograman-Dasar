/*
 *  Name Program    : Sum Array Value
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 9
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 5th August 2021
 *  Language        : Java Language
 * 
 * 	Input
 * 	-----
 * 	3
 *  1 
 *  2
 *  3
 * 
 * 	Output
 * 	------
 *  6
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration & inisialization
	    int number = 0, increment, result;

		// Variable instantiation
		Scanner sc = new Scanner(System.in);
        Function function = new Function();

        // Get input from console
        try{

            number = sc.nextInt();

        }catch(Exception e){

        }

        // Variable declaration 
        int[] array = new int[number];

        for(increment = 0; increment < number; increment++){

            // Get input from console
            try{

                array[increment] = sc.nextInt();

            }catch(Exception e){

            }
        }

        // Calculate sum array value
        result = function.sumArrayValue(number, array);
        System.out.println(result);
	}
}

// Print class
class Function{

    // Constructor
    Function(){

    }

    // Method for sum array value
    public static int sumArrayValue(int number, int[] array){

        // Variable declaration
        int increment, totalSum;

        // Variable inisialization
        totalSum = 0;

        // Loop for sum odd array value
        for(increment = 0; increment < number; increment++){

            totalSum = totalSum + array[increment];
        }

        return totalSum;
    }
}