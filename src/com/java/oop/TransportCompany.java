package com.java.oop;

public class TransportCompany {
	
	public static void main(String[] args) {
		Driver obj = new Driver("andy", "Ford", "345");
	}

}

class CarClass{
	String carName;
	int carId;
	
	//constructor
	public CarClass(String carName, int carId) {
		super();
		this.carName = carName;
		this.carId = carId;
	}
	
	
}

class Driver extends CarClass{
	
	String driverName;

	public Driver(String driverName, String carName, int carId) {
		super(carName, carId);
		this.driverName = driverName;   
	}
	
	
	
}