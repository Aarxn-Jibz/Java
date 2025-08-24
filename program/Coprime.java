/**
 * co-prime: two numbers whose HCF is 1

2,3
4,5
50,9
11,13



accept two numbers and check they are co-prime number or not.
 */
        import java.util.Scanner;
        class Coprime 
        {
            public static void main()
            {
                Scanner sc=new Scanner(System.in);
                int a,b,i,hcf=0;
                System.out.println("Enter 2 numbers");
                a=sc.nextInt();
                b=sc.nextInt();
                for (i=1;i<=((a<b)?a:b);i++)
                {
                    if(a%i==0 && b%i==0)
                    hcf=i;
                }
                if(hcf==1)
                {
                    System.out.println("The numbers are co-prime");
                }
                else
                {
                    System.out.println("The numbers are not co-prime");
                }
            }
        }