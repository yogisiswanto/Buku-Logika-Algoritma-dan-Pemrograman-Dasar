import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		int [] arrayInteger = new int[5];
		int penghitung = 0;
		int banyak = 0;

		Scanner sc = new Scanner(System.in);

		for (penghitung = 0; penghitung < 5; penghitung++)
		{
			System.out.println("Masukan angka:\n");

			try{

				arrayInteger[penghitung] = sc.nextInt();

			}catch(Exception e){

			}

			System.out.println();
		}

		banyak = 0;

		for (penghitung = 0; penghitung < 5; penghitung++)
		{
			if (arrayInteger[penghitung] % 2 == 1)
			{
				banyak++;
			}
		}

		System.out.println(maksimal);

	}
}