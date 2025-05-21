//Number Programs
// wap to count digits of a number
 import java.util.Scanner;
class CountDigitsofNumber
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

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number : ");
			int n = sc.nextInt();
			System.out.println(" Number of digit in " + n + " is : " +countdigit(n));
	} 
	
	
}
