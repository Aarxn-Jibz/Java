/**
 *  display the shortest word present in a sentencea  
 */
import java.util.*;
class shortest_words
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String s,w,min;
        int n;
        System.out.println("Enter the sentence");
        s=sc.nextLine();
        min=s;
        while(s.length()>0)
        {
            s=s.trim();
            n=s.indexOf(' ');
            if(n==-1)
                n=s.length();
            w=s.substring(0,n);
            s=s.substring(n);
            
            if(w.length()<min.length())
                min=w;
            
        }
        System.out.println(min);
     }
}