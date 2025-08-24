/**
 *design a class called krishnamurthy having following data mnembers:
 *n,sum as integer 
 *member methods:
 *void input(): to accept tyhe number from the user
 *void calculate(): to calculate the sum of the factorial   of the digits of the number
 *int getfact(int): it will  return the factorial of the received digit.v
 *void output(): it will print that the number is krishnamurty or not.
 */
  import java.util.Scanner;
  class krishnamurthy
  {
      int n,sum;
      void input()
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Input a number");
          n=sc.nextInt();
       }
       void calculate()
       {
           int cpy,i,r,f;
           cpy=n;
           while(cpy>0)
           {
              r=cpy%10;
              cpy=cpy/10;
              f=1;
              for(i=1;i<=r;i++)
              {
                  f=f*i;
               }
              sum=sum+f;
           }
         if(sum==cpy)
           {
               System.out.println("The factorial of the inputted number="+sum);
           }
           else 
           {
               System.out.println("The factorial of the inputted number="+sum);
           }
       }
}