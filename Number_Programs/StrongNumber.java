//Number Programs
// Strong  number
import java.util.Scanner;
class StrongNumber
{
	public static boolean Sum(int n)
	{
		int n1 = n;
		int sumpool = 0;
		while(n!=0)
		{
			int last=n%10;
			n=n/10;
			int sum = factorial(last);
			sumpool = sumpool +sum;
		}
		if (sumpool == n1 && sumpool !=0)
			return true;
		else
			return false;
	}
	public static int factorial(int n) {
		int fact = 1; 
		for (int i =1; i<=n ;i++ )
		{
			fact=fact*i;
		}
		return fact;
	}

		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number : ");
			int n = sc.nextInt();
			System.out.println( "Is "+n + " a Strong Number : " +Sum(n));
		} 
	
}
