    import java.util.Scanner;
    class payrollhw1July
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            int n,d,m,i,e,sum;double db,mb,eb,DA,HRA,EA,TA,MA,dded,eded,mded;
            System.out.println("Enter the number of employees");
            n=sc.nextInt();
            String a[]=new String [n];
            String ar[]=new String[n];
            long arr[]=new long[n];
            System.out.println("Enter number of directors");
            d=sc.nextInt();
            System.out.println("Enter number of managers");
            m=sc.nextInt();
            System.out.println("Enter number of executives");
            e=sc.nextInt();
            sum=d+m+e;
            if(sum!=n)
            {
                System.out.println("Wrong data inputted");
                System.exit(0);
            }
            System.out.println("Enter name");
            System.out.println("Enter position");
            System.out.println("Enter mobile number");
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextLine();
                ar[i]=sc.nextLine();
                if(ar[i].equalsIgnoreCase(DIRECTOR))
                {
                    d--;
                    if(d<0)
                    {
                        System.out.println("Wrong data");
                        System.exit(0);
                    }
                }
                else if(ar[i].equalsIgnoreCase(MANAGER))
                {
                    m--;
                    if(m<0)
                    {
                        System.out.println("Wrong input");
                        System.exit(0);
                    }
                }
                else if (ar[i].equalsIgnoreCase(EXECUTIVE))
                {
                    e--;
                    if(e<0)
                    {
                        System.out.println("Wrong input");
                        System.exit(0);
                    }
                }
                else
                {
                    System.out.println("Wrong input");
                    System.exit(0);
                }
                arr[i]=sc.nextLong();
            }
            System.out.println("Enter base salary of director");
            db=sc.nextDouble();
            System.out.println("Enter base salary of manager");
            mb=sc.nextDouble();
            System.out.println("Enter base salary of exeecutive");
            eb=sc.nextDouble();
            System.out.println("Enter % of DA");
            DA=sc.nextDouble();
            System.out.println("Enter % of HRA");
            MA=sc.nextDouble();
            System.out.println("Enter % of MA");
            MA=sc.nextDouble();
            System.out.println("Enter % of EA");
            EA=sc.nextDouble();
            System.out.println("Enter % of TA");
            TA=sc.nextDouble();
            db=db+((DA/100)*db)+((HRA/100)*db)+((MA/100)*db)+((EA/100)*db)+((TA/100)*db);
            mb=db+((DA/100)*mb)+((HRA/100)*mb)+((MA/100)*mb)+((TA/100)*mb);
            eb=db+((DA/100)*eb)+((HRA/100)*eb)+((MA/100)*eb);
            dded=db-(((12.5/100)*db)+((5/100)*db));
            mded=mb-(((12.5/100)*mb)+((3/100)*mb));
            eded=eb-(((12.5/100)*eb)+((5/100)*eb));
            for(i=0;i<n;i++)
            {
                System.out.println("Name:"+a[i]);
                System.out.println("Position:"+ar[i]);
                System.out.println("Mobile number:"+arr[i]);
                System.ou.println("     ");
                if(ar[i].equalsIgnoreCase(EXECUTIVE))
                {
                    System.out.println("Gross salary:"+eb);
                    System.out.println("Net salary:"+eded);
                }
                else if(ar[i].equalsIgnoreCase(MANAGER))
                {
                    System.out.println("Gross salary:"+mb);
                    System.out.println("Net salary:"+mded);
                }
                else
                {
                    System.out.println("Gross salary:"+db);
                    System.out.println("Net salary:"+dded);
                }
                System.out.println("___________________________________________________________");
            }
        }
    }
