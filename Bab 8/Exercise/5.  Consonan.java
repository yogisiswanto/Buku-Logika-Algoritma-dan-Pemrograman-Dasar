import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		char[] character = new char[10];
		int banyak, baris;

		Scanner sc = new Scanner(System.in);

		banyak = 0;
		baris = 0;

		try{

			banyak = sc.nextInt();

		}catch(Exception e){

		}

		for (baris = 0; baris < banyak; baris++) {

			try{

				character[baris] = sc.next().charAt(0);

			}catch(Exception e){

			}
		}

		for (baris = 0; baris < banyak; baris++)
		{
			if ((character[baris] != 'A') && (character[baris] != 'a') &&
				(character[baris] != 'I') && (character[baris] != 'i') &&
				(character[baris] != 'U') && (character[baris] != 'u') &&
				(character[baris] != 'E') && (character[baris] != 'e') &&
				(character[baris] != 'O') && (character[baris] != 'o'))
			{
				System.out.println(character[baris]);
			}
		}
	}
}