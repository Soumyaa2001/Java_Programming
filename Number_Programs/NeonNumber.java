//Number Programs
// wap to find Neon Number
 import java.util.Scanner;
class NeonNumber
{
	public static boolean sumdigit(int n) {
		int sum = 0;
		int n1 =(int)Math.pow(n,2);
		while (n1!=0)
		{
			int last=n1%10;
			sum=sum+last;
			n1=n1/10;
					 			
		}
		if(sum == n )
			return true;
		else
			return false;
		
	}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number : ");
			int n = sc.nextInt();
			System.out.println( "Is "+n + " a Neon Number : " +sumdigit(n));
	} 
	
	
}
