import java.util.Scanner;
public class CouponCalculatorLab5 {

	//Ma'laijah Garris
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many dollars would you like to spend on chocolate from the vending machine? ");
		int dollars = scanner.nextInt();
		
		if(dollars <= 0)
		{
			System.out.println("Invalid value for amount! Exiting the program!");
			scanner.close();
			return;
			
		}
		int totalBars = dollars;
		int coupons = dollars;
		
		while (coupons >= 6)
		{
			int freeBars = coupons / 6;
			totalBars += freeBars;
			coupons = coupons %6 + freeBars;
		}

		System.out.println("Total chocolate bars: " +totalBars);
		System.out.println("Coupons remaining: " +coupons);
	}

}
