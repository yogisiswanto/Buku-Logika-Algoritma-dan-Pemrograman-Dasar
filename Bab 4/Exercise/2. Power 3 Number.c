#include <stdio.h>

int main(){

    int a;
    int b;
    int c;
    int d;

    printf("Masukan tiga angka satu persatu, lalu tekan enter setelahnya\n");

    scanf("%d", &a);
    scanf("%d", &b);
    scanf("%d", &c);

    d = a * b * c;

    printf("%d", d);
    
    return 0;
}