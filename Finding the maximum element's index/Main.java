import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int i,max,index=0,j;
    int arr[]=new int[n];
    for(i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }
    max=arr[0];
    for(j=1;j<n;j++)
    {
      if(max<arr[j])
      {
        max=arr[j];
        index=j;
      }
    }
    System.out.println(index);
  }
}
 