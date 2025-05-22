import java.util.Scanner;
import java.util.Arrays;

class CopyValueArrayToArray{
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array  : ");
		int size = sc.nextInt();
		int[] a = new int[size];
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		int[] b = new int[a.length];
		for(int j=0; j<a.length;j++)
		{
			b[j]=a[j];
			
		}
		System.out.println(Arrays.toString(b));
}
}