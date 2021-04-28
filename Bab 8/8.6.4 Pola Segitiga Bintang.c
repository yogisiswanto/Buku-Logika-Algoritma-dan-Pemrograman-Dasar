/*
 *  Name Program    : Pola Segitiga Bintang
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 28th April 2021
 *  Language        : C Language
 */

#include <stdio.h>

// Main function
int main(){
	
	// Variable declaration
	int baris, kolom, bintang;

	printf("Masukan banyaknya bintang:\n");

	// Get input from console
	scanf("%d", &bintang);

	// Loop for star print for top part
	for (baris = 0; baris < (bintang / 2); baris++)
	{
		
		for (kolom = 0; kolom < baris; kolom++)
		{
			
			printf(" ");
		}

		for (kolom = 0; kolom < bintang; kolom++)
		{
			
			printf("*");
		}
		
		printf("\n");
	}

	// Loop for star print for middle part
	if (bintang % 2 == 1)
	{
		
		for (kolom = 0; kolom < (bintang / 2); kolom++)
		{
			printf(" ");
		}

		for (kolom = 0; kolom < bintang; kolom++)
		{
			
			printf("*");
		}

		printf("\n");
	}

	// Loop for star print for bottom part
	for (baris = 0; baris < (bintang / 2); baris++)
	{
		
		for (kolom = ((bintang / 2) - baris); kolom > 1; kolom--)
		{
			
			printf(" ");
		}

		for (kolom = 0; kolom < bintang; kolom++)
		{
			
			printf("*");
		}
		
		printf("\n");
	}

	return 0;   
}