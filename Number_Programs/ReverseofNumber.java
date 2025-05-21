//Number Programs
// wap to find reverse of a number
 import java.util.Scanner;
class ReverseofNumber
{
	public static int revdigit(int n) {
		int rev = 0	;
		while (n!=0)
		{
			rev = (rev*10)+ n%10;
			n=n/10;
					 			
		}
		return rev;
	}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number : ");
			int n = sc.nextInt();
			System.out.println(" Reverse of digit " + n + " is : " +revdigit(n));
	} 
	
	
}
