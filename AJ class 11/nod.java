/**
 * day after no of days
 * 
 * input: 1) day of 1st jan a year
 *        2) no. of days
 * 
 * output: day after that no. of days
 * 
 * eg: input: sunday   2023      450
 */
import java.util.Scanner;
class nod
{
    String ar[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
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
    static void main()
    {
        nod ob=new nod();
        ob.control();
    }
}