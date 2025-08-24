/**
 *Display the greatest and smallest digit of a number using following functions: 
i) int getmax(int):
ii) int getmin(int):
*/
 
 import java.util.Scanner;
 class Q5
 {
     void main()
     {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n=sc.nextInt();
        getmax(n);
        getmin(n);
    }
    int getmax(int n)
    {
        int a,r,c=0;
        a=n;
        while(a>0)
        {
           r=a%10;
           a=a/10;
           if (c<=r)
           { 
               c=r;
           }
        }
        System.out.println("The greatest number of the number "+n+"is "+c);
        return c;
    }
    int getmin(int n)
    {
        int a,r,x=10;
        a=n;
        while (n>0)
        {
            r=a%10;
            a=a/10;
            if (x>=r)
            {
                x=r;
            }
        }
        System.out.println("The smallest number of the number "+n +"is "+x);
        return x;
    }
}