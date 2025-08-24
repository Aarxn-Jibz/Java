import java.util.Scanner;
class CirQueue
{
    int ar[],limit,f,r;
    CirQueue(int n)
    {
        limit=n;
        ar=new int[limit];
        f=r=-1;
    }
    void insert(int v)
    {
        if((r==limit-1 && f==0) ||(f-r==1))
        {
            System.out.println("Circular Queue is filled");
            return;
        }
        if(r==-1)   // for first insertion
        {
            f=0;
        }
        r=(r+1)%limit;
        ar[r]=v;
    }
    void delete()
    {
        if(f==-1)
        {
            System.out.println("Circular Queue is empty");
            return;
        }
        System.out.println("Deleting item ="+ar[f]);
        if(f==r)   // there is only one element
        {
            f=r=-1;
        }
        else
        {
            f=(f+1)%limit;
        }
    }
    void display()
    {
        if(f==-1)
        {
            System.out.println("Circular Queue is empty");
            return;
        }
        int i=f;
        while(i!=r)
        {
            System.out.println(ar[i]);
            i=(i+1)%limit;
        }
        System.out.println(ar[r]);
    }
    void control()
    {
        
        Scanner sc=new Scanner(System.in);
        int ch,a;
        while (true)
        {
            System.out.println("Input 1 to input element to the circular queue:");
            System.out.println("Input 2 to delete element from circular queue:");
            System.out.println("Input 3 to display elements from circular queue:");
            System.out.println("Input 4 to exit the program:");
            ch=sc.nextInt();
            switch (ch) 
            {
                case 1:
                    {
                        System.out.println("Input element to be inputted:");
                        a=sc.nextInt();
                        insert(a);
                    }
                break;
                case 2:
                    {
                        delete();
                    }
                break;
                case 3:
                    {
                        display();
                    }
                break;
                case 4:
                    {
                        System.exit(0);
                    }
                break;
                default:
                    {
                        System.out.println("No such case!");
                    }
            }
        }
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.println("Input length of queue:");
        x=sc.nextInt();
        CirQueue ob=new CirQueue(x);
    }
}