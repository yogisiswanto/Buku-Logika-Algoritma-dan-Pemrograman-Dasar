/*
 *  Name Program    : Sum Odd Array Value
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 9
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 3rd August 2021
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
 *  4
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration & inisialization
	    int number = 0, increment;

		// Variable instantiation
		Scanner sc = new Scanner(System.in);
        Print print = new Print();

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

        // Print array
        print.sumOddArrayValue(number, array);
	}
}

// Print class
class Print{

    // Constructor
    Print(){

    }

    // Method for write sentence
    public static void sumOddArrayValue(int number, int[] array){

        // Variable declaration
        int increment, totalOddValue;

        // Variable inisialization
        totalOddValue = 0;

        // Loop for sum odd array value
        for(increment = 0; increment < number; increment++){

            // Condition when array value is odd
            if(array[increment] % 2 == 1){

                totalOddValue = totalOddValue + array[increment];
            }
        }

        System.out.println(totalOddValue);
    }
}

