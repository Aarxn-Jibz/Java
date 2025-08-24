/**
 * WAP to generate password
 */
class ranpasgen
{
    public static void main()
    {
        String s="";
        char ca;
        long a,b;
        System.out.println("The password is:");
        while(s.length()<16)
        {
            a=Math.round(Math.random()*122);
            ca=(char) a;
            b=s.indexOf(ca);
            if(b==-1)
            {
                if((a>=48 && a<=57) || (a>=65 && a<=90) || (a>=97 && a<=122))
                {
                    s=s+ca;
                }               
            }            
        }
        System.out.println(s);
    }
}