import java.util.Scanner;
class pascal 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,c=0,sum=0;
        System.out.println("Input number of terms:");
        n=sc.nextInt();
        int ar[]=new int[999];
        ar[0]=1;
        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(ar[j]+" ");
            }
            for(j=i+1;j>0;j--)
            {
                ar[j]=ar[j]+ar[j-1];
            }
            System.out.println();
        }
    }
}