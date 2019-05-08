import java.util.Scanner;

public class Main
{
   public static void main(String args[])
   {
       int large, size, i;
       Scanner scan = new Scanner(System.in);
       size = scan.nextInt();
	   int arr[] = new int[size];
       for(i=0; i<size; i++)
       {
           arr[i] = scan.nextInt();
       }
	   
       large = arr[0];
	   
       for(i=0; i<size; i++)
       {
           if(large < arr[i])
           {
               large = arr[i];
           }
           
       }
	   
       System.out.print(large); 
   }
}