import java.util.Scanner;
class unique2711
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,n,r,c=0,c0=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0;
        System.out.println("Input number:");
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            n=n/10;
            if(r==0)
            {
                c0++;
            }
            if(r==1)
            {
                c1++;
            }
            if(r==2)
            {
                c2++;
            }
            if(r==3)
            {
                c3++;
            }
            if(r==4)
            {
                c4++;
            }
            if(r==5)
            {
                c5++;
            }
            if(r==6)
            {
                c6++;
            }
            if(r==7)
            {
                c7++;
            }
            if(r==8)
            {
                c8++;
            }
            if(r==9)
            {
                c9++;
            }
        }
        if(c1>1 || c2>1 || c3>1 || c4>1 || c5>1 || c6>1 || c7>1 || c8>1 || c9>1 || c0>1)
        {
            System.out.println("Not a special number!");
        }
        else
        {
            System.out.println("Special number!");
        }
    }
}