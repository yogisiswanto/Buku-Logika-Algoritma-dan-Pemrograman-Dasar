/*
 *  Name Program    : Luas Persegi
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 3
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 15th April 2021
 *  Language        : C Language
 */

#include <stdio.h>

// Main function
int main(){

    // Variable instantiation
    int luas, panjang, lebar;

    printf("Masukan dua angka satu persatu, tekan enter setiap selesai memasukkan\n");

    // Get input from console
    scanf("%d", &panjang);
    scanf("%d", &lebar);

    // Calculate large of square
    luas = panjang * lebar;

    // Print to console
    printf("Luas Persegi = %d\n", luas);

    return 0;
}