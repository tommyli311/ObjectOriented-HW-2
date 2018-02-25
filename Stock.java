package edu.albany.hw2.stock;

public class Stock {
	
  public enum Symbol{
	  
	  MSFT,T,AMZN,GOOGL,APPL
  }
  
  SymbolName symbol;
  
  double previousClosingPrice;
  double currentPrice;

}

//constructor used to set 
public Stock(SymbolName){
	this.symbol= symbolName;
	
}

public void getPreviousClosingPrice(){
	
	return previousClosingPrice;
	
}

public void setPreviousClosingPrice(double a){
	 this.previousClosingPrice=a;
}

public void getCurrentPrice(){
	
	returnCurrentPrice;
}

public void setCurrentPrice(double a){
	this.currentPrice=a;
}

public void getChangePercent(){
	
}

