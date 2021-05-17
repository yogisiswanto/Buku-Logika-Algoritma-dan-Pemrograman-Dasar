/*
 *  Name Program    : Array of Integer
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 22th April 2021
 *  Language        : C Language
 * 
 *  Input
 *  -----
 * 	5
 *  1
 *  2
 *  3
 *  4
 *  5
 * 
 *  Output
 *  ------
 *  1
 *  2
 *  3
 *  4
 *  5
 */

#include <stdio.h>

// Main function
int main()
{
	// Variable declaration
	int banyak;

	printf("Masukan banyaknya angka:\n");

	// Get input from console
	scanf("%d", &banyak);

	// Variable declaration
	int arrayInteger[banyak];
	int penghitung;

	// Loop for getting input from console
	for (penghitung = 0; penghitung < banyak; penghitung++)
	{
		printf("Masukan angka:\n");

		scanf("%d", &arrayInteger[penghitung]);
	}

	// Loop for print value from array of integer
	for (penghitung = 0; penghitung < banyak; penghitung++)
	{
		
		printf("%d\n", arrayInteger[penghitung]);
	}

	return 0;
}