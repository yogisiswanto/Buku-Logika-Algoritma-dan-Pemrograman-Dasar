import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        int alas;
        int atas;
        int tinggi;
        int luas;

        System.out.println("Masukan sisi alas, sisi atas, tinggi satu persatu, lalu tekan enter");

        Scanner sc = new Scanner(System.in);

        try{
            
            alas = sc.nextInt();
            atas = sc.nextInt();
            tinggi = sc.nextInt();
        
        }catch(Exception e){

        }

        luas = 0.5 * (alas + atas) * tinggi;
        
        System.out.println(luas);

    }
}