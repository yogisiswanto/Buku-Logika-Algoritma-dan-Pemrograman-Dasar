/*
 *  Name Program    : Sum Array Value
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 9
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 5th August 2021
 *  Language        : C Language
 * 
 * 	Input
 * 	-----
 * 	3
 *  1 
 *  2
 *  3
 * 
 * 	Output
 * 	------
 *  6
 */

#include <stdio.h>
int sumArrayValue(int, int []);

// Main function
int main(){

    // Variable declaration
    int number, increment, result;

    // Get input from console
    scanf("%d", &number);

    // Variable declaration
    int array[number];

    // Loop for fill array of integer
    for(increment = 0; increment < number; increment++){
        
        scanf("%d", &array[increment]);
    }

    // Calculate sum array value
    result = sumArrayValue(number, array);
    printf("%d\n", result);

    return 0;
}

// Function for sum array value
int sumArrayValue(int number, int array[]){

    // Variable declaration
    int increment, totalSum;

    // Variable inisialization
    totalSum = 0;

    // Loop for sum odd array value
    for(increment = 0; increment < number; increment++){

        totalSum = totalSum + array[increment];
    }

    return totalSum;
}