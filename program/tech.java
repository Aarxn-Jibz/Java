    class tech
    {
        public static void main()
        {
            int i,a,b,s;
            System.out.println("Inout a 4 digit number");
            for(i=1000;i<=9999;i++)
            {
                a=i%100;
                b=1/100;
                s=a+b;
                if(s*s==i)
                {
                    System.out.println(i);
                }
            }
        }
    }