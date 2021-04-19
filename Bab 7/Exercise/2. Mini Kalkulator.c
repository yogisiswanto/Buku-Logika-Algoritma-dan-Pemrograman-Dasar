/*
 *  Name Program    : Mini Kalkulator
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
    int angkaPertama, angkaKedua, hasil, menu;

    printf("Masukan dua buah angka, untuk setiap angka tekan enter\n");

    // Get input from console
    scanf("%d", &angkaPertama);
    scanf("%d", &angkaKedua);

    printf("Menu:\n
    1. Tambah\n
    2. Kali\n
    3. Kurang\n");

    // Get input from console
    scanf("%d", &menu);

    // Sanitize input
    if((menu >= 1) && (menu <= 3)){

        switch(menu){

            // Condition when menu is equals with 1
            case 1 : {
                
                hasil = angkaPertama + angkaKedua;
            }

            // Condition when menu is equals with 2
            case 2 : {

                hasil = angkaPertama * angkaKedua;

            }

            // Condition when menu is equals with 3
            case 3 : {

                hasil = angkaPertama - angkaKedua;
            }
        }
    
    // Condition when input is not sanitize
    }else{

        hasil = 0;
        printf("Menu tidak valid\n");
    }

    // Print to console
    printf("%d\n", hasil);

    return 0;
}