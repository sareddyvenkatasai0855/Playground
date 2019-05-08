import java.util.Scanner;
class Main{
  public static void main(String arg[])
  {
    Scanner in=new Scanner(System.in);
    int base=in.nextInt();
    int exp=in.nextInt();
    int pow=power(base,exp);
    System.out.println(pow);
  }
  public static int power(int n,int m)
  {
    int temp=1;
    for(int i=1;i<=m;i++)
    {
      temp=temp*n;
    }
    return temp;
  }
}