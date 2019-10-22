import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      float num=0.5f;
      for(int i=1,j=0;j<n;i=i*3,j++)
      {
        System.out.print(num+" ");
        num=num+i;
      }
	}
}