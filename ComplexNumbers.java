import java.util.*;

class ComplexNumbers{
	
	int real, imaginary;
	
	ComplexNumbers(){  }
	
	ComplexNumbers(int real, int imaginary){
		this.real= real;
		this.imaginary= imaginary;
	}
	
	void complexAdd(ComplexNumbers compNum){
		int real_sum, imaginary_sum;
		real_sum= this.real+compNum.real;
		imaginary_sum= this.imaginary+compNum.imaginary;
		System.out.println("The sum of the mentioned complex numbers is : "+real_sum+" + "+imaginary_sum+"i");
	}
	
	void display(){
		System.out.println("The entered complex number is : "+real+" + "+imaginary+"i");
		System.out.println("\n");
	}
	
	public static void main(String[] args){
		
		int real_num, imaginary_num;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the real value of the 1st complex number : ");
		real_num= sc.nextInt();
		System.out.print("Enter the imaginary value of the 1st complex number : ");
		imaginary_num= sc.nextInt();
		ComplexNumbers com1= new ComplexNumbers(real_num, imaginary_num);
		com1.display();
		
		System.out.print("Enter the real value of the 2nd complex number : ");
		real_num= sc.nextInt();
		System.out.print("Enter the imaginary value of the 2nd complex number : ");
		imaginary_num= sc.nextInt();
		ComplexNumbers com2= new ComplexNumbers(real_num, imaginary_num);
		com2.display();
		
		com1.complexAdd(com2);
	}
}