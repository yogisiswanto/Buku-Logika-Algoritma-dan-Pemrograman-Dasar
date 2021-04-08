#include <stdio.h>

int main(){

    int a, b, c, tanda;

    printf("Masukan 3 angka lalu tekan enter setiap setelah memasukan 1 huruf\n");

    scanf("%d", &a);
    scanf("%d", &b);
    scanf("%d", &c);

    tanda = 0;

    // Periksa angka
    if((a > 999) && (a < 10000)){

        if((b > 999) && (b < 10000)){

            if((c > 999) && (c < 10000)){
            
                tanda = 1;
            }
        }  
    }

    if(tanda == 1){

        printf("Semua angka masukan adalah ribuan\n");
    
    }else{

        prinft("Tidak semua angka masukan adalah ribuan\n");
    }
    return 0;
}