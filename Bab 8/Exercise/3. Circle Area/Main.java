import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		int r = 0;
		
		Circle circle = new Circle();

		Scanner sc = new Scanner(System.in);

		try{

			r = sc.nextInt();

		}catch(Exception e){

		}

		circle.setR(r);

		System.out.println(circle.getArea());

	}
}