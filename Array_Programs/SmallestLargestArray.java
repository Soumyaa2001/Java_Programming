import java.util.*;
class SmallestLargestArray{
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
		Arrays.sort(a);

		System.out.println("Smallest is :"+a[0]);
		System.out.println("Largest is :"+a[a.length-1]);
		for(int i=1; i<a.length;i++)
		{
			if(a[0] !=a[i])
			{
			System.out.println("2nd Smallest is "+a[i]);
			break;
			}
		}
		for(int i=a.length-2;i>=0;i--)
		{
			if(a[a.length-1] !=a[i])
			{
			System.out.println("2nd Largest is "+a[i]);
			break;
			}
		}
	
}
}