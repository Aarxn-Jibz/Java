    import java.util.Scanner;
    class compma
    {
        public static void main()
        {
            Scanner ssc=new Scanner(System.in);
            int i,avg=0,total=0;String name;
            String ar[]=new String[50];
            int arr[]=new int[50];
            System.out.println("Enter name and marks");
            for(i=0;i<50;i++)
            {
                ar[i]=sc.nextLine();
                arr[i]=sc.nextInt();
                sum=sum+arr[i];
            }
            avg=sum/50;
            System.out.println("average:"+avg);
        }
    }
    