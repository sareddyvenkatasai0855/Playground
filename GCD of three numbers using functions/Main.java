import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int k=gcd(n1,n2);
      int i=gcd(k,n3);
      System.out.println(i);
	}
  public static int gcd(int m,int n)
  {
    while(m!=n)
    {
      if(m>n)
        m=m-n;
      else
        n=n-m;
    }
    return n;
  }
}