package com.src.parkinglot;

public class ParkingSpot {

	private int spotNumber;
	private boolean isOccupied;
	private Vehicle vehicleHere;

	public ParkingSpot(int spotNumber) {
		this.spotNumber = spotNumber;
		this.isOccupied = false;
		System.out.println("Parking Spot: " + this.spotNumber + " created.");
	}

	public boolean isOccupied() {
		return this.isOccupied;
	}

	public void setOccupancy(boolean value, Vehicle vehicle) {
		this.isOccupied = value;
		this.vehicleHere = vehicle;
	}

	public int getSpotNumber() {
		return this.spotNumber;
	}

	public Vehicle getVehicle() {
		return this.vehicleHere;
	}
}