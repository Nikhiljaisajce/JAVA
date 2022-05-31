import java.util.*;
import java.lang.*;

interface Shape {
    float pi = 3.14F;
    float area();
    float perimeter();
}
class Circle implements Shape {
    Scanner sc = new Scanner(System.in);
    int r;
    public float area() {
        System.out.print("Enter the radius : ");
        r = Integer.parseInt(sc.nextLine());
        return (pi * r * r);
    }
    public float perimeter() {
        System.out.print("Enter the radius : ");
        r = Integer.parseInt(sc.nextLine());
        return (2 * pi * r);
    }
}
class Rectangle implements Shape {
    Scanner sc = new Scanner(System.in);
    int l, b;

    public float area() {
        System.out.print("Enter the Length : ");
        l = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the breadth : ");
        b = Integer.parseInt(sc.nextLine());
        return (l * b);

    }

    public float perimeter() {
        System.out.print("Enter the Length : ");
        l = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the breadth : ");
        b = Integer.parseInt(sc.nextLine());
        return (2 * (l + b));
    }
}

class ShapeInterface {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        int ch;
        while (true) {
            System.out.println("1:Area of Circle");
            System.out.println("2:Perimeter of Circle");
            System.out.println("3:Area of Rectangle");
            System.out.println("4:Perimter of Rectangle");
            System.out.println("5:EXIT");
            System.out.print("Enter choice : ");
            ch = Integer.parseInt(sc.nextLine());
            switch (ch) {
                case 1:
                    float ar = c.area();
                    System.out.println("Area  :" + ar);
					System.out.println("**-----------**----------**");
                    break;
                case 2:
                    float pr = c.perimeter();
                    System.out.println("Perimeter of Circle = "+pr);
					System.out.println("**-----------**----------**");
                    break;
                case 3:
                    float a = r.area();
                    System.out.println("Area :" + a);
					System.out.println("**-----------**----------**");
                    break;
                case 4:
                    float pr1 = r.perimeter();
                    System.out.println("Perimeter of Rectangle = "+pr1);
					System.out.println("**-----------**----------**");
                    break;
                case 5:
                    System.out.println("Exiting the Program!!!!!");
                    System.exit(0);
                default:
                    System.out.println("invalid!");
            }
        }

    }
}