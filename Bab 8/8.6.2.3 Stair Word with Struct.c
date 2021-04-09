#include <stdio.h>
#include <string.h>

typedef struct{
	char string[50];
}str;

int main()
{
	
	str arrayString[9];
	int baris, kolom, spasi;

	for (baris = 0; baris < 9; baris++)
	{
		
		printf("Masukan kata:\n");
		scanf("%s", &arrayString[baris].string);
		printf("\n");

	}

	spasi = 0;

	for (baris = 0; baris < 9; baris++)
	{
		for (kolom = 0; kolom < spasi; kolom++)
		{
			printf(" ");
		}

		printf("%s\n", arrayString[baris].string);

		spasi = spasi + strlen(arrayString[baris].string);
	}

	return 0;
}