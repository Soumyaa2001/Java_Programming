//Number Programs
// Find Happy Number

 import java.util.Scanner;
class HappyNumber
{
	public static boolean sumdigit(int n) {
		while(n!= 1 && n!=4)
		{
			int sumpool = 0;
			while (n!=0)
			{
				int last=n%10;
				int sum = (int)Math.pow(last,2);
				sumpool=sumpool + sum;
				n=n/10;			 			
			}
			n=sumpool;
		}
		if(n == 1 )
			return true;
		else
			return false;
		
	}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number : ");
			int n = sc.nextInt();
			System.out.println( "Is "+n + " a Happy Number : " +sumdigit(n));
	} 
	
	
}
