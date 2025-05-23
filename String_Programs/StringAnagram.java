import java.util.Scanner;
import java.util.Arrays;
class StringAnagram {

	public static boolean anagram(String str, String str1){
		 if(str.length() != str1.length())
		 	return false;
		 else {	
			char[] c1=new char[str.length()];
			for (int i=0;i<str.length();i++)
			{
			c1[i]=str.charAt(i);
			}
			char[] c2=new char[str1.length()];
			for (int i=0;i<str1.length();i++)
			{
			c2[i]=str1.charAt(i);
			}

			Arrays.sort(c1);
			Arrays.sort(c2);

			return Arrays.equals(c1,c2);
		}
		}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1 :");
		String s=sc.nextLine();
		System.out.println("Enter string 2 :");
		String s1=sc.nextLine();
		System.out.println(anagram(s,s1));
	}
}