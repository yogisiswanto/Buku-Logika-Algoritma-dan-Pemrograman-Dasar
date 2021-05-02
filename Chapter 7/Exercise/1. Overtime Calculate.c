/*
 *  Name Program    : Overtime Calculate
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
    int jamLembur;

    printf("Masukan Jam Lembur\n");

    // Get input from console
    scanf("%d", &jamLembur);

    // Condition when jam lembur less than 12 hour
    if(jamLembur < 12){

        printf("Gaji Lembur sebesar Rp. 100.000\n");
    
    // Condition when jam lembur equals with 12 hour
    }else if(jamLembur == 12){

        printf("Gaji Lembur sebesar Rp. 200.000\n");
    
    // Condition when jam lembur greater than 12 hour
    }else{

        printf("Gaji Lembur sebesar Rp. 300.000\n");
    }

    return 0;
}