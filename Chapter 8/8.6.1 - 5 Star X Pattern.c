/*
 *  Name Program    : Star X Pattern
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 28th April 2021
 *  Language        : C Language
 * 
 *  Input
 * 	-----
 * 	5
 * 
 * 	Output
 * 	------
 * 	*****    *****
 *   *****  *****
 *    **********
 *   *****  *****
 *  *****    *****
 */

#include <stdio.h>

// Main function
int main(){
	
	// Variable declaration
	int baris, kolom, bintang, batas, bagianBawah;

	printf("Masukan banyaknya bintang:\n");

	// Get input from console
	scanf("%d", &bintang);

	// Condition when input is even
	if (bintang % 2 == 0)
	{
		bagianBawah = bintang / 2;
		batas = bintang - 2;
	
	// Condition when input is odd
	}else{

		bagianBawah = (bintang / 2) + 1;
		batas = bintang - 1;
	}

	// Loop for star print for top part
	/* 
	 * 	*****    *****
	 *   *****  *****
 	 *    **********
	 */
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

		for (kolom = 0; kolom < (batas - (baris * 2)); kolom++)
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
	/* 
	 *   *****  *****
 	 *  *****    *****
	 */
	for (baris = 0; baris < bagianBawah; baris++)
	{
		
		for (kolom = bagianBawah - baris; kolom > 1; kolom--)
		{
			
			printf(" ");
		}

		for (kolom = 0; kolom < bintang; kolom++)
		{
			
			printf("*");
		}

		for (kolom = 0; kolom < (baris * 2); kolom++)
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