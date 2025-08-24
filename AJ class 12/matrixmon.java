import java.util.Scanner;
class matrixmon
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int ar[][]=new int[5][7];
        System.out.println("Input day of first january!");
        String s=sc.nextLine();
        System.out.println("Input month number");
        int m=sc.nextInt();
        System.out.println("Input year:");
        int y=sc.nextInt();
        int arr[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String day[]={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if(checkleap(y)==true)
        {
            arr[1]=29;
        }
        int check=0,i,j,c=0,c1=1;
        for(i=0;i<m-1;i++)
        {
            check=check+arr[i];
        }
        for(i=0;i<7;i++)
        {
            if(s.equalsIgnoreCase(day[i])==true)
            {
                break;
            }
        }
        check=(i+check)%7;
        for(i=0;i<5;i++)
        {
            for(j=check;j<7;j++)
            {
                if(i==4 && j==6)
                {
                    ar[i][j]=c1;
                    c1++;
                    i=0;
                    j=0;
                }
                ar[i][j]=c1;
                if(c1<arr[m-1])
                {
                    c1++;
                }
                else
                {
                    break;
                }
            }
            check=0;
        }
        System.out.println("Printed month!");
        for(i=0;i<5;i++)
        {
            System.out.println();
            for(j=0;j<7;j++)
            {
                System.out.print(ar[i][j]+"\t");
            }
        }
    }
    boolean checkleap(int y)
    {
        if(y%100==0 && y%400 ==0)
        {
            return true;
        }
        else if(y%4==0 && y%100!=0)
        {
            return true;
        }
        return false;
    }
}