/**
 *accept 10 integers in an array and display all the even numbers are present in it
 */
  import java.util.Scanner;
  class even_array
  {
      public static void main()
      {
          Scanner sc=new Scanner(System.in);
          int i,e;
          int ar[]=new int[10];
          System.out.println("Input elements");
          for (i=0;i<10;i++)
          {
              ar[i]=sc.nextInt();
          }
          for(i=0;i<10;i++)
          {
              if(ar[i]%2==0)
              {
                  System.out.println(ar[i]);
              }
         }
     }
 }