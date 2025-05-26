import java.util.Scanner;
class RemoveDuplicateAccurance
{
	// public static String upper(String a)
	// {
	// 	String res ="";
	// 	res=a.replace('a','\0');
	// 	return res;
	// }

    public static String upper(String a, char ch) 
    {
        StringBuilder sb = new StringBuilder();
        for (char c : a.toCharArray()) {
            if (c != ch) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String  : ");
		String a=sc.nextLine();
		System.out.print("Enter a character to remove  : ");
		char ch=sc.next().charAt(0);
		System.out.println("Uppercase is :" +upper(a, ch));
	}
}