/*
 *  Name Program    : Pyramid of Number
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 9
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 2nd August 2021
 *  Language        : C Language
 * 
 * 	Input
 * 	-----
 * 	4
 * 
 * 	Output
 * 	------
 * 	1
 *  1 2
 *  1 2 3
 *  1 2 3 4
 */

#include <stdio.h>
void pyramid(int);

// Main function
int main(){

    // Variable declaration
    int number;

    // Get input from console
    scanf("%d", &number);

    // Print procedure
    pyramid(number);

    return 0;
}

// Procedure for print triangle pattern
void pyramid(int number){

    // Variable declaration
    int incrementRow, incrementColumn;

    // Loop for process row pattern
    for(incrementRow = 1; incrementRow <= number; incrementRow++){

        // Loop for process column pattern
        for(incrementColumn = 1; incrementColumn <= incrementRow; incrementColumn++){

            // Condition when increment column is equal with increment row
            if (incrementColumn < incrementRow){

                printf("%d ", incrementColumn);
            }

            // Condition when increment column is not equal with increment row
            else{

               printf("%d\n", incrementColumn); 
            }
        }
    }
}