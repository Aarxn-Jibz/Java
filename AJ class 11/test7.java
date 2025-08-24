import java.util.Scanner;
class test7
{
   public void main()
   {
       Scanner sc=new Scanner(System.in);
       int n,p;
       System.out.println("Input 1 number");
       n=sc.nextInt();
       p=fact(n);
       System.out.println(p);
   }
   int fact(int n)
   {
       if(n>1)
       {
            return n*fact(n-1);
       }
       return 1;
   }
}