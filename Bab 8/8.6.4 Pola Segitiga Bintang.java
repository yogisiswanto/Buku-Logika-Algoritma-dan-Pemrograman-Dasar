import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		int baris, kolom, bintang = 0;

		System.out.println("Masukan banyaknya bintang:");

		Scanner sc = new Scanner(System.in);

		try{

			bintang = sc.nextInt();

		}catch(Exception e){

		}

		for (baris = 0; baris < (bintang / 2); baris++)
		{
			
			for (kolom = 0; kolom < baris; kolom++)
			{
				
				System.out.print(" ");
			}

			for (kolom = 0; kolom < bintang; kolom++)
			{
				
				System.out.print("*");
			}
			
			System.out.println();
		}

		if (bintang % 2 == 1)
		{
			
			for (kolom = 0; kolom < (bintang / 2); kolom++)
			{
				System.out.print(" ");
			}

			for (kolom = 0; kolom < bintang; kolom++)
			{
				
				System.out.print("*");
			}

			System.out.println();
		}

		for (baris = 0; baris < (bintang / 2); baris++)
		{
			
			for (kolom = ((bintang / 2) - baris); kolom > 1; kolom--)
			{
				
				System.out.print(" ");
			}

			for (kolom = 0; kolom < bintang; kolom++)
			{
				
				System.out.print("*");
			}
			
			System.out.println();
		}

	}
}