#include <stdio.h>
#include <string.h>

int main(int argc, char const *argv[])
{
	
	char string[99];
	int baris, kolom, spasi, panjang;

	scanf("%s", &string);

	panjang =  strlen(string) - 1;
	spasi = panjang - 1;


	for (baris = panjang; baris >= 0; baris--)
	{

		if (baris < panjang - 1)
		{
			spasi--;
		}

		for (kolom = 0; kolom < spasi; kolom++)
		{
			printf(" ");
		}

		printf("%c\n", string[baris]);
	}

	return 0;
}