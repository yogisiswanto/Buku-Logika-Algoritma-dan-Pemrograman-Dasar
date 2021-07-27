/*
 *  Name Program    : Power
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 4
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 15th April 2021
 *  Language        : C Language
 */

#include <stdio.h>

// Main function
int main(){

    // Variable declaration
    int a;
    int b;

    printf("Masukan angka, lalu tekan enter\n");

    // Get input from console. Example = 2
    scanf("%d", &a);

    // Calculate power
    b = a * a;

    // Print to console
    printf("%d", b);
    
    return 0;
}