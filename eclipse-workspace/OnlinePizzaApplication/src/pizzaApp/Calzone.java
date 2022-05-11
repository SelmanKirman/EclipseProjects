package pizzaApp;
import java.util.ArrayList;
import java.util.Iterator;

public class Calzone extends PizzaApp {
	
	//1. Declare the itemName property, the String Array and the Integer Array list below
	public String itemName = "Calzones";
	
	private String[] cheeseType = {"Ricotta", "Cottage", "Goat"};
	ArrayList<Integer> calSize = new ArrayList<Integer>();
	
	//2. Build the calzone size method similar to below
	public String calzoneSize() {
		
		// Do we have Calzone ingredients in stock ? True is yes, false is no
		boolean ingredientsInStock = true;
		int csize = 0; // single element of calSize
		String calzoneSizeList = "";
		
		calSize.add(4);
		calSize.add(6);
		calSize.add(10);
		
		Iterator<Integer> cal_itr = calSize.iterator();
		
		//If the ingredients are in stock, or if ingredientsInStock is true, build the size list
		if(ingredientsInStock) {
			
			while(cal_itr.hasNext()) {
				csize = cal_itr.next();
				calzoneSizeList += csize + " ";
				
			}
		}
		
		
		return calzoneSizeList;
	}
	
	//3. Build the getCalCheeses to the list the cheeses entered into chese type array
	public String getCalCheeses() {
		
		int ilength = cheeseType.length;
		
		String mycalzones = "";
		String mycals = "";
		
		for (int i = 0; i < ilength; i++) {
			
			mycals = cheeseType[i];
			mycalzones = mycalzones + " " + mycals;
			
		}
		
		return mycalzones;
	}

}
