import java.util.Scanner;
class reverse_array
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[10];
        int i;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter the element");
            ar[i]=sc.nextInt();
        } 
        for (i=9;i>=0;i--)
        System.out.println(ar[i]);
    }
}