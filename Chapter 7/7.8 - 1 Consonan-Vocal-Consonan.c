/*
 *  Name Program    : Consonan-Vocal-Consonan
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
    char a, b, c;
    int tanda;

    printf("Masukan 3 huruf lalu tekan enter setiap setelah memasukan 1 huruf\n");

    // Get input from console
    /* 
        Example
        b
        a
        c
     */
    scanf(" %c", &a);
    scanf(" %c", &b);
    scanf(" %c", &c);

    // Variable inisialize
    tanda = 0;

    // Check Consonan
    if((a != 'a') && (a != 'i') && (a != 'u') && (a != 'e') && (a != 'o')){

        // Check vokal
        if((b != 'a') || (b != 'i') || (b != 'u') || (b != 'e') || (b != 'o')){

            // Chek Consonan
            if((c != 'a') && (c != 'i') && (c != 'u') && (c != 'e') && (c != 'o')){
            
                tanda = 1;
            }
        }  
    }

    // Condition when tanda is equal with 1
    if(tanda == 1){

        printf("Konsonan-Vokal-Konsonan\n");
    
    // Alternate condition
    }else{

        printf("Bukan Konsonan-Vokal-Konsonan\n");
    }
    return 0;
}