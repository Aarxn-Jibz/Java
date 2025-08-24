import java.util.Scanner;
class daydate
{
    String ar[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    void control()
    {
        Scanner sc=new Scanner(System.in);
        String day;int r,n,i,c=0;
        System.out.println("Day of first January of the year");
        day=sc.nextLine();
        for(i=0;i<7;i++)
        {
            if(day.equalsIgnoreCase(ar[i]))
            {
                c=i;
                break;
            }
        }
        System.out.println("Input number of days");
        n=sc.nextInt();
        r=(n+c)%7;
        System.out.println(ar[r]);
    }
    public static void main()
    {
        daydate ob=new daydate();
        ob.control();
    }
}