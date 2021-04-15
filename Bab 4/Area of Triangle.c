/*
 *  Name Program    : Area of Triangle
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
    int t;
    int l;

    printf("Masukan alas dan tinggi lalu tekan enter untuk setiap angka\n");

    // Get input from console
    scanf("%d", &a);
    scanf("%d", &t);

    // Calculate area of triangle
    l = 0.5 * (float)a * (float)t;

    // Print to console
    printf("%d", l);
    
    return 0;
}