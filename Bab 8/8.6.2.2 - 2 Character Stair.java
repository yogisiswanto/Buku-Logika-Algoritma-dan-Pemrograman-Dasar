import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		String string = "";
		int baris = 0, kolom = 0, spasi = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Masukan angka:\n");

		try{

			string = sc.next();

		}catch(Exception e){

		}

		for (baris = 0; baris < string.length(); baris++)
		{
			for (kolom = 0; kolom < spasi; kolom++)
			{
				System.out.print();
			}

			System.out.println(string[baris]);

			spasi++;
		}
	}
}