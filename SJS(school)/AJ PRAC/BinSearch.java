import java.util.Scanner;
class BinSearch
{
    int arr[],n;
    BinSearch(int nn)
    {
        n=nn;
        arr=new int[n];
    }
    void fillarray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Elements:");
        int i;
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
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    int bin_search(int l, int u, int v)
    {
        System.out.println(l);
        System.out.println(u);
        int m;
        m=(l+u)/2;
        System.out.println(m);
        if(v<arr[m])
        {
            bin_search(0,m-1,v);
        }
        else if(v>arr[m])
        {
            System.out.println(m);
            System.out.println(u);
            bin_search(m+1,u,v);
        }
        else if(v==arr[m])
        {
            return m;
        }
        return -1;
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int nn=sc.nextInt();
        System.out.println("Enter element t be searched:");
        int  a=sc.nextInt();
        BinSearch  ob=new BinSearch(nn);
        ob.fillarray();
        ob.sort();
        int m=ob.bin_search(0,n-1,a);
        if(m==-1)
        {
            System.out.println("ERROR! NOT FOUND");
        }
        else
        {
            System.out.println("The element exists at "+m);
        }
        int[] ar=new int[nn];
        
    }
}