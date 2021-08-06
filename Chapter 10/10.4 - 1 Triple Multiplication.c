/*
 *  Name Program    : Triple Multiplication
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 10
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 5th August 2021
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
 * 	6 
 */

#include <stdio.h>
int tripleMultiplication(int, int, int);

// Main function
int main(){

    // Variable declaration
    int firstNumber, secondNumber, thirdNumber, result;

    // Get input from console
    scanf("%d", &firstNumber);
    scanf("%d", &secondNumber);
    scanf("%d", &thirdNumber);

    // Calculate multiplication
    result = tripleMultiplication(firstNumber, secondNumber, thirdNumber);

    printf("%d\n", result);


    return 0;
}

// Function to calculate multiplication from 3 number
int tripleMultiplication(int firstNumber, int secondNumber, int thirdNumber){

    return (firstNumber * secondNumber * thirdNumber);
}