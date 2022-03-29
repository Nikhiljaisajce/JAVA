public class Product{
	
	String pcode, pname;
	double price;
	
	public void details(){
		System.out.println("The product name is : "+pname);
		System.out.println("The product code is : "+pcode);
		System.out.println("The product price is : "+price);
		System.out.println("\n");
	}
	
	public static void main(String[] args){
		
		Product prod1= new Product();
		prod1.pcode= "P101";
		prod1.pname= "Book";
		prod1.price= 55.5;
		prod1.details();
		
		Product prod2= new Product();
		prod2.pcode= "P202";
		prod2.pname= "Pencil";
		prod2.price= 10.0;
		prod2.details();
		
		Product prod3= new Product();
		prod3.pcode= "P303";
		prod3.pname= "Pen";
		prod3.price= 20.2;
		prod3.details();
		
		
		System.out.println("\n");
		if((prod1.price < prod2.price)&&(prod1.price < prod3.price))
		{
			System.out.println("The price of "+prod1.pname+" is the lowest");
		}
		else if((prod2.price < prod1.price)&&(prod2.price < prod3.price))
		{
			System.out.println("The price of "+prod2.pname+" is the lowest");
		}
		else{
				System.out.println("The price of "+prod3.pname+" is the lowest");
			}
		
	}
}