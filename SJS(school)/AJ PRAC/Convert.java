import java.util.Scanner;
class Convert
{
    int n,d,m,y;
    Convert()
    {
        n=0;
        d=0;
        m=0;
        y=0;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input day number:");
        n=sc.nextInt();
        System.out.println("Input year:");
        y=sc.nextInt();
    }
    void day_to_date()
    {
        int ar[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int c=0;
        if(y%4==0 && y%100!=0)
        {
            ar[1]=29;
        }
        if(y%100==0)
        {
            if(y%400==0)
            {
                ar[1]=29;
            }
        }
        while(n>0)
        {
            if(n>ar[c])
            {
                n=n-ar[c];
                c++;
            }
            else
            {
                c++;
                break;
            }
        }
        d=n;
        m=c;
    }
    void display()
    {
        String ar[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println(ar[m]+" "+d+","+y);
    }
    void main()
    {
        Convert ob=new Convert();
        ob.accept();
        ob.day_to_date();
        ob.display();
    }
}