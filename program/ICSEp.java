import java.util.Scanner;
class ICSEp
{
 public static void main()
 {
     Scanner sc=new Scanner(System.in);
     int i;
     String s,n=" ";
     System.out.println("Enter word");
     s=sc.nextLine();
     for (i=0;i<s.length();i++)
     {
         if(Character.isLowerCase(s.charAt(i))==true)
         {
             n=n+Character.toUpperCase(s.charAt(i));
         }
         else if(Character.isUpperCase(s.charAt(i))==true)
         {
             n=n +Character.toLowerCase(s.charAt(i));
         }
         else
         {
             n =n +s.charAt(i);
         }
     }
 }
}   