/*
 *  Name Program    : Character Stair
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 22th April 2021
 *  Language        : C Language
 * 
 *  Input
 *  -----
 *  akuadalah
 * 
 *  Output
 *  ------
 *  a
 *   k
 *    u
 *     a
 *      d
 *       a
 *        l
 *         a
 *          h
 */

#include <stdio.h>
#include <string.h>

// Main function
int main()
{
	// Variable declaration
	char string[50];
	int baris, kolom, spasi;

	printf("Masukan kata:\n");
	
	// Get input from console
	scanf("%s", &string);

	// Varibale inisialization
	spasi = 0;

	// Loop for print character like stair
	for (baris = 0; baris < strlen(string); baris++)
	{
		for (kolom = 0; kolom < spasi; kolom++)
		{
			printf(" ");
		}

		printf("%c\n", string[baris]);

		spasi++;
	}

	return 0;
}