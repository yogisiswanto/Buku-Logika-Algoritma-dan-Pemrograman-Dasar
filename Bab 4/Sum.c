/*
 *  Name Program    : Sum
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 4
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

    printf("Masukan dua angka satu persatu, tekan enter setiap selesai memasukkan\n");

    // Get input from console
    scanf("%d", &a);
    scanf("%d", &b);

    // Calculate sum
    c = a + b;

    // Print to console
    printf("%d", c);
    
    return 0;
}