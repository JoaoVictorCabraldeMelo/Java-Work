import java.util.Random;


public class Oferta {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int number = rand.nextInt(10) + 1;
		
		if (number == 7) {
			 System.out.println("Uma oferta pra voce!!! ");
		}
		
		System.out.println(number);
		

	}

}
