package edu.albany.hw2.car;

//main method
public class CarSimulator {
	public static void main(String[] args){
	
		
	double MaxNumOfGallons=15;
	//objects for fuelGauge and Odometer class
	FuelGauge fuel= new FuelGauge();
	Odometer odometer = new Odometer(0, fuel);
		 
	//loops through, an incremments the amount of gas in the vehicle
		 for(int i=0; i< MaxNumOfGallons;i++) {
		  fuel.addGasToCar();
	 }

	while (fuel.getNumOfGallons()>0)
	{
		//increase the number of miles in the car
		odometer.increaseMiles();
		
		//prints the current number of miles driven, and the amount of fuel that is burned.
		System.out.println("Current Number of miles is " + odometer.getMiles());
		
		System.out.println("Amount of fuel is " + fuel.getNumOfGallons() + " gallons.");
	}
	

	

}
}
