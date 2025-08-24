import java.util.Scanner;
class stringsss
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s,w;int a=0;
        System.out.println("Inout a sentsnce");
        s=sc.nextLine();
        System.out.println();
        while(s.length()>0)
        {
            if(s.indexOf(' ')==-1)
            {
                w=s.substring(0);
                Character.toUpperCase(w.charAt(0));
                System.out.print(w);
                break;
            }
            a=s.indexOf(' ');
            w=s.substring(0,a);
            s=s.substring(a+1);
            Character.toUpperCase(w.charAt(0));
            System.out.print(w+" ");
        }
    }
}