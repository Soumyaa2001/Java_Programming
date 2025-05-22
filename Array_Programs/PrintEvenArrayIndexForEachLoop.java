import java.util.Scanner;
class PrintEvenArrayIndexForEachLoop{

	public static void PrintArrayForEachLoop(int [] a)
	{
		for(int i: a)
		{
			if(i%2==0)
				System.out.println(i);
		}
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
		PrintArrayForEachLoop(a);
		
}
}