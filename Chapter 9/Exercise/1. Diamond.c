/*
 *  Name Program    : Diamond
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 9
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 2nd August 2021
 *  Language        : C Language
 * 
 * 	Input
 * 	-----
 * 	5
 * 
 * 	Output
 * 	------
 * 	    *
 *     * *
 *    * * *
 *   * * * *
 *  * * * * *
 *   * * * *
 *    * * *
 *     * *
 *      *
 */

#include <stdio.h>
void diamond(int);

// Main function
int main(){

    // Variable declaration
    int number;

    // Get input from console
    scanf("%d", &number);

    // Print procedure
    diamond(number);

    return 0;
}

// Procedure for print diamond
void diamond(int number){

    // Variable declaration
    int incrementRow, incrementColumn;

    // Loop for process row pattern
    /* 
           *
          * *
         * * *
        * * * * 
     */
    for(incrementRow = 0; incrementRow < number; incrementRow++){

        // Loop for process column space pattern
        for(incrementColumn = (number - 1); incrementColumn > incrementRow; incrementColumn--){

            printf(" ");
        }

        // Loop for process column pattern
        for(incrementColumn = 0; incrementColumn <= incrementRow; incrementColumn++){

            printf("*");

            // Condition when increment column is not equal with increment row
            if(incrementColumn != incrementRow){

                printf(" ");
            }
            
        }

        printf("\n");
    }

    // Loop for process row pattern
    /* 
        * * * *
         * * *
          * *
           * 
     */
    for(incrementRow = 1; incrementRow < number; incrementRow++){

        // Loop for process column pattern
        for(incrementColumn = 1; incrementColumn <= incrementRow; incrementColumn++){

            printf(" ");
        }

        // Loop for process column pattern
        for(incrementColumn = (number - 1); incrementColumn >= incrementRow; incrementColumn--){

            printf("*");

            // Condition when increment column is not equal with increment row
            if(incrementColumn != incrementRow){

                printf(" ");
            }
        }

        printf("\n");
    }

}