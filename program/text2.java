/**
 * accept a string and convert the upper to lower and vice versa.
 */
import java.util.*;
class text2
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String s,nstr="";
        int i;
        char ch;
        System.out.println("Enter the string");
        s=sc.nextLine();
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch>=65 && ch<=90)
                ch=(char)(ch+32);
            
            else if(ch>=97 && ch<=122)
                ch=(char)(ch-32);
            nstr=nstr+ch;    
            
        }
        System.out.println(nstr);
        
    }
}