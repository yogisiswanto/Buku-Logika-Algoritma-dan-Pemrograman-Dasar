#include <stdio.h>

int main(){

    char input[5];

    printf("Masukan lima buah karakter satu persatu, lalu tekan enter\n");

    scanf("%c", &input[0]);
    scanf("%c", &input[1]);
    scanf("%c", &input[2]);
    scanf("%c", &input[3]);
    scanf("%c", &input[4]);

    printf("Karakter ke 1 = %c\n", input[0]);
    printf("Karakter ke 2 = %c\n", input[1]);
    printf("Karakter ke 3 = %c\n", input[2]);
    printf("Karakter ke 4 = %c\n", input[3]);
    printf("Karakter ke 5 = %c\n", input[4]);

    return 0;
}