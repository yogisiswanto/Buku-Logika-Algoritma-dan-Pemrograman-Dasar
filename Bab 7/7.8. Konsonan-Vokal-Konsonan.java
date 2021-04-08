import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        char a, b, c;
        boolean tanda;

        System.out.println("Masukan 3 huruf lalu tekan enter setiap setelah memasukan 1 huruf");

        Scanner sc = new Scanner(System.in);

        try{

            a = sc.next().charAt(0);
            b = sc.next().charAt(0);
            c = sc.next().charAt(0);
    
        }catch(Exception e){
        }

        tanda = false;

        // Periksa konsonan
    if((a != 'a') && (a != 'i') && (a != 'u') && (a != 'e') && (a != 'o')){

        if((b != 'a') || (b != 'i') || (b != 'u') || (b != 'e') || (b != 'o')){

            if((c != 'a') && (c != 'i') && (c != 'u') && (c != 'e') && (c != 'o')){
            
                tanda = true;
            }
        }  
    }

    if(tanda == true){

        System.out.println("Konsonan-Vokal-Konsonan");
    
    }else{

        System.out.println("Bukan Konsonan-Vokal-Konsonan");
    }
    }
}