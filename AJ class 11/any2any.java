import java.util.*;
class any2any
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int sb,tb;
        String sv,tv;
        System.out.println("Enter the source base and source value");
        sb=sc.nextInt();
        sv=sc.next();
        System.out.println("Enter the target base");
        tb=sc.nextInt();
        if(isvalid(sb,sv)==false)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        int deci=convertsource2deci(sb,sv);
        tv=convertdeci2target(deci,tb);
        System.out.println(tv);
    }
    boolean isvalid(int sb,String sv)
    {
       
        for(int i=0;i<sv.length();i++)
        {
            int d=(int)sv.charAt(i);
            if(d>=48 && d<=57)
                d=d-48;
            else if(d>=65 && d<=90)
                d=d-55;
            if(d>=sb)
                return false;
        }
        return true;
    }
    int convertsource2deci(int sb,String sv)
    {
        int sum=0,p=0;
        for(int i=sv.length()-1;i>=0;i--)
        {
            int d=(int)sv.charAt(i);
            if(d>=48 && d<=57)
                d=d-48;
            else
                d=d-55;
            sum=sum+d*(int)Math.pow(sb,p);
            p++;
        }
        return sum;
    }
    String convertdeci2target(int deci,int tb)
    {
        String result="";
        while(deci>0)           //deci=175      tb=16
        {
            int r=deci%tb;      //r=15
            deci=deci/tb;       //10
            if(r>9)
                result=(char)(r+55)+result;
            else
                result=r+result;
        }
        return result;
    }
}