import java.util.Random;
import static java.lang.System.out;

public class VinteUm {

	public static void main(String[] args) {
	
		Random rand = new Random();	
		int total = 0, card;
		
		while(total < 21) {
			
			card = rand.nextInt(10) + 1;
			
			total += card;
			
			out.println("Card " + card + " Total " + total);
		}
		
		if(total == 21) {
			out.println("Voce venceu :P");
		}
		else {
			out.println("Voce perdeu ;-;");
		}
		
		
	}

}
