/**
 * accept a string and count
 * no. of vowel and consonats  are present in the string.
 */
import java.util.*;
class text1
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String s,vowel="AEIOU";
        int i,v=0,c=0;
        char ch;
        System.out.println("Enter the string");
        s=sc.nextLine().toUpperCase();
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch>=65 && ch<=90)
            {
                if(vowel.indexOf(ch)>=0)
                    v++;
                else
                    c++;
            }
        }
        System.out.println("no. of vowel="+v);
        System.out.println("no. of conso="+c);
    }
}