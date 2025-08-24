import java.util.Scanner;
class practical2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i;char ch; String s,w="",k="";
        System.out.println("Input Sentence:");
        s=sc.nextLine();
        while(s.indexOf(' ')!=-1)
        {
            w=s.substring(0,s.indexOf(' '));
            s=s.substring(s.indexOf(' ')+1);
            for(i=0;i<w.length();i++)
            {
                ch=w.charAt(i);
                if (Character.isUpperCase(ch)==true)
                {
                    k=k+ch;
                }
            }
            for(i=0;i<w.length();i++)
            {
                ch=w.charAt(i);
                if (Character.isLowerCase(ch)==true)
                {
                    k=k+ch;
                }
            }
            for(i=0;i<w.length();i++)
            {
                ch=w.charAt(i);
                if (Character.isUpperCase(ch)==false && Character.isLowerCase(ch)==false)
                {
                    k=k+ch;
                }
            }
            k=k+" ";
        }
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if (Character.isUpperCase(ch)==true)
            {
                k=k+ch;
            }
        }
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if (Character.isLowerCase(ch)==true)
            {
                k=k+ch;
            }
        }
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if (Character.isUpperCase(ch)==false && Character.isLowerCase(ch)==false)
            {
                k=k+ch;
            }
        }
        System.out.println(k);
    }
}