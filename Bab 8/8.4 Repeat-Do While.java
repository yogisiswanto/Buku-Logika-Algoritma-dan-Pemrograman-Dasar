import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		

		char jawaban;

		Scanner sc = new Scanner(System.in);

		do{
		
			System.out.println("Halo dunia!");

			System.out.println("Apakah anda ingin menampilkan lagi?");

			try{

				jawaban = sc.next().charAt(0);

			}catch(Exception e){

			}

		} while (jawaban == 'y');
	}
}