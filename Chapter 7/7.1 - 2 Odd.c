/*
 *  Name Program    : Odd
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 7
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 15th April 2021
 *  Language        : C Language
 */

#include <stdio.h>

// Main function
int main(){

    // Variable declaration
    int bilangan;

    printf("Masukan bilangan: \n");

    // Get input from console. Example 5
    scanf("%d", &bilangan);

    // Condition when input is odd
    if(bilangan % 2 == 1){

        printf("bilangan ganjil\n");
    }

    return 0;
}