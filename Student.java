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
		m3=90;
	}
public void display()
	{
		System.out.println("The Student Name=" + Sname);
		System.out.println("The Student id=" +id);
		System.out.println("Marks are =" +m1 +m2 +m3);
	}
	
}   
 public class Student{
	public static void main(String[] args)
	{
	stud obj = new stud();//default constructor
    obj.display();
	stud obj1= new stud(23,"Arjun",88,66,78);//parameterized constructor
	obj1.display();
}
}