import java.util.Scanner;
class temp
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int c,c2,n,r;
        System.out.println("Input 1 to give input in celsius");
        System.out.println("Input 2 to give input in farenheit");
        System.out.println("Input 3 to give input in kelvin");
        c=sc.nextInt();
        switch(c)
        {
            case 1:System.out.println("Enter input");
            n=sc.nextInt();
            System.out.println("Input 1 to convert to farenheit");
            System.out.println("Input 2 to convert to kelvin");
            c2=sc.nextInt();
            switch(c2)
            {
                case 1:
                    r=tofar(n);
                    System.out.println(r+"F");
                    break;
                case 2:
                    r=tokel(n);
                    System.out.println(r+"K");
                    break;
                default:
                    System.out.println("Wrong input");
            }
            break;
            case 2:System.out.println("Enter input");
            n=sc.nextInt();
            System.out.println("Input 1 to convert to celsius");
            System.out.println("Input 2 to convert to kelvin");
            c2=sc.nextInt();
            switch(c2)
            {
                case 1:
                    r=tocel(n);
                    System.out.println(r+"C");
                    break;
                case 2:
                    r=tocel(n);
                    r=tokel(r);
                    System.out.println(r+"K");
                    break;
                default:
                    System.out.println("Wrong input");
            }
            break;
            case 3:System.out.println("Enter input");
            n=sc.nextInt();
            System.out.println("Input 1 to convert to celsius");
            System.out.println("Input 2 to convert to farenheit");
            c2=sc.nextInt();
            switch(c2)
            {
                case 1:
                    r=tocelK(n);
                    System.out.println(r+"F");
                    break;
                case 2:
                    r=tocelK(n);
                    r=tofar(r);
                    System.out.println(r+"K");
                    break;
                default:
                    System.out.println("Wrong input");
            }
            break;
            default:System.out.println("Wrong input");
        }
    }
    int tofar(int n)
    {
        int a;
        a=(5*n-160)/9;
        return a;
    }
    int tokel(int n)
    {
        int a;
        a=n+273;
        return a;
    }
    int tocel(int n)
    {
        int a;
        a=((9*n)/5)+32;
        return a;
    }
    int tocelK(int n)
    {
        int a;
        a=n-273;
        return a;
    }
}