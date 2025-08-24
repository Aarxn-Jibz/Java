import java.util.Scanner;
class Question3
{
 public static void main()
 {
     int n;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Number");
     n=sc.nextInt();
     if(n%7==0 || n%10==7)
     System.out.println("Buzz Number");
     else if(n%7!=0 || n%7!=7)
     System.out.println("Not a Buzz Number");
    }
}

     
