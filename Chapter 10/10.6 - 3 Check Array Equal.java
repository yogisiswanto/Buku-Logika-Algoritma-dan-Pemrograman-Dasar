/*
 *  Name Program    : Check Array Equal
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 9
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 5th August 2021
 *  Language        : Java Language
 * 
 * 	Input 1
 * 	-----
 * 	2
 *  1
 *  2
 *  2
 *  1
 *  2
 * 
 * 	Output 1
 * 	------
 *  Sama
 * 
 * 	Input 2
 * 	-----
 * 	1
 *  1
 *  2
 *  1
 *  2
 * 
 * 	Output 2
 * 	------
 *  Tidak Sama
 * 
 * 	Input 3
 * 	-----
 * 	2
 *  1
 *  2
 *  2
 *  2
 *  1
 * 
 * 	Output 3
 * 	------
 *  Tidak Sama
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration & inisialization
	    int firstNumber = 0, secondNumber = 0, increment;
        boolean result = false;

		// Variable instantiation
		Scanner sc = new Scanner(System.in);
        Function function = new Function();

        // Get input from console firstNumber
        try{

            firstNumber = sc.nextInt();

        }catch(Exception e){

        }

        // Variable declaration of firstArray
        int[] firstArray = new int[firstNumber];

        // Loop for fill firstArray
        for(increment = 0; increment < firstNumber; increment++){

            // Get input from console
            try{

                firstArray[increment] = sc.nextInt();

            }catch(Exception e){

            }
        }

        // Get input from console secondNumber
        try{

            secondNumber = sc.nextInt();

        }catch(Exception e){

        }

        // Variable declaration of secondArray
        int[] secondArray = new int[secondNumber];

        // Loop for fill secondArray
        for(increment = 0; increment < secondNumber; increment++){

            // Get input from console
            try{

                secondArray[increment] = sc.nextInt();

            }catch(Exception e){

            }
        }

        // Check first array and second array is equal
        result = function.isEqual(firstNumber, firstArray, secondNumber, secondArray);

        // Condition when first array and second array is equal
        if(result == true){

            System.out.println("Sama\n");
        }

        // Condition when first array and second array is not equal
        else{

            System.out.println("Tidak Sama\n");
        }
	}
}

// Print class
class Function{

    // Constructor
    Function(){

    }

    // Method for check first array and second array is equal
    public static boolean isEqual(int firstNumber, int[] firstArray, int secondNumber, int[] secondArray){

        // Variable declaration
        int increment;
        boolean status;

        // Variable inisialization
        increment = 0;
        status = true;

        // Condition when firstNumber and secondNumber is equal
        if (firstNumber == secondNumber){
            
            // Loop for check first array and second array is equal
            while ((increment < firstNumber) && (status == true)){
                
                // Condition when firstArray value of current index is not equal with secondArray value of current index
                if (firstArray[increment] != secondArray[increment]){
                    
                    status = false;
                }

                increment++;            
            }
        }

        // Condition when firstNumber and secondNumber is equal
        else{
            
            status = false;
        }

        return status;
    }
}