import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		int [] arrayInteger = new int[5];
		int penghitung = 0;
		int maksimal = 0;

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

		maksimal = arrayInteger[0];

		for (penghitung = 1; penghitung < 5; penghitung++)
		{
			if (arrayInteger[penghitung] > maksimal)
			{
				maksimal = arrayInteger[penghitung];
			}
		}

		System.out.println(maksimal);

	}
}