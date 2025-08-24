import java.util.Scanner;
class tables
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int m,i,n,c;
        System.out.println("Input number");
        m=sc.nextInt();
        System.out.println("Input n");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            c=table(m,i);
            System.out.println(c);
        }
    }
    int table(int m,int n)
    {
        int pro=m*n;
        return pro;
    }
}