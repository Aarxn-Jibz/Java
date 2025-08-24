import java.util.Scanner;
class arr
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j,check,sum=0;
        System.out.println("Input size of first array");
        m=sc.nextInt();
        System.out.println("Input size of second array");
        n=sc.nextInt();
        System.out.println("Input number");
        check=sc.nextInt();
        int ar[]=new int[m];
        int arr[]=new int[n];
        System.out.println("Input elements of first array:");
        for(i=0;i<m;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("Input elements of second array:");
        for(j=0;j<n;j++)
        {
            arr[j]=sc.nextInt();
        }
        for(i=0;i<m;i++)
        {
            sum=0;
            for(j=0;j<n;j++)
            {
                sum=ar[i]+arr[j];
                if(sum==check)
                {
                    System.out.print(ar[i]+" ");
                    System.out.print(arr[j]+" ");
                    System.out.println();
                }
            }
        }
        for(i=0;i<m;i++)
        {
            sum=0;
            for(j=0;j<m;j++)
            {
                sum=ar[i]+arr[j];
                if(sum==check)
                {
                    System.out.print(ar[i]+" ");
                    System.out.print(ar[j]+" ");
                    System.out.println();
                }
            }
        }
        for(i=0;i<n;i++)
        {
            sum=0;
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i]+" ");
                System.out.print(arr[j]);
                System.out.println();
            }
        }
    }
}