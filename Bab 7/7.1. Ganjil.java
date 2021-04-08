import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        int bilangan = 0;

        System.out.println("masukkan bilangan:");

        Scanner sc = new Scanner(System.in);

        try{

            bilangan = sc.nextInt();
        
        }catch(Exception e){

            if(bilangan % 2 == 1){
                
                System.out.println("bilangan ganjil");
            }
        }
    }
}