import java.util.Scanner;
class sod
{
    int sum=0;
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,m,n,c;char ch;
        System.out.println("Input number");
        s=sc.nextLine();
        m=s.length();
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            n=Character.getNumericValue(ch);
            c=su(n);
        }
        System.out.println(sum);
    }
    int su(int n)
    {
        sum=sum+n;
        return sum;
    }
}