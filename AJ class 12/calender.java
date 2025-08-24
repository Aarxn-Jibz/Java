import java.util.Scanner;
class calender
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input day of first january!");
        String s=sc.nextLine();
        System.out.println("Input year:");
        int y=sc.nextInt();
        int arr[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String day[]={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if(checkleap(y)==true)
        {
            arr[1]=29;
        }
        int check=0,i,j,c=0,c1=1,x=1;
        for(i=0;i<7;i++)
        {
            if(s.equalsIgnoreCase(day[i])==true)
            {
                break;
            }
        }
        check=i;
        while(x<13)
        {
            int ar[][]=new int[5][7];
            int a=check;
            i=0;j=a;c1=1;
            while(c1<=arr[x-1])
            {
                ar[i][j]=c1++;
                if(j==6)
                {
                    i++;
                    j=0;
                }
                else
                {
                    j++;
                }
                if(i==4 && j==6)
                {
                    i=0;
                    j=0;
                }
            }
            check=j;
            for(i=0;i<5;i++)
            {
                System.out.println();
                for(j=0;j<7;j++)
                {
                    System.out.print(ar[i][j]+"\t");
                }
            }
            x++;
            sc.nextLine();
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