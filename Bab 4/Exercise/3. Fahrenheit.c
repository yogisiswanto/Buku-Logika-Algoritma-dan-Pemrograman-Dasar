#include <stdio.h>

int main(){

    int celcius;
    int fahrenheit;

    printf("Masukan derajat celcius\n");

    scanf("%d", &celcius);

    fahrenheit = ((9 * celcius) / 5) + 32;

    printf("%d", fahrenheit);
    
    return 0;
}