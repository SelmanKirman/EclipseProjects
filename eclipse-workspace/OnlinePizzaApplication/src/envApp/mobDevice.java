package envApp;  

public class mobDevice {

 	 	public String OS = "";

        public String devType[] = {"phone, tablet"};

        public String device = "";

        public static int quant = 0;
        

 	     public void setQuant(int num) {

 		 		quant = num; 

            }

          public int getQuant() {

 		 		return quant;

 	} 

        public void setDev (String dev) {

 		 		device = dev;

 		 	}

       public String getDevice() {

 		 		return device;

 	}

      public static void main(String[] args) {

 		// TODO Auto-generated method stub

 		String devType;

 		int myInv;

 		 mobDevice myphone = new mobDevice();

 		myphone.setQuant(450);

 		myInv = myphone.getQuant();

 		myphone.setDev("iPhone");

 		devType = myphone.getDevice();

 		 if(myInv > 0 && myInv < 10) { 

                       System.out.println("The " +  devType + " price is: $1,000."); 

	        }else if (myInv >= 10 && myInv <= 100) {

 			System.out.println("The " +  devType + " price is: $950.");

 		}else {

 			System.out.println("Check on-line for " +  devType + " prices.");

 		}

     }

  }