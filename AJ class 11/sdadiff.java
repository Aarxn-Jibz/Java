import java.util.Scanner;
class sdadiff
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,diff=0;
        int ar[]=new int[6];
        System.out.println("Input array elements");
        for(i=0;i<6;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("The original array is");
        for(i=0;i<6;i++)
        {
            System.out.print(ar[i]+"\t");
        }
        System.out.println();
        for(i=0;i<5;i++)
        {
            diff=ar[i+1]-ar[i];
            ar[i]=diff;
            System.out.print(diff+"\t");
        }
        System.out.println();
        for(i=0;i<4;i++)
        {
            diff=ar[i+1]-ar[i];
            ar[i]=diff;
            System.out.print(diff+"\t");
        }
        System.out.println();
        for(i=0;i<3;i++)
        {
            diff=ar[i+1]-ar[i];
            ar[i]=diff;
            System.out.print(diff+"\t");
        }
        System.out.println();
        for(i=0;i<2;i++)
        {
            diff=ar[i+1]-ar[i];
            ar[i]=diff;
            System.out.print(diff+"\t");
        }
        System.out.println();
        for(i=0;i<1;i++)
        {
            diff=ar[i+1]-ar[i];
            ar[i]=diff;
            System.out.print(diff+"\t");
        }
        System.out.println();
    }
}