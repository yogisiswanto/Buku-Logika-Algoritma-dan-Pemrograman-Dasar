/*
 *  Name Program    : Repeat Do-While
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
	char jawaban;

	// Getting input from console first, and then check
	do{
		
		printf("Halo dunia!\n");

		printf("Apakah anda ingin menampilkan lagi?\n");

		scanf("%c", &jawaban);

		while(getchar() != '\n');

		printf("\n");

	} while (jawaban == 'y');

	return 0;   
}