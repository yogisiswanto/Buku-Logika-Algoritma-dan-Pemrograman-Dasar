/*
 *  Name Program    : Integer
 *  Purpose         : Answer question from exercise Chapter 6 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 15th April 2021
 *  Language        : C Language
 */

#include <stdio.h>

// Main function
int main(){

    // Variable declaration
    int input[5];

    printf("Masukan lima buah angka secara berurutan, lalu tekan enter setelahnya\n");

    // Get input from console
    /* 
        Example
        1
        2
        3
        4
        5
     */
    scanf("%d", &input[0]);
    scanf("%d", &input[1]);
    scanf("%d", &input[2]);
    scanf("%d", &input[3]);
    scanf("%d", &input[4]);

    // Print to console
    printf("Angka ke - 1 = %d\n", input[0]);
    printf("Angka ke - 2 = %d\n", input[1]);
    printf("Angka ke - 3 = %d\n", input[2]);
    printf("Angka ke - 4 = %d\n", input[3]);
    printf("Angka ke - 5 = %d\n", input[4]);

    return 0;
}