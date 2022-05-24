public class Employee{
      public static void main(String[] args) {
      Teacher teacObj[] = new Teacher[2];
       teacObj[0]=new Teacher("1","Aravind","srenilayam house",50000,"MCA","Computer    Graphics");
       teacObj[1] = new Teacher("2","Basker","Anars House",23000,"FT","Food   Microbiology");
       teacObj[0].display();
       teacObj[1].display();
     }
}
class Employees {
           String Empid;
           String Name;
           String Address;
           int Salary;
           Employees(String id,String name,String addr,int salary){
           this.Empid   = id;
           this.Name    = name;
           this.Address = addr;
           this.Salary  = salary;
  }
void display(){
           System.out.println("EmpID   : " + this.Empid);
           System.out.println("Name    : " + this.Name);
           System.out.println("Address : " + this.Address);
           System.out.println("Salary  : " + this.Salary);
     }
}
class Teacher extends Employees{
          String Department;
          String Subject;
         Teacher(String id,String name,String addr,int salary,String dept,String subj){
                   super(id,name,addr,salary);
                   this.Department=dept;
                   this.Subject=subj;
    }
void display(){
            System.out.println("..........................................");
            super.display();
            System.out.println("Dept Name : " + this.Department);
            System.out.println("Subject Name : " + this.Subject);
            System.out.println("..........................................");
      }
}
