/*
 *  Name Program    : Pyramid of Number
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 9
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 2nd August 2021
 *  Language        : Java Language
 * 
 * 	Input
 * 	-----
 * 	4
 * 
 * 	Output
 * 	------
 * 	1
 *  1 2
 *  1 2 3
 *  1 2 3 4 
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration & inisialization
	    int number = 0;

		// Variable instantiation
		Scanner sc = new Scanner(System.in);
        Pattern pattern = new Pattern();

        // Get input from console
        try{

            number = sc.nextInt();

        }catch(Exception e){

        }

        // Print pattern
        pattern.pyramid(number);
	}
}

// Patterns class
class Pattern{

    // Constructor
    Pattern(){

    }

    // Method for write sentence
    public static void pyramid(int number){

        // Variable declaration
        int incrementRow, incrementColumn;

        // Loop for process row pattern
        for(incrementRow = 1; incrementRow <= number; incrementRow++){

            // Loop for process column pattern
            for(incrementColumn = 1; incrementColumn <= incrementRow; incrementColumn++){

                // Condition when increment column is equal with increment row
                if (incrementColumn < incrementRow){

                    System.out.print(incrementColumn + " ");
                }

                // Condition when increment column is not equal with increment row
                else{

                    System.out.println(incrementColumn); 
                }
            }
        }
    }
}

