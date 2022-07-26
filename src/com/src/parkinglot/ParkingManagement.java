package com.src.parkinglot;

public class ParkingManagement {
	public static void main(String args[]) {

		ParkingLot mallParking = new ParkingLot(10);

		Vehicle c1 = new Vehicle("UP 78 KQ 1271", "blue");
		Vehicle c2 = new Vehicle("UP 78 KQ 1272", "blue");
		// Vehicle c3 = new Vehicle("UP 78 KQ 1273", "red");
		Vehicle c4 = new Vehicle("UP 78 KQ 1274", "silver");

		if (mallParking.bookParking(c1)) {
			System.out.println("Booked by " + c1.getRegistration() + " at spot " + c1.getSpot().getSpotNumber());
		} else {
			System.out.println("Booking failed");
		}

		if (mallParking.bookParking(c2)) {
			System.out.println("Booked by " + c2.getRegistration() + " at spot " + c2.getSpot().getSpotNumber());
		} else {
			System.out.println("Booking failed");
		}

		mallParking.checkout(c2);

		if (mallParking.bookParking(c4)) {
			System.out.println("Booked by " + c4.getRegistration() + " at spot " + c4.getSpot().getSpotNumber());
		} else {
			System.out.println("Booking failed");
		}

		Vehicle c5 = new Vehicle("UP 78 KQ 1275", "black");

		if (mallParking.bookParking(c5)) {
			System.out.println("Booked by " + c5.getRegistration() + " at spot " + c5.getSpot().getSpotNumber());
		} else {
			System.out.println("Booking failed");
		}

		mallParking.checkout(c4);
		Vehicle c6 = new Vehicle("UP 78 KQ 1276", "white");

		if (mallParking.bookParking(c6)) {
			System.out.println("Booked by " + c6.getRegistration() + " at spot " + c6.getSpot().getSpotNumber());
		} else {
			System.out.println("Booking failed");
		}
	}
}