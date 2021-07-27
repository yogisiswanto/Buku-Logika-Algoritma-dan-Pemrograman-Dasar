/*
 *  Name Program    : Depend On
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 7
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 2nd Mei 2021
 *  Language        : C Language
 */

#include <stdio.h>

// Main function
int main(){

    // Variable declaration
    int hari;

    // Get input from console. Example 7
    scanf("%d", &hari);

    switch(hari){

        // Condition when hari is equal with 1
        case 1 :
            printf("Hari Senin");
        break;
        
        // Condition when hari is equal with 2
        case 2 :
            printf("Hari Selasa");
        break;
        
        // Condition when hari is equal with 3
        case 3 :
            printf("Hari Rabu");
        break;

        // Condition when hari is equal with 4
        case 4 :
            printf("Hari Kamis");
        break;

        // Condition when hari is equal with 5
        case 5 :
            printf("Hari Jum'at");
        break;

        // Condition when hari is equal with 6
        case 6 :
            printf("Hari Sabtu");
        break;
        
        // Condition when hari is equal with 7
        case 7 :
            printf("Hari Ahad");
        break;

        // Condition when hari is not in the list
        default :
            printf("Tidak ada hari ke - %d\n", hari);
        break;
    }

    return 0;
}