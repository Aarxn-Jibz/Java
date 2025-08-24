/**
 * ISC 2020
 */
import java.util.Scanner;
class convert
{
    int n,d,m,y;
    convert()
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
        int ar[]={31,28,3,30,31,30,31,31,30,31,30,31};
        if(y%4==0 && y%100!=0)
        {
            ar[1]=29;
        }
        else if(y%100==0 && y%400==0)
        {
            ar[1]=29;
        }
        int cpy=n;
        int c=0;
        while(cpy>ar[c])
        {
            cpy=cpy-ar[c];
            c++;
            System.out.println(cpy);
        }
        d=cpy;
        m=c-1;
    }
    void display()
    {
        String arr[]={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("Month name:"+arr[m]);
        System.out.println("Day number:"+d);
        System.out.println("Year:"+y);        
    }
    void main()
    {
        convert ob=new convert();
        ob.accept();
        ob.day_to_date();
        ob.display();
    }
}