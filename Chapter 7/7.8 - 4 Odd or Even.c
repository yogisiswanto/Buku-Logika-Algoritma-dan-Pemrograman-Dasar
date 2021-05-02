/*
 *  Name Program    : Odd or Even
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
    int angkaPertama, angkaKedua, hasil;

    printf("Masukan dua buah bilangan bulat lalu tekan enter untuk setiap angkanya\n");
    
    // Get input from console
    /* 
        Example
        2
        2

        or 

        3
        3
     */
    scanf("%d", &angkaPertama);
    scanf("%d", &angkaKedua);

    // Condition when first number is even and second number is even, then both number will be add each other
    if((angkaPertama % 2 == 0) && (angkaKedua % 2 == 0)){

        hasil = angkaPertama + angkaKedua;
    
    // Condition when first number is odd and second number is odd, then both number will be multiple each other
    }else{

        hasil = angkaPertama * angkaKedua;
    }

    // Print to console
    printf("Hasilnya adalah = %d", hasil);

    return 0;
}