import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      char ch=in.next().charAt(0);
      int key=in.nextInt();
      if(ch>='a' && ch<='z')
      {
        ch=(char)(ch-key);
          if(ch<=96)
          {
            ch=(char)(ch+26);
          }
        System.out.println(ch);
      }
      else  if(ch>='A' && ch<='Z')
      {
        ch=(char)(ch-key);
          if(ch<=65)
          {
            ch=(char)(ch+26);
          }
        System.out.println(ch);
      }
    }
}