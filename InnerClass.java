class Outer
{
	int x=5;
	class Inner{
		int y=10;
	}
	}
public class InnerClass{
	public static void main(String[] arg){
		Outer MyOuterobj = new Outer();
		Outer.Inner MyInnerobj = MyOuterobj.new Inner();
		System.out.println("X="+MyOuterobj.x);
		System.out.println("Y="+MyInnerobj.y);
	}
}		
