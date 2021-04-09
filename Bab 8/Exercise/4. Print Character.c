#include <stdio.h>
#include <string.h>

int main()
{

	char string[99][99];
	int banyak, baris, kolom;

	scanf("%d", &banyak);

	for (baris = 0; baris < banyak; baris++)
	{
		scanf(" %s", &string[baris]);
	}

	for (baris = 0; baris < banyak; baris++)
	{

		if ((string[baris][0] == 'A') || (string[baris][0] == 'a'))
		{
			
			for (kolom = strlen(string[baris]) - 1; kolom >= 0; kolom--)
			{
				printf("%c", string[baris][kolom]);
			}

			printf("\n");
		
		}

		else if ((string[baris][0] == 'I') || (string[baris][0] == 'i'))
		{
			int length = 0;
			int start = 0;
			int middle = 0;

			length = strlen(string[baris]);

			if (length % 2 == 0)
			{
				start = (length / 2) - 1;
				middle = length / 2;
			}

			else{
				start = length / 2;
				middle = (length / 2) + 1;
			}

			for (kolom = start; kolom >= 0; kolom--)
			{
				printf("%c", string[baris][kolom]);
			}

			for (kolom = middle; kolom < length; kolom++)
			{
				printf("%c", string[baris][kolom]);
			}

			printf("\n");
		}

		else if ((string[baris][0] == 'U') || (string[baris][0] == 'u'))
		{
			for (kolom = strlen(string[baris]) - 1; kolom >= 0; kolom--)
			{
				printf("%c", string[baris][kolom]);
			}

			printf("\n");
		}

		else{
			
			printf("%s\n", string[baris]);
		}
		
	}

	return 0;
}