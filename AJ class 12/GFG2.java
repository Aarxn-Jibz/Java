/**
 * There is a string of size n containing only 'A' and 'O'. 'A' stands for Apple, and 'O' stands for Orange. 
 * We have m number of spells, each spell allows us to convert an orange into an apple.
 * Find the longest subarray of apples you can make, given a string and the value of m.
 */
import java.util.Scanner;
class GFG2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,m,ca=0,co=0,i;String s;char c;
        System.out.println("Input size of string");
        n=sc.nextInt();
        System.out.println("Input number of spells");
        m=sc.nextInt();
        char a[]=new char[n];
        System.out.println("Input values(A for apple and O for orange)");
        for(i=0;i<n;i++)
        {
            c=sc.nextLine().toUpperCase().charAt(0);
            a[i]=c;
            if(a[i]=='A')
            {
                ca++;
            }
            else if(a[i]=='O')
            {
                co++;
            }
        }
        if(m<=co)
        {
            System.out.println(ca+m);
        }
        else
        {
            System.out.println(ca+co);
        }
    }
}