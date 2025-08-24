/**
 * In Piglatin a word such as KING becomes INGKAY, TROUBLE becomes OUBLETRAY as son on.
 * The first vowel of the original word becomes the starting of the translation and proceeding letter being shifted towards the end and 
 * followed by AY. 
 * Word that begins with a vowel is left unchanged. 
 * To convert each word to piglatin word in a sentence. Define a class convert that has the following functions.
 * Class name : convert
 * Data Member : word as String
 * Member Methods :
 * convert() : default constructor to assign the data by null
 * convert(String) : Parameterized constructor to assign the data by given Values
 * int vowelpos(convert) : it will return the index no. of the first vowel int the word given by the argument object
 * convert piglatin() : it converts the current object data into pig lain word and returning an object.
 * Write the void main, through which call all appropriate functions by object
 */
import java.util.Scanner;
class piglatin
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i;char ch;
        String s,s2="";
        System.out.println("Input word:");
        s=sc.nextLine().toUpperCase();
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
            {
                s2=s+"AY";
                break;
            }
            else
            {
                ch=s.charAt(i);
                s=s.substring(1,s.length()-1)+ch;
            }
        }
        System.out.println(s2);
    }
}