import java.util.*;
class array_10
{
    void main()
    {
        int c=0;
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[10];
        int i;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter the element");
            ar[i]=sc.nextInt();
        }
        
        for(i=0;i<10;i++)
        {
            if(ar[i]%10==0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}