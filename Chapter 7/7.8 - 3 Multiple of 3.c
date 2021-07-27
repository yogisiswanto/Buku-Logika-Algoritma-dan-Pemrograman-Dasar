/*
 *  Name Program    : Multiple of 3
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 7
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 20th April 2021
 *  Language        : C Language
 */

#include <stdio.h>

// Main function
int main(){

    // Variable declaration
    double a;
    int depan, belakang;

    printf("Masukan bilangan riil\n");
    
    // Get input from console. Example 1.33
    scanf("%f", &a);

    // Convert float to integer
    depan = a;
    
    // Get number after decimal point
    belakang = (a - depan) * 100;

    // Condition when front number is multiple of 3 and back number is multiple of 3
    if((depan % 3 == 0) && (belakang % 3 == 0)){

        printf("Memenuhi syarat\n");
    
    // Alternate condition
    }else{

        printf("Tidak memenuhi syarat\n");
    }

    return 0;
}