    import java.util.Scanner;
    class Shape
    {
        void rectangle()
        {
            Scanner sc=new Scanner(System.in);
            int l,b,area;
            System.out.println("Enter length of rectangle");
            l=sc.nextInt();
            System.out.println("Enter breadth of rectangle");
            b=sc.nextInt();
            area=l*b;
            System.out.println(area);
        }
        void square()
        {
            Scanner sc=new Scanner(System.in);
            int area1,a;
            System.out.println("Enter side");
            a=sc.nextInt();
            area1=a*a;
            System.out.println(area1);
        }
        void circle()
        {
            Scanner sc=new Scanner(System.in);
            double r,area2;
            System.out.println("Enter radius");
            r=sc.nextDouble();
            area2=3.14*r*r;
            System.out.println(area2);
        }
        public static void main()
        {
            Shape ob=new Shape();
            ob.rectangle();
            ob.square();
            ob.circle();
        }
    }