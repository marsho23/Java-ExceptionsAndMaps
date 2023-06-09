package com.qa.garage;

import java.util.ArrayList;
import java.util.Scanner;

import com.qa.garage.vehicle.Bike;
import com.qa.garage.vehicle.Boat;
import com.qa.garage.vehicle.Car;
import com.qa.garage.vehicle.Vehicle;
import com.qa.garage.vehicle.VehicleNotFoundException;

public class Runner {

	public static void main(String[] args) {
		Garage g = new Garage();

		g.addVehicle(new Car(4, "Black"));
		g.addVehicle(new Boat(0, "Blue"));
		g.addVehicle(new Bike(2, "Red"));
		g.addVehicle(new Car(3, "red"));

		System.out.println(g);

//		g.removeByType("car");
		g.remove(Car.class);
		System.out.println(g);
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		Car c1 = new Car(4, "Black");
		c1.setId(1);
		vehicles.add(c1);
		try {
			findById(vehicles);
		} catch (VehicleNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("vehicle not found with this id");
		}
	}
	
	public static void findById(ArrayList<Vehicle> vehicles) throws VehicleNotFoundException {
		
		try(Scanner scan = new Scanner(System.in);){
			boolean idFound = false;
			
			System.out.println("Enter id: ");
			int id = scan.nextInt();
			while (true) {
				for (Vehicle vehicle:vehicles) {
					if (vehicle.getId()==id) {
						System.out.println(vehicle);
						idFound = true;
						break;
					}	
					else 
						idFound = false;
				}
				if (idFound == false ) {
					System.out.println("Id not found. Try again");
				}
				System.out.println("Enter id: ");
				id = scan.nextInt();
				
			}
			
			
		}	
		
	}
}
