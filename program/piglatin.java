
/**
 *converting a string to piglatin string
 * 
 * 
 * aaron        ==aaronay
 * sky          = skyay
 * dritiman     = itimandray
 */
     import java.util.Scanner;
     class piglatin
     {
         public static void main()
         {
             Scanner sc=new Scanner(System.in);
             String s,vowel="AEIOUaeiou";int i;
             System.out.println("Enter string");
             s=sc.nextLine();
             for(i=0;i<s.length();i++)
             {
                 if(vowel.indexOf(s.charAt(i))>=0)
                 break;
             }
             s=s.substring(i)+s.substring(0,i)+"ay";
         }
     }
             