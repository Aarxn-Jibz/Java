/**
 * WAP to input name,date of birth,optional subjects and marks and print a report card
 */ import java.util.Scanner;
 class Project
 {
     String name,notes,subject,subject10,grade,section,DOB;int Roll,total_class,Class,attended;double attendance,percentage,marks1,marks2,marks3,marks4,marks5,marks6,marks7,marks8,marks9,marks10,marks11,mark12;
     void input()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter student's name");
         name=sc.nextLine();
         sc.nextLine();
         System.out.println("Enter Date of birth");
         DOB=sc.nextLine();
         sc.nextLine();
         System.out.print("Enter class(9 or 10)");
         Class=sc.nextInt();
         System.out.println("Enter section");
         section=sc.nextLine();
         sc.nextLine();
         System.out.println("Enter roll number");
         Roll=sc.nextInt();
         System.out.println("Enter which stream the student has chosen(Science or comerce)");
         sc.nextLine();
         subject=sc.nextLine();
         System.out.println("Enter additional subject(Economic Applications or Computer Applications)(only economics for commerce)");
         subject10=sc.nextLine();
         sc.nextLine();
         System.out.println("Enter English Language Marks");
         marks1=sc.nextDouble();
         System.out.println("Enter English literature Marks");
         marks2=sc.nextDouble();
         System.out.println("Enter Second language marks");
         marks3=sc.nextDouble();
         System.out.println("Enter History marks");
         marks4=sc.nextDouble();
         System.out.println("Enter Geography Marks");
         marks5=sc.nextDouble();
         System.out.println("Enter Mathematics marks");
         marks6=sc.nextDouble();
         if(subject.equalsIgnoreCase("Science")==true)
         {
             System.out.println("Enter Physics marks");
             marks7=sc.nextDouble();
             System.out.println("Enter chemistry marks");
             marks8=sc.nextDouble();
             System.out.println("Enter biology marks");
             marks9=sc.nextDouble();
             if(subject10.equalsIgnoreCase("Computer Applications")==true)
             {
                 System.out.println("Enter computer marks");
                 marks10=sc.nextDouble();
             }
             else
             {
                 System.out.println("Enter economics marks");
                 marks10=sc.nextDouble();
             }
         }
         else
         {
             System.out.println("Enter Commerce marks");
             marks11=sc.nextDouble();
             System.out.println("Enter Economics marks");
             marks10=sc.nextDouble();
         }
         System.out.println("Enter notes");
         sc.nextLine();
         notes=sc.nextLine();
         System.out.println("Input total days present");
         attended=sc.nextInt();
         System.out.println("Input number of days there was class");
         total_class=sc.nextInt();
     }
     void compute()
     {
         if(subject.equalsIgnoreCase("Science")==true)
         {
             percentage=((marks1+marks2+marks3+marks4+marks5+marks6+marks7+marks8+marks9+marks10)/1000)*100;
         }
         else
         {
             percentage=((marks1+marks2+marks3+marks4+marks5+marks6+marks10+marks11)/800)*100;
         }
         if (percentage<=40.0)
         {
             grade="D";
         }
         else if(percentage>40.0 && percentage<=70.0)
         {
             grade="C";
         }
         else if(percentage>70.0 && percentage<=85.0)
         {
             grade="B";
         }
         else
         {
             grade="A";
         }
         attendance=((attended/total_class)*100);
         System.out.println(notes);
     }
     void display()
     {
         System.out.println("_____________________________");
         System.out.println(name);
         System.out.println(Class+section);
         System.out.println(DOB);
         System.out.println("Roll no.="+Roll);
         System.out.println("English Language   |"+marks1);
         System.out.println("English Literature |"+marks2);
         System.out.println("Second language    |"+marks3);
         System.out.println("History            |"+marks4);
         System.out.println("Geography          |"+marks5);
         System.out.println("Mathematics        |"+marks6);
         if(subject.equalsIgnoreCase("Science")==true)
         {         
         System.out.println("Physics            |"+marks7);
         System.out.println("Chemistry          |"+marks8);
         System.out.println("Biology            |"+marks9);
         }
         else
         {
         System.out.println("Commerce           |"+marks11);
         }
         if(subject10.equalsIgnoreCase("Computer Applications")==true)
         {
         System.out.println("Computer           |"+marks10);
         }
         else
         {
         System.out.println("Economics          |"+marks10);
         }
         System.out.println("________________________");
         System.out.println("Percentage     :"+percentage);
         System.out.println("Grade          :"+grade);
         System.out.println("Attendance     :"+attendance);
         System.out.println("Teacher's notes:"+notes);
     }
     public static void main()
     {
         Project ob=new Project();
         ob.input();
         ob.compute();
         ob.display();
     }
  }