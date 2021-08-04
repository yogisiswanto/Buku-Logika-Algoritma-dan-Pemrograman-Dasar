/*
 *  Name Program    : Maximum
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 10
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 4th August 2021
 *  Language        : C Language
 * 
 * 	Input
 * 	-----
 *  1
 *  2
 *  3
 * 
 * 	Output
 * 	------
 * 	3 
 */

#include <stdio.h>
int maximum(int, int, int);

// Main function
int main(){

    // Variable declaration
    int firstNumber, secondNumber, thirdNumber, result;

    // Get input from console
    scanf("%d", &firstNumber);
    scanf("%d", &secondNumber);
    scanf("%d", &thirdNumber);

    // Search maximum value
    result = maximum(firstNumber, secondNumber, thirdNumber);

    printf("%d\n", result);


    return 0;
}

// Function to get maximum value from 3 number
int maximum(int firstNumber, int secondNumber, int thirdNumber){

    // Condition when firstNumber is greater than secondNumber
    if(firstNumber > secondNumber){

        // Condition when firstNumber is greater than thirdNumber
        if(firstNumber > thirdNumber){

            return firstNumber;
        }

        // Condition when thirdNumber is greater than firstNumber
        else{

            return thirdNumber;
        }
    }

    // Condition when secondNumber is greater than firstNumber 
    else{
        
        // Condition when secondNumber is greater than thirdNumber
        if(secondNumber > thirdNumber){

            return secondNumber;
        }

        // Condition when thirdNumber is greater than secondNumber
        else{

            return thirdNumber;
        }
    }
}