#include <stdio.h>

int main(){

    int a;
    int b;
    int c;

    printf("Masukan dua angka satu persatu, tekan enter setiap selesai memasukkan\n");

    scanf("%d", &a);
    printf("\n");
    scanf("%d", &b);
    printf("\n");

    c = a + b;

    printf("%d", c);
    
    return 0;
}