/*
 *  Name Program    : Volume
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
    int p;
    int l;
    int t;
    int v;

    printf("Masukan panjang, lebar, tinggi lalu tekan enter untuk setiap angka\n");

    // Get input from console
    scanf("%d", &p);
    scanf("%d", &l);
    scanf("%d", &t);

    // Calculate volume
    v = p * l * t;

    // Print to console
    printf("%d", v);
    
    return 0;
}