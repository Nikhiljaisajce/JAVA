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
		id=25;
		Sname="Nikhil";
		m1=88;
		m2=75;
		m3=92;
	}
	public stud(float mark1,float mark2,float mark3)
	{
		id=13;
		Sname="Amal";
		m1=mark1;
		m2=mark2;
		m3=mark3;
		
	}
public void display()
	{
		System.out.println("The Student Name= " + Sname);
		System.out.println("The Student id= " +id);
		System.out.println("Marks are\n" +m1 + "\n" +m2+ "\n" +m3 + "\n");
	}
	
}   
 public class Student{
	public static void main(String[] args)
	{
	stud obj = new stud();//default constructor
    obj.display();
	stud obj1= new stud(33,"Ron",88,66,64);//parameterized constructor
	obj1.display();
	stud obj3= new stud(64,78,66);//parameterized constructor
	obj3.display();	
}
}