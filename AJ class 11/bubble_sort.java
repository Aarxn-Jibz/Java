    import java.util.Scanner;
    
class bubble_sort
    {
        static void main()
        {
            Scanner sc=new Scanner(System.in);
            int ar[]=new int[10];
            int i,j,small,pos;
            int temp=0;
            int m=sc.nextInt();
            for(i=0;i<m;i++)
            {
                ar[i]=sc.nextInt();
            }
            for(i=0;i<m;i++)
            {
                small=ar[i];
                pos=i;
                for(j=i+1;j<m;j++)
                {
                    if(ar[j]<small)
                    {
                        small=ar[j];
                        pos=j;
                    }
                }
                ar[pos]=ar[i];
                ar[i]=small;
                System.out.println(ar[i]);
            }
            for(i=0;i<m;i++)
            {
                System.out.println(ar[i]);
            }
        }
    }