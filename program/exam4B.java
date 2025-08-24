/** A person is paid Rs.350 for each day he works and fined Rs.30 for each day he remains
 *  absent. Write a program in java to calculate and display his income for the month of
 *  August, if he is present for 25 days and remains absent for the rest of the month.
 */ 
 class exam4B
 {
     public static void main()
     {
         int p,a,i;
         p=350*25;
         a=30*6;
         i=p-a;
         System.out.println("Income of the person in the month August is "+i);
        }
    }