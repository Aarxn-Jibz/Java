import java.util.Scanner;
class pendus
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int m,i,j,mid,l,r,small,pos;
        System.out.println("Input size:");
        m=sc.nextInt();
        int ar[]=new int[m];
        System.out.println("Input matrix:");
        for(i=0;i<m;i++)
        {
            ar[i]=sc.nextInt();
        }
        mid=m/2;
        l=m/2;
        r=m/2+1;
        int arr[]=new int[m];
        for(i=0;i<m;i++)
        {
            small=ar[i];
            pos=i;
            for(j=i+1;j<m;j++)
            {
                if(ar[j]<small)
                {
                    small=ar[j];
                    pos=j;
                }
            }
            ar[pos]=ar[i];
            ar[i]=small;
            if(i%2==0)
            {
                arr[l]=ar[i];
                l--;
            }
            else
            {
                System.out.println(r);
                arr[r]=ar[i];
                r++;
            }
        }
        System.out.println("The new matris is:");
        for(i=0;i<m;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}