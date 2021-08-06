/*
 *  Name Program    : Palindrom
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 9
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 5th August 2021
 *  Language        : Java Language
 * 
 * 	Input 1
 * 	-----
 * 	kasurusak
 * 
 * 	Output 1
 * 	------
 *  Palindrom
 * 
 * 	Input 2
 * 	-----
 * 	abcd
 * 
 * 	Output 2
 * 	------
 *  Bukan Palindrom
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration & inisialization
	    boolean result;
        String string = "";

		// Variable instantiation
		Scanner sc = new Scanner(System.in);
        Function function = new Function();

        // Get input from console
        try{

            string = sc.next();

        }catch(Exception e){

        }

        // Check palindrom
        result = function.isPalindrom(string);

        // Condition when string is palindrom
        if(result == true){

            System.out.println("Palindrom\n");
        }

        // Condition when string is not palindrom
        else{

            System.out.println("Bukan Palindrom\n");
        }
	}
}

// Print class
class Function{

    // Constructor
    Function(){

    }

    // Method for check palindrom
    public static boolean isPalindrom(String string){

        // Variable declaration
        int increment, stringLength;
        boolean status;
    
        // Variable inisialization
        increment = 0;
        status = true;
        stringLength = string.length() - 1;
    
    
        // Loop for check palindrom
        while((increment <= stringLength) && (status == true)){
    
            // Condition when start character is not equal with end character
            if(string.charAt(increment) != string.charAt(stringLength - increment)){
    
                status = false;
            }
    
            increment++;
        }
    
        return status;
    }
}