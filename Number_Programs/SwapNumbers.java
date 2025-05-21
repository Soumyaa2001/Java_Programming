// swap numbers
import java.util.Scanner;
class SwapNumbers{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number A : ");
		int a = sc.nextInt();
		System.out.print("Enter Number B : ");
		int b = sc.nextInt();

		// int temp=a;
		// a=b;
		// b=temp;

		// a = a+b;
		// b=a-b;
		// a=a-b;

		// a = a^b;
		// b=a^b;
		// a=a^b;

		// a = a*b;
		// b=a/b;
		// a=a/b;

		//  a = a + b - (b = a);
		 a = b - a + (b = a);
		 

		System.out.println("Number A Is :"+a);
		System.out.println("Number B Is :"+b);
	}
}