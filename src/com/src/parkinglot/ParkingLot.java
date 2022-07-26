package com.src.parkinglot;

import java.util.*;

public class ParkingLot {

	private ArrayList<ParkingSpot> spots;

	private PriorityQueue<ParkingSpot> spotsAvailable;

	private int maxCapacity;
	private int totalVehicles;

	public ParkingLot(int maxCapacity) {
		this.spots = new ArrayList<>();

		this.spotsAvailable = new PriorityQueue<ParkingSpot>(new Comparator<ParkingSpot>() {
			@Override
			public int compare(ParkingSpot o1, ParkingSpot o2) {
				return Integer.compare(o1.getSpotNumber(), o2.getSpotNumber());
			}
		});

		this.maxCapacity = maxCapacity;
		this.totalVehicles = 0;
		for (int i = 0; i < maxCapacity; i++) {
			ParkingSpot newSpot = new ParkingSpot(i + 1);
			this.spots.add(newSpot);
			this.spotsAvailable.add(newSpot);
		}
	}

	public boolean bookParking(Vehicle v) {
		
		if (totalVehicles == maxCapacity) {
			System.out.println("Parking full!");
			return false;
		}
		
		ParkingSpot newSpot = spotsAvailable.poll();
		v.setParkingLotAllocated(newSpot);
		newSpot.setOccupancy(true, v);
		
		this.totalVehicles++;
		System.out.println(v.getRegistration() + " has been parked in parking spot: " + newSpot.getSpotNumber());
		return true;
	}

	public void checkout(Vehicle v) {
		if (v.isInLot()) {
			ParkingSpot newSpot = v.getSpot();
			spotsAvailable.add(newSpot);
			this.totalVehicles--;
			v.setParkingLotAllocated(null);
			System.out.println("Vehicle " + v.getRegistration() + " checked out");
		} else {
			System.out.println("Vehicle not present");
		}
	}
}