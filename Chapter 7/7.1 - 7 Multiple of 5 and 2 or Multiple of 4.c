/*
 *  Name Program    : Kelipatan 5 dan kelipatan 2 atau 4
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 7
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 20th April 2021
 *  Language        : C Language
 */

#include <stdio.h>

// Main function
int main(){

    // Variable instantiation
    int bilangan;

    printf("Masukan bilangan: \n");

    // Get input from console
    scanf("%d", &bilangan);

    // Condition when number multiple of 5 and 2 or multiple 4
    if(((bilangan % 5 == 0) && (bilangan % 2 == 0)) || (bilangan % 4 == 0)){

        printf("kelipatan 5 dan 2 atau 4\n");
    }

    return 0;
}