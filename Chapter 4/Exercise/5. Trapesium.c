/*
 *  Name Program    : Trapesium
 *  Purpose         : Answer question from exercise Chapter 4 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 15th April 2021
 *  Language        : C Language
 */

#include <stdio.h>

// Main function
int main(){

    // Variable declaration
    int alas;
    int atas;
    int tinggi;
    int luas;

    printf("Masukan sisi alas, sisi atas, tinggi satu persatu, lalu tekan enter\n");

    // Get input from console
    /* 
        Example
        2
        3
        4
     */
    scanf("%d", &alas);
    scanf("%d", &atas);
    scanf("%d", &tinggi);

    // Calculate area of trapesium
    luas = 0.5 * (alas + atas) * tinggi;

    // Print to console
    printf("%d", luas);
    
    return 0;
}