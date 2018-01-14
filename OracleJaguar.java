import java.util.Scanner;
import java.util.Random;


public class OracleJaguar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int randnumber;
		
		System.out.println("Pergunte sua duvida, meu gafanhoto: ");
		
		scan.nextLine();
		
		randnumber  = rand.nextInt(10) + 1;
		
		if(randnumber > 5) {
			System.out.println("Sim . Não esta na cara?");
		} 
		else {
			System.out.println("Não, me desculpe");
		}
		
		scan.close();
		
		

	}

}
