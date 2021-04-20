/*
 *  Name Program    : Greater Number
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
    int angkaPertama, angkaKedua, angkaKetiga;

    printf("Masukan ketiga bilangan\n");

    // Get input from console
    scanf("%d", &angkaPertama);
    scanf("%d", &angkaKedua);
    scanf("%d", &angkaKetiga);

    // Condition when first number is greater second number, and second number is greater third number
    if((angkaPertama > angkaKedua) && (angkaKedua > angkaKetiga)){

        printf("Angka Pertama paling besar\n");
    
    // Condition when second number is greater first number, and first number is greater third number
    }else if((angkaKedua > angkaPertama) && (angkaPertama > angkaKetiga)){

        printf("Angka Kedua paling besar\n");

    // Condition when third number is greater first number, and third number is greater second number
    }else if((angkaKetiga > angkaPertama) && (angkaKetiga > angkaKedua)){

        printf("Angka Ketiga paling besar\n");
    
    // alternate condition
    }else{

        printf("Ada dua atau tiga masukan memiliki nilai sama\n");
    }

    return 0;
}