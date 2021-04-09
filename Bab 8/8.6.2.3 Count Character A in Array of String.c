#include <stdio.h>
#include <string.h>

int main()
{
	
	char string[10][50];
	int penghitung, huruf, jumlah;

	for (penghitung = 0; penghitung < 10; penghitung++)
	{
		
		printf("Masukan kata:\n");
		scanf("%s", &string[penghitung]);
		printf("\n");

	}

	jumlah = 0;

	for (penghitung = 0; penghitung < 10; penghitung++)
	{
		for (huruf = 0; huruf < strlen(string[penghitung]); huruf++)
		{
			if ((string[penghitung][huruf] == 'A') || (string[penghitung][huruf] == 'a'))
			{
				jumlah++;
			}
		}
	}

	printf("%d\n", jumlah);

	return 0;
}