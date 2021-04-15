/*
 *  Name Program    : Ganjil genap
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
    int bilangan;

    printf("Masukan bilangan: \n");

    // Get input from console
    scanf("%d", &bilangan);

    // Condition when input is odd
    if(bilangan % 2 == 1){

        printf("bilangan ganjil\n");
    
    // Condition when input is even
    }else{

        printf("bilangan genap\n");
    }

    return 0;
}