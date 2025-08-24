 /** 
  *W.A.P to accept a numbers and check whether it is twisted prime or not (13 is twisted prime because it 
  * and its reverse are prime)
  */
      import java.util.Scanner;
      class twistedprime
      {
          void main()
          {
              Scanner sc=new Scanner(System.in);
              int a,c1,c2,r,rev=0;
              System.out.println("Enter number");
              a=sc.nextInt();
              c1=getcount(a);
              while (a>0)
              {
                  r=a%10;
                  a=a/10;
                  rev=rev*10+r;
              }
              c2=getcount(rev);
              if (c1==2 && c2==2 )
              {
                  System.out.println("The given number is twisted prime");
              }
              else
              {
                  System.out.println("The given number is not a twisted prime");
              }
          }
         int getcount(int n)
         {
             int i,c=0;
             for (i=1;i<=n;i++)
             {
                 if (n%i==0)
                 c++;
              }
              return c;
          }
      }