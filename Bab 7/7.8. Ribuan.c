/*
 *  Name Program    : Ribuan
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
    int a, b, c, tanda;

    printf("Masukan 3 angka lalu tekan enter setiap setelah memasukan 1 huruf\n");

    // Get input from console
    scanf("%d", &a);
    scanf("%d", &b);
    scanf("%d", &c);

    // Variable inisialize
    tanda = 0;

    // Check a is greater than 999 and less than 10000
    if((a > 999) && (a < 10000)){

        // Check b is greater than 999 and less than 10000
        if((b > 999) && (b < 10000)){

            // Check c is greater than 999 and less than 10000
            if((c > 999) && (c < 10000)){
            
                tanda = 1;
            }
        }  
    }

    // Condition when tanda is equal with 1
    if(tanda == 1){

        printf("Semua angka masukan adalah ribuan\n");
    
    // Alternate condition
    }else{

        prinft("Tidak semua angka masukan adalah ribuan\n");
    }
    return 0;
}