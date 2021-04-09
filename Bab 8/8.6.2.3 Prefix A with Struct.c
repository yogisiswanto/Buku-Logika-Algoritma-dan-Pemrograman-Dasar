#include <stdio.h>
#include <string.h>

typedef struct{
	char string[50];
}str;

int main()
{
	
	str arrayString[10];
	int penghitung;

	for (penghitung = 0; penghitung < 10; penghitung++)
	{
		
		printf("Masukan kata:\n");
		scanf("%s", &arrayString[penghitung].string);
		printf("\n");

	}

	for (penghitung = 0; penghitung < 10; penghitung++)
	{
		
		if ((arrayString[penghitung].string[0] == 'A') || (arrayString[penghitung].string[0] == 'a'))
		{
			printf("%s\n", arrayString[penghitung].string);
		}

	}

	return 0;
}