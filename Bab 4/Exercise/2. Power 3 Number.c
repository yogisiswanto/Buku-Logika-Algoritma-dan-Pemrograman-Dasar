/*
 *  Name Program    : Power 3 Number
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
    int a;
    int b;
    int c;
    int d;

    printf("Masukan tiga angka satu persatu, lalu tekan enter setelahnya\n");

    // Get input from console
    scanf("%d", &a);
    scanf("%d", &b);
    scanf("%d", &c);

    // Calculate Sum 3 Number
    d = a * b * c;

    // Print to console
    printf("%d", d);
    
    return 0;
}