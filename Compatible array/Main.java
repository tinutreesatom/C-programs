import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[15];
    int[] b=new int[15];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      b[i]=sc.nextInt();
    }
    int count=0;
    for(int i=0;i<n;i++)
    {
      if(a[i]>=b[i])
        count++;
    }
    if(count==n)
      System.out.println("Compatible");
     else
      System.out.println("Incompatible");
    
  }
}