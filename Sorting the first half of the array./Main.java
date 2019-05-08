import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int i,temp=0;
    int size=in.nextInt();
    int arr[]=new int[size];
    for(i=0;i<size;i++)
      arr[i]=in.nextInt();
    int h=size/2;
    for(i=0;i<h;i++)
    {
      for(int j=i+1;j<h;j++)
      {
        if(arr[i]>arr[j])
      {
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
       }
      }
    }
    for(i=0;i<size;i++)
    {
      System.out.print(arr[i]+" ");
    }       
  }
}
        

      