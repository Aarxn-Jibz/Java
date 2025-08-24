import java.util.*;
public class spiralmatrix
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j,m,n,top,bot,lft,r8,k=1;    
        System.out.println("Input m");
        m=sc.nextInt();
        System.out.println("Input n");
        n=sc.nextInt();
        int ar[][]=new int[m][n];
        top=lft=0;
        bot=m-1;
        r8=n-1;
        i=j=0;
        while(k<=m*n)
        {
            ar[i][j]=k++;
            if(i==top && j<r8)  // moving toward right
                j++;
            else if(j==r8 && i<bot) // moving downwards
                i++;
            else if(i==bot && j>lft)    // moving towards left
                j--;
            else if(j==lft && i>top)    // moving upwards
                i--;
            if(i==top && j==lft)
            {
                top++;
                lft++;
                bot--;
                r8--;
                i=top;
                j=lft;
            }
        }
        for(i=0;i<m;i++)
        {
            System.out.println();
            for(j=0;j<n;j++)
            {
                System.out.print(ar[i][j]+"\t");
            }
        }
    }
}