#include <stdio.h>

int main(){

    char input[5][99];

    printf("Masukan lima buah kata secara berurutan, lalu tekan enter setelahnya\n");

    scanf(" %s", &input[0]);
    scanf(" %s", &input[0]);
    scanf(" %s", &input[0]);
    scanf(" %s", &input[0]);
    scanf(" %s", &input[0]);

    printf("Kata ke - 1 = %s\n", input[0]);
    printf("Kata ke - 2 = %s\n", input[1]);
    printf("Kata ke - 3 = %s\n", input[2]);
    printf("Kata ke - 4 = %s\n", input[3]);
    printf("Kata ke - 5 = %s\n", input[4]);

    return 0;
}