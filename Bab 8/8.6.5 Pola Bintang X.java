import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		int baris, kolom, bintang = 0, batas, bagianBawah;

		System.out.println("Masukan banyaknya bintang:");

		Scanner sc = new Scanner(System.in);

		try{

			bintang = sc.nextInt();

		}catch(Exception e){

		}

		if (bintang % 2 == 0)
		{
			bagianBawah = bintang / 2;
			batas = bintang - 2;
		
		}else{

			bagianBawah = (bintang / 2) + 1;
			batas = bintang - 1;
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

			for (kolom = 0; kolom < (batas - (baris * 2)); kolom++)
			{
				
				System.out.print(" ");
			}

			for (kolom = 0; kolom < bintang; kolom++)
			{
				
				System.out.print("*");
			}
			
			System.out.println();
		}

		for (baris = 0; baris < bagianBawah; baris++)
		{
			
			for (kolom = bagianBawah - baris; kolom > 1; kolom--)
			{
				
				System.out.print(" ");
			}

			for (kolom = 0; kolom < bintang; kolom++)
			{
				
				System.out.print("*");
			}

			for (kolom = 0; kolom < (baris * 2); kolom++)
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