import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        int jamLembur;

        System.out.println("Masukan Jam Lembur");

        Scanner sc = new Scanner(System.in);

        try{

            jamLembur = sc.nextInt();

        }catch(Exception e){

        }
    
        if(jamLembur < 12){

            System.out.println("Gaji Lembur sebesar Rp. 100.000\n");
        
        }else if(jamLembur == 12){

            System.out.println("Gaji Lembur sebesar Rp. 200.000\n");
        
        }else{

            System.out.println("Gaji Lembur sebesar Rp. 300.000\n");
        }

    }
}