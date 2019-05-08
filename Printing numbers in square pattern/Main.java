import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=0;
      for(int row=1;row<=n;row++)
      {
        count++;
        for(int col=1;col<=n;col++)
        {
          System.out.print(count);
        }
        System.out.println("");
      }
          
	}
}