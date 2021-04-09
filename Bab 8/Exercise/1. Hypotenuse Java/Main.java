import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		int x = 0, y = 0;
		
		Triangle segitiga = new Triangle();

		Scanner sc = new Scanner(System.in);

		try{

			x = sc.nextInt();
			y = sc.nextInt();

		}catch(Exception e){

		}

		segitiga.setX(x);
		segitiga.setY(y);

		System.out.println(segitiga.getR());

	}
}