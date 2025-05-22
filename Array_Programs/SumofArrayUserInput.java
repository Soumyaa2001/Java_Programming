import java.util.Scanner;
class SumofArrayUserInput{
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
		for(int i=0; i<a.length;i++)
		{
			sum= sum+a[i];
		}
		System.out.println("Sum is :"+sum);
}
}