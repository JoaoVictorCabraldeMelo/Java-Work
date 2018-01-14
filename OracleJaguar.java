import java.util.Scanner;
import java.util.Random;
import static java.lang.System.out;


public class OracleJaguar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int randnumber;
		
		System.out.println("Pergunte sua duvida, meu gafanhoto: ");
		
		scan.nextLine();
		
		randnumber  = rand.nextInt(10) + 1;
		
		switch(randnumber) {
		
				case 1 :
					out.println("Sim.Nao esta na cara?");
					break;
					
				case 2 :
					out.println("Nao, e nao me pergunte novamente ");
					break;
					
				case 3:
					out.println("Claro, e ta muito facil viu");
					break;
				
				case 4:
					out.println("Não mas ta quase la viu");
					break;
				
				case 5:
					out.println("Sim, porem voce vai ter que se esforçar muito");
					break;
				
				case 6:
					out.println("Não , por que voce ta me perguntando");
					break;
				
				case 7:
					out.println("Sim, mas voce quer um cha ?");
					break;
					
				case 8:
					out.println("Não, nem quando o mundo acabar");
					break;
				
				case 9:
					out.println("Sim, aceita cafe ?");
					break;
					
				case 10:
					out.println("Não, mas tem coisa melhor por ai");
					break;
					
				default:
					out.println("Chewie i think we have a problem my rng is bugged");
					break;
					
			
			
		}
		
		out.println("Tchauzinho ^^");
		
		scan.close();
		
		

	}

}
