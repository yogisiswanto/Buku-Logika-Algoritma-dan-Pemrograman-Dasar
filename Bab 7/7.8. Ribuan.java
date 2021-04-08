import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        int a, b, c;
        boolean tanda;

        System.out.println("Masukan 3 angka lalu tekan enter setiap setelah memasukan 1 huruf");

        Scanner sc = new Scanner(System.in);

        try{

            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
    
        }catch(Exception e){
        }

        tanda = false;

        // Periksa konsonan
        if((a > 999) && (a < 10000)){

            if((b > 999) && (b < 10000)){

                if((c > 999) && (c < 10000)){
                    
                    tanda = true;
                }
            }  
        }

    if(tanda == true){

        System.out.println("Semua angka masukan adalah ribuan");
    
    }else{

        System.out.println("Tidak semua angka masukan adalah ribuan");
    }
    }
}