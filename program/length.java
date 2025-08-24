
/**
 *accept 3 strings and display the longest among them 
 */
     import java.util.Scanner;
     class length
     {
         public static void main()
         {
             Scanner sc=new Scanner(System.in);
             String a,b,c;int x,y,z;
             System.out.println("enter the first string");
             a=sc.nextLine();
             x=a.length();
             System.out.println("Enter the second string");
             b=sc.nextLine();
             y=b.length();
             System.out.println("Enter the third String");
             c=sc.nextLine();
             z=c.length();
             if (x>y && x>y)
             {
                 System.out.println("The first string is the longest");
             }
             else if(y>x && y>z)
             {
                 System.out.println("The second string is the longest");
             }
             else
             {
                 System.out.println("The third string is the longest");
             }
            }
        }