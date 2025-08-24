import java.util.Scanner;
class Time
{
    int hr,min;
    Time()
    {
        
    }
    Time(int a,int b)
    {
        hr=a;
        min=b;
    }
    int timetomin()
    {
        int x;
        x=hr*60+min;
        return x;
    }
    void diff(Time t1,Time t2)
    {
        int diff;
        int a=t1.timetomin();
        int b=t2.timetomin();
        if(a>b)
        {
            diff=1400-a+b;
        }
        else
        {
            diff=b-a;
        }
        mintotime(diff);
    }
    void mintotime(int d)
    {
        hr=d/60;
        min=d%60;
    }
    void display()
    {
        System.out.println(hr+"hrs"+"\t"+min+"mins");
    }
    static void main()
    {
       Time t1=new Time(2,54);
       Time t2=new Time(5,35);
       Time t3=new Time();
       t3.diff(t1,t2);
       t3.display();
    }
}