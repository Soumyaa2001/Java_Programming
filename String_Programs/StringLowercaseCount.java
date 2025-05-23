import java.util.Scanner;
class StringLowercaseCount {

	public static int countOfStringChar(String str)
	{
		int count=0;
		for (int i=0;i<str.length();i++)
		{  
			char c=str.charAt(i);
			if (c>='a' && c<='z')
				count++;
			
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String  : ");
		String a=sc.nextLine();
		System.out.println(" Number of Lower Case are :" +countOfStringChar(a));
	}
}