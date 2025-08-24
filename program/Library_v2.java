        import java.util.Scanner;
        class Library_v2
        {
               int calculate;
               void confirm()
               {
                    Scanner sc=new Scanner(System.in);
                    String f,l;int Conf,check;
                    System.out.println("Enter first name");
                    f=sc.nextLine();
                    System.out.println("Enter last name");
                    l=sc.nextLine();
                    System.out.println("Do you have to pay dues to the library(Press 1 if yes and 2 if no)");
                    Conf=sc.nextInt();
                    check=Check(Conf);
                }
                int Check(int a)
                {
                    Scanner sc=new Scanner(System.in);
                    switch (a)
                    {
                        case 1:
                        calculate=Calculate(a);
                        break;
                        case 2:
                        System.out.println("Thank you.Have a nice day!");
                        break;
                    }
                }
                int calculate(int b)
                {
                    int z,fees,basic;
                    basic=10;
                    if (b==1)
                    {
                        System.out.println("Enter number of weeks(upto 10) due");
                        z=sc.nextInt();
                        switch (z)
                        {
                            case 1:
                            fees=basic*1;
                            System.out.println("The fees is Rs."+fees);
                            System.out.println("Thank you");
                            break;
                            case 2:
                            fees=basic*2;
                            System.out.println("Please pay Rs."+fees);
                            System.out.println("Thank you");
                            break;
                            case 3:
                            fees=basic*3;
                            System.out.println("Please pay Rs."+fees);
                            System.out.println("Thank you");
                            break;
                            case 4:
                            fees=basic*4;
                            System.out.println("Please pay Rs."+fees);
                            System.out.println("Thank you");
                            break;
                            case 5:
                            fees=basic*5;
                            System.out.println("Please pay Rs."+fees);
                            System.out.println("Thank you");
                            break;
                            case 6:
                            fees=basic*6;
                            System.out.println("Please pay Rs."+fees);
                            System.out.println("Thank you");
                            break;
                            case 7:
                            fees=basic*7;
                            System.out.println("Please pay Rs."+fees);
                            System.out.println("Thank you");
                            break;
                            case 8:
                            fees=basic*8;
                            System.out.println("Please pay Rs."+fees);
                            System.out.println("Thank you");
                            break;
                            case 9:
                            fees=basic*9;
                            System.out.println("Please pay Rs."+fees);
                            System.out.println("Thank you");
                            break;
                            case 10:
                            fees=basic*10;
                            System.out.println("Please pay Rs."+fees);
                            System.out.println("Thank you");
                            break;
                            default:
                            System.out.println("System does not accept number below zero and above 10");
                            break;
                            }
                        }
                    }
                    public static void main()
                    {
                        Library_v2 ob=new Library_v2();
                        ob.confirm();
                        ob.Check();
                        ob.calculate();
                    }
                }