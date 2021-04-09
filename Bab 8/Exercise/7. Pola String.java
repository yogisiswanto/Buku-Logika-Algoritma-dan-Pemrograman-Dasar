import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		String[] string = new String[99];
		int banyak, baris, kolom, panjang;

		Scanner sc = new Scanner(System.in);

		banyak = 0;
		baris = 0;
		kolom = 0;
		panjang = 0;

		try{

			banyak = sc.nextInt();

		}catch(Exception e){

		}

		for (baris = 0; baris < banyak; baris++) {

			try{

				string[baris] = sc.next();

			}catch(Exception e){

			}

			if (panjang < string[baris].length())
			{
				panjang = string[baris].length();
			}
		}

		for (baris = 0; baris < panjang; baris++)
		{
			for (kolom = 0; kolom < banyak; kolom++)
			{
				if (baris < string[kolom].length()) {
				
					if (kolom == banyak - 1)
					{
						System.out.print(string[kolom].charAt(baris));
					}

					else{		

						System.out.print(string[kolom].charAt(baris) + " ");
					}		

				}else{

					System.out.print("  ");
				}			
			}

			System.out.println();
		}
	}
}