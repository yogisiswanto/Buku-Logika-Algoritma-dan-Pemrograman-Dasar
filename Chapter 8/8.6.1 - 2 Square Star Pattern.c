/*
 *  Name Program    : Square Star Pattern
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 22th April 2021
 *  Language        : C Language
 * 
 *  Input
 * 	-----
 * 	5
 * 
 * 	Output
 * 	------
 * 	*****
 *  *****
 *  *****
 *  *****
 *  *****
 */

#include <stdio.h>

// Main function
int main(){
	
	// Variable declaration
	int baris, kolom, bintang;

	printf("Masukan banyaknya bintang:\n");

	// Get input from console
	scanf("%d", &bintang);

	// Loop for print to console the start pattern
	for (baris = 0; baris < bintang; baris++)
	{
		
		for (kolom = 0; kolom < bintang; kolom++)
		{
			
			printf("*");
		}
		
		printf("\n");
	}

	return 0;   
}