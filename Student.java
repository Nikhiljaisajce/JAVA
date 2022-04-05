 class stud
{
	int id;
	String Sname;
	float m1;
	float m2;
	float m3;
	
	public stud(int id1,String name,float mark1,float mark2,float mark3)
	{
		id=id1;
		Sname=name;
		m1=mark1;
		m2=mark2;
		m3=mark3;
	}
	public stud()
	{
		id=45;
		Sname="neha";
		m1=98;
		m2=89;
		m3=90;
	}
public void display()
	{
		System.out.println(" /n The Student Name=" + Sname);
		System.out.println(" /n The Student id=" +id);
		System.out.println("/n Marks are =" +m1 +m2 +m3);
	}
	
}   
 public class Student{
	public static void main(String[] args)
	{
	stud ob = new stud();//default constructor
    ob.display();
	stud ob1= new stud(23,"manju",78,56,44);//parameterized constructor
	ob1.display();
}
}