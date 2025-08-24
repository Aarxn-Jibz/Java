/**
 *
 *  Half Initial:
 *  
 *          i/P:
 *              Tomaghno kumar dasgupta
 *              
 *          o/p:
 *              T.K.Dasgupta
 *  
 *  
 *  
 *  
 */
import java.util.*;
class Half_initial
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String s,w,s1;
        int n;
        System.out.println("Enter the sentence");
        s=sc.nextLine().toUpperCase();
       
        
        while(s.length()>0)
        {
            s=s.trim();
            n=s.indexOf(' ');
            if(n==-1)
            {
                s=s.charAt(0)+s.substring(1).toLowerCase();
                System.out.print(s);
                break;
            }
            
            w=s.substring(0,n);
            s=s.substring(n);
            System.out.print(w.charAt(0)+".");
        }
     }
}