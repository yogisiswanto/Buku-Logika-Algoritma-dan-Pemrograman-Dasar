/*
 *  Name Program    : String
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
    char input[5][99];

    printf("Masukan lima buah kata secara berurutan, lalu tekan enter setelahnya\n");

    // Get input from console
    /* 
        Example
        aku
        adalah
        anak
        gembala
        selalu
     */
    scanf("%s", &input[0]);
    scanf("%s", &input[1]);
    scanf("%s", &input[2]);
    scanf("%s", &input[3]);
    scanf("%s", &input[4]);

    // Print to console
    printf("Kata ke - 1 = %s\n", input[0]);
    printf("Kata ke - 2 = %s\n", input[1]);
    printf("Kata ke - 3 = %s\n", input[2]);
    printf("Kata ke - 4 = %s\n", input[3]);
    printf("Kata ke - 5 = %s\n", input[4]);

    return 0;
}