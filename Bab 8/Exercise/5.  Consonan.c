#include <stdio.h>

int main()
{

	char character[99];
	int banyak, baris;

	scanf("%d", &banyak);

	for (baris = 0; baris < banyak; baris++)
	{
		scanf(" %c", &character[baris]);
	}

	for (baris = 0; baris < banyak; baris++)
	{
		if ((character[baris] != 'A') && (character[baris] != 'a') &&
			(character[baris] != 'I') && (character[baris] != 'i') &&
			(character[baris] != 'U') && (character[baris] != 'u') &&
			(character[baris] != 'E') && (character[baris] != 'e') &&
			(character[baris] != 'O') && (character[baris] != 'o'))
		{
			printf("%c\n", character[baris]);
		}
	}

	return 0;
}