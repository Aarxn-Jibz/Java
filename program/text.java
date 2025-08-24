/**
 * accept a string and count
 * no. of upper and lower case characters are present in the string.
 */
import java.util.*;
class text
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,u=0,l=0;
        char ch;
        System.out.println("Enter the string");
        s=sc.nextLine();
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch>='A' && ch<='Z')
                u++;
            else if(ch>=97 && ch<=122)
                l++;
        }
        System.out.println("no. of upper="+u);
        System.out.println("no. of lower="+l);
    }
}