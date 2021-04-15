/*
 *  Name Program    : Fahrenheit
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
    int fahrenheit;

    printf("Masukan derajat celcius\n");

    // Get input from console
    scanf("%d", &celcius);

    // Calculate from celcius to fahrenheit
    fahrenheit = ((9 * celcius) / 5) + 32;

    // Print to console
    printf("%d", fahrenheit);
    
    return 0;
}