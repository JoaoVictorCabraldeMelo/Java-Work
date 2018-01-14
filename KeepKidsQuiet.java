import java.util.Scanner;

public class KeepKidsQuiet {

	public static void main (String args []) {
		
		Scanner myscanner = new Scanner(System.in);
	
		int gumballs;
		int kids;
		int gumballsPerKid;
		
		boolean eachkidsgetTen;
		
		//gumballs = 30;
		
		//kids = 4;
		
		System.out.print("How many gumballs? How many kids ?");
		
		gumballs = myscanner.nextInt();
		kids = myscanner.nextInt();
		
		gumballsPerKid = gumballs / kids ;
		
		eachkidsgetTen = gumballsPerKid >= 10;
		
		
		System.out.print("Each kid gets ");
		System.out.print(gumballsPerKid);
		System.out.println(" gumballs");
		System.out.println("Each kid gets ten ?");
		System.out.print(eachkidsgetTen);
		
		myscanner.close();
		
	}
}
