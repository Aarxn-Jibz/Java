/**
 * Given an array A containing 2*N+2 positive numbers, out of which 2*N numbers exist in pairs whereas the other two number occur exactly once and 
 * are distinct. Find the other two numbers.
 */
import java.util.Scanner;
class pract4
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,m,i,j,c=0,c1=0;
        System.out.println("Input size of array:");
        n=sc.nextInt();
        m=(2*n)+2;
        System.out.println("The size is:"+m);
        int ar[]=new int[m];
        System.out.println("Input 2*n non zero numbers which exist in pairs and 2 which occur exactly once::");
        for(i=0;i<m;i++)
        {
            ar[i]=sc.nextInt();
        }
        int a[]=new int[m];
        for(i=0;i<m;i++)
        {
            c=i;
            c1=0;
            if(i==(m-1))
            {
                if(ar[m-1]==0)
                {
                    break;
                }
                else
                {
                    System.out.println(ar[i]);
                }
            }
            for(j=i;j<m;j++)
            {
                if(ar[c]==ar[j])
                {
                    c1++;
                    ar[j]=0;
                    ar[c]=0;
                    break;
                }
            }
            if(c1==0)
            {
                System.out.println(ar[i]);
            }
        }
    }
}