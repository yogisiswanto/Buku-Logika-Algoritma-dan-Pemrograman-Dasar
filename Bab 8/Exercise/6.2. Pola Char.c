#include <stdio.h>
#include <string.h>

int main(){
 
	char string[99];
	int baris, kolom, spasi, panjang;

	scanf("%s", &string);

	panjang =  strlen(string);
	spasi = panjang / 2;


	for (baris = 0; baris < spasi; baris++)
	{
		
		for (kolom = 0; kolom < baris; kolom++)
		{
			
			printf(" ");
		}

		printf("%c\n", string[baris]);
	}

	for (baris = spasi; baris < panjang; baris++)
	{
		
		for (kolom = 1; kolom < (panjang - baris); kolom++)
		{
			
			printf(" ");
		}

		printf("%c\n", string[baris]);
	}

	return 0;   
}