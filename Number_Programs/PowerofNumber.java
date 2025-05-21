//Number Programs
//  Find power of a number
import java.util.Scanner;
class PowerofNumber
{
	public static int power(int n, int p) 
	{ 
		if (p==0)
			return 1;
		int pow = 1;
		for (int i =1; i<=p ;i++ )
		{
			pow=pow*n;
			
		}
		return pow;

	}

		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number : ");
			int n = sc.nextInt();
			System.out.println("Enter Power : ");
			int p = sc.nextInt();
			System.out.println( n +" power "+p+  " is : " + power(n,p) );

		} 
	
}
