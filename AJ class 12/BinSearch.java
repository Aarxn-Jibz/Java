/**
 * Write a prohgram to do binary search using OOP and and recursion
 */
import java.util.Scanner;
class BinSearch
{
    int arr[],n;
    BinSearch(int nn)
    {
        n=nn;
        arr=new int[n];
    }
    void fill_array()
    {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("Input elemnts:");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    void sort()
    {
        int i,j,temp;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    int Bin_Search(int l, int u, int v)
    {
        int m;
        m=(l+u)/2;
        if(v<arr[l])
        {
            return -1;
        }
        if(arr[m]<v)
        {
            return Bin_Search(m+1,u,v);
        }
        else if(arr[m]>v)
        {
            return Bin_Search(l,m-1,v);
        }
        else
        {
            return m;
        }
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,s,x;
        System.out.println("Input size:");
        a=sc.nextInt();
        BinSearch ob=new BinSearch(a);
        ob.fill_array();
        ob.sort();
        System.out.println("Input elements to be searched:");
        s=sc.nextInt();
        x=ob.Bin_Search(0,n-1,s);
        if(x!=-1)
        {
            System.out.println("Found at "+x);
        }
        else
        {
            System.out.println("Not found::");
        }
    }
}