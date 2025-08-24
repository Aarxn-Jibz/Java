/**Write a program to accept a alphabet in upper case or in lower case. Diplay the next alphabet
accordingly. i.e 'a' follows 'b' & 'z' follows 'a' * */
import java.util.*;
public class Q7
{
    public static void main()
    {           
                System.out.println("\f");
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter a character");
                char ch=sc.next().charAt(0);
                 if(ch=='z')
                 System.out.println("a");
                 else if(ch=='Z')
                 System.out.println("A");
                 else
                 System.out.println(++ch);
    }
}