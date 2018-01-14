import java.util.Scanner;

public class SnitSoft {

	public static void main(String[] args) {

		Scanner price = new Scanner(System.in);

		Double amount;

		System.out.print("What's the price for the CD-ROM ?");

		amount = price.nextDouble();

		amount = amount + 25.00;

		System.out.print("We will bill $");
		System.out.print(amount);
		System.out.println(" to your credit card");

		price.close();

	}

}
