/*
 *  Name Program    : Swap Number
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
 * 
 * 	Output
 * 	------
 * 	First Number = 2 - Second Number = 1 
 */

#include <stdio.h>
int * swap(int, int);

// Main function
int main(){

    // Variable declaration
    int firstNumber, secondNumber, *result;

    // Get input from console
    scanf("%d", &firstNumber);
    scanf("%d", &secondNumber);

    // Swap
    result = swap(firstNumber, secondNumber);

    // Variable reinisialization
    firstNumber = *(result + 0);
    secondNumber = *(result + 1);

    printf("First Number = %d - Second Number = %d\n", firstNumber, secondNumber);


    return 0;
}

// Function to swap number
int * swap(int firstNumber, int secondNumber){

    // Variable declaration
    static int array[3];

    // Variable inisialization
    array[0] = secondNumber;
    array[1] = firstNumber;

    return array;
}