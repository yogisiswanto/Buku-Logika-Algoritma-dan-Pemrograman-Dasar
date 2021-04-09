#include <stdio.h>
#include <string.h>

int main()
{
	
	char string[50];
	int penghitung, jumlah;

	printf("Masukan kata:\n");
	scanf("%s", &string);
	printf("\n");

	jumlah = 0;

	for (penghitung = 0; penghitung < strlen(string); penghitung++)
	{
		if ((string[penghitung] == 'a') || (string[penghitung] == 'i') || (string[penghitung] == 'u') || (string[penghitung] == 'e') || (string[penghitung] == 'o'))
		{
			jumlah++;
		}
	}

	printf("%d\n", jumlah);

	return 0;
}