/*
 *  Name Program    : Pass by Reference
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 9
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 2nd August 2021
 *  Language        : C Language
 * 
 * 	Input
 * 	-----
 * 	2
 *  2
 *  3
 * 
 * 	Output
 * 	------
 * 	Third number before calculate = 3
 *  Third number on calculate = 4
 *  Third number after calculate = 4
 */

#include <stdio.h>
void calculate(int, int, int *);

// Main function
int main(){

    // Variable declaration
    int firstNumber, secondNumber, thirdNumber;

    // Get input from console
    scanf("%d", &firstNumber);
    scanf("%d", &secondNumber);
    scanf("%d", &thirdNumber);

    printf("Third number before calculate = %d\n", thirdNumber);
    
    // Calculate
    calculate(firstNumber, secondNumber, &thirdNumber);

    printf("Third number after calculate = %d\n", thirdNumber);

    return 0;
}

// Procedure print calculate form two variable
void calculate(int firstNumber, int secondNumber, int *thirdNumber){

    // Calculate firstNumber add by secondNumber
    *thirdNumber = firstNumber + secondNumber;

    // Print thirdNumber
    printf("Third number on calculate = %d\n", *thirdNumber);
    
}