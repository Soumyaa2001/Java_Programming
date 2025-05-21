//Number Programs
// wap to Find Armstrong number
import java.util.Scanner;
class ArmstrongNumber
{
	public static int countdigit(int n) {
		int count = 0;
		while (n!=0)
		{
			n=n/10;
			count++;
		 			
		}
		return count;
	}

	public static boolean power(int n)
	{
		int sum = 0;
		int n1 =n;
		int p= countdigit(n1);
		while (n!=0)
		{
			int last=n%10;
			sum=sum+(int)Math.pow(last,p);
			n=n/10;			 			
		}
		if(sum==n1)
			return true;
		else
			return false;
	}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number : ");
			int n = sc.nextInt();
			System.out.println("Is "+n + " a Armstrong Number : " +power(n));
	} 
	
	
}