import java.util.Scanner;
class StringWordCount {

	public static int wordCount(String str){

		int count=0;
		for (int i=0;i<str.length();i++)
		{
			if ((i==0 && str.charAt(i) != ' ')||(str.charAt(i) != ' ' && str.charAt(i-1) == ' ' ))
				count++;		
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String  : ");
		String a=sc.nextLine();
		System.out.println("words are :" +wordCount(a));
	}
}