#include <stdio.h>

int main(){

    char nilai;

    printf("Masukan karakter:\n");

    scanf("%c", &nilai);

    if((nilai == 'A') || (nilai == 'B') || (nilai == 'C')){

        printf("lulus\n");
    }

    return 0;
}