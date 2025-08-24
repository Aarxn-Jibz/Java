import java.util.Scanner;
class testing
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s,s2;int i;
        System.out.println("Input a string");
        s=sc.nextLine();
        s2="";
        for(i=s.length()-1;i>=0;i--)
        {
            s2=s2+s.charAt(i);
        }
        if(s.equalsIgnoreCase(s2))
        {
            System.out.println("PAL");
        }
        else
        {
            System.out.println("NO");
        }
    }
}