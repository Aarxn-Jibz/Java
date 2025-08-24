/** Write a program to accept a character if it is a letter then display the case  i.e lower or upper,
 *otherwise check whether it is digit or special character
 */
import java.util.*;
public class Q8
{
    public static void main()
    {           
                System.out.println("\f");
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter a character");
                char ch = sc.next().charAt(0);
                if(Character.isLetter(ch))
                {
                                System.out.println(ch+"is a letter");
                                if(Character.isUpperCase(ch))
                                System.out.println(ch +" is in upper Case");
                                else
                                System.out.println(ch +" is in lower Case");
                }
                else if(Character.isDigit(ch))
                                System.out.println(ch +" is a digit");      
                else
                                System.out.println(ch +" is a Special Character");    
    }
}