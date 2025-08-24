import java.util.Scanner;
class truestack
{
    int ar[],cap,top;
    static Scanner sc=new Scanner(System.in);
    truestack(int n)
    {
        cap=n;
        top=-1;
        ar=new int[cap];
    }
   void push(int v)
   {
       if(top==cap-1)
       {
           System.out.println("stack is overflow");
           return;
       }
       ar[++top]=v;
   }
   void pop()
   {
       if(top==-1)
       {
           System.out.println("Stack is underflow");
           return;
       }
       System.out.println("delting item="+ar[top]);
       top--;
    }
   void peek()
   {
       if(top==-1)
       {
           System.out.println("Stack is underflow");
           return;
       }
       for(int i=top;i>=0;i--)
       System.out.println(ar[i]);    
   }
   void control()
   {
       
       int ch,v;
       while(true)
       {
           System.out.println("Input 1 to PUSH:");
           System.out.println("Input 2 to POP:");
           System.out.println("Input 3 to PEEK:");
           System.out.println("Input 4 to EXIT:");
           ch=sc.nextInt();
           switch(ch)
           {
               case(1):
                   System.out.println("Enter the data");
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
                   return;
            }
        }
    }
    static void main()
    {
        System.out.println("Enter the capacity");
        int n=sc.nextInt();
        truestack ob=new truestack(n);
        ob.control();
    }
}