import java.util.Scanner;

import  static java.lang.System.in;
import static java.lang.System.out;

public class Ingresso {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(in);
		
		int age;
		double price = 0.00;
		
		char reply;
		
		boolean isKid, isOld, WithCoupon, NoCoupon;
		
		out.println("Qual sua idade ? ");
		
		age = scan.nextInt();
		
		out.println("Tem cupom de desconto ? Y ou N");
		
		reply = scan.findWithinHorizon(".", 0).charAt(0);
		
		isKid = age < 12;
		isOld = age  >= 65;
		WithCoupon = reply == 'Y' || reply =='y';
		NoCoupon = reply == 'N'|| reply == 'n';
		
		if(!isKid && !isOld) {
			
			price = 9.25;
		}
		
		else if(isKid || isOld) {
			
			price = 5.25;
		}
		
		if(WithCoupon) {
			
			price -= 2.00;
			
		}
		else if(!WithCoupon && !NoCoupon) {
			
			out.println("Hein ???");
			
		}
		
		
		out.print("Por favor pague $ " + price + " .Divirta-se com o show!!!");
		
		scan.close();

	}

}
