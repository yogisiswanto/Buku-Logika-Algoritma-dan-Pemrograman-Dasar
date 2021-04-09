import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		int penghitung, bintang;

		System.out.println("Masukan banyaknya bintang:");

		Scanner sc = new Scanner(System.in);

		try{

			bintang = sc.nextInt();

		}catch(Exception e){

		}

		for (penghitung = 0; penghitung < bintang; penghitung++)
		{
			
			System.out.println("*");
		}
	}
}