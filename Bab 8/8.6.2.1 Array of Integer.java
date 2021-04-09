import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		int banyak = 0;

		System.out.println("Masukan banyaknya angka:");

		Scanner sc = new Scanner(System.in);

		try{

			banyak = sc.nextInt();

		}catch(Exception e){

		}

		int [] arrayInteger = new int[banyak];
		int penghitung = 0;

		for (penghitung = 0; penghitung < banyak; penghitung++)
		{
			System.out.println("Masukan angka:\n");

			try{

				arrayInteger[penghitung] = sc.nextInt();

			}catch(Exception e){

			}

			System.out.println();
		}

		for (penghitung = 0; penghitung < banyak; penghitung++)
		{
			
			System.out.println(arrayInteger[penghitung]);
		}

	}
}