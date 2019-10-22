import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      	String door=sc.nextLine();
    	int rail=sc.nextInt();
      if(door.equalsIgnoreCase("front"))
         {
           if(rail==1)
             System.out.println("Left Handed");
           else
             System.out.println("Right Handed");
         }
         else
         {
           if(rail==1)
             System.out.println("Right Handed");
           else
             System.out.println("Left Handed");
         }
         }    
}