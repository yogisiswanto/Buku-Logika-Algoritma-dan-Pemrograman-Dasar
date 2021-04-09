#include <stdio.h>
#include <string.h>

int main()
{
	
	char string[50];
	int baris, kolom, spasi;

	printf("Masukan kata:\n");
	scanf("%s", &string);
	printf("\n");

	spasi = 0;

	for (baris = 0; baris < strlen(string); baris++)
	{
		for (kolom = 0; kolom < spasi; kolom++)
		{
			printf(" ");
		}

		printf("%c\n", string[baris]);

		spasi++;
	}

	return 0;
}