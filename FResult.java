import java.util.Scanner;

class student{
    int roll;
    String name;
    int phy,eng,maths;

    student()
    {
        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter the roll number:");
        roll =sc1.nextInt();
        System.out.println("Enter name:");
        name=sc1.next();
        System.out.println("Enter physics mark:");
        phy =sc1.nextInt();
        System.out.println("Enter english mark:");
        eng =sc1.nextInt();
        System.out.println("Enter maths mark:");
        maths =sc1.nextInt();



    }

}

class sports extends student
{
    int fscore,cscore;
    sports()
    {
        Scanner sc2= new Scanner(System.in);
        System.out.println("Enter football score:");
        fscore=sc2.nextInt();
        System.out.println("Enter Cricket score:");
        cscore=sc2.nextInt();

    }
}
class Result extends sports
{
void display()
{

System.out.println("Academic  Details"+"\n"+" ");

System.out.println("Name : " + name);
System.out.println("Roll No : " + roll);
System.out.println("");
System.out.println("MARKS" +"\n" + " ");

System.out.println("Physics :" + phy);
System.out.println("English :" + eng);
System.out.println("Maths :" + maths);
        System.out.println("Total subject mark:"+(phy+eng+maths));
System.out.println("");
       
System.out.println("SPORTS SCORE" +"\n"+" ");
        System.out.println("Football : " + fscore);
        System.out.println("Cricket : " + cscore);
System.out.println("Total Sports mark:"+(fscore+cscore));
}
}

public class FResult{
     public static void main(String[] args) {
        Result rs =new Result();
        rs.display();
    }
}
 