import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      int num=4;
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      //  System.out.println(num);
      for(int i=0;i<n;i++)
      {
        num=num+(int)Math.pow(i,2);
        System.out.print(num+" ");
      }
	}
}