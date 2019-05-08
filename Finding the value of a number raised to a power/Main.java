import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in=new Scanner(System.in);
      int base=in.nextInt();
      int exp=in.nextInt();
      int res=1;
      for(int i=0;i<exp;i++)
      {
        res=res*base;
      }
      System.out.println(res);
    }
}