/*
 *  Name Program    : Square Patterns
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 9
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 2nd August 2021
 *  Language        : Java Language
 * 
 * 	Input
 * 	-----
 * 	  3
 * 
 * 	Output
 * 	------
 * 	***
 *  ***
 *  ***
 *  ****
 *  ****
 *  ****
 *  ****
 *  *****
 *  *****
 *  *****
 *  *****
 *  ***** 
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration & inisialization
	    int length = 0;

		// Variable instantiation
		Scanner sc = new Scanner(System.in);
        Patterns pattern = new Patterns();

        // Get input from console
        try{

            length = sc.nextInt();

        }catch(Exception e){

        }

        // Print patterns
        pattern.square(length);
        pattern.square(length + 1);
        pattern.square(length + 2);
	}
}

// Patterns class
class Patterns{

    // Constructor
    Patterns(){

    }

    // Method for print square pattern
    public void square(int length){
        
        // Variable declaration
        int incrementRow, incrementColumn;

        // Loop for process row pattern
        for(incrementRow = 0; incrementRow < length; incrementRow++){

            // Loop for process column pattern
            for(incrementColumn = 0; incrementColumn < length; incrementColumn++){

                System.out.print("*");
            }

            System.out.println();
        }
    }
}

