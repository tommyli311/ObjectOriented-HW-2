//package declaration
package edu.albany.hw2.stock;

//stock class
public class Stock {
 
//enum declaration for the names of the stock
  public enum Symbol{
	  
	  MSFT,T,AMZN,GOOGL,APPL;
	 
	  // string declaration for name of stock
	  public String stockName;
	  
	  //getters and setters for the name of stock
      public void setStockName(String a) {
          this.stockName = a;
      }
      
      public String getStockName() {
          return stockName;
	 
   }
}
Symbol symbol;

double previousClosingPrice;// closing price of stock
double currentPrice;// current price of the stock

//constructor that creates a stock with specified symbol and name
public Stock(Symbol symbol){
	this.symbol= symbol;
	
}

//method that gets the previous closing price of stock
public double getPreviousClosingPrice(){
	
	return previousClosingPrice;
	
}

//method that sets the previous closing price of stock
public void setPreviousClosingPrice(double a){
	 this.previousClosingPrice=a;
}

//method that gets the current closing price of stock
public double getCurrentPrice(){
	
	return currentPrice;
}

//method that sets the current closing price of stock
public void setCurrentPrice(double a){
	this.currentPrice=a;
}

//method that returns the percentage change in a stock value
public double getChangePercent(){
	
	return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
}

//main method
public static void main(String[] args) {

	/*object created to reference Microsoft stock symbol from enum, gets the previous and current price and 
    return the percentage change in value.*/
    Stock stockName = new Stock(Symbol.MSFT);

    stockName.setPreviousClosingPrice(58.9);
    stockName.setCurrentPrice(59);
    System.out.println("Percentage of price change for Microsoft stock is : "
            + stockName.getChangePercent());
    
    /*object created to reference Apple stock symbol from enum, gets the previous and current price and 
    return the percentage change in value.*/
    Stock stock2 = new Stock(Symbol.APPL);

    stock2.setPreviousClosingPrice(104.5);
    stock2.setCurrentPrice(107.5);
    System.out.println("Percentage of price change for Apple stock is : "
            + stock2.getChangePercent());
}
}
