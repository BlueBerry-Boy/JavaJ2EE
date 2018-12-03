package selenium.automationFramework.enum_;



	public class Park {

		public static void main(String[] args) {
		Parking prk;
		 
		 prk = Parking.MONTHLY;
		 
		System.out.println("You selected " + prk + " Parking");
		 
		// System.out.println(Parking.VALET);
		 
		 
		 switch(prk) {
		 
		 case ECONOMY:
			 System.out.println("Economy parking is $10");
			 break;
			 
		 case EXECUTIVE:
			 System.out.println("Executive parking is $60");
			  break;
		
		 case WEEKEND:	  
			 System.out.println("Weekend parking is $40");
			 break;
			 
		 case VALET:
			 System.out.println("The Valet is $20");
			 break;
			 
		 case MONTHLY:
			 System.out.println("Monthly Parking is $100");
			 break;
			 
		 }

	}

}
