/*
 *  Name Program    : Palindrom
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 9
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 5th August 2021
 *  Language        : C Language
 * 
 * 	Input 1
 * 	-----
 * 	kasurusak
 * 
 * 	Output 1
 * 	------
 *  Palindrom
 * 
 * 	Input 2
 * 	-----
 * 	abcd
 * 
 * 	Output 2
 * 	------
 *  Bukan Palindrom
 */

#include <stdio.h>
#include <string.h>
int isPalindrom(char []);

// Main function
int main(){

    // Variable declaration
    int result;
    char string[99];

    // Get input from console
    scanf("%s", &string);

    // Check palindrom
    result = isPalindrom(string);

    // Condition when string is palindrom
    if(result == 1){

        printf("Palindrom\n");
    }

    // Condition when string is not palindrom
    else{

        printf("Bukan Palindrom\n");
    }

    return 0;
}

// Function for check palindrom
int isPalindrom(char string[]){

    // Variable declaration
    int increment, status, stringLength;

    // Variable inisialization
    increment = 0;
    status = 1;
    stringLength = strlen(string) - 1;


    // Loop for check palindrom
    while((increment <= stringLength) && (status == 1)){

        // Condition when start character is not equal with end character
        if(string[increment] != string[stringLength - increment]){

            status = 0;
        }

        increment++;
    }

    return status;
}