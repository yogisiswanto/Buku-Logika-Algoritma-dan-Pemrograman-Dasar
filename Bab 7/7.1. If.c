/*
 *  Name Program    : If
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 7
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 15th April 2021
 *  Language        : C Language
 */

#include <stdio.h>

// Main function
int main(){

    // Variable instantiation
    char nilai;

    printf("Masukan karakter:\n");

    // Get input from console
    scanf("%c", &nilai);

    // Condition when nilai is equal with A, or B, or C
    if((nilai == 'A') || (nilai == 'B') || (nilai == 'C')){

        printf("lulus\n");
    }

    return 0;
}