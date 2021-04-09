#include <stdio.h>

int main()
{
	
	int increment;
	float hasil;

	hasil = 0.0;

	for (increment = 1; increment <= 10; increment++)
	{
		hasil = hasil + increment;
	}

	hasil = hasil / 10;

	printf("%f\n", hasil);

	return 0;
}