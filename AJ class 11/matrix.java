import java.util.*;
class matrix
{
static void main()
{
    Scanner sc=new Scanner(System.in);
    int m,i,j;
    System.out.println("Enter the limit");
    m=sc.nextInt();
    int mat[][]=new int[m][m];
    for(i=0;i<m;i++)
    {
        for(j=0;j<m;j++)
        {
            System.out.println("Enter the element");
            mat[i][j]=sc.nextInt();
        }
    }
    
    System.out.println("\nHere is the matrix");
    for(i=0;i<m;i++)
    {
        System.out.println();
        for(j=0;j<m;j++)
        {
            System.out.print(mat[i][j]+"\t");
        }
    }
    System.out.println("\nHere is below of  left diagonal");
    
    for(i=0;i<m;i++)
    {
        System.out.println();
        for(j=0;j<=i;j++)
        {
            System.out.print(mat[i][j]+"\t");
        }
    }
    
    System.out.println("\nHere is above of  left diagonal");
    
    for(i=0;i<m;i++)
    {
        System.out.println();
        for(j=0;j<m;j++)
        {
            if(j>=i)
                System.out.print(mat[i][j]+"\t");
            else
                System.out.print("\t");
        }
    }
}
}