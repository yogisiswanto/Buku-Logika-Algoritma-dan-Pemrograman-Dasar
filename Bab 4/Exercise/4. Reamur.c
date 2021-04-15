/*
 *  Name Program    : Reamur
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 3
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 15th April 2021
 *  Language        : C Language
 */

#include <stdio.h>

// Main function
int main(){

    // Variable instantiation
    int celcius;
    int reamur;

    printf("Masukan derajat celcius\n");

    // Get input from console
    scanf("%d", &celcius);

    // Calculate from celcius to reamur
    reamur = (4 * celcius) / 5;

    // Print to console
    printf("%d", reamur);
    
    return 0;
}