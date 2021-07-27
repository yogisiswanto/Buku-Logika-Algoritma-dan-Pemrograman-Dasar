/*
 *  Name Program    : Answer 3
 *  Purpose         : Answer question from exercise Chapter 3 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 14th April 2021
 *  Language        : C Language
 */

#include <stdio.h>

// Struct declaration
typedef struct{
    int x;
    int y;
}Titik;

// Main function
int main(){

    // Struct instantiation
    Titik A;
    Titik B;
    Titik C;

    // 1st Point
    A.x = -3;
    A.y = 1;

    // 2st Point
    B.x = 5;
    B.y = 1;

    // 3st Point
    C.x = 1;
    C.y = 8;

    return 0;
}