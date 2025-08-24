  class question19
  {
      void main()
      {
          int i,j;
          for(i=1;i<=4;i++)
          {
              System.out.println();
              for (j=1;j<=i;j++)
              {
                  if(j%2==0)
                  System.out.print("#");
                  else
                  System.out.print("*");
                }
            }
        }
    }