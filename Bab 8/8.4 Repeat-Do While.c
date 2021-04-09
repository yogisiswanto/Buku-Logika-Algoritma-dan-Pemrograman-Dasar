#include <stdio.h>
int main(){
 
	char jawaban;

	do{
		
		printf("Halo dunia!\n");

		printf("Apakah anda ingin menampilkan lagi?\n");

		scanf("%c", &jawaban);

		while(getchar() != '\n');

		printf("\n");

	} while (jawaban == 'y');

	return 0;   
}