/*
 *  Name Program    : Rerata
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 21th April 2021
 *  Language        : C Language
 */

#include <stdio.h>

// Main function
int main()
{
	// Variable declaration
	int increment;
	float hasil;

	// Variable initialization
	hasil = 0.0;

	// Loop for calculate sum
	for (increment = 1; increment <= 10; increment++)
	{
		hasil = hasil + increment;
	}

	// Calculate average
	hasil = hasil / 10;

	// Print to console
	printf("%f\n", hasil);

	return 0;
}