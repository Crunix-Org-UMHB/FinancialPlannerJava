package finance;

import java.util.ArrayList;
import java.util.Scanner;
//To test the new Dev on github branch
public class BudgetApp {
	//Variables 
		static Scanner input = new Scanner(System.in);
		public static double TOTAL_INCOME;
		static ArrayList<Catergories> objs = new ArrayList<Catergories>();
		static String name;
		static int perc;
		
		//Create the Categories object
		public static Catergories category(String name, int perc, double TOTAL_INCOME) {
			Catergories budgetObj = new Catergories(name, perc, TOTAL_INCOME);
			return budgetObj;
		}//end category()
		
		//Collects the parameters need category()
		public static void createCatergory() {
			System.out.print("Enter budget catergory name: ");
			name = input.next();
			System.out.print("\nEnter the percentage: ");
			perc = input.nextInt();
			System.out.print("Enter your total income: ");
			TOTAL_INCOME = input.nextDouble();
			objs.add(category(name, perc, TOTAL_INCOME));
		}//end createCategory()
		
		public static void main(String[] args) {
			System.out.print("How many categories? ");
			int numCat = input.nextInt();
			
			for(int i = 0; i < numCat; i++) {
				createCatergory();
			}//end for
			for(int i = 0; i < numCat; i++) {
				Catergories get = objs.get(i);
				System.out.println(get.getName());
				System.out.println(get.getPerc());
				System.out.println(get.getAmt());
			}//end for
			
			
		
		}//end main()

}//end class BudgetApp

