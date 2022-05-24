import java.util.*;
class Person{
    String Name;
    String Gender;
    String Address;
    String Age;
    public Person(String Name,String Gender,String Address,String Age)
{
this.Name=Name;
this.Gender=Gender;
this.Address=Address;
this.Age=Age;
}

}
 class  Employee extends Person
{
String Empid;
String Company_Name;
String Qualification;
String Salary;

public Employee(String Name,String Gender,String Address,String Age ,String Empid,String Company_Name, String Qualification,String Salary)
{
super(Name,Gender,Address,Age);
this.Empid= Empid;
this.Company_Name=Company_Name;
this.Qualification=Qualification;
this.Salary=Salary;

}
}
 class Teacher extends Employee
{
    String Teacherid;
String Department;
String Subject;
public Teacher(String Name,String Gender,String Address,String Age,String Empid,String Company_Name,String Qualification,String Salary,String Teacherid, String Department,String Subject)
{
super(Name,Gender,Address,Age,Empid,Name,Qualification, Salary);
this.Teacherid=Teacherid;
this.Department=Department;
this.Subject=Subject;
}
public void read()
{   Scanner in =new Scanner(System.in);
System.out.println("enter the Name=");
       Name=in.nextLine();
       System.out.println("enter the Gender=");
       Gender=in.nextLine();
       System.out.println("enter the Address=");
       Address=in.nextLine();
       System.out.println("enter the Age=");
       Age=in.nextLine();
       System.out.println("enter the Employ id=");
       Empid=in.nextLine();
       System.out.println("enter the Company Name=");
       Company_Name=in.nextLine();
       System.out.println("enter the Qualification=");
       Qualification=in.nextLine();
       System.out.println("enter the Salary=");
       Salary=in.nextLine();
       System.out.println("enter the Teacher id=");
       Teacherid=in.nextLine();
       System.out.println("enter the Department=");
       Department=in.nextLine();
       System.out.println("Enter the Subject=");
       Subject=in.nextLine();
}
public void display()
{   System.out.println("________Employee Details__________");
    
    System.out.println("Name="+ Name);
    System.out.println("Gender=" + Gender);
    System.out.println("Address=" + Address);
    System.out.println("Age=" + Age);
    System.out.println("Empid=" + Empid);
    System.out.println("Company Name=" + Company_Name);
    System.out.println("Qualification=" + Qualification);
    System.out.println("Salary=" + Salary);
    System.out.println("Teacher id=" + Teacherid);
    System.out.println("Department=" + Department);
    System.out.println("Subject=" + Subject);
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
}
}
public class InheritancePerson
{
    public static void main(String Args[])
    { int i,n;
     Scanner in =new Scanner(System.in);
       System.out.println("Enter the Number of employee=");
       n=in.nextInt();
            Teacher T[] = new Teacher[n];
       for(i=0;i<n;i++)
       {
       T[i]=new Teacher("Name","Gender","Address","Age","Empid","Name","Qualification","Salary","Teacherid","Department","Subject"); 
       T[i].read();
       }
    
    for(i=0;i<n;i++)
    {
        T[i].display();
    }
    }
    }
