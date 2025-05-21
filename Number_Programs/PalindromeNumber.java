//Number Programs
// wap to find palindrom number
 import java.util.Scanner;
class PalindromeNumber
{
	public static void reverse(int n) {
		int rev = 0	;
		int n1 = n;
		while (n!=0)
		{
			rev = (rev*10)+ n%10;
			n=n/10;
					 			
		}
		if (rev== n1)
			System.out.println(n1 +" is a Plindrom Number");
		else
			System.out.println(n1 + " is not a palindrom Number");
	}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number : ");
			int n = sc.nextInt();
			reverse(n);
	} 
	
	
}
