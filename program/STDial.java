    import java.util.Scanner;
    class STDial
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            int i,c=0,we=0;String s,search="";
            int arr[] =new int[10];
            String ar[]=new String[10];
            System.out.println("Enter city name and STD");
            for(i=0;i<10;i++)
            {
                ar[i]=sc.nextLine();
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter city name to be searched");
            search=sc.nextLine();
            for(i=0;i<10;i++)
            {
                if(ar[i].equalsIgnoreCase(search))
                {
                    c++;
                }
                if(c==1)
                {
                    we=i;
                    break;
                }
            }
            if(c==1)
            {
                System.out.println("STD of the entered city is at"+arr[we]);
            }
            else 
            {
                System.out.println("city not found");
            }
        }
    }