#include <stdio.h>

typedef struct{
    int x;
    int y;
}Titik;

int main(){

    Titik A;
    Titik B;
    Titik C;

    // 1st Point
    A.x = -3;
    A.y = 1;

    // 2st Point
    B.x = 5;
    B.y = 1;

    // 3st Point
    C.x = 1;
    C.y = 8;

    return 0;
}