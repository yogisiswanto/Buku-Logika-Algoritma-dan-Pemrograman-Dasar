/*
 *  Name Program    : Show Array Value
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
 *  1 
 *  2
 *  3
 */

#include <stdio.h>
void showArrayValue(int, int []);

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
    showArrayValue(number, array);

    return 0;
}

// Procedure for print array value
void showArrayValue(int number, int array[]){

    // Variable declaration
    int increment;

    // Loop for print array value
    for(increment = 0; increment < number; increment++){

        printf("%d\n", array[increment]);
    }
}