import java.util.Scanner;//to input Scanner class
class Question5//opening class
{ 
 public static void main()//opening void main
 {
     Scanner sc=new Scanner(System.in);
     int n,i,s=0;
     System.out.println("Enter Number");
     n=sc.nextInt();
     for(i=1;i<=n;i++)
     {
         if (n%i==0)
         s=s+i;
        }
     if (s==n)
     System.out.println("Perfect number");
     else
     System.out.println("Not a Perfect number");
    }
}
