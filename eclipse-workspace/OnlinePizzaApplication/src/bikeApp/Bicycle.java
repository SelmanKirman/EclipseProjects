package bikeApp;

public class Bicycle {
	
	String gears="";
	String breakes="";
	
	public void setGears(String g) {
		
		gears=g;
	}
	
	public String getGears() {
		
		return gears;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String gearNum="";
		
		Bicycle myBike = new Bicycle();
		
		myBike.setGears("21");
		
		gearNum = myBike.getGears();
		
		System.out.println("The number of gears is:" + gearNum);

	}

}
