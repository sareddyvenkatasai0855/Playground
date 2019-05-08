import java.util.Scanner;  
public class Main {  
   public static void main(String[] args) {  
       Scanner s = new Scanner(System.in);    
       int n= s.nextInt();  
       for (int i = 2; i <= n; i++) {  
           if (isPrime(i)) {  
               System.out.println(i);  
           }  
       }  
   }  
   public static boolean isPrime(int m) {  
       if (m <= 1) {  
           return false;  
       }  
       for (int i = 2; i <= Math.sqrt(m); i++) 
       {  
           if (m % i == 0) 
           {  
               return false;  
           }  
       }  
       return true;  
   }  
}  
  
