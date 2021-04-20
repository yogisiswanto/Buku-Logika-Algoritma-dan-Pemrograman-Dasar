/*
 *  Name Program    : Kelipatan 3
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
    double a;
    int depan, belakang;

    printf("Masukan bilangan riil\n");
    
    // Get input from console
    scanf("%f", &a);

    depan = a;
    belakang = (a - depan) * 100;

    
    if((depan % 3 == 0) && (belakang % 3 == 0)){

        printf("Memenuhi syarat\n");
    
    }else{

        printf("Tidak memenuhi syarat\n");
    }

    return 0;
}