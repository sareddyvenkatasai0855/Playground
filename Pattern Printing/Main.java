import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner in=new Scanner(System.in);
      int row=in.nextInt();
      int col=in.nextInt();
     for(int i=0;i<row;i++)
    {
      for(int j=col;j>=1;j--)
      {
        if((i+j)>col)
          System.out.print(j);
        else
          System.out.print(col-i);
      }
      System.out.println();
    }
    }
}