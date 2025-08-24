/**
 * Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not.
 * An anagram of a string is another string that contains the same characters, only the order of characters can be different.
 * For example, act and tac are an anagram of each other.
 * Example 1:
 * Input:a = geeksforgeeks, b = forgeeksgeeks
 * Output: YES
 * Explanation: Both the string have same characters with same frequency. So, both are anagrams.
 */
import java.util.Scanner;
class anagram
{
    String a,b;
    void control()
    {
        Scanner sc=new Scanner(System.in);
        int c=0,i,j,copy;char x,y;
        System.out.println("Input first string:");
        a=sc.nextLine();
        System.out.println("Input second string:");
        b=sc.nextLine();
        if(a.length()!=b.length())
        {
            System.out.println("NO");
            System.exit(0);
        }
        for(i=0;i<a.length();i++)
        {
            x=a.charAt(i);
            int c1=getfreq(x,a);
            int c2=getfreq(x,b);
            if(c1!=c2)
            {
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");
    }
    int getfreq(char c,String s)
    {
        int i;c=0;
        for(i=0;i<s.length();i++)
        {
            if(c==s.charAt(i))
            {
                c++;
            }
        }
        return c;
    }
    static void main()
    {
        anagram ob=new anagram();
        ob.control();
    }
}