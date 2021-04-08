import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        int a;
        int t;
        int l;

        System.out.println("Masukan alas dan tinggi lalu tekan enter untuk setiap angka");

        Scanner sc = new Scanner(System.in);

        try{
            
            a = sc.nextInt();
            t = sc.nextInt();
        
        }catch(Exception e){

        }

        l = 0.5 * (float)a * (float)t;
        
        System.out.println(l);

    }
}