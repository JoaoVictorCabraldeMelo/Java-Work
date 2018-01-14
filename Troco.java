import java.util.Scanner;

public class Troco {
	
	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
		
		int quarters, dimes, nickels, cents;
		int WhatsLeft, total;
		
		System.out.print("How many cents you have ?");
		
		total = scan.nextInt();
		
		quarters = total / 25;
		WhatsLeft = total % 25;
		
		dimes = WhatsLeft / 10;
		WhatsLeft = WhatsLeft % 10;
		
		nickels = WhatsLeft / 5;
		WhatsLeft = WhatsLeft % 5;
		
		cents = WhatsLeft;
		
		System.out.println();
		System.out.println("From "+ total +" cents you get");
		System.out.println(quarters + "quarters");
		System.out.println(dimes + "dimes");
		System.out.println(nickels + "nickels");
		System.out.println(cents + "cent");
		
		scan.close();
	}

}
