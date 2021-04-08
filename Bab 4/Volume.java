import java.util.Scanner;

public class Main{

    public static void main(String[] args){

    int p;
    int l;
    int t;
    int v;

    System.out.println("Masukan panjang, lebar, tinggi lalu tekan enter untuk setiap angka");

    Scanner sc = new Scanner(System.in);

    try{
        
        p = sc.nextInt();
        l = sc.nextInt();
        t = sc.nextInt();
    
    }catch(Exception e){

    }

    v = p * l * t;
    
    System.out.println(v);

    }
}