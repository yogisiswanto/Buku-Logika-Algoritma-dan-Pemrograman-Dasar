/*
 *  Name Program    : Casting Integer to Char
 *  Purpose         : Answer question from exercise Chapter 3 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 14th April 2021
 *  Language        : C Language
 */

#include <stdio.h>

int main() {
    
    // Variable declaration
    char first;
    char second;
    char result;
    int temporary;

    // Variable inisialization
    first = '1';
    second = '2';
    
    // Casting each char and store to integer
    temporary = (int) first + (int) second;
    
    // Casting integer to char
    result = (char) temporary;
    
    // Print char
    printf("%c", result);    
    
    return 0;
}