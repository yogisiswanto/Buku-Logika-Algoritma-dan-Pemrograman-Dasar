/*
 *  Name Program    : Square Area
 *  Purpose         : Answer question from exercise Chapter 5 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 15th April 2021
 *  Language        : C Language
 */

#include <stdio.h>

// Main function
int main(){

    // Variable declaration
    int luas, panjang, lebar;

    printf("Masukan dua angka satu persatu, tekan enter setiap selesai memasukkan\n");

    // Get input from console
    scanf("%d", &panjang); // Example = 2
    scanf("%d", &lebar); // Example = 3

    // Calculate large of square
    luas = panjang * lebar;

    // Print to console
    printf("Luas Persegi = %d\n", luas);

    return 0;
}