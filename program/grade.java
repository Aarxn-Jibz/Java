/**
 *W.A.P in switch case to display grades for the given criteria:
 *    Marks                    Grades
 *    80-100                      A
 *    50-79                       B
 *    40-49                       C
 *    0-40                        D 
 */
    import java.util.Scanner;
    class grade               //opening class
    {
        public static void main()  //opening void main
        {
            Scanner sc=new Scanner(System.in);
            int a;
            System.out.println("Enter marks(Out of 100)");
            a=sc.nextInt();
            switch (a/10)
            {
                case 10:
                case 9 :
                case 8 :
                System.out.println("A");
                break;
                case 7:
                case 6:
                case 5:
                System.out.println("B");
                break;
                case 4:
                System.out.println("C");
                break;
                default:
                System.out.println("D");
               }
        } //closing void main
    }             //closing class