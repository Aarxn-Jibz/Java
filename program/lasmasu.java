    import java.util.Scanner;
    class lasmasu
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            int i,n,lar=-99999,small=99999,sum=0;
            int ar[]=new int[20];
            System.out.println("Input 20 elements");
            for(i=0;i<20;i++)
            {
                ar[i]=sc.nextInt();
                if(ar[i]>lar)
                {
                    lar=ar[i];
                }
                else if(ar[i]<small)
                {
                    small=ar[i];
                }
                sum+=ar[i];
            }
            System.out.println("Largest number:"+lar);
            System.out.println("Smallest number:"+small);
            System.out.println("Sum:"+sum);
        }
    }