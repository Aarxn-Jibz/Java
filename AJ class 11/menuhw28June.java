    import java.util.Scanner;
    class menuhw28June
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            int n;double sol=0.0,a,b,h,l,r;
            System.out.println("Enter 1 to find the volume of a cube");
            System.out.println("Enter 2 to find the volume of a cylinder");
            System.out.println("Enter 3 to find the volume of cuboid");
            n=sc.nextInt();
            switch (n)
            {
                case 1:
                    System.out.println("Enter length of side");
                    a=sc.nextDouble();
                    sol=a*a*a;
                    System.out.println("The solution is "+sol);
                    break;
                case 2:
                    System.out.println("Enter height of cylinder");
                    h=sc.nextDouble();
                    System.out.println("Enter radius");
                    r=sc.nextInt();
                    sol=3.14*r*r*h;
                    break;
                case 3:
                    System.out.println("Enter length");
                    l=sc.nextInt();
                    System.out.println("Enter breadth");
                    b=sc.nextInt();
                    System.out.println("Enter height");
                    h=sc.nextInt();
                    sol=l*b*h;
                    break;
                default:
                System.out.println("Bruuh");
            }
        }
    }