/**
 * Accept an alphabet and check whether it is a vowel or consonant.
 */
   import java.util.Scanner;                  //starting scanner class
   class alphabets                            //opening class
   {
       public static void main()              //opening void main
       {
           Scanner sc=new Scanner (System.in);
           char ch;
           System.out.println("Enter the alphabet");
           ch=sc.next().charAt(0);
           switch (ch)
           {
               case 'A':
               case 'a':
               case 'E':
               case 'e':
               case 'I':
               case 'i':
               case 'O':
               case 'o':
               case 'U':
               case 'u':
               System.out.println("Vowels");
               break;
               default:System.out.println("Consonants");
            }                                           
        }                                               //closing void main
    }                                                   //closing class
               