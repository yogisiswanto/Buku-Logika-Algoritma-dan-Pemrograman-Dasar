#include <stdio.h>
#include <string.h>

typedef struct{
	char string[50];
}str;

int main()
{
	
	str arrayString[10];
	int penghitung, huruf, jumlah;

	for (penghitung = 0; penghitung < 10; penghitung++)
	{
		
		printf("Masukan kata:\n");
		scanf("%s", &arrayString[penghitung].string);
		printf("\n");

	}

	jumlah = 0;

	for (penghitung = 0; penghitung < 10; penghitung++)
	{
		for (huruf = 0; huruf < strlen(arrayString[penghitung].string); huruf++)
		{
			if ((arrayString[penghitung].string[huruf] == 'A') || (arrayString[penghitung].string[huruf] == 'a'))
			{
				jumlah++;
			}
		}
	}

	printf("%d\n", jumlah);

	return 0;
}