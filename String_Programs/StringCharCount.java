import java.util.Scanner;
class StringCharCount {

	public static int charCount(String str){
		int count=0;
		for (int i=0;i<str.length();i++)
		{
			if (str.charAt(i) !=' ')
				count++;		
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String  : ");
		String a=sc.nextLine();
		System.out.println(" Number of Characters are :" +charCount(a));
	}
}