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

		panjang =  string.length();
		spasi = panjang / 2;

		for (baris = 0; baris < spasi; baris++)
		{
			
			for (kolom = 0; kolom < baris; kolom++)
			{
				
				System.out.print(" ");
			}

			System.out.println(string.charAt(baris));
		}

		for (baris = spasi; baris < panjang; baris++)
		{
			
			for (kolom = 1; kolom < (panjang - baris); kolom++)
			{
				
				System.out.print(" ");
			}

			System.out.println(string.charAt(baris));
		}
	}
}