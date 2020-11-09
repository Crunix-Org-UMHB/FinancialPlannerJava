package finance;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Catergories {
	HashMap<String, Double>budgAmt = new HashMap<String, Double>();
	HashMap<String, Integer> budgPerc = new HashMap<String, Integer>();
	ArrayList<String> cats = new ArrayList<String>();
	public double TOTAL_INCOME;
	public Catergories(ArrayList<String> names, ArrayList<Integer> perc, int totalInc) {
		TOTAL_INCOME = totalInc;

		for(int i = 0; i < names.size(); i++) {
			budgPerc.put(names.get(i), perc.get(i)); //Map the category to its budget percentage
			budgAmt.put(names.get(i), (TOTAL_INCOME * (perc.get(i) / 100))); //Compute the budget amount
			cats.add(names.get(i)); //Add the names for easy access
		}//end for loop 
		
	}//end Catergories()
	
	//Compute the budget amounts from the percents
	public void compute() {
		//For each category, compute new budget amount
		for(int i = 0; i < cats.size(); i++) {
			budgAmt.put(cats.get(i), (TOTAL_INCOME * (budgPerc.get(cats.get(i)) /100))); 
		}//end for loop
	}//end compute()
	
}//end class
