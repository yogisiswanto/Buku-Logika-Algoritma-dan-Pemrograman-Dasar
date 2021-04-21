/*
 *  Name Program    : Search Odd with While
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 21th April 2021
 *  Language        : C Language
 */

#include <stdio.h>

// Main function
int main(){
	
	// Variable declaration
	int penghitung, arrayInteger[5], ketemu;

	// Loop for getting input from console
	for (penghitung = 0; penghitung < 5; penghitung++)
	{
		printf("Masukan angka:");

		scanf("%d", &arrayInteger[penghitung]);
	}

	// Variable inisialization
	ketemu = 0;
	penghitung = 0;

	// Loop for finding odd value in array of integer
	while((ketemu == 0) && (penghitung < 5)){

		if (arrayInteger[penghitung] % 2 == 1)
		{
		
			ketemu = 1;
		
		}else{

			penghitung = penghitung + 1;
		}
	}

	// Condition when there is an odd value in array of integer
	if (ketemu == 0)
	{
		
		printf("tidak ada angka ganjil\n");
	
	// Alternate condition
	}else{

		printf("ada angka ganjil\n");
	}

	return 0;   
}