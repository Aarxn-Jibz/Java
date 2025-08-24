/**
 * Design a class called menu having following members :
 * 
 * Data member=
 * ch as character for choice;
 * a,b,c are integers;
 * member methods are 
 * void input()-to accept the choice from the user to do the following task
 *              1)Display the HCF of 2 numbers
 *              2)Check whether the number is a palindrome number or not
 * void getHCF()-to calculate & print HCF of 2 numbers
 * void checkpalindrome()-to check whether the number is palindrome
 */
   import java.util.Scanner;
   class menu
   {
       char ch;int a,b,c;
       void input()
       {
           Scanner sc=new Scanner(System.in);
           System.out.println("Input 1 to find HCF of 2 numbers");
           System.out.println("Input 2 to find palindrome of a number");
           ch=sc.next().charAt(0);
           switch (ch)
           {
               case '1':
               System.out.println("Input 2 number");
               a=sc.nextInt();
               b=sc.nextInt();
               getHCF();
               break;
               case '2':
               System.out.println("Input a number");
               c=sc.nextInt();
               checkpalindrome();
               break;
               default:System.out.println("Choice not valid");
            }
        }
            void getHCF()
            {
                int i,h=0;
                for (i=1;i<=a && i<=b;i++)
                {
                    if (a%i==0 && b%i==0)
                    {
                        h=i;
                    }
                }
                System.out.println("The HCF of"+a+" &"+b+" is"+h);
            }
            void checkpalindrome()
            {
                int rev=0,r,cpy=0;
                cpy=c;
                while (c>0)
                {
                    r=c%10;
                    c=c/10;
                    rev=rev*10+r;
                }
                if (rev==cpy)
                System.out.println("The inputted number is palindrome");
                else 
                System.out.println("The inputted number is not palindrome");
            }
            void main()
            {
                menu obj=new menu();
                obj.input();
            }
        }