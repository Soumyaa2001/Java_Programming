import java.util.Scanner;
import java.util.Arrays;
class StringRemoveDuplicates {

	public static String duplicate(String str)
	{
		char[] c=new char[str.length()];
		for (int i=0;i<str.length();i++)
		{
		c[i]=str.charAt(i);
		}
		Arrays.sort(c);
		int k = 0;
		char[] c1=new char[c.length];
		for (int j=0;j<c.length;j++)
		{
			if(j==0||c[j-1]!= c[j])
			{
				c1[k]=c[j];
				k++;
			}

		}
		return new String(c1, 0, k);


	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string :");
		String s=sc.nextLine();
		System.out.println(duplicate(s));
	}
}