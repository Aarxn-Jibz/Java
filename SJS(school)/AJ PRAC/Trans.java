import java.util.Scanner;
class Trans
{
    int arr[][],m;
    Trans(int mm)
    {
        m=mm;
        arr=new int[m][m];
    }
    void fillarray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input values:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void display()
    {
        int i,j;
        System.out.println("ORiginal:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        transpose();
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void transpose()
    {
        int i,j;
        int a[][]=new int[m][m];
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]=arr[i][j];
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                arr[i][j]=a[j][i];
            }
        }
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int mm=sc.nextInt();
        Trans ob=new Trans(mm);
        ob.fillarray();
        ob.display();
    }
}