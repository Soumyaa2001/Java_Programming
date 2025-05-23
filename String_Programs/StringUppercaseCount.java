import java.util.Scanner;
class StringUppercaseCount {

	public static int countOfStringChar(String str)
	{
		int count=0;
		for (int i=0;i<str.length();i++)
		{  
			char c=str.charAt(i);
			if (c>='A' && c<='Z')
				count++;
			
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String  : ");
		String a=sc.nextLine();
		System.out.println(" Number of Upper Case are :" +countOfStringChar(a));
	}
}