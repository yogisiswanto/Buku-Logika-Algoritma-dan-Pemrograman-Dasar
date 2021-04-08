#include <stdio.h>

int main(){

    char a, b, c;
    int tanda;

    printf("Masukan 3 huruf lalu tekan enter setiap setelah memasukan 1 huruf\n");

    scanf("%c", &a);
    scanf("%c", &b);
    scanf("%c", &c);

    tanda = 0;

    // Periksa konsonan
    if((a != 'a') && (a != 'i') && (a != 'u') && (a != 'e') && (a != 'o')){

        if((b != 'a') || (b != 'i') || (b != 'u') || (b != 'e') || (b != 'o')){

            if((c != 'a') && (c != 'i') && (c != 'u') && (c != 'e') && (c != 'o')){
            
                tanda = 1;
            }
        }  
    }

    if(tanda == 1){

        printf("Konsonan-Vokal-Konsonan\n");
    
    }else{

        prinft("Bukan Konsonan-Vokal-Konsonan\n");
    }
    return 0;
}