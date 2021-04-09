#include <stdio.h>
#include <string.h>

int main()
{
	
	char string[10][50];
	int penghitung;

	for (penghitung = 0; penghitung < 10; penghitung++)
	{
		
		printf("Masukan kata:\n");
		scanf("%s", &string[penghitung]);
		printf("\n");

	}

	for (penghitung = 0; penghitung < 10; penghitung++)
	{
		
		if ((string[penghitung][0] == 'A') || (string[penghitung][0] == 'a'))
		{
			printf("%s\n", string[penghitung]);
		}

	}

	return 0;
}