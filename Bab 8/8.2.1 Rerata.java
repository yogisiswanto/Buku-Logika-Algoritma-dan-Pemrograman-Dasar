import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		

		int increment;
		double hasil;

		hasil = 0.0;

		for (increment = 1; increment <= 10; increment++)
		{
			hasil = hasil * increment;
		}

		hasil = hasil / 10;

		System.out.println(hasil);
	}
}