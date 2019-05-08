import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int op=s.nextInt();
      switch(op)
      {  
          case 1:
          int x=s.nextInt();
          int as=x*x;
          System.out.println(as);
          break; 
                                   
           case 2: 
                                  int l=s.nextInt();
                                  int b=s.nextInt();
                                  int ar=l*b;
                                 System.out.println(ar);
                                 break;
            case 3: 
                    		int ba=s.nextInt();
                    		int he=s.nextInt();
                    float at=0.5f*ba*he;
                    System.out.println(at);
                    break;
                  case 4: 
                                  double r=s.nextFloat();
                                  double ac=3.14d*r*r;
                                 System.out.println(ac);
                                 break;

                     

                    
                  default:
                    }
    }
}