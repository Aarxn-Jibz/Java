/**
 *Write a program for following specification: Class name - student 
Data members : 
Name , Hindi marks, English marks, maths marks, computer marks, average, grade.
 Member methods: 
Student( ) : constructor to initialize data members. 
Void accept( ) : to accept name and marks in 3 subjects given. 
Void calcavg( ): to calculate and store the grade according to following slab: 
Average marks 			grade 
	>=90	A++
	>=75 - <90	A
	>=60 - 75	B
	<60	        C
Now write the main method to create the object of the class and call the above method.
*/
import java.util.Scanner;
class Proj1
{
   String Name;
   int Hindimarks,Englishmarks,mathsmarks,computermarks;
   double average;
   String grade;
   void accept()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter name");
       Name=sc.nextLine();
       System.out.println("Enter mathematics marks");
       mathsmarks=sc.nextInt();
       System.out.println("Enter Hindi marks");
       Hindimarks=sc.nextInt();
       System.out.println("Enter English marks");
       Englishmarks=sc.nextInt();
       System.out.println("Enter Computer marks");
       computermarks=sc.nextInt();
    }
    Proj1()
    {
        mathsmarks=0;
        Hindimarks=0;
        Englishmarks=0;
        computermarks=0;
    }
    void calcavg()
    {
        average=(mathsmarks+Hindimarks+Englishmarks+computermarks)/4;
        if (average >=90)
        grade="A++";
        else if (average>=75 && average<90)
        grade="A";
        else if(average>=60 && average<75)
        grade="B";
        else if(average<60)
        grade="C";
        System.out.println(grade);
    }
    public static void main()
    {
        Proj1 ob=new Proj1();
        ob.accept();
        ob.calcavg();
    }
}