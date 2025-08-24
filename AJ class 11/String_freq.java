/**
 * i/p:MISSISSIPi
 * o/p:M  *
 *     I  ****
 *     S  ****
 *     P  **
 */
import java.util.Scanner;
class String_freq
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s;int i,j,k,c;
        System.out.println("Input String");
        s=sc.nextLine().trim().toUpperCase();
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='*')
            {
                System.out.print(s.charAt(i)+"     ");
                    for(j=i+1;j<s.length();j++)
                    {
                        if(s.charAt(i)==(s.charAt(j)))
                        {
                            s=s.substring(0,j)+"*"+s.substring(j+1);
                            System.out.print("*");
                        }
                    }
                System.out.println("*");
            }
        }
    }
}