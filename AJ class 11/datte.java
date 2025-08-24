/**
 * WAP to accept the year, number of days and a whole number n and display the date after the number of days and the date after number of days+n
 */
import java.util.Scanner;
class datte
{
    int ar[]={31,28,31,30,31,30,31,31,30,31,30,31};
    void control()
    {
        Scanner sc=new Scanner(System.in);
        int i=0,nod,n,d,y;
        System.out.println("Input number of days");
        nod=sc.nextInt();
        System.out.println("Input year");
        y=sc.nextInt();
        System.out.println("Input n");
        n=sc.nextInt();
        date(nod,y);
        date(nod+n,y);
    }
    boolean checkleap(int y)
    {
        if((y%4==0 && y%100!=0) || y%400==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void date(int nod,int y)
    {
        int i=0;
        while(nod>=ar[i])
        {
            if(checkleap(y)==true)
            {
                ar[1]=29;
            }
            else
            {
                ar[1]=28;
            }
            nod-=ar[i];
            i++;
            if(i==12)
            {
                i=0;
                y++;
            }
        }
        if(nod==0)
        {
            nod=1;
            i=(i+1)%12;
        }
        System.out.println(nod+"/"+(i+1)+"/"+y);
    }
    static void main()
    {
        datte ob=new datte();
        ob.control();
    }
}