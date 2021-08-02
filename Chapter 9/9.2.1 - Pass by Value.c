/*
 *  Name Program    : Pass by Value
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 9
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 2nd August 2021
 *  Language        : C Language
 * 
 * 	Input
 * 	-----
 * 	2
 *  3
 * 
 * 	Output
 * 	------
 * 	First number before calculate = 2
 *  First number on calculate = 5
 *  First number after calculate = 2
 */

#include <stdio.h>
void calculate(int, int);

// Main function
int main(){

    // Variable declaration
    int firstNumber, secondNumber;

    // Get input from console
    scanf("%d", &firstNumber);
    scanf("%d", &secondNumber);

    printf("First number before calculate = %d\n", firstNumber);
    
    // Calculate
    calculate(firstNumber, secondNumber);

    printf("First number after calculate = %d\n", firstNumber);

    return 0;
}

// Procedure print calculate form two variable
void calculate(int firstNumber, int secondNumber){

    // Calculate firstNumber add by secondNumber
    firstNumber = firstNumber + secondNumber;

    // Print firstNumber
    printf("First number on calculate = %d\n", firstNumber);
    
}