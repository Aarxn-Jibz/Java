/**W.A.P to accept 2 numbers and check whether they are anagram to each other or not
 * (if the frequency of all the digits n both the numbers are same,then they are anagram to each other) 
 *  E.g. 123 & 231
 */
 import java.util.Scanner;
 class anagram
 {
     void main()
     {
         Scanner sc=new Scanner(System.in);
         int a,b,i,c=0,d=0;
         System.out.println("Enter 2 numbers");
         a=sc.nextInt();
         b=sc.nextInt();
         for (i=0;i<=9;i++)
         {
             c=getfreq(a,i);
             d=getfreq(b,i);
             if (c!=d)
             {
                 System.out.println("They are not angram");
                 break;
             }
          }
          if (c==d)
          {
              System.out.println("They are anagram");
          }
     }
     int getfreq(int n,int i)
     {
         int r,c=0;
         while (n>0)
         {
             r=n%10;
             n=n/10;
             if (r==i)
             c++;
         }
     return c;
     }
 }