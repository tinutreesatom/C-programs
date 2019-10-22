import java.util.Scanner;
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
      int ele=sc.nextInt();
      int flag=0;
      for(int i=0;i<n;i++)
      {
        if(a[i]==ele)
        {
          flag=1;
          break;
        }
      }
       if(flag==1)
        {
          System.out.println(ele+" is present in the array");
        }
        else
        {
          System.out.println(ele+" is not present in the array");
        }
    }
}