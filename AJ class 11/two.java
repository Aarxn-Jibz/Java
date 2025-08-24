import java.util.Scanner;
class two
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n,mid,c=0;
        System.out.println("Input array size:");
        n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Input array elements:");
        for(i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        mid=n/2;
        int arr[]=new int[mid];
        int a[]=new int[n-mid];
        for(i=0;i<mid;i++)
        {
            arr[i]=ar[i];
        }
        for(i=mid;i<n;i++)
        {
            a[c]=ar[i];
            c++;
        }
        for(i=0;i<c;i++)
        {
            System.out.print(a[i]);
            for(j=mid-1;j>=0;j--)
            {
                System.out.print(arr[j]);
                break;
            }
            mid--;
        }
    }
}