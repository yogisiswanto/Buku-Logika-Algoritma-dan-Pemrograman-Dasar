#include <stdio.h>

int main(){

    int input[5];

    printf("Masukan lima buah angka secara berurutan, lalu tekan enter setelahnya\n");

    scanf("%d", &input[0]);
    scanf("%d", &input[0]);
    scanf("%d", &input[0]);
    scanf("%d", &input[0]);
    scanf("%d", &input[0]);

    printf("Angka ke - 1 = %d\n", input[0]);
    printf("Angka ke - 2 = %d\n", input[1]);
    printf("Angka ke - 3 = %d\n", input[2]);
    printf("Angka ke - 4 = %d\n", input[3]);
    printf("Angka ke - 5 = %d\n", input[4]);

    return 0;
}