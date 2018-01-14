import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class Jogo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(in);
		
		int flamengo, corinthians;
		
		out.println("Flamengo contra Corinthians placar ? ");
		
		flamengo = scan.nextInt();
		corinthians = scan.nextInt();
		
		out.println();
		
		if (flamengo > corinthians ) {
			out.print("Flamengo: ");
			out.println(flamengo);
			out.print("Corinthians: ");
			out.println(corinthians);
		}
		else {
			out.print("Corinthians:");
			out.println(corinthians);
			out.print("Flamengo:");
			out.print(flamengo);
		}
		
		scan.close();

	}

}
