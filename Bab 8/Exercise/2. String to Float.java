import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		String string = "";
		int banyak, baris, kolom, before;
		float jumlah, temp, total;

		banyak = 0;
		total = 0;

		Scanner sc = new Scanner(System.in);

		try{

			banyak = sc.nextInt();

		}catch(Exception e){
		}

		for (baris = 0; baris < banyak; baris++) {

			try{

				string = sc.next();

			}catch(Exception e){
			}

			before = 0;
			jumlah = 0;
			kolom = 0;

			while((string.charAt(kolom) != '.') && (kolom < string.length())){

				if (string.charAt(kolom) == '1')
				{
					temp = 1;
				}

				else if (string.charAt(kolom) == '2')
				{
					temp = 2;
				}

				else if (string.charAt(kolom) == '3')
				{
					temp = 3;
				}

				else if (string.charAt(kolom) == '4')
				{
					temp = 4;
				}

				else if (string.charAt(kolom) == '5')
				{
					temp = 5;
				}

				else if (string.charAt(kolom) == '6')
				{
					temp = 6;
				}

				else if (string.charAt(kolom) == '7')
				{
					temp = 7;
				}

				else if (string.charAt(kolom) == '8')
				{
					temp = 8;
				}

				else if (string.charAt(kolom) == '9')
				{
					temp = 9;
				}

				else{
					temp = 0;
				}

				if (kolom == 1)
				{
					temp = temp * 10;
				}

				else if (kolom == 2)
				{
					temp = temp * 100;
				}

				jumlah = jumlah + temp;

				before++;
				kolom++;
			}

			temp = 0;

			for (kolom = before + 1; kolom < string.length(); kolom++)
			{
				
				if (string.charAt(kolom) == '1')
				{
					temp = 1;
				}

				else if (string.charAt(kolom) == '2')
				{
					temp = 2;
				}

				else if (string.charAt(kolom) == '3')
				{
					temp = 3;
				}

				else if (string.charAt(kolom) == '4')
				{
					temp = 4;
				}

				else if (string.charAt(kolom) == '5')
				{
					temp = 5;
				}

				else if (string.charAt(kolom) == '6')
				{
					temp = 6;
				}

				else if (string.charAt(kolom) == '7')
				{
					temp = 7;
				}

				else if (string.charAt(kolom) == '8')
				{
					temp = 8;
				}

				else if (string.charAt(kolom) == '9')
				{
					temp = 9;
				}

				else{
					temp = 0;
				}

				if (kolom == before + 1)
				{
					temp = temp / 10;
				}

				else if (kolom == before + 2)
				{
					temp = temp / 100;
				}

				jumlah = jumlah + temp;

			}

			total = total + jumlah;
		}

		System.out.println(total);
	}
}