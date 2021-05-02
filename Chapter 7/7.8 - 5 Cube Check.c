/*
 *  Name Program    : Cube Check
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
    int sisiPertama, sisiKedua, sisiKetiga;

    printf("Masukan ketiga sisi\n");

    // Get input from console
    /* 
        Example
        2
        2
        2

        or 

        1
        2
        3
     */
    scanf("%d", &sisiPertama);
    scanf("%d", &sisiKedua);
    scanf("%d", &sisiKetiga);
    
    // Condition when sisi pertama is equal with sisi kedua and sisi kedua is equal with sisi ketiga
    if((sisiPertama == sisiKedua) && (sisiKedua == sisiKetiga)){

        printf("Termasuk kubus\n");
    
    // alternate condition
    }else{

        printf("Bukan termasuk kubus\n");
    }

    return 0;
}