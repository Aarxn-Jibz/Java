import java.util.Scanner;
class Evil
{
    int num,bin;
    Evil()
    {
        num=0;
        bin=0;
    }
    void accept_num()
    {
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num<0)
        {
            System.out.println("Inpvalid input:");
            System.exit(0);
        }
    }
    void rec_bin(int x)
    {
        
    }
}