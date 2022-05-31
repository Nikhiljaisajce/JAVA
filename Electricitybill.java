import java.text.SimpleDateFormat;
import java.util.Date;
interface bill
{
    void cal();
}
class details1 implements bill{
    int pid=101,q=2,uprice=25,t1;
    String name1="A";
    public void cal()
    {
        t1=q*uprice;
    }
}
class details2 extends details1 {
    int pid2=102,q2=1,uprice2=100,t2;
    String name2="B";
    SimpleDateFormat f=new SimpleDateFormat("dd/MM/yy");
    Date d= new Date();
        public void cal() 
        {
            super.cal();
            t2=q2*uprice2;

        }
    
        public void display()
        {
            System.out.println("Order No.384\n");
            System.out.println("Date: "+f.format(d));
            System.out.println("\nProduct Id\tName\t\tQuantity\tunit price\tTotal");
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println(pid+"\t\t"+name1+"\t\t"+q+"\t\t"+uprice+"\t\t"+t1);
            System.out.println(pid2+"\t\t"+name2+"\t\t"+q2+"\t\t"+uprice2+"\t\t"+t2);
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("\t\t\t\t\tNet.Amount"+"\t\t"+(t1+t2));

        }
    }


 public class Electricitybill{
     public static void main(String[] args) {
		details2 obj2=new details2();
		obj2.cal(); 
		obj2.display();
     }
 }
