/*
 *  Name Program    : Diamond
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 9
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 3rd August 2021
 *  Language        : Java Language
 * 
 * 	Input
 * 	-----
 * 	5
 * 
 * 	Output
 * 	------
 * 	    *
 *     * *
 *    * * *
 *   * * * *
 *  * * * * *
 *   * * * *
 *    * * *
 *     * *
 *      *
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration & inisialization
	    int number = 0;

		// Variable instantiation
		Scanner sc = new Scanner(System.in);
        Print print = new Print();

        // Get input from console
        try{

            number = sc.nextInt();

        }catch(Exception e){

        }

        // Print diamond
        print.diamond(number);
	}
}

// Print class
class Print{

    // Constructor
    Print(){

    }

    // Method for write sentence
    public static void diamond(int number){

        // Variable declaration
        int incrementRow, incrementColumn;

        // Loop for process row pattern
        /* 
               *
              * *
             * * *
            * * * * 
        */
        for(incrementRow = 0; incrementRow < number; incrementRow++){

            // Loop for process column space pattern
            for(incrementColumn = (number - 1); incrementColumn > incrementRow; incrementColumn--){

                System.out.print(" ");
            }

            // Loop for process column pattern
            for(incrementColumn = 0; incrementColumn <= incrementRow; incrementColumn++){

                System.out.print("*");

                // Condition when increment column is not equal with increment row
                if(incrementColumn != incrementRow){

                    System.out.print(" ");
                }
                
            }

            System.out.println();
        }

        // Loop for process row pattern
        /* 
            * * * *
             * * *
              * *
               * 
        */
        for(incrementRow = 1; incrementRow < number; incrementRow++){

            // Loop for process column pattern
            for(incrementColumn = 1; incrementColumn <= incrementRow; incrementColumn++){

                System.out.print(" ");
            }

            // Loop for process column pattern
            for(incrementColumn = (number - 1); incrementColumn >= incrementRow; incrementColumn--){

                System.out.print("*");

                // Condition when increment column is not equal with increment row
                if(incrementColumn != incrementRow){

                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}

