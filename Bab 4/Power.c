#include <stdio.h>

int main(){

    int a;
    int b;

    printf("Masukan angka, lalu tekan enter\n");

    scanf("%d", &a);
    printf("\n");

    b = a * a;

    printf("%d", b);
    
    return 0;
}