import java.util.Scanner;
class password
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,c=0,d=0;String s="";double b;
        System.out.println("Random password is:");
        while(s.length()!=8)
        {
            b=48+(48*Math.random());
            a=(int)Math.round(b);
            if((a>=48 && a<=57) || (a>=65 && a<=90))
            {
                if(s.indexOf((char)a)>=0)
                {
                    continue;
                }
                if(a>=48 && a<=57)
                {
                    if(c==4)
                    {
                        continue;
                    }
                    s=s+(char)a;
                    c++;
                }
                else
                {
                    if(a>=65 && a<=90)
                    {
                        if(d==4)
                        {
                            continue;
                        }
                        s=s+(char)a;
                        d++;
                    }
                }
            }
        }
        System.out.print(s);
    }
}