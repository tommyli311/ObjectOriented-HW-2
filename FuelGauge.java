package edu.albany.hw2.car;

public class FuelGauge {

double MaxNumOfGallons=15;// max amount of gas car can hold
double NumOfGallons;// number of gallons of gas
	
	//constructor, sets the initial amount of gas to zero gallons
	public FuelGauge(){
		NumOfGallons=0;
	}
	
	/*checks if the amount of gas is greater than the max 
	amount of gas, if it is the current amount of gas is equal
	to the maximum amount of gas*/
	
	public void FuelGauge(double NumOfGallons){
		if(NumOfGallons<=MaxNumOfGallons)
			this.NumOfGallons= NumOfGallons;
		
		else{
			NumOfGallons= MaxNumOfGallons;
		}
	}
	
	public double getNumOfGallons(){
		return NumOfGallons;
	}
	
	/*method that adds gas to car by incrementing number of gallon if it is less than the
	  max amount of gas, if the amount of gas is greater than the max number of gallons, message will be printed
	stating tank is overfilled.*/
	public void addGasToCar(){
		if(NumOfGallons< MaxNumOfGallons)
			NumOfGallons++;
		
		else{
			System.out.println("TOO MUCH GAS!!");
		}
	}
	
	//decrements the number the amount of fuel
	public void FuelConsumption(){
		if(NumOfGallons>0){
			NumOfGallons--;
		}
		else{
			System.out.println("No more fuel left!!!");
		}
	}
	

}

