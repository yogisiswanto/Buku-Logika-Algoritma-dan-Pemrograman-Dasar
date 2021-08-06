/*
 *  Name Program    : Check String Equal
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 9
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 5th August 2021
 *  Language        : Java Language
 * 
 * 	Input 1
 * 	-----
 * 	abc
 *  abc
 * 
 * 	Output 1
 * 	------
 *  ***
 *  ***
 *  ***
 * 
 * 	Input 2
 * 	-----
 * 	abcd
 *  abc
 * 
 * 	Output 2
 * 	------
 *  ****
 *  ****
 *  ****
 *  ****
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration & inisialization
	    String firstString = "", secondString = "";
        boolean result;
        int maximumStringLength;        

		// Variable instantiation
		Scanner sc = new Scanner(System.in);
        Function function = new Function();

        // Get input from console
        try{

            firstString = sc.next();
            secondString = sc.next();

        }catch(Exception e){

        }

        // Check firstString is equal with secondString
        result = function.isEqualString(firstString, secondString);

        // Condition when firstString is equal with secondString
        if(result == true){

            // Get maximum string length from firstString and secondString
            maximumStringLength = function.getMaximumLength(firstString, secondString);

            // Print star square pattern
            function.square(maximumStringLength);
        }

        // Condition when firstString is not equal with secondString
        else{

            // Get maximum string length from firstString and secondString
            maximumStringLength = function.getMaximumLength(firstString, secondString);

            // Print star square pattern
            function.square(maximumStringLength);
        }
	}
}

// Print class
class Function{

    // Constructor
    Function(){

    }

    // Method for check firstString is equal with secondString
    public static boolean isEqualString(String firstString, String secondString){

        // Variable declaration
        boolean status;

        // Variable inisialization
        status = false;

        // Condition when firstString is equal with secondString
        if (firstString.equals(secondString)){

            status = true;
        }

        // Condition when firstString is not equal with secondString
        else{
            
            status = false;
        }
        
        return status;
    }

    // Method for get maximum length from firstString and secondString
    public static int getMaximumLength(String firstString, String secondString){

        // Variable declaration
        int firstStringLength, secondStringLength;

        // Variable inisialization
        firstStringLength = firstString.length();
        secondStringLength = secondString.length();

        // Condition when firstStringLength is greater than with secondStringLength
        if (firstStringLength > secondStringLength){

            return firstStringLength;
        }

        // Condition when firstStringLength is less than with secondStringLength
        else if (firstStringLength < secondStringLength){
            
            return secondStringLength;
        }

        // Condition when firstStringLength is equal with secondStringLength
        else{

            return firstStringLength;
        }
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