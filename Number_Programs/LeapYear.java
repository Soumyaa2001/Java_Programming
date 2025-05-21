//  Find Leap Year
import java.util.Scanner;
class LeapYear
{
	public static boolean leapyear( int n)
	{
		if(n>0 && (n%4==0 && (n%400==0 || n%100 != 0)))
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Year : ");
			int n = sc.nextInt();
			System.out.println("Is " +n+ " A Leap Year ? " + leapyear(n) );

		}  
}