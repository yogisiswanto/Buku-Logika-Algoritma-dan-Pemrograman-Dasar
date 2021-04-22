/*
 *  Name Program    : Pola Bintang Satu Baris
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 22th April 2021
 *  Language        : C Language
 */

#include <stdio.h>

// Main function
int main(){
	
	// Variable declaration
	int penghitung, bintang;

	printf("Masukan banyaknya bintang:\n");

	// Get input from console
	scanf("%d", &bintang);

	// Loop for print to console the start pattern
	for (penghitung = 0; penghitung < bintang; penghitung++)
	{
		
		printf("*");
	}

	return 0;   
}