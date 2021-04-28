/*
 *  Name Program    : Struct Type Example 1
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 3
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 14th April 2021
 *  Language        : C Language
 */

#include <stdio.h>

// Struct initialization
typedef struct{
    
    float x;
    float y;

}Titik;

// Main function
int main(){

    // Struct instantiation
    titik p1;

    // Struct assignment
    p1.x = 0;
    p1.y = 0;

    return 0;
}