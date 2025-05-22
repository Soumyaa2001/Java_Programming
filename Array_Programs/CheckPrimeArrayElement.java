import java.util.Scanner;
import java.util.Arrays;
class CheckPrimeArrayElement{

	public static void primeArrayElement(int [] a)
	{
		for(int i=0; i<a.length;i++)
		{
			if(prime(a[i]))
			System.out.println(a[i]);
		}
        
	}
		public static boolean prime(int n) 
		{
			int count =0;
			for(int i = 1; i<=n;i++)
			{
				if(n%i==0)
					count++;
			}
			if (count==2)
				return true;
			else
				return false;
		}

		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array  : ");
		int size = sc.nextInt();
		int[] a = new int[size];
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();	
		}
		primeArrayElement(a);	
}
}