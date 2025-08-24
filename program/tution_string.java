/**
 * Input two words and find out the set that will be formed by 
 * the intersection of the characters found in both the string.
 * e.g; Input 1 : DISARI
 * Input 2 :	HALDIA
 * Output will come as : {D,I,A}
 */
    import java.util.Scanner;
    class tution_string
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            String s,first,second;int a,b,i,c=0;char x;
            System.out.println("Input first word");
            first=sc.nextLine();
            System.out.println("Input second word");
            second=sc.nextLine();
            a=first.length();
            b=second.length();
            for(i=0;i<a;i++)
            {
                x=first.charAt(i);
                if(second.indexOf(x)!=-1)
                {
                    System.out.print(x+",");
                }
            }
        }
    }