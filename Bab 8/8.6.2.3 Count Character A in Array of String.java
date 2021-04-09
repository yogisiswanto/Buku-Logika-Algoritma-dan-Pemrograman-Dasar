import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		String[] string = new String[10];
		int penghitung = 0, huruf = 0, jumlah = 0;

		Scanner sc = new Scanner(System.in);

		for (penghitung = 0; penghitung < 10; penghitung++) {

			System.out.println("Masukan angka:\n");

			try{

				string[penghitung] = sc.next();

			}catch(Exception e){

			}
		}

		for (penghitung = 0; penghitung < 10; penghitung++)
		{
			for (huruf = 0; huruf < string[penghitung].length(); huruf++)
			{
				if ((string[penghitung].chartAt(huruf) == 'A') || (string[penghitung].chartAt(huruf) == 'a'))
				{
					jumlah++;
				}
			}
		}

		System.out.println(jumlah);
	}
}