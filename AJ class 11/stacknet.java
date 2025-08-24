/*stack.java*/
import java.io.*;
import java.util.Scanner;
public class stacknet
{ int element,maxsize,top;
int[] st;
public stacknet()
{ Scanner integer=new Scanner(System.in);
System.out.println("Enter stack size");
maxsize=integer.nextInt();
st=new int[maxsize];
top=-1;
}
public void push(int element)
{ /*if(top>=maxsize)
{ System.out.println("Overflow!!");
//return(0);
}*/
try
{ st[++top]=element;
}
catch(ArrayIndexOutOfBoundsException e)
{ System.out.println(e);
}
}
public int pop()
{ if(top==-1)
{ System.out.println("UnderFlow");
return(-1);
}
return(st[top--]);
}
public void display(int[] st, int max_size)
{ int i;
System.out.println("Stack Elements:");
for(i=0;i<=max_size;i++)
System.out.println(st[i]);
}
}