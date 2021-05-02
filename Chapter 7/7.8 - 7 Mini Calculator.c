/*
 *  Name Program    : Mini Calculator
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
    int angkaPertama, angkaKedua, hasil, menu;

    printf("Masukan dua buah angka, untuk setiap angka tekan enter\n");

    // Get input from console
    /* 
        Example
        2
        2
     */
    scanf("%d", &angkaPertama);
    scanf("%d", &angkaKedua);

    printf("Menu:\n1. Tambah\n2. Kurang\n3. Kali\n");

    scanf("%d", &menu);

    // Sanitize input
    if((menu >= 1) && (menu <= 3)){

        switch(menu){

            // Condition when menu is equal with 1
            case 1 : {
                
                hasil = angkaPertama + angkaKedua;
            }

            // Condition when menu is equal with 2
            case 2 : {

                hasil = angkaPertama - angkaKedua;
            }

            // Condition when menu is equal with 3
            case 3 : {

                hasil = angkaPertama * angkaKedua;
            }
        }
    
    // Condition when menu is not in list
    }else{

        hasil = 0;
        printf("Menu tidak valid\n");
    }

    // Print to console
    printf("%d\n", hasil);

    return 0;
}