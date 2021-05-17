/*
 *  Name Program    : Sum
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
 * 	10
 */

#include <stdio.h>

// Main function
int main()
{
	
	// Variable declaration
	int berapa_kali, hasil_jumlah, penghitung;

	// Variable initialization
	hasil_jumlah = 0;

	printf("masukan angka berapa kali akan diulang:\n");

	// Get input from console. Example = 5
	scanf("%d", &berapa_kali);

	// Loop for calculate sum from input
	for (penghitung = 0; penghitung < berapa_kali; penghitung++)
	{
		hasil_jumlah = hasil_jumlah + penghitung;
	}

	// Print to console
	printf("%d\n", hasil_jumlah);

	return 0;
}