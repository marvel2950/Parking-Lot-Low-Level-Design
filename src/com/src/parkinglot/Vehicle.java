package com.src.parkinglot;

public class Vehicle {

	private String color;
	private String registrationNum;
	private ParkingSpot allocatedSpot;

	public Vehicle(String registrationNum, String color) {
		this.color = color;
		this.registrationNum = registrationNum;
	}

	public void setParkingLotAllocated(ParkingSpot spot) {
		this.allocatedSpot = spot;
	}

	public boolean isInLot() {
		if (this.allocatedSpot == null)
			return false;
		return true;
	}

	public void setParking(ParkingSpot newSpot) {
		this.allocatedSpot = newSpot;
	}

	public ParkingSpot getSpot() {
		return this.allocatedSpot;
	}

	public String getRegistration() {
		return this.registrationNum;
	}

	public String getColor() {
		return this.color;
	}
}