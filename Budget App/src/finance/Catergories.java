package finance;


public class Catergories {

	
	  private String name;
	  private int perc;
	  private double amt;
	  public double TOTAL_INCOME;
	  
	  //Constructor 
	  public Catergories(String name, int perc, double TOTAL_INCOME){
	  		this.name = name;
	  		this.perc = perc;
	  		this.TOTAL_INCOME = TOTAL_INCOME;
	  		setAmt();
	  }//end Constructor
	  
	  public void setName(String name){
	  		this.name = name;
	  }//end setName
	  
	  public void setPerc(int perc){
	  		this.perc = perc;
	  }//end setPerc
	  
	  public void setTOTAL_AMOUNT(double TOTAL_INCOME){
	  		this.TOTAL_INCOME = TOTAL_INCOME;
	  }//end setTOTAL_COME
	  
	  private void setAmt(){
	  		amt = (perc / 100.0) * TOTAL_INCOME;
	  }//end setAmt
	  
	  public String getName(){
	  		return name;
	  }//end getName
	  
	  public int getPerc(){
	  		return perc;
	  }//end getPerc
	  
	  public double getAmt() {
		  return amt;
	  }//end getAmt
	  
	  public double getTOTAL_INCOME(){
	  		return TOTAL_INCOME;
	  }//end getTOTAL_INCOME
	
}//end class



