/**
 *Display the frequency  of all the digits of a number
 */
 import java.util.Scanner;
 class frequency
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         int i,cpy,n,c,r;
         System.out.println("Enter number");
         n=sc.nextInt();
         for(i=0;i<=9;i++)
         {
             c=0;
             cpy=n;
             while (cpy>0)
             {
                r=cpy%10;
                cpy=cpy/10;
                if (r==i)
                {
                    c++;
                }
             }
             if (c>0)
             {
                 System.out.println(i+"="+c);
             }
          }
     }
 }
            