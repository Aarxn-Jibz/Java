           import java.util.Scanner;
           class Library
           {
               public static void main()
               {
                    Scanner sc=new Scanner(System.in);
                    String f,l;int confirm,basic,number,fees,goback;
                    basic=10;
                    System.out.println("Enter first name");
                    f=sc.nextLine().trim();
                    System.out.println("Enter last name");
                    l=sc.nextLine().trim();
                    System.out.println("Do you have to pay dues to the library(Press 1 if yes and 2 if no)");
                    confirm=sc.nextInt();
                    switch(confirm)
                    {
                        case 1:
                        System.out.println("How many weeks due(up to 10 weeks)?");
                        number=sc.nextInt();
                        switch(number)
                        {
                            case 1:
                            fees=basic;
                            System.out.println("Please pay Rs."+fees);
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
                         break;
                        case 2:
                        System.out.println("Thank you");
                        break;
                    }
                }
            }