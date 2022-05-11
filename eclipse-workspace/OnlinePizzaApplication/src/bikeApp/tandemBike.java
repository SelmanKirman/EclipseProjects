package bikeApp;

public class tandemBike extends Bicycle {
	
	static int numSeats=0;
	
	public void setNumSeats() {
		// overload method
		numSeats=6;
	}
	
	public void setNumSeats(int seats) {
		//overload method
		numSeats=seats;
	}
	
	public int getNumSeats() {
		//overload method
		return numSeats;
	}

	public static void main(String[] args) {
		
		tandemBike my2Bike = new tandemBike();
		String myNumGears="";
		int myseats=0;
		my2Bike.setGears("18"); // inherited from Bicycle
		myNumGears=my2Bike.getGears();// inherited from Bicycle
		my2Bike.setNumSeats(2); // native to tandemBike
		myseats=my2Bike.getNumSeats(); // native to tandemBike
		System.out.println("The number of gears on the bike: " + myNumGears);
		System.out.print("The bike has this many seats:" + myseats + "\n");
		if(numSeats==6) {
			System.out.println("The bike is a surry bike it has " + myseats + "seats");
		} else if (numSeats <6 && numSeats >1 ) {
			System.out.println("The bike is a tandem it has " + myseats + "seats");
		} else {
			System.out.println("The bike is a single it has " + myseats + "seats");
		}
	

	}

}
