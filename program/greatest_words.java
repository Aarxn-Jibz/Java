/**
 *
 *  display the greatest word present in a sentence
 *  
 *  
 *  friday
 *  
 *  
 *  
 *  
 *  
 */
import java.util.*;
class greatest_words
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String s,w,max="";int n;
        System.out.println("Enter the sentence");
        s=sc.nextLine();
        while(s.length()>0)
        {
            s=s.trim();
            n=s.indexOf(' ');
            if(n==-1)
                n=s.length();
            w=s.substring(0,n);
            s=s.substring(n);
            if(w.compareTo(max)>0)
                max=w;
        }
        System.out.println(max);
     }
}