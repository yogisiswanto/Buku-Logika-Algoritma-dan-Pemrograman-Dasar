/*
 *  Name Program    : Pola Tangga Bintang
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

	// Loop for star print look like stair
	for (baris = 0; baris < bintang; baris++)
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

	return 0;   
}