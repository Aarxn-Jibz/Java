import java.util.Scanner;
class stackfinale
{
    static Scanner sc=new Scanner(System.in);
    int n,top=-1,i;int ar[];char ch;
    stackfinale(int x)
    {
        n=x;
        ar=new int[n];
    }
    void control()
    {
        int c,v;
        while(true)
        {
            System.out.println("Press 1 to PUSH:");
            System.out.println("Press 2 to POP:");
            System.out.println("Press 3 to PEEK:");
            System.out.println("Press 4 to see SIZE:");
            System.out.println("Press 5 to check whether EMPTY:");
            System.out.println("Press 6 to check whether full:");
            System.out.println("Press 7 to TERMINATE:");
            c=sc.nextInt();
            switch(c)
            {
                case(1):
                    System.out.println("Input element:");
                    v=sc.nextInt();
                    push(v);
                    break;
                case(2):
                    pop();
                    break;
                case(3):
                    peek();
                    break;
                case(4):
                    size();
                    break;
                case(5):
                    empty();
                    break;
                case(6):
                    full();
                    break;
                case(7):
                    System.exit(0);
            }
        }
    }
    void push(int v)
    {
        int bruh;
        if(top==n-1)
        {
            System.out.println("Error!  Stack Overflow:");
        }
        else
        {
            ar[++top]=v;
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("Error!  Stack Underflow");
        }
        else
        {
            System.out.println("Popped element:"+ar[top]);
            --top;
        }
    }
    void peek()
    {
        for(i=0;i<=top;i++)
        {
             System.out.print(ar[i]+"\t");
        }
        System.out.println();
    }
    void size()
    {
        int a;
        a=top+1;
        System.out.println("The size of the stack is:"+a);
    }
    void empty()
    {
        if(top==-1)
        {
            System.out.println("Check:  True");
        }
        else
        {
            System.out.println("Check:  False");
        }
    }
    void full()
    {
        if(top==n-1)
        {
            System.out.println("Check:  True");
        }
        else
        {
            System.out.println("Check:  False");
        }
    }
    public static void main()
    {
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        stackfinale ob=new stackfinale(n);
        ob.control();
    }
}