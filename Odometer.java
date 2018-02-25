package edu.albany.hw2.car;

public class Odometer {

	//constants for max mileage, and mpg for the vehicle
	final int MAX_MILES = 999999;
	final int MILES_PER_GALLON= 22;;
	
	int initialMiles;
	int miles;

//Fuel Gauge Object
public FuelGauge fuelGauge;

//constructor
public Odometer(int miles, FuelGauge fuelGauge){
	
	this.initialMiles= miles;
	this.miles= miles;
	this.fuelGauge= fuelGauge;
	
}

//returns the mileage
public int getMiles(){
	return miles;
}

/* method, that increments the number of miles if current mileage is
less than the max mileage, if it exceeds the max amount of miles, 
odometer resets*/
public void increaseMiles(){
	if(miles< MAX_MILES){
		miles++;
	}
	else
	{
	miles=0;
	}
	}

/*if the number of miles drive divides evenly my mpg of the vehicle,
one gallon of gas is decreased for every 22 miles driven.*/
int NumOfMilesDriven = initialMiles- miles;
{

if(NumOfMilesDriven % MILES_PER_GALLON==0)
{
	fuelGauge.FuelConsumption();
	}

}
}
