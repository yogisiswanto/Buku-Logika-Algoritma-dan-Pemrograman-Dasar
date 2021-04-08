import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        int a;
        int b;
        int c;
        int d;

        System.out.println("Masukan tiga angka satu persatu, tekan enter setiap selesai memasukkan");

        Scanner sc = new Scanner(System.in);

        try{
            
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        
        }catch(Exception e){

        }

        d = a + b + c;
        
        System.out.println(d);

    }
}