import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		

		int berapa_kali, hasil_jumlah, penghitung;

		hasil_jumlah = 0;

		System.out.println("masukan angka berapa kali akan diulang:");

		Scanner sc = new Scanner(System.in);

		try{

			berapa_kali = sc.nextInt();

		}catch(Exception e){

		}


		for (penghitung = 0; penghitung < berapa_kali; penghitung++)
		{
			hasil_jumlah = hasil_jumlah + penghitung;
		}

		System.out.println(hasil_jumlah);
	}
}