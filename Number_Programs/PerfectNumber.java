//Number Programs
//  perfect number
import java.util.Scanner;
class PerfectNumber
{
	public static boolean perfect(int n) 
	{ 
		int sum=0;
		for (int i =1; i<=n/2 ;i++ )
		{
			int fact = n%i;
			if(fact==0)
				sum = sum+i;
		}
		if(sum==n)
			return true;
		else
			return false;

	}

		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number : ");
			int n = sc.nextInt();
			System.out.println(" Is " + n + " a Perfect Number : " +perfect(n));
		} 
	
}
