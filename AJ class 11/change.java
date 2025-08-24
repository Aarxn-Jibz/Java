import java.util.Scanner;
class change
{
    int n;
    int a[];
    change()
    {
        n=0;
        a=new int[50];
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input integer");
        n=sc.nextInt();
        deci2hexa(n);
    }
    void deci2hexa(int n1)
    {
        int r,c=0;
        while(n1>0)
        {
            r=n1%16;
            n1=n1/16;
            a[c]=r;
            c++;
        }
        n=c;
    }
    void hexa2deci()
    {
        int i,calc=0,c=0;
        for (i=0;i<n;i++)
        {
            calc=calc+(a[i]*(int) Math.pow(16,c));
            c++;
        }
        System.out.println(calc);
    }
    static void main()
    {
        change ob=new change();
        ob.input();
        ob.hexa2deci();
    }
}