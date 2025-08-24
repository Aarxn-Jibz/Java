import java.util.Scanner;
class smithrec
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int s1=getsum(n);   // step 1
        int s2=getsumfact(n,2);     // step 2
        if(s1==s2)
        {
            System.out.println("SMITH NUMBER");
            
        }
        else
        {
            System.out.println("NOPE");
        }
    }

    int getsum(int n)
    {
        if(n>0)
            return n%10+getsum(n/10);
        return 0;
    }

    int getsumfact(int n,int i)
    {   
        if(n>1)
        {
            if(n%i==0)
            {
                return getsum(i)+getsumfact(n/i,i);
            }
            else
                return getsumfact(n,i+1);
        }
        return 0;
    
    }
}