import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		String[] string = new String[10];
		int banyak, baris, kolom;

		Scanner sc = new Scanner(System.in);

		banyak = 0;
		baris = 0;
		kolom = 0;

		try{

			banyak = sc.nextInt();

		}catch(Exception e){

		}

		for (baris = 0; baris < banyak; baris++) {

			try{

				string[baris] = sc.next();

			}catch(Exception e){

			}
		}

		for (baris = 0; baris < banyak; baris++)
		{

			if ((string[baris].charAt(0) == 'A') || (string[baris].charAt(0) == 'a'))
			{
				
				for (kolom = string[baris].length() - 1; kolom >= 0; kolom--)
				{
					System.out.print(string[baris].charAt(kolom));
				}

				System.out.println();
			
			}

			else if ((string[baris].charAt(0) == 'I') || (string[baris].charAt(0) == 'i'))
			{
				int length = 0;
				int start = 0;
				int middle = 0;

				length = string[baris].length();

				if (length % 2 == 0)
				{
					start = (length / 2) - 1;
					middle = length / 2;
				}

				else{
					start = length / 2;
					middle = (length / 2) + 1;
				}

				for (kolom = start; kolom >= 0; kolom--)
				{
					System.out.print(string[baris].charAt(kolom));
				}

				for (kolom = middle; kolom < length; kolom++)
				{
					System.out.print(string[baris].charAt(kolom));
				}

				System.out.println();
			}

			else if ((string[baris].charAt(0) == 'U') || (string[baris].charAt(0) == 'u'))
			{
				for (kolom = string[baris].length() - 1; kolom >= 0; kolom--)
				{
					System.out.print(string[baris].charAt(kolom));
				}

				System.out.println();
			}

			else{
				
				System.out.println(string[baris]);
			}	
		}
	}
}