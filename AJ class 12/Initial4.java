import java.util.*;
class Initial4
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        SLL ob=new SLL();
        int v,ch;
        while(true)
        {
            System.out.println("Press 1 for Insert at End");
            System.out.println("Press 2 for Insert at Beg");
            System.out.println("Press 3 for Insert at by Position");
            System.out.println("Press 4 for Insert in sorted order");
            System.out.println("Press 5 for Delete from front");
            System.out.println("Press 6 for Delete from End");
            System.out.println("Press 7 for Delete by position");
            System.out.println("Press 8 for display forward");
            System.out.println("Press 9 for display backward");
            System.out.println("Press 10 for Exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                        System.out.println("Enter the data");
                        v=sc.nextInt();
                        ob.insertAtEnd(v);
                        break;
                case 2:
                        System.out.println("Enter the data");
                        v=sc.nextInt();
                        ob.insertAtBeg(v);
                        break;
                
                case 5:
                        ob.delete4rmFront();
                        break;
                case 6:
                        ob.delete4rmEnd();
                        break;
                case 8:
                        ob.displayForward();
                        break;
                case 9:
                        ob.displayBakward(ob.start);
                        break;
                case 10:
                        return;
            }
        }
    }
}