/**                                 LET X
 * ------------------12/01/2020---------------------
 * 
 * 
 * ---------------------2021-----------------------------       365 DAYS LET Z
 * 
 *                                      LET Y
 * -------------------06/10/2022-------------------------------
 * 
 * X+Z+(365-Y)
 * 
 * 
 * ------------01/03/2022------------------------11/11/2022--------------------
 * 
 */
import java.util.*;
class dateDiff
{
    int ar[]={31,28,31,30,31,30,31,31,30,31,30,31};
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        System.out.println("enter two dates in(dd/mm/yyyy)");
        s1=sc.next();
        s2=sc.next();
        int d1=Integer.parseInt(s1.substring(0,s1.indexOf('/')));
        int m1=Integer.parseInt(s1.substring(s1.indexOf('/')+1,s1.lastIndexOf('/')));
        int y1=Integer.parseInt(s1.substring(s1.lastIndexOf('/')+1));        
        int d2=Integer.parseInt(s2.substring(0,s2.indexOf('/')));
        int m2=Integer.parseInt(s2.substring(s2.indexOf('/')+1,s2.lastIndexOf('/')));
        int y2=Integer.parseInt(s2.substring(s2.lastIndexOf('/')+1));        
        int diff=0,i,x,y;
        x=getdaysleft(d1,m1,y1);
        y=getdaysleft(d2,m2,y2);
        if(y1==y2)
        {
            diff=x-y;
        }
        else
        {
            diff=x;
            for(i=y1+1;i<y2;i++)
            {
                diff+=365;
                if(isleap(i)==true)
                    diff++;
            }
            if(isleap(y2)==true)
            {
                diff+=366-y;
            }
            else
            {
                diff+=365-y;
            }
        }
        System.out.println(diff);
    }
    boolean isleap(int y)
    {
        if(y%400==0 ||(y%100!=0 && y%4==0))
        {
            return true;
        }
        return false;
    }
    int getdaysleft(int d,int m,int y)
    {
        if(isleap(y)==true)
        {
             ar[1]=29;
        }
        else
        {
            ar[1]=28;
        }
        int sum=ar[m-1]-d;
        for(int i=m;i<12;i++)
        {
            sum+=ar[i];
        }
        return sum;
    }
}