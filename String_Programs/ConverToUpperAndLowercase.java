import java.util.Scanner;
class ConverToUpperAndLowercase
{
	public static String upper(String a)
	{
		String res ="";
		for (int i=0;i<a.length();i++) 
		{
			char c=a.charAt(i);
			if(c>='a' && c<='z')
			{
				int x = (int)c - 32;
				c = (char)x;
				res = res+c;
			}
			else
				res = res+c;
			
		}
		return res;
	}
	public static String low(String a)
	{
		String res ="";
		for (int i=0;i<a.length();i++) 
		{
			char c=a.charAt(i);
			if(c>='A' && c<='Z')
			{
				int x = (int)c + 32;
				c = (char)x;
				res = res+c;
			}
			else
				res = res+c;
			
		}
		return res;

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String  : ");
		String a=sc.nextLine();
		System.out.println("Uppercase is :" +upper(a));
		System.out.println("Lowercase is :" +low(a));

	}
}