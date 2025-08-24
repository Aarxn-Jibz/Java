/**W.A.P to display the digits if a number in ascending order
 */
 import java.util.Scanner;
 class digits
 {
     public static void main()
     {
         {
         Scanner sc=new Scanner(System.in);
         int i,cpy,n,r;
         System.out.println("Enter number");
         n=sc.nextInt();
         for(i=0;i<=9;i++)
         {
             cpy=n;
             while (cpy>0)
             {
                r=cpy%10;
                cpy=cpy/10;
                if (r==i)
                System.out.println(i);
            
             }
          }
     }
 }
}
         