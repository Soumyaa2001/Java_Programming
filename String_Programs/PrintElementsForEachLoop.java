import java.util.Scanner;
class PrintElementsForEachLoop{

	public static void printElementsForEachLoop(char [] a)
	{
		for(char i: a)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String  : ");
			String b=sc.next();
			char[] a=b.toCharArray();
		printElementsForEachLoop(a);
		
}
}