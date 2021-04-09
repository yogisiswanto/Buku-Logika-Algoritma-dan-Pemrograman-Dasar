import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		

		int fak_berapa, penghitung, hasil_faktorial;

		hasil_faktorial = 1;

		System.out.println("Masukan angka faktorial yang akan dihitung:");

		Scanner sc = new Scanner(System.in);

		try{

			fak_berapa = sc.nextInt();

		}catch(Exception e){

		}


		for (penghitung = 2; penghitung <= fak_berapa; penghitung++)
		{
			hasil_faktorial = hasil_faktorial * penghitung;
		}

		System.out.println("Hasil Faktorial = " + hasil_faktorial);
	}
}