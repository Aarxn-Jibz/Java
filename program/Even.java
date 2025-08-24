/**
 * Display all even digits of a number
 */
 import java.util.Scanner;
 class Even
 {
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,r;
        System.out.println("Enter number");
        n=sc.nextInt();
        while (n>0)
        {
            r=n%10;
            n=n/10;
            if (r%2==0)
            {
            System.out.println(r);
            }
        }
    }
}