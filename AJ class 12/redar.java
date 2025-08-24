import java.util.Scanner;
class redar
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,k,g,g2,c=0;
        System.out.println("Input size of the array:");
        n=sc.nextInt();
        int ar[]=new int[n];
        for(i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        while(c!=n-1)
        {
            g=0;
            g2=0;
            c=0;
            for(i=0;i<n;i++)
            {
                if(ar[i]>g2 && ar[i]>g)
                {
                    j=i;
                    g[2]=ar[g2];
                    j=g;
                    
                }
            }
        }
    }
}