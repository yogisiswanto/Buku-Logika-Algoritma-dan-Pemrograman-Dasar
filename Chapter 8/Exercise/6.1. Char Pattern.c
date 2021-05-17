/*
 *  Name Program    : Char Pattern
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
 * 	     a
 *       l
 *      a
 *     b
 *    m
 *   e
 *  g
 */

#include <stdio.h>
#include <string.h>

// Main function
int main()
{
	// Variable declaration
	char string[99];
	int baris, kolom, spasi, panjang;

	// Get input from console
	scanf("%s", &string);

	// Length inisialization
	panjang =  strlen(string) - 1;
	spasi = panjang - 1;

	// Loop for print pattern
	for (baris = panjang; baris >= 0; baris--)
	{
		// Decrement white space
		if (baris < panjang - 1)
		{
			spasi--;
		}

		// Print white space
		for (kolom = 0; kolom < spasi; kolom++)
		{
			printf(" ");
		}

		printf("%c\n", string[baris]);
	}

	return 0;
}