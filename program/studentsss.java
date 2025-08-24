/**
 *design a class called student having following members to find out the grade as per 
 *criteria
    class name:		student 
   data members:		m1,m2,m3 as the marks of 3 subjects as integer
			avg as double to store average
			grade as character

   members methods:
			student(int,int,int): constructore to initialize
					      the data member by given 					    
					      values accordingly.

			void find(): after calculate the average it will
				     decide the grade as per following criteria
				avg		grade
				80-100		A
				50-79		B
				below 50	C

			void display():	to display all details in tabular form
*/
 import java.util.Scanner;
 class studentsss
 {
     int m1,m2,m3;double avg;char grade;
     studentsss (int x,int y,int z)
     {
         m1=x;
         m2=y;
         m3=z;
     }
     void find()
     {
         double avg=(m1+m2+m3)/3;
         if (avg >=80 && avg<=100)
         System.out.println("A");
         else if (avg>=50 && avg <80)
         System.out.println("B");
         else
         System.out.println("C");
     }
     void main()
     {
         studentsss ob=new studentsss(20,30,40);
         ob.find();
     }
 }