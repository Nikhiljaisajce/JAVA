class VehicleDetails{
	
	
	String vname, vmodel;
	int vserialno, vprice;
	
	VehicleDetails(){  }
	
	VehicleDetails(String vname, String vmodel, int vserialno, int vprice){
		this.vname= vname;
		this.vmodel= vmodel;
		this.vserialno= vserialno;
		this.vprice= vprice;
	}
	
	void details(){
		System.out.println("The Car Name is : "+vname);
		System.out.println("The Car-Model name is : "+vmodel);
		System.out.println("The Car Serial Number is : "+vserialno);
		System.out.println("The Car Price is : Rs."+vprice);
		System.out.println("\n");
	}
}

class Vehicle{
	public static void main(String[] args){
		VehicleDetails[] vehicleDetails= new VehicleDetails[3];
		
		vehicleDetails[0]= new VehicleDetails("BMW","BMW X5", 10001,9200000);
		vehicleDetails[0].details();
		
		vehicleDetails[1]= new VehicleDetails("Mercedes","Mercedes Benz C-Class", 10002,4999000);
		vehicleDetails[1].details();
		
		vehicleDetails[2]= new VehicleDetails("Jaguar","Jaguar XF",10003,5570000);
		vehicleDetails[2].details();
	}
}