import java.util.Scanner;
class penduvyv
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int m,i,j,mid,l,r,small,pos;
        System.out.println("Input size:");
        m=sc.nextInt();
        int ar[][]=new int[m][m];
        System.out.println("Input matrix:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        mid=m/2;
        l=(m%2==0)?m/2-1:m/2;
        r=(m%2==0)?m/2:m/2+1;
        int arr[]=new int[m];
        for(i=0;i<m;i++)
        {
            small=ar[i][mid];
            pos=i;
            for(j=i+1;j<m;j++)
            {
                if(ar[mid][j]<small)
                {
                    small=ar[mid][j];
                    pos=j;
                }
            }
            ar[mid][pos]=ar[mid][i];
            ar[mid][i]=small;
            if(i%2==0)
            {
                arr[l]=ar[mid][i];
                l--;
            }
            else
            {
                arr[r]=ar[mid][i];
                r++;
            }
        }
        System.out.println("The new matris is:");
        for(i=0;i<m;i++)
        {
            if(i==mid)
            {
                for(j=0;j<m;j++)
                {
                    System.out.print(arr[j]+"\t");
                }
            }
            else
            {
                for(j=0;j<m;j++)
                {
                    System.out.print(ar[i][j]+"\t");
                }
            }
            System.out.println();
        }
    }
}