/*
 *  Name Program    : Arithmetic Operation
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 10
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 5th August 2021
 *  Language        : C Language
 * 
 * 	Input
 * 	-----
 *  2
 *  3
 * 
 * 	Output
 * 	------
 * 	5
 * 	-1
 * 	6
 * 	0.67 
 */

#include <stdio.h>
int add(int, int);
int substraction(int, int);
int multiplication(int, int);
float division(int, int);

// Main function
int main(){

    // Variable declaration
    int firstNumber, secondNumber, thirdNumber, result;
    float resultFloat;

    // Get input from console
    scanf("%d", &firstNumber);
    scanf("%d", &secondNumber);

    // Calculate add
    result = add(firstNumber, secondNumber);
    printf("%d\n", result);

    // Calculate substraction
    result = substraction(firstNumber, secondNumber);
    printf("%d\n", result);

    // Calculate multiplication
    result = multiplication(firstNumber, secondNumber);
    printf("%d\n", result);

    // Calculate division
    resultFloat = division(firstNumber, secondNumber);
    printf("%.2f\n", resultFloat);

    return 0;
}

// Function to calculate add from firstNumber & secondNumber
int add(int firstNumber, int secondNumber){

    return (firstNumber + secondNumber);
}

// Function to calculate substraction from firstNumber & secondNumber
int substraction(int firstNumber, int secondNumber){

    return (firstNumber - secondNumber);
}

// Function to calculate multiplication from firstNumber & secondNumber
int multiplication(int firstNumber, int secondNumber){

    return (firstNumber * secondNumber);
}

// Function to calculate division from firstNumber & secondNumber
float division(int firstNumber, int secondNumber){

    float resultFloat;

    // Condition when divider is equal with zero
    if(secondNumber == 0){

        return 0.0;
    }

    // Condition when divider is not equal with zero
    else{

        return (float) firstNumber / (float) secondNumber;;
    }
    
}