import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int fac=n;
      for(int i=n;i>1;--i)
      {
        fac=fac*(i-1);
      }
      System.out.println(fac);
	}
}