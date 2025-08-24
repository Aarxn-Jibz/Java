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
class pt6
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String s,s2;int n,c=0;
        System.out.println("Input word:");
        s=sc.nextLine();
        System.out.println("Input phrase:");
        s2=sc.nextLine();
        if(s.length()<s2.length())
        {
            while(s!=s2)
            {
                if(s2.charAt(c)==' ')
                {
                    s2=s2.substring(0,c)+s2.substring(c+2);
                }
            }
        }
    }
}