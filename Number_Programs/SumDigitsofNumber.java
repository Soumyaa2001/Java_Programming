//Number Programs
// wap to find sum of digits of a number
 import java.util.Scanner;
class SumDigitsofNumber
{
	public static int sumdigit(int n) {
		int sum = 0;
		int n1 =0;
		while (n!=0)
		{
			n1=n%10;
			sum=sum+n1;
			n=n/10;			 			
		}
		return sum;
	}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number : ");
			int n = sc.nextInt();
			System.out.println(" Sum of digit in " + n + " is : " +sumdigit(n));
	} 
	
	
}
