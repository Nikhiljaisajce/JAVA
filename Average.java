import java.util.Scanner;
class NegException extends Exception
{
    public NegException(String s)
    {
        super(s);
    }
}

public class Average {
    public static void main(String[] args)
    {
        int i;
        double sum=0,avg=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n numbers:");
        int n=sc.nextInt();
        
        for(i=1;i<=n;i++)
        {
            try 
            {
                System.out.println("Enter number"+i);
                int a=sc.nextInt();
                if(a<0)
                {
                    i--;
                    throw new NegException("Negative numbers not allowed,Try again");
                }
                else
                {
                    sum=sum+a;
                }
            }
            catch(NegException e)
            {
                System.out.println("NEGETIVE EXCEPTION OCCURED:"+e);
            }
        }
        avg=sum/n;
        System.out.println("Average is "+avg);
        sc.close();
    }
    
}
