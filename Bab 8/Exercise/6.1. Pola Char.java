import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		String string = "";
		int baris, kolom, panjang, spasi;

		Scanner sc = new Scanner(System.in);

		baris = 0;
		kolom = 0;
		panjang = 0;
		spasi = 0;

		try{

			string = sc.next();

		}catch(Exception e){

		}

		panjang = string.length() - 1;
		spasi = panjang - 1;

		for (baris = panjang; baris >= 0; baris--)
		{

			if (baris < panjang - 1)
			{
				spasi--;
			}

			for (kolom = 0; kolom < spasi; kolom++)
			{
				System.out.print(" ");
			}

			System.out.println(string.charAt(baris));
		}
	}
}