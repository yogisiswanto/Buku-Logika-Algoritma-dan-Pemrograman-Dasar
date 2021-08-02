/*
 *  Name Program    : Procedure in C
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 9
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 2nd August 2021
 *  Language        : C Language
 * 
 * 	Input
 * 	-----
 * 	-
 * 
 * 	Output
 * 	------
 * 	Program utama prosedur
 */

#include <stdio.h>
void write(char []);

// Main function
int main(){

    // Variable declaration & inisialization
    char word[] = "Program utama prosedur\n";

    // Print procedure
    write(word);

    return 0;
}

// Procedure print word
void write(char word[]){

    // Print word
    printf("%s", word);
    
}