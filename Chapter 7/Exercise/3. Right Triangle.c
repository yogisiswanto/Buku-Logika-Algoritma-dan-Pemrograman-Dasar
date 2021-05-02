/*
 *  Name Program    : Right Triangle
 *  Purpose         : Answer question from exercise Chapter 7 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 19th April 2021
 *  Language        : C Language
 */

#include <stdio.h>

// Main function
int main(){

    // Variable declaration
    int alas, tinggi, sisiMiring;

    printf("Masukan alas, tinggi, sisi miring dari segitiga, tekan enter setiap memasukan angka\n");

    // Get input from console
    /* 
        Example
        3
        4
        5
     */
    scanf("%d", &alas);
    scanf("%d", &tinggi);
    scanf("%d", &sisiMiring);

    // Condition when square of sisi miring equals with square of alas plus square of tinggi
    if((sisiMiring * sisiMiring) == ((alas * alas) + (tinggi * tinggi))){

        printf("Segitiga siku-siku\n");
    
    // another condition
    }else{

        printf("Bukan Segitiga siku-siku\n");
    }


    return 0;
}