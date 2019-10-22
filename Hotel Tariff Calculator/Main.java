import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      	int month=sc.nextInt();
      float t;
      float r=sc.nextFloat();
      float d=sc.nextFloat();
      switch(month)
      {
        case 4:
        case 5:
        case 6:
        case 11:
        case 12:t=(1.2f*r)*d;
          System.out.println(t);break;
        case 1:
        case 2:
        case 3:
        case 7:
        case 8:
        case 9:
        case 10:t=r*d;
          System.out.println(t);break;
        default:System.out.println("Invalid Input");break;
      }
	}
}