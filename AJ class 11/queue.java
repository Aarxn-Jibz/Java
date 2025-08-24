import java.util.Scanner;
class queue
{
    static Scanner sc=new Scanner(System.in);
    int ar[];
    int front,rear,n;
    char ch;
    public queue(int x)
    {
        n=x;
        ar=new int[n];
        front=0;
        rear=-1;
    }
    public void control()
    {
        while(true)
        {
            int ch;
            System.out.println("Input 1 to enqueue:");
            System.out.println("Input 2 to dequeue:");
            System.out.println("Input 3 to display elements:");
            System.out.println("Input 4 to terminate:");
            ch=sc.nextInt();
            switch(ch)
            {
                case (1):
                insert();
                break;
                case(2):
                delete();
                break;
                case(3):
                display();
                break;
                case(4):
                System.exit(0);
            }
        }
    }
    public void insert()
    {
        int a;
        if(rear==n-1)
        {
            System.out.println("Queue is filled!");
        }
        else
        {
            System.out.println("Input a number:");
            ar[++rear]=sc.nextInt();
        }
    }
    public void delete()
    {
        if(front>=rear)
        {
            System.out.println("Stack is empty!");
        }
        else
        {
            System.out.println("Topmost element:"+ar[front]);
            ++front;
        }
    }
    void display()
    {
        int i;
        for(i=front;i<=rear;i++)
        {
            System.out.print(ar[i]+"\t");
        }
        System.out.println();
    }
    public static void main()
    {
        System.out.println("Input size of queue:");
        int n=sc.nextInt();
        queue ob=new queue(n);
        ob.control();
    }
}