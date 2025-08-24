/**
 *2) display the FULL INITIAL of a given name
 *      I/P:
 *              netaji subhash chandra bose
 *      O/P:
 *              N.S.C.B.
 */
       import java.util.*;
class initials
{
    public static void main()
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
            n=s.length();
            w=s.substring(0,n);
            s=s.substring(n);
            System.out.print(w.charAt(0)+".");
        }     
        
    }
}
                