import java.util.Scanner;
class trial2
{
 public static void main()
 {
     int x,y,i;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter 2 numbers");
     x=sc.nextInt();
     y=sc.nextInt();
     for(i=x;i<=y;i++)
     {
         if (i%2==0)
         {
             System.out.println(i);
            }
        }
    }
}
