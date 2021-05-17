/*
 *  Name Program    : Circle
 *  Purpose         : Answer question from exercise Chapter 8 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 9th May 2021
 *  Language        : C Language
 * 
 *  Input
 * 	-----
 * 	5
 * 
 * 	Output
 * 	------
 * 	78.50
 */

#include <stdio.h>

// Struct declaration
typedef struct
{
	int jari_jari;
	float luas;
}lingkaran;

// Main function
int main()
{
	// Variable declaration	
	lingkaran lingkaran;

	// Get input from console
	scanf("%d", &lingkaran.jari_jari);

	// Calculate circle area
	lingkaran.luas = 3.14 * lingkaran.jari_jari * lingkaran.jari_jari;

	printf("%0.2f\n", lingkaran.luas);
	
	// Print to console
	return 0;
}