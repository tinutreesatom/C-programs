import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[20];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    int res=typeArray(n,a);
    if(res==1)
      System.out.println("The array is Even");
    else if(res==1)
      System.out.println("The array is Odd");
    else
      System.out.println("The array is Mixed");
  }
  static int typeArray(int n,int a[])
  {
    int ecount=0,ocount=0;
     for(int i=0;i<n;i++)
    {
      if(a[i]%2==0)
        ecount++;
    }
     for(int i=0;i<n;i++)
    {
      if(a[i]%2==1)
        ocount++;
    }
    if(ecount==n)
        return 1;
    else if(ocount==n)
        return 2;
    else
      return 3;
  }
}