/*
 *  Name Program    : Quartet Multiplication
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
 *  4
 * 
 * 	Output
 * 	------
 * 	24 
 */

#include <stdio.h>
int quartetMultiplication(int, int, int, int);

// Main function
int main(){

    // Variable declaration
    int firstNumber, secondNumber, thirdNumber, fourthNumber, result;

    // Get input from console
    scanf("%d", &firstNumber);
    scanf("%d", &secondNumber);
    scanf("%d", &thirdNumber);
    scanf("%d", &fourthNumber);

    // Calculate multiplication
    result = quartetMultiplication(firstNumber, secondNumber, thirdNumber, fourthNumber);

    printf("%d\n", result);


    return 0;
}

// Function to calculate multiplication from 4 number
int quartetMultiplication(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber){

    return (firstNumber * secondNumber * thirdNumber * fourthNumber);
}