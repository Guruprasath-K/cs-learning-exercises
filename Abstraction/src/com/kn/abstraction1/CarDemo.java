package com.kn.abstraction1;

public class CarDemo {

	public static void main(String[] args) {
		/*ElectricCar eCar= new ElectricCar();
		eCar.start();
		eCar.stop();
		eCar.refuel();
		eCar.race();*/
		System.out.println("***************************");
		PetrolCar pCar = new PetrolCar(); 
		pCar.start();
		pCar.stop();
		pCar.refuel();
		pCar.race();
		System.out.println("***************************");
		/*DieselCar dCar = new DieselCar(); 
		dCar.start();
		dCar.stop();
		dCar.refuel();
		dCar.race();*/
		System.out.println("***************************");
		
	}
		
	}


