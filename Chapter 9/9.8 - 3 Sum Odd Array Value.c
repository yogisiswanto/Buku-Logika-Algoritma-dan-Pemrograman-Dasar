/*
 *  Name Program    : Sum Odd Array Value
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 9
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 3rd August 2021
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
 *  4
 */

#include <stdio.h>
void sumOddArrayValue(int, int []);

// Main function
int main(){

    // Variable declaration
    int number, increment;

    // Get input from console
    scanf("%d", &number);

    // Variable declaration
    int array[number];

    // Loop for fill array of integer
    for(increment = 0; increment < number; increment++){
        
        scanf("%d", &array[increment]);
    }

    // Print procedure
    sumOddArrayValue(number, array);

    return 0;
}

// Procedure for sum odd array value
void sumOddArrayValue(int number, int array[]){

    // Variable declaration
    int increment, totalOddValue;

    // Variable inisialization
    totalOddValue = 0;

    // Loop for sum odd array value
    for(increment = 0; increment < number; increment++){

        // Condition when array value is odd
        if(array[increment] % 2 == 1){

            totalOddValue = totalOddValue + array[increment];
        }
    }

    printf("%d\n", totalOddValue);
}