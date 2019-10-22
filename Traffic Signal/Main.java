import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      float time;
		Scanner sc=new Scanner(System.in);
        float s=sc.nextFloat();
      	float d=sc.nextFloat();
     	float t=sc.nextFloat();
      time=d/s;
      if(time<(t/(60*60)))
        System.out.println("Yes");
      else 
        System.out.println("No");
      
	}
}