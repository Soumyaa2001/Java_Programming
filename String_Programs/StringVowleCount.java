import java.util.Scanner;
class StringVowleCount {

	public static int countOfStringChar(String str)
	{
		int vowelcount=0;
		for (int i=0;i<str.length();i++)
		{  
			char c=str.charAt(i);
			if (c=='A' || c=='E'|| c=='I'|| c=='O'|| c=='U'|| c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u')
				vowelcount++;
		}
		return vowelcount;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String  : ");
		String a=sc.nextLine();
		System.out.println(" Number of Vowels are :" +countOfStringChar(a));
	}
}