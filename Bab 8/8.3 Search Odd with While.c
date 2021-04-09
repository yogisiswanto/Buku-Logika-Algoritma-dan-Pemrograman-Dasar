#include <stdio.h>
int main(){
 
	int penghitung, arrayInteger[5], ketemu;

	for (penghitung = 0; penghitung < 5; penghitung++)
	{
		printf("Masukan angka:");

		scanf("%d", &arrayInteger[penghitung]);
	}

	ketemu = 0;
	penghitung = 0;

	while((ketemu == 0) && (penghitung < 5)){

		if (arrayInteger[penghitung] % 2 == 1)
		{
		
			ketemu = 1;
		
		}else{

			penghitung = penghitung + 1;
		}
	}

	if (ketemu == 0)
	{
		
		printf("tidak ada angka ganjil\n");
	
	}else{

		printf("ada angka ganjil\n");
	}

	return 0;   
}