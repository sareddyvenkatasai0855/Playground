import java.util.Scanner;
class Main
{
  public static int Square(int num)
  {
    int sqr;
    sqr=num*num;
    return sqr;
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int n1=Square(n);
      System.out.println(n1);
	} 
}