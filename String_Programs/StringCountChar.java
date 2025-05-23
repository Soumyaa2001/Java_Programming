import java.util.Scanner;
class StringCountChar {

	public static void countOfStringChar(String str)
	{
		int spacecount=0;
		int vowelcount=0;
		int consonantcount=0;
		int specialcount=0; 
		int digitcount=0;
		for (int i=0;i<str.length();i++)
		{   char c=str.charAt(i);

			if ((c>='A' && c<='Z') || (c>='a' && c<='z'))
				{ 
					if (c=='A' || c=='E'|| c=='I'|| c=='O'|| c=='U'|| c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u')
					vowelcount++;
					else
						consonantcount++;
				}
			else if (c>='0' && c<='9')
				digitcount++;
			else if (c==' ')
				spacecount++;
			else
				specialcount++;

		}
		 System.out.println("vowelcount :" + vowelcount);
		 System.out.println("consonantcount :"+consonantcount);
		 System.out.println("spacecount :" +spacecount);
		 System.out.println("digitcount :" +digitcount);
		 System.out.println("specialcount :" +specialcount);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String  : ");
		String a=sc.nextLine();
		countOfStringChar(a);
		 }
}