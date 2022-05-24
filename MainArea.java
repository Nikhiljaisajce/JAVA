class Area
{          
int shape(int l, int b)
{
return l*b;
}

double shape(double l,double b)
{
return (0.5*l*b);
}
double shape(double  l)
{
return (3.14*l*l);
}
}
public class MainArea
{
public static void main(String Args[])
{
Area A =new Area();
System.out.println("Area of rectangle=" + A.shape(4,5));
System.out.println("Area of  Triangle=" + A.shape(6,5));
System.out.println("Area of circle=" + A.shape(4));
}
}