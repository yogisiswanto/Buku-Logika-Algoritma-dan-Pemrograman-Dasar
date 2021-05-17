/*
 *  Name Program    : Count Character A in Array of String
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 22th April 2021
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
 *  15
 */

#include <stdio.h>
#include <string.h>

// Main function
int main()
{
	// Variable declaration
	char string[10][50];
	int penghitung, huruf, jumlah;

	// Loop getting input from console
	for (penghitung = 0; penghitung < 10; penghitung++)
	{
		
		printf("Masukan kata:\n");
		scanf("%s", &string[penghitung]);

	}

	// Variable inisialization
	jumlah = 0;

	// Loop for counting a character in array of string
	for (penghitung = 0; penghitung < 10; penghitung++)
	{
		for (huruf = 0; huruf < strlen(string[penghitung]); huruf++)
		{
			if ((string[penghitung][huruf] == 'A') || (string[penghitung][huruf] == 'a'))
			{
				jumlah++;
			}
		}
	}

	// Print to console
	printf("%d\n", jumlah);

	return 0;
}