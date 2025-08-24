import java.util.Scanner;
class timeinwords
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int hr,min;
        String ar[]={"o'clock","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen",
            "quarter","sixteen","seventeen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five",
            "twenty six","twenty seven","twenty eight","twenty nine","half past"};
        System.out.println("Input hour");
        hr=sc.nextInt();
        System.out.println("Input minutes");
        min=sc.nextInt();
        if(min<=30 && min!=0)
        {
            System.out.println(ar[min]+" past "+ar[hr]);
        }
        else if(min>30 && min<60)
        {
            if(hr==12)
            {
                hr=1;
            }
            else
            {
                hr++;
            }
            System.out.println(ar[60-min]+" to "+ar[hr]);
        }
        else if(min==0)
        {
            System.out.println(ar[hr]+" "+ar[min]); 
        }
    }
}