import java.util.Scanner;
class adder
{
    int a[];
    adder()
    {
        a=new int[2];
        a[0]=0;
        a[1]=1;
    }
    void read_time()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter hour and minutes");
        for(int i=0;i<2;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    void addtime(adder X, adder Y)
    {
        a[0]=X.a[0]+Y.a[0];
        int s=X.a[1]+Y.a[1];
        if(s>60)
        {
            s=s-60;
            a[0]=a[0]+1;
        }
        a[1]=s;
    }
    void disptime()
    {
        System.out.println("Hours="+a[0]);
        System.out.println("Minutes="+a[1]);
    }
    void main()
    {
        adder A=new adder();
        adder B=new adder();
        adder C=new adder();
        A.read_time();
        B.read_time();
        C.addtime(A,B);
        C.disptime();
    }
}