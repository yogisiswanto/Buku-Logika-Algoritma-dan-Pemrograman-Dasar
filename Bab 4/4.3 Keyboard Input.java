import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        int bilBulat;

        Scanner sc = new Scanner(System.in);

        try{
            
            bilBulat = sc.nextInt();
        
        }catch(Exception e){

        }

        System.out.println("bilangan bulat masukan adalah: " + bilBulat);
    }
}