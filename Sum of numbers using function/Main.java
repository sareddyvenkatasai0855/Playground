import java.util.Scanner;
class Main{
  public static int Sum(int num)
  {
    int temp=0;
    for(int i=1;i<=num;i++)
    {
      temp=temp+(i);
    }
    return temp;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int n1=Sum(n);
      System.out.println(n1);
	}
}