import java.util.Scanner;
class linkedpal
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,rev=0,n,ne=0;
        System.out.println("Input array size");
        n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Input single digit numbers");
        for(i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        for(i=n-1;i>=0;i--)
        {
            rev=rev*10+ar[i];
        }
        for(i=0;i<n;i++)
        {
            ne=ne*10+ar[i];
        }
        if(ne==rev)
        {
            System.out.println("Palindrome array");
        }
        else
        {
            System.out.println("Not a palindrome array");
        }
    }
}