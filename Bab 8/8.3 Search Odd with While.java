import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		

		int penghitung;
		int[] arrayInteger = new int[5];
		boolean ketemu = false;

		Scanner sc = new Scanner(System.in);

		for (penghitung = 0; penghitung < 5; penghitung++)
		{
			System.out.println("Masukan angka:");

			try{

				arrayInteger[penghitung] = sc.nextInt();

			}catch(Exception e){

			}
		}

		penghitung = 0;

		while((ketemu == false) && (penghitung < 5)){

			if (arrayInteger[penghitung] % 2 == 1)
			{
			
				ketemu = true;
			
			}else{

				penghitung = penghitung + 1;
			}
		}

		if (ketemu == false)
		{
			
			System.out.println("tidak ada angka ganjil");
		
		}else{

			System.out.println("ada angka ganjil");
		}
	}
}