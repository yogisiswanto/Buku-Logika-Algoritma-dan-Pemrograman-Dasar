/*
 *  Name Program    : Stair Word with Struct
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 28th April 2021
 *  Language        : C Language
 * 
 *  Input
 *  -----
 *  aku
 *  adalah
 *  anak
 *  gemabal
 *  selalu
 *  riang
 *  serta
 *  gembira
 *  karena
 *  aku
 * 
 *  Output
 *  ------
 *  aku
 *     adalah
 *           anak
 *               gembala
 *                      selalu
 *                            riang 
 *                                 serta
 *                                      gembira
 *                                             karena
 */

#include <stdio.h>
#include <string.h>

// Struct declaration
typedef struct{
	char string[50];
}str;

// Main function
int main()
{
	
	// Variable declaration
	str arrayString[9];
	int baris, kolom, spasi;

	// Loop getting input from console
	for (baris = 0; baris < 9; baris++)
	{
		
		printf("Masukan kata:\n");
		scanf("%s", &arrayString[baris].string);

	}

	// Variable inisialization
	spasi = 0;

	// Loop for string print look like stair
	for (baris = 0; baris < 9; baris++)
	{
		for (kolom = 0; kolom < spasi; kolom++)
		{
			printf(" ");
		}

		printf("%s\n", arrayString[baris].string);

		spasi = spasi + strlen(arrayString[baris].string);
	}

	return 0;
}