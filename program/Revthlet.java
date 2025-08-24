/**
 * WAP to input a string and inverse the case of the letter 
 */    
    import java.util.Scanner;
    class Revthlet
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            String s;char ch;int i,length=0;
            System.out.println("Enter word");
            s=sc.nextLine();
            length=s.length();
            for (i=0;i<length-1;i++)
            {
                ch=s.charAt(i);
                if(Character.isUpperCase(ch))
                {
                    ch=Character.toLowerCase(ch);
                }
                else
                {
                    ch=Character.toUpperCase(ch);
                }
                System.out.print(ch);
            }
        }
    }