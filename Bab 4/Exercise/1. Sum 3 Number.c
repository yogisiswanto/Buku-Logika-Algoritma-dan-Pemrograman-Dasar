#include <stdio.h>

int main(){

    int a;
    int b;
    int c;
    int d;

    printf("Masukan tiga angka satu persatu, tekan enter setiap selesai memasukkan\n");

    scanf("%d", &a);
    printf("\n");
    scanf("%d", &b);
    printf("\n");
    scanf("%d", &c);
    printf("\n");

    d = a + b + c;

    printf("%d", d);
    
    return 0;
}