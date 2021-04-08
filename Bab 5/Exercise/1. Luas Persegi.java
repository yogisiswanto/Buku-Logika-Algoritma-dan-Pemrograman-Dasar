import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        int luas, panjang, lebar;

        System.out.println("Masukan dua angka satu persatu, tekan enter setiap selesai memasukkan");

        Scanner sc = new Scanner(System.in);

        try{
            
            panjang = sc.nextInt();
            lebar = sc.nextInt();
        
        }catch(Exception e){

        }

        luas = panjang * lebar;
        
        System.out.println("Luas Persegi = " + luas);

    }
}