import java.util.Scanner;
class StringPalimdrom {

	public static void palindrom(String str){
		String temp="";
		for (int i=str.length()-1;i>=0;i--)
		{
			temp=temp+str.charAt(i);
				
		}
		 if(str.equalsIgnoreCase(temp))   //equalsIgnoreCase > ignores the upper and lower case
		 	System.out.println("it is palindrom");     //equals > use to compare string
		 else
		 System.out.println("not a palindrom");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String  : ");
		String a=sc.nextLine();
		palindrom(a);
	}
}