/**
 * An anagram is a word or a phrase made by transposing the letters of another word or phrase, for example, 
 * “Parliament” is an anagram of “partial men” and 
 * “software” is an anagram of “swear oft”. 
 * Write a program that figures out whether one string is an anagram of other string or not. 
 * Program should ignore white spaces and punctuations. Here the class specification is given below.
 * Class : Anagram
 * Data members : Str as String
 * Member Methods :
 * Anagram(string) : constructor to assign the data members
 * int findFreqency(char c) : it returns the frequency of the given character in the present string.
 * boolean checkAnagram(Anagram a1): it will return true if both the strings (current object and argument object) are anagram else returns false.
 */
import java.util.Scanner;
class anagram
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        String s,w;
        System.out.println("Input word:");
        s=sc.nextLine();
        System.out.println("Input collection:");
        w=sc.nextLine();
        n=s.length();
        char ar[]=new char[s.length()];
        for(i=0;i<n;i++)
        {
            ar[i]=s.charAt(i);
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<w.length();j++)
            {
                if(Character.isLetter(w.charAt(j))==true)
                {
                    if(w.charAt(j)==ar[i])
                    {
                        ar[i]='0';
                    }
                }
            }
        }
        for(i=0;i<n;i++)
        {
            if(ar[i]!='0')
            {
                System.out.println("Not an anagram:");
                System.exit(0);
            }
        }
        System.out.println("Anagram");
    }
}