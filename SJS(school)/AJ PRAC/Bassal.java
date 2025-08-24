import java.util.*;
class Bassal
{
    double bs = 0.0 , da = 0.0, hra=0.0, tax=0.0,fin=0.0;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input basic salary: ");
        bs = sc.nextDouble();
        System.out.println("Input da: ");
        da = sc.nextDouble();
        System.out.println("Input hra: ");
        hra = sc.nextDouble();
        System.out.println("Input tax: ");
        tax = sc.nextDouble();
    }
    void display()
    {
        System.out.println("Final Salary: "+fin);
    }
    void calculate()
    {
        fin = bs + da + hra - tax;
    }
    public static void main()
    {
        Bassal a = new Bassal();
        a.input();
        a.calculate();
        a.display();
    }
}