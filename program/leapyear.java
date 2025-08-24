import java.util.Scanner;
class leapyear
{
 public static void main()
 {
     int n;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter year (in AD)");
     n=sc.nextInt();
     if ((n%4==0 && n%100!=0) || n%400==0)
     System.out.println(n+" AD is a Leapyear");
     else
     System.out.println(n+" AD is not a Leapyear");
    }
}