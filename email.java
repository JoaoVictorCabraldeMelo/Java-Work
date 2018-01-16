import java.util.Scanner;

public class email {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char symbol;
		
		System.out.println("Digite seu email :");
		
		symbol = scan.findWithinHorizon(".", 0).charAt(0);
		
		while(symbol != '@') {
			
			System.out.print(symbol);
			symbol = scan.findWithinHorizon(".", 0).charAt(0);
			
		}
		
		System.out.println();
		
		scan.close();
	}

}
