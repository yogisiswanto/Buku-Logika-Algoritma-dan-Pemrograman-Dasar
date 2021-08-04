/*
 *  Name Program    : Triangular Character
 *  Purpose         : Answer question from exercise Chapter 8 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 17th May 2021
 *  Language        : C Language
 * 
 *  Input
 * 	-----
 * 	gembala
 * 
 * 	Output
 * 	------
 * 	g
 *   e
 *    m
 *     b
 *    a
 *   l
 *  a
 */

#include <stdio.h>
#include <string.h>

// Main function
int main(){
 
	// Variable declaration
	char string[99];
	int baris, kolom, spasi, panjang;

	// Get input from console
	scanf("%s", &string);

	// Length inisialization
	panjang =  strlen(string);
	spasi = panjang / 2;

	// Loop for print pattern
	/* 
	 * 	g
 	 *   e
 	 *    m
	 */
	for (baris = 0; baris < spasi; baris++)
	{
		
		for (kolom = 0; kolom < baris; kolom++)
		{
			
			printf(" ");
		}

		printf("%c\n", string[baris]);
	}

	// Loop for print pattern
	/* 
	 *     b
	 *    a
	 *   l
	 *  a
	 */
	for (baris = spasi; baris < panjang; baris++)
	{
		
		for (kolom = 1; kolom < (panjang - baris); kolom++)
		{
			
			printf(" ");
		}

		printf("%c\n", string[baris]);
	}

	return 0;   
}