import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		String[] string = new String[10];
		int penghitung = 0;

		Scanner sc = new Scanner(System.in);

		for (penghitung = 0; penghitung < 10; penghitung++) {

			System.out.println("Masukan angka:\n");

			try{

				string[penghitung] = sc.next();

			}catch(Exception e){

			}
		}

		for (penghitung = 0; penghitung < 10; penghitung++)
		{
			
			if ((string[penghitung].chartAt(0) == 'A') || (string[penghitung].chartAt(0) == 'a'))
			{
				System.out.println(string[penghitung]);
			}

		}
	}
}