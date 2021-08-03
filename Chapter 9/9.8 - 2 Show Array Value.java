/*
 *  Name Program    : Show Array Value
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
 *  1 
 *  2
 *  3
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
        print.showArrayValue(number, array);
	}
}

// Print class
class Print{

    // Constructor
    Print(){

    }

    // Method for write sentence
    public static void showArrayValue(int number, int[] array){

        // Variable declaration
        int increment;

        // Loop for print array value
        for(increment = 0; increment < number; increment++){

            System.out.println(array[increment]);
        }
    }
}

