/** Write a program in java to accept a name containing three words and  display the surname
first followed by the first and middle names. 
*/
import java.util.*;
public class Q9
{
    public static void main()
    {           
                System.out.println("\f");
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter a String");
                String st=sc.nextLine();
                st=st.trim();
                int n= st.length();
                int first=st.indexOf('   ');
                int last=st.lastIndexOf('   ');
                st=st.substring(last,n)+'   '+st.substring(0,last);
                System.out.println(st);
    }
}