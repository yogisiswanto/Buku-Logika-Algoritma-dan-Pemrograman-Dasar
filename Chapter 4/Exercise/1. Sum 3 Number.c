/*
 *  Name Program    : Sum 3 Number
 *  Purpose         : Answer question from exercise Chapter 4 from Logic Algorithm and Basic Programming Book
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
    int c;
    int d;

    printf("Masukan tiga angka satu persatu, tekan enter setiap selesai memasukkan\n");

    // Get input from console
    /* 
        Example
        2
        3
        4
     */
    scanf("%d", &a);
    scanf("%d", &b);
    scanf("%d", &c);

    // Calculate Sum 3 Number
    d = a + b + c;

    // Print to console
    printf("%d", d);
    
    return 0;
}