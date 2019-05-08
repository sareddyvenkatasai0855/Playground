import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int size=in.nextInt();
      int arr[]=new int[size];
      int temp1=0,temp2=0,flag1=-1,flag2=-1;
      for(int i=0;i<size;i++)
      {
        arr[i]=in.nextInt();
      }
      int m=in.nextInt();
      int n=in.nextInt();
      for(int p=0;p<size;p++)
      {
        if(arr[p]==m)
        {
          flag1=1;
          temp1=p;
          break;
        }
      }
      for(int k=0;k<size;k++)
      {
        if(arr[k]==n)
        {
          flag2=1;
          temp2=k;
          break;
        }
      }
      if(flag1==1)
        System.out.println(temp1);
      else
        System.out.println(flag1);
      if(flag2==1)
        System.out.println(temp2);
      else
        System.out.println(flag2);
    }
}