   import java.util.Scanner;
   class AA
   {
       String name,DOB,School;int age,Class;
       void input()
       {
           Scanner sc=new Scanner(System.in);
           System.out.println("Hello");
           System.out.println("What is your name");
           name=sc.nextLine();
           sc.nextLine();
           System.out.println("How old are you");
           age=sc.nextInt();
           System.out.println("Which school do you study in?");
           School=sc.nextLine();
           sc.nextLine();
           System.out.println("Which class are you in");
           Class=sc.nextInt();
           System.out.println("When were you born");
           DOB=sc.nextLine();
           sc.nextLine();
        }
        void display()
        {
            System.out.println("Student Information");
            System.out.println("___________________");
            System.out.println("Name         :"+name);
            System.out.println("Date of Birth:"+DOB);
            System.out.println("Age          :"+age);
            System.out.println("School       :"+School);
            System.out.println("Class        :"+Class);
        }
        void main()
        {
            AA ob=new AA();
            ob.input();
            ob.display();
        }
    }