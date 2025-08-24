        import java.util.Scanner;
        class samp2
        {
            public static void main()
            {
                Scanner sc=new Scanner(System.in);
                char ch;int i,uc=0,vow=0;
                char ar[]=new char[10];
                System.out.println("Enter terms");
                for(i=0;i<10;i++)
                {
                    ar[i]=sc.next().charAt(0);
                    if(Character.isUpperCase(ar[i])=true)
                    {
                        uc++;
                    }
                    if(ar[i]='A' || ar[i]='E' || ar[i]='I' || ar[i]='O' || ar[i]='U')
                    {
                        vow++;
                    }
                    else if(ar[i]='a' || ar[i]='e' || ar[i]='i' || ar[i]='o' || ar[i]='u')
                    {
                        vow++;
                    }
                }
                System.out.println("The number of upper case characters are:"+uc);
                System.out.println("The number of vowels are:"+vow);
            }
        }
                