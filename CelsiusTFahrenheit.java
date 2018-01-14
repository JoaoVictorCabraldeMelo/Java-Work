import java.util.Scanner;


public class CelsiusTFahrenheit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double celsius,fh;
		
		System.out.println("Enter the Celsius Temperutare :");
		
		celsius = scan.nextDouble();
		
		fh = 9.0/5.0 * celsius + 32.0 ;
		
		System.out.println("Room Temperature ?");
		
		System.out.println(fh);
		
		System.out.println(fh == 69.8);
		
		scan.close();
		
		

	}

}
