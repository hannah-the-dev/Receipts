package receiptsSep;

import java.util.Scanner;

public class Receipt3Main {		//emart  full: %34s

	public static void main(String[] args) {
		Receipt3HeaderFooter hf = new Receipt3HeaderFooter();
		Receipt3Items items = new Receipt3Items();
		Receipt3Amount amount = new Receipt3Amount();
		Receipt3Pay pay = new Receipt3Pay();
		
		Scanner sc = new Scanner(System.in);
		int numberOfItems = sc.nextInt();
		
		hf.printHeader();
		
		int[] calBase = items.printItems(numberOfItems);
		int k21_dutyFree = calBase[1];
		int k21_duty = calBase[2];
		
		amount.printAmount(k21_dutyFree, k21_duty, numberOfItems);

		pay.printPayInfo(k21_dutyFree, k21_duty);
		pay.printPoints(k21_dutyFree, k21_duty);
		
		hf.printFooter();
	}
}