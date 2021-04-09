#include <stdio.h>

typedef struct
{
	int jari_jari;
	float luas;
}lingkaran;

int main()
{
	
	lingkaran lingkaran;

	scanf("%d", &lingkaran.jari_jari);

	lingkaran.luas = 3.14 * lingkaran.jari_jari * lingkaran.jari_jari;

	printf("%0.2f\n", lingkaran.luas);
	

	return 0;
}