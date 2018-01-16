
import static java.lang.System.out;
import java.util.Random;

public class DiceGame {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int dice1 = 0, dice2 = 0;
		
		while(dice1 + dice2 != 7 && dice1 + dice2 != 11) {
			
			dice1 = rand.nextInt(6) + 1;
			dice2 = rand.nextInt(7) + 1;
			
			out.print(dice1);
			out.print(" ");
			out.println(dice2);
		}
		
		out.print("Saiu ");
		out.println(dice1 + dice2);

	}

}
