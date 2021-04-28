/*
 *  Name Program    : Answer 3
 *  Purpose         : Answer question from exercise Chapter 3 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 14th April 2021
 *  Language        : C Language
 */

#include <stdio.h>

int main() {
    
    // Variable declaration & inisialization
    char first = '1';
    char second = '2';
    char result;
    int temporary;
    
    // Casting each char and store to integer
    temporary = (int) first + (int) second;
    
    // Casting integer to char
    result = (char) temporary;
    
    // Print char
    printf("%c", result);
    
    
    return 0;
}