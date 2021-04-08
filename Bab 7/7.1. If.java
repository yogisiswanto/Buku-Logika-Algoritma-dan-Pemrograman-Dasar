import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        char nilai = '\0';

        System.out.println("masukkan karakter:");

        Scanner sc = new Scanner(System.in);

        try{

            nilai = sc.next().charAt(0);
        
        }catch(Exception e){

            if((nilai == 'A') || (nilai == 'B') || (nilai == 'C')){
                
                System.out.println("lulus");
            }
        }
    }
}