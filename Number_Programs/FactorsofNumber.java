//Number Programs
//  factors of a number
import java.util.Scanner;
class FactorsofNumber
{
	public static void factors(int n) 
	{ 
		for (int i =1; i<=n ;i++ )
		{
			int fact = n%i;
			if(fact==0)
				System.out.println(i);
		}

	}

		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number : ");
			int n = sc.nextInt();
			System.out.println(" Factors of  " + n + " is : " );
			factors(n);
		} 
	
}
