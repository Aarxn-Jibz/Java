    import java.util.Scanner;
    class trarea
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            double a,b,c,s,area;
            System.out.println("Enter first side");
            a=sc.nextDouble();
            System.out.println("Enter second side");
            b=sc.nextDouble();
            System.out.println("Enter third side");
            c=sc.nextDouble();
            s=(a+b+c)/2;
            area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println(area);
        }
    }