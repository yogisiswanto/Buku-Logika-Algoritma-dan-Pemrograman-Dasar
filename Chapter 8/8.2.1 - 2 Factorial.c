/*
 *  Name Program    : Factorial
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 21th April 2021
 *  Language        : C Language
 * 
 * 	Input
 * 	-----
 * 	5
 * 
 * 	Output
 * 	------
 * 	120
 */

#include <stdio.h>

// Main function
int main()
{
	// Variable declaration
	int fak_berapa, penghitung, hasil_faktorial;

	printf("Masukan angka faktorial yang akan dihitung:\n");

	// Get input from console
	scanf("%d", &fak_berapa);

	// Variable initialization
	hasil_faktorial = 1;

	// Loop for calculate factorial from input
	for (penghitung = 2; penghitung <= fak_berapa; penghitung++)
	{
		hasil_faktorial = hasil_faktorial * penghitung;
	}

	// Print to console
	printf("%d\n", hasil_faktorial);

	return 0;
}