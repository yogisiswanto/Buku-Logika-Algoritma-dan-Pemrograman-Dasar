/*
 *  Name Program    : Check String Equal
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 9
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 5th August 2021
 *  Language        : C Language
 * 
 * 	Input 1
 * 	-----
 * 	abc
 *  abc
 * 
 * 	Output 1
 * 	------
 *  ***
 *  ***
 *  ***
 * 
 * 	Input 2
 * 	-----
 * 	abcd
 *  abc
 * 
 * 	Output 2
 * 	------
 *  ****
 *  ****
 *  ****
 *  ****
 */

#include <stdio.h>
#include <string.h>
int isEqualString(char [], char []);
int getMaximumLength(char [], char []);
void square(int);

// Main function
int main(){

    // Variable declaration
    int result, maximumStringLength;
    char firstString[99], secondString[99];

    // Get input from console
    scanf("%s", &firstString);
    scanf("%s", &secondString);

    // Check firstString is equal with secondString
    result = isEqualString(firstString, secondString);

    // Condition when firstString is equal with secondString
    if(result == 1){

        // Get maximum string length from firstString and secondString
        maximumStringLength = getMaximumLength(firstString, secondString);

        // Print star square pattern
        square(maximumStringLength);
    }

    // Condition when firstString is not equal with secondString
    else{

        // Get maximum string length from firstString and secondString
        maximumStringLength = getMaximumLength(firstString, secondString);

        // Print star square pattern
        square(maximumStringLength);
    }

    return 0;
}

// Function for check firstString is equal with secondString
int isEqualString(char firstString[], char secondString[]){

    // Variable declaration
    int status;

    // Variable inisialization
    status = 0;

    // Condition when firstString is equal with secondString
    if (strcmp(firstString, secondString) == 0){

        status = 1;
    }

    // Condition when firstString is not equal with secondString
    else{
        
        status = 0;
    }
    
    return status;
}

// Function for get maximum length from firstString and secondString
int getMaximumLength(char firstString[], char secondString[]){

    // Variable declaration
    int firstStringLength, secondStringLength;

    // Variable inisialization
    firstStringLength = strlen(firstString);
    secondStringLength = strlen(secondString);

    // Condition when firstStringLength is greater than with secondStringLength
    if (firstStringLength > secondStringLength){

        return firstStringLength;
    }

    // Condition when firstStringLength is less than with secondStringLength
    else if (firstStringLength < secondStringLength){
        
        return secondStringLength;
    }

    // Condition when firstStringLength is equal with secondStringLength
    else{

        return firstStringLength;
    }
}

// Procedure print square pattern
void square(int length){

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