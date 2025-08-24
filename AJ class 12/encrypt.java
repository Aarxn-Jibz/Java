/**
 * WAP to give option to encrypt/decrypt a code having only capital letters where the cypher is the alphabet in inverted order
 */
import java.util.Scanner;
class encrypt
{
    static void mian()
    {
        Scanner sc=new Scanner(System.in);
        int n,m,l,i;String s,w="";char ch;
        System.out.println("Enter 1 to encrypt and 2 to decrypt:");
        n=sc.nextInt();
        if(n==1)
        {
            System.out.println("Enter code to encrypt:");
            sc.nextLine();
            s=sc.nextLine().toUpperCase();
            System.out.println(s);
            for(i=0;i<s.length();i++)
            {
                if(s.charAt(i)==' ')
                {
                    w=w+" ";
                }
                else
                {
                    m=(int)(s.charAt(i));
                    l=m-64;
                    w=w+(char)(91-l);
                }
            }
            System.out.println("your original code is:"+s);
            System.out.println("Your encrypted code is:"+w);        
        }
        else if(n==2)
        {
            System.out.println("Enter code to decrypt:");
            sc.nextLine();
            s=sc.nextLine().toUpperCase();
            for(i=0;i<s.length();i++)
            {
                if(s.charAt(i)==' ')
                {
                    w=w+" ";
                }
                else
                {
                    m=(int)(s.charAt(i));
                    l=91-m;
                    w=w+(char)(64+l);
                }
            }
            System.out.println("The original code is:"+s);
            System.out.println("Your decrypted code is:"+w);
        }
        else
        {
            System.out.println("Not a valid choice! Please pick again");
        }
    }
}