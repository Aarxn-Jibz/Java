import java.util.Scanner;
class one
{
    public static void mian()
    {
        Scanner sc=new Scanner(System.in);
        int n,i,temp;
        System.out.println("Input array size:");
        n=sc.nextInt();
        if(n%3==1)
        {
            System.out.println("Wrong Input.");
            System.exit(0);
        }
        int ar[]=new int[n];
        System.out.println("Input array elements:");
        for(i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if((i+1)%3==1)
            {
                temp=ar[i];
                ar[i]=ar[i+1];
                ar[i+1]=temp;
            }
        }
        System.out.println("The final array is:");
        for(i=0;i<n;i++)
        {
            System.out.print(ar[i]+",");
        }
    }
}