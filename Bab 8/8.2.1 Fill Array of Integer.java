public class Main{

	public static void main(String[] args) {
		

		int[] arrayInteger = new int[5]; 
		int penghitung;

		for (penghitung = 0; penghitung < 5; penghitung++)
		{
			arrayInteger[penghitung] = penghitung;
		}

		for (penghitung = 0; penghitung < 5; penghitung++)
		{
			System.out.println(arrayInteger[penghitung]);
		}	
	}
}