import java.util.Scanner;
import java.util.Arrays;
class ReverseArrayElement{

	public static int[] ReverseArrayElement(int [] a)
	{
		int[] b = new int[a.length];
		
		for(int i=0; i<a.length;i++)

		{	int x=a[i];
			int rev = 0;
			while(x!=0)
			{
			rev=(rev*10)+x%10;
			x=x/10;
			}
			b[i]=rev;
		}
			return b;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array  : ");
		int size = sc.nextInt();
		int[] a = new int[size];
		int sum=0;
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();	
		}
		System.out.println(Arrays.toString(ReverseArrayElement(a)));;
		
}
}