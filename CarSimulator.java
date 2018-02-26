package edu.albany.hw2.car;

public class CarSimulator {
	public static void main(String[] args){
	
	double MaxNumOfGallons=15;
	FuelGauge fuel= new FuelGauge();
	Odometer odometer = new Odometer(0, fuel);
		 
		 for(int i=0; i< MaxNumOfGallons;i++) {
		  fuel.addGasToCar();
	 }

	while (fuel.getNumOfGallons()>0)
	{
		odometer.increaseMiles();
		
		System.out.println("Current Number of miles is " + odometer.getMiles());
		
		System.out.println("Amount of fuel is " + fuel.getNumOfGallons() + " gallons.");
	}
	

	

}
}
