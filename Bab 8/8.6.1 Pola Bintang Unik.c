#include <stdio.h>

int main(){

    int bintang, baris, kolom, batas, bagianBawah;

    printf("Masukan jumlah bintang:\n");

    scanf("%d", &bintang);

    printf("\n");

    if(bintang % 2 == 0){

        bagianBawah = bintang / 2;
        batas = bintang - 2;

    }else{

        bagianBawah = (bintang / 2) + 1;
        batas = bintang - 1;
    }

    for(baris = 1; baris <= (bintang / 2); baris++){

        for(kolom = 1; kolom <= (baris - 1); kolom++)
        {            
            printf(" ");
        }

        for (kolom = 1; kolom <= bintang; kolom++)
        {            
            printf("*");
        }

        for (kolom = 1; kolom <= (batas - (baris - 1 ) * 2); kolom++)
        {            
            printf(" ");
        }

        for (kolom = 1; kolom <= bintang; kolom++)
        {            
            printf("*");
        }    

        printf("\n");            
        
    }

    for (baris = 0; baris <= bagianBawah; baris++)
    {
        
        for (kolom = (bintang / 2) - baris; kolom >= 0; kolom--)
        {
            printf("-");
        }
        
        for (kolom = 1; kolom <= bintang; kolom++)
        {            
            printf("*");
        } 

        for (kolom = 1; kolom <= (baris-1)*2; kolom++)
        {
            printf(" ");
        }            

        for (kolom = 1; kolom <= bintang; kolom++)
        {            
            printf("*");
        } 

        printf("\n");
    }

    return 0;
}