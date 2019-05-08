import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int k=great_two(n1,n2);
      int i=great_two(k,n3);
      System.out.println(i);
	}
  public static int great_two(int m,int n)
  {
    if(m>n)
      return m;
    else
      return n;
  }
}