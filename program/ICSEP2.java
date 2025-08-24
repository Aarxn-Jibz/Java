     import java.util.Scanner;
     class ICSEP2
     {
         public static void main()
         {
             Scanner sc=new Scanner(System.in);
             int i;String s;
             System.out.println("Enter word");
             s=sc.nextLine();
             i=s.length();
             System.out.println("Length:"+i);
             s=s.toUpperCase();
             System.out.println("Upper Case:"+s);
             s=s.toLowerCase();
             System.out.println("Lower case:"+s);
         }
     }