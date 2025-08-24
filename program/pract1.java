/**
 * linear search:
 * 1) accept N number of elements in int array and also accept
 *    a single value from the user to that the value is
 *    present in the array or not.
 * 
 * 2) accept N number of elements in int array and also accept
 *    a single value from the user to display its frequency.
 */
   import java.util.Scanner;
   class pract1
   {
       public static void main()
       {
           Scanner sc=new Scanner(System.in);
           int i,c=0,uv,n;
           System.out.println("Input number of elments to be accepted into array");
           n=sc.nextInt();
           int ar[]=new int[n];
           System.out.println("Input elements of array");
           for(i=0;i<n;i++)
           {
               ar[i]=sc.nextInt();
           }
           System.out.println("Input value to be searched");
           uv=sc.nextInt();
           for(i=0;i<n;i++)
           {
               if(ar[i]==uv)
               {
                   c++;
               }
           }
           System.out.println("The frequency of inputted vslue is "+c);
       }
   }