#include <stdio.h>
#include <string.h>

int main()
{
	
	char string[9][50];
	int baris, kolom, spasi;

	for (baris = 0; baris < 9; baris++)
	{
		
		printf("Masukan kata:\n");
		scanf("%s", &string[baris]);
		printf("\n");

	}

	spasi = 0;

	for (baris = 0; baris < 9; baris++)
	{
		for (kolom = 0; kolom < spasi; kolom++)
		{
			printf(" ");
		}

		printf("%s\n", string[baris]);

		spasi = spasi + strlen(string[baris]);
	}

	return 0;
}