#include <stdio.h>

int main(){

    int celcius;
    int reamur;

    printf("Masukan derajat celcius\n");

    scanf("%d", &celcius);

    reamur = (4 * celcius) / 5;

    printf("%d", reamur);
    
    return 0;
}