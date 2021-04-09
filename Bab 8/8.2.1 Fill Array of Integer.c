#include <stdio.h>

int main()
{
	
	int arrayInteger[5], penghitung;

	for (penghitung = 0; penghitung < 5; penghitung++)
	{
		arrayInteger[penghitung] = penghitung;
	}

	for (penghitung = 0; penghitung < 5; penghitung++)
	{
		printf("%d\n", arrayInteger[penghitung]);
	}	

	return 0;
}