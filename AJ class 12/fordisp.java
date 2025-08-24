import java.util.Scanner;
class fordisp
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int c,ti;double a,b,d;String s,w,k,l;
        while(true)
        {
            System.out.println("Press 1 if you want simple interest:");
            System.out.println("Press 2 if you want compound interest:");
            System.out.println("Press 3 if you want terminate:");
            c=sc.nextInt();
            switch(c)
            {
                case 1: 
                    System.out.println("Input IFSC:");
                    s=sc.next();
                    System.out.println("Input branch name:");
                    w=sc.next();
                    System.out.println("Input account number:");
                    k=sc.next();
                    System.out.println("Input Principal:");
                    a=sc.nextDouble();
                    System.out.println("Input Rate:");
                    b=sc.nextDouble();
                    System.out.println("Input time:");
                    ti=sc.nextInt();
                    simple ob=new simple(k,s,w,a,b,c);
                    ob.display();
                    break;
                case 2: 
                    System.out.println("Input IFSC:");
                    s=sc.next();
                    System.out.println("Input branch name:");
                    w=sc.next();
                    System.out.println("Input account number:");
                    k=sc.next();
                    System.out.println("Input Principal:");
                    a=sc.nextDouble();
                    System.out.println("Input Rate:");
                    b=sc.nextDouble();
                    System.out.println("Input time:");
                    ti=sc.nextInt();
                    compound ob1=new compound(k,s,w,a,b,c);
                    ob1.display();
                    break;
                    case 3:
                        System.exit(1);
            }
        }
    }
}