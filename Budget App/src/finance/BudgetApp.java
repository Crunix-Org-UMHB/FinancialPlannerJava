package finance;

import java.util.Scanner;

public class BudgetApp {
	static Scanner input = new Scanner(System.in);
	//Budget Catagories
	public static double TOTAL_INCOME;
	public static double SAVINGS;
	public static double DINING_DRINKS;
	public static double GROCERIES;
	public static double AUTO_TRANSPORT;
	public static double BILLS;
	public static double OTHER;
	
	//Catagory percentages
	public static double TIP;
	public static double SP;
	public static double DDP;
	public static double GP;
	public static double ATP;
	public static double BP;
	public static double OP;
	
	public static void setIncome() {
		TOTAL_INCOME = input.nextDouble();
	}
	
	public static void setPerc() {
		SP = input.nextInt() / 100;
		DDP = input.nextInt() / 100;
		GP = input.nextInt() / 100;
		ATP = input.nextInt() / 100;
		BP = input.nextInt() / 100;
		OP = input.nextInt() / 100;
	}
	
	public void calcBudgt() {
		SAVINGS = SP * TOTAL_INCOME;
		DINING_DRINKS = DDP * TOTAL_INCOME;
		GROCERIES = GP * TOTAL_INCOME;
		AUTO_TRANSPORT = ATP * TOTAL_INCOME;
		BILLS = BP * TOTAL_INCOME;
		OTHER = OP * TOTAL_INCOME;
	}
	public static void main(String[] args) {

	}

}
