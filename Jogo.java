import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class Jogo {
	
	enum Vencedor{fla,cor,empate};
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(in);
		
		int flamengo, corinthians;

		
		Vencedor quem;
		
		
		
		out.println("Flamengo contra Corinthians placar ? ");
		
		flamengo = scan.nextInt();
		corinthians = scan.nextInt();
		
		out.println();
		
		if (flamengo > corinthians ) {
			quem = Vencedor.fla;
			out.println("O Mengao venceu!!!");
		}
		else if(corinthians > flamengo) {
			quem = Vencedor.cor;
			out.println("A fiel venceu!!!");
		}
		else {
			quem = Vencedor.empate;
			out.println("Foi empate!!!");
		}
		
		
		if(quem == Vencedor.fla) {
			out.println("O mais querido ganhou!!!");
		}
		else if (quem == Vencedor.cor) {
			out.println("Aqui e um bando de loucos por ti corinthians!!!!");
		}
		else {
			out.println("Ixi o jogo vai pros penaltis!!!!!!!!!!");
		}
		
		scan.close();

	}

}
