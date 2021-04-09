import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		String string = "";
		int penghitung = 0;
		int jumlah = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Masukan angka:\n");

		try{

			string = sc.next();

		}catch(Exception e){

		}

		jumlah = 0;

		for (penghitung = 0; penghitung < string.length(); penghitung++)
		{
			if ((string.chartAt(penghitung) == 'a') || (string.chartAt(penghitung) == 'i') || (string.chartAt(penghitung) == 'u') || (string.chartAt(penghitung) == 'e') || (string.chartAt(penghitung) == 'o'))
			{
				jumlah++;
			}
		}

		System.out.println(jumlah);
	}
}