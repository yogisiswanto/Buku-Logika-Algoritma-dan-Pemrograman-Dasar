/*
 *  Name Program    : Kalkulator
 *  Purpose         : Answer question from exercise Chapter 5 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 15th April 2021
 *  Language        : C Language
 */

#include <stdio.h>

// Main function
int main(){

    // Variable instantiation
    int firstInput, secondInput, add, substraction, multiplication, divide;

    printf("Masukan dua angka satu persatu, tekan enter setiap selesai memasukkan\n");

    // Get input from console
    scanf("%d", &firstInput);
    scanf("%d", &secondInput);

    // Calculate input
    add = firstInput + secondInput;
    substraction = firstInput - secondInput;
    multiplication = firstInput * secondInput;

    if(secondInput != 0){

        divide = firstInput / secondInput;
    
    }else{
        
        divide = 0;
        printf("Pembagi adalah 0\n");
    }

    // Print to console
    printf("Pertambahan = %d\n", add);
    printf("Pengurangan = %d\n", substraction);
    printf("Perkalian = %d\n", multiplication);
    printf("Pembagian = %d\n", divide);

    return 0;
}