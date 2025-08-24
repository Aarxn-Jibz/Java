/**
 *
 *  word extraction                 digit extraction
 *                                  while(n>0)      // 786
 *                                  {
 *                                      r=n%10;        //r=6
 *                                      n=n/10;         n=78
 *                                      print(r);
 *                                      
 *                                       w=s.substring(0,n);
 *                                       s=s.substring(n);
 *                                  }
 *  
 *  
 *  
 *  
 */
import java.util.*;
class word_extraction
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String s,w,s1;
        int n;
        System.out.println("Enter the sentence");
        s=sc.nextLine();
        s1=s;
        /*
         * "boy"
         * n=4  n=2 n=1 n=-1
         * w="jack" w="is"  w="a"
         * 
         */
        while(s.length()>0)
        {
            s=s.trim();
            n=s.indexOf(' ');
            if(n==-1)
                n=s.length();
            
            w=s.substring(0,n);
            s=s.substring(n);
            System.out.println(w);
        }
            
        //or
        
        int i;
        char ch;
        w="";
        s1=s1+" ";
        for(i=0;i<s1.length();i++)
        {
            ch=s1.charAt(i);
            if(ch!=' ')
                w=w+ch;
            else
            {
                System.out.println(w);
                w="";
            }
        }
        
    }
}