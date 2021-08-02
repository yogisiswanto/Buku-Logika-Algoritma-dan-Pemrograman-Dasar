/*
 *  Name Program    : Procedure in C with 3 files
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
 * 	*
 *  **
 *  ***
 *  ****
 *  ****
 *  ****
 *  ****
 *  ****
 *  ****
 *  ***
 *  **
 *  * 
 */

#include "pattern.h"

// Main function
int main(){

    // Variable declaration
    int length;

    // Get input from console
    scanf("%d", &length);

    // Print patterns
    triangle(length);
    square(length);
    reverseTriangle(length);

    return 0;
}