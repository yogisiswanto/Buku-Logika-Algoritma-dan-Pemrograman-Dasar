/*
 *  Name Program    : Square Patterns
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 9
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 2nd August 2021
 *  Language        : C Language
 * 
 * 	Input
 * 	-----
 * 	  3
 * 
 * 	Output
 * 	------
 * 	***
 *  ***
 *  ***
 *  ****
 *  ****
 *  ****
 *  ****
 *  *****
 *  *****
 *  *****
 *  *****
 *  ***** 
 */

#include <stdio.h>
void pattern(int);

// Main function
int main(){

    // Variable declaration
    int length;

    // Get input from console
    scanf("%d", &length);

    // Print patterns
    pattern(length);
    pattern(length + 1);
    pattern(length + 2);

    return 0;
}

// Procedure print square pattern
void pattern(int length){

    // Variable declaration
    int incrementRow, incrementColumn;

    // Loop for process row pattern
    for(incrementRow = 0; incrementRow < length; incrementRow++){

        // Loop for process column pattern
        for(incrementColumn = 0; incrementColumn < length; incrementColumn++){

            printf("*");
        }

        printf("\n");
    }
}