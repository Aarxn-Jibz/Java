import java.util.Scanner;
class tut1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int f=0,i;String s;char ch;
        s="";
        System.out.println("Input binary number");
        s=sc.nextLine();
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(f==0 && ch=='1')
            {
                f=1;
                System.out.print("|");
            }
            else if(f==1 && ch=='0')
            {
                f=0;
                System.out.print("|");
            }
            if(ch=='0')
            {
                System.out.print("_");
            }
            else if(ch=='1')
            {
                System.out.print((char)175);
            }
        }
    }
}