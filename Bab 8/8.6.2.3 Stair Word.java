import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		String[] string = new String[10];
		int baris = 0, kolom = 0, spasi = 0;

		Scanner sc = new Scanner(System.in);

		for (baris = 0; baris < 9; baris++) {

			System.out.println("Masukan angka:");

			try{

				string[baris] = sc.next();

			}catch(Exception e){

			}
		}

		for (baris = 0; baris < 9; baris++)
		{
			for (kolom = 0; kolom < spasi; kolom++)
			{
				System.out.print(" ");
			}

			System.out.println(string[baris]);

			spasi = spasi + string[baris].length();
		}
	}
}