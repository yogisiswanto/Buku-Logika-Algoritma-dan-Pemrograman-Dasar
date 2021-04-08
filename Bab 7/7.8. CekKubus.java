import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        int sisiPertama, sisiKedua, sisiKetiga;

        System.out.println("Masukan ketiga sisi");

        Scanner sc = new Scanner(System.in);

        try{

            sisiPertama = sc.nextInt();
            sisiKedua = sc.nextInt();
            sisiKetiga = sc.nextInt();

        }catch(Exception e){

        }

        if((sisiPertama == sisiKedua) && (sisiKedua == sisiKetiga)){

            System.out.println("Termasuk kubus");
    
        }else{

            System.out.println("Bukan termasuk kubus");
        }
    }
}