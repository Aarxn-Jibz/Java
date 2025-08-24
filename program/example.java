import java.util.*;
class example
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[10];
        int i;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter the lement");
            ar[i]=sc.nextInt();
        }
        
        for(i=0;i<10;i++)
        {
            System.out.println(ar[i]);
        }
    }
}