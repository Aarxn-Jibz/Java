 import java.util.*;
 class Salary_Slip
 {
    static double
    basic,da=0.0,hra=0.0,ma=0.0,ea=0.0,gross=0.0,netsal=0.0,pf=0.0;
    public void calSalary(double basic)
    {
       da=(60*basic)/100;
       hra=(30*basic)/100;
       ma=(10*basic)/100;
       gross=basic+da+hra+ma;
       pf=(30*gross)/100;
       netsal=gross-pf;
if (netsal>50000)
ea=(20*gross)/100;
else
ea=(5*gross)/100;
}
public void displayData()
{
System.out.println("Basic:"+basic);
System.out.println("DA:"+da);
System.out.println("HRA:"+hra);
System.out.println("MA:"+ma);
System.out.println("Gross:"+gross);
System.out.println("PF:"+pf);
System.out.println("Net Salary:"+netsal);
System.out.println("EA:"+ea);
}
public static void main()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the basic salary of an employee:");
basic = sc.nextDouble();
Salary_Slip obj= new Salary_Slip();
obj.calSalary(basic);
obj.displayData();
}
}