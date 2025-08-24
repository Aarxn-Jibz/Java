import java.util.Scanner;
class sort
{
    int n;
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i=0,k;
        System.out.println("input size of array");
        n=sc.nextInt();
        int ar[]=new int [n];
        System.out.println("Input elements");
        for(k=0;k<n;k++)
        {
            ar[k]=sc.nextInt();
        }
        outer(ar,0);
        for(k=0;k<n;k++)
        {
            System.out.println(ar[k]);
        }
    }
    void outer(int ar[],int i)
    {
        if(i<n)
        {
            int j=0;
            inner(ar,i,j);
            outer(ar,i+1);
        }
    }
    void inner(int ar[],int i,int j)
    {
        int temp;
        if(j<n-i-1)
        {
            if(ar[j]>ar[j+1])
            {
                temp=ar[j];
                ar[j]=ar[j+1];
                ar[j+1]=temp;
            }
            inner(ar,i,j+1);
        }
    }
}